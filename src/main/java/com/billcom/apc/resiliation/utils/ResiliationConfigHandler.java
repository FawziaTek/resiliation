package com.billcom.apc.resiliation.utils;

import java.io.File  ;      
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;

import org.apache.axis.message.PrefixedQName;
import org.apache.axis.message.SOAPHeaderElement;
import org.jboss.logging.Logger;

import com.billcom.apc.generatedSOAP.BalanceManagerV2.BalanceManagerV2;
import com.billcom.apc.generatedSOAP.BalanceManagerV2.BalanceManagerV2Service;
import com.billcom.apc.generatedSOAP.PBI_CMS.APCManager.APCManagerService;
import com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager.ResiliationManager;
import com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager.ResiliationManagerService;
import com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.JbpmOrderResiliationPortBindingStub;
import com.billcom.apc.generatedSOAP.PBI_JBPM.jbpmOrderResiliation.JbpmOrderResiliation_ServiceLocator;
import com.billcom.apc.generatedSOAP.bscs.apcHandling.APCHandlingServiceLocator;
import com.billcom.apc.generatedSOAP.bscs.apcHandling.APCHandlingSoapBindingStub;
import com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractHandlingServiceLocator;
import com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractHandlingSoapBindingStub;
import com.billcom.apc.generatedSOAP.bscs.contractServiceParametersRead.ContractServiceParametersReadServiceSoapBindingStub;
import com.billcom.apc.generatedSOAP.bscs.contractServiceParametersRead.ContractServiceParametersReadService_ServiceLocator;
import com.billcom.apc.generatedSOAP.bscs.contractServicesRead.ContractServicesReadServiceSoapBindingStub;
import com.billcom.apc.generatedSOAP.bscs.contractServicesRead.ContractServicesReadService_ServiceLocator;
import com.billcom.apc.generatedSOAP.bscs.contractWrite.ContractWriteServiceSoapBindingStub;
import com.billcom.apc.generatedSOAP.bscs.contractWrite.ContractWriteService_ServiceLocator;
import com.billcom.apc.generatedSOAP.bscs.grhHandling.GrhHandlingServiceLocator;
import com.billcom.apc.generatedSOAP.bscs.grhHandling.GrhHandlingSoapBindingStub;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ResiliationHandlingServiceLocator;
import com.billcom.apc.generatedSOAP.bscs.resiliationHandling.ResiliationHandlingSoapBindingStub;
import com.billcom.apc.generatedSOAP.gps.ApcWebServiceWebServicePortBindingStub;
import com.billcom.apc.generatedSOAP.gps.ApcWebService_ServiceLocator;
import com.billcom.apc.ws.manager.APCManager;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
 
/**
 * @author achref.boumiza
 * updated: Bechir
 * updated: fethi
 */

public class ResiliationConfigHandler {

	private Logger logger = Logger.getLogger(ResiliationConfigHandler.class);

	Properties prop = null;
	String propFileName = "";
	String propertyFile = null;
	File file = null;
	String result = "";

	public ResiliationConfigHandler() {
		prop = new Properties();
		propFileName = "config_resiliation.properties";
		propertyFile = System.getProperty(propFileName);
		file = new File(propertyFile);
		try {

			prop.load(new FileInputStream(this.file));

		} catch (FileNotFoundException e) {
			logger.error("",e);
		} catch (IOException e) {
			logger.error("",e);
		} 
	}

	public final String getPropValues(String elem) {

		try {
			result = prop.getProperty(elem);
		} catch (Exception e) {
			logger.info("Exception: " + e);
		}
		return result;
	}

	public ResiliationHandlingSoapBindingStub consumeResiliationHandling() {
		logger.info("=> consumeResiliationHandling in");
		java.net.URL url;
		ResiliationHandlingSoapBindingStub binding = null;
		String wsdlUserSec = "";
		String wsdlUsername = "";
		String wsdlPassword = "";

		try {

			wsdlUserSec = this.getPropValues("wsdlUserSec");
			wsdlUsername = this.getPropValues("wsdlUsername");
			wsdlPassword = this.getPropValues("wsdlPassword");
			url = new URL(this.getPropValues("resiliationWsUrl"));
			int timeoutBSCS = Integer.parseInt(this.getPropValues("timeoutBSCS"));


			binding = (ResiliationHandlingSoapBindingStub) new ResiliationHandlingServiceLocator().getResiliationHandling(url);
			SOAPHeaderElement header = new SOAPHeaderElement(new PrefixedQName(this.getPropValues("SecQname"), "Security", wsdlUserSec));
			SOAPElement usernameToken = header.addChildElement("UsernameToken", wsdlUserSec);
			SOAPElement username = usernameToken.addChildElement("Username", wsdlUserSec);
			username.addTextNode(wsdlUsername);
			SOAPElement password = usernameToken.addChildElement("Password", wsdlUserSec);
			password.addTextNode(wsdlPassword);
			logger.info("timeoutBSCS : " + timeoutBSCS);

			binding.setTimeout(timeoutBSCS);

			binding.setHeader(header);

		} catch (Exception e) {
			logger.error("",e);
		}
		logger.info("<= consumeResiliationHandling out");
		return binding;
	}

	public ContractHandlingSoapBindingStub consumeContractHandling() {
		logger.info("=> consumeContractHandling in");
		java.net.URL url;
		String wsdlUserSec = "";
		String wsdlUsername = "";
		String wsdlPassword = "";
		ContractHandlingSoapBindingStub binding = null;

		try {

			wsdlUserSec = this.getPropValues("bscswsdlUserSec");
			wsdlUsername = this.getPropValues("bscswsdlUsername");
			wsdlPassword = this.getPropValues("bscswsdlPassword");
			url = new URL(this.getPropValues("BSCSWsContractUrl"));
			int timeoutBSCS = Integer.parseInt(this.getPropValues("timeoutBSCS"));

			logger.info("Binding to WS ContractHandling : " + this.getPropValues("BSCSWsContractUrl"));

			binding = (ContractHandlingSoapBindingStub) new ContractHandlingServiceLocator().getContractHandling(url);

			SOAPHeaderElement header = new SOAPHeaderElement(
					new PrefixedQName(this.getPropValues("SecQname"), "Security", wsdlUserSec));
			SOAPElement usernameToken = header.addChildElement("UsernameToken", wsdlUserSec);

			SOAPElement username = usernameToken.addChildElement("Username", wsdlUserSec);
			username.addTextNode(wsdlUsername);

			SOAPElement password = usernameToken.addChildElement("Password", wsdlUserSec);

			password.addTextNode(wsdlPassword);
			logger.info("timeoutBSCS : " + timeoutBSCS);

			binding.setTimeout(timeoutBSCS);

			binding.setHeader(header);

		} catch (Exception e) {
			logger.error("",e);
		}
		logger.info("<= consumeContractHandling out");
		return binding;
	}

	public APCHandlingSoapBindingStub consumeAPCHandling() {
		logger.info("=> consumeAPCHandling in");
		java.net.URL url;
		APCHandlingSoapBindingStub binding = null;
		String wsdlUserSec = "";
		String wsdlUsername = "";
		String wsdlPassword = "";

		try {
			wsdlUserSec = this.getPropValues("wsdlUserSec");
			wsdlUsername = this.getPropValues("wsdlUsername");
			wsdlPassword = this.getPropValues("wsdlPassword");
			url = new URL(this.getPropValues("billcomWsUrl"));
			int timeoutBSCS = Integer.parseInt(this.getPropValues("timeoutBSCS"));

			logger.info("Binding to WS APCHandling : " + this.getPropValues("billcomWsUrl"));

			binding = (APCHandlingSoapBindingStub) new APCHandlingServiceLocator().getAPCHandling(url);
			SOAPHeaderElement header = new SOAPHeaderElement(new PrefixedQName(this.getPropValues("SecQname"), "Security", wsdlUserSec));
			SOAPElement usernameToken = header.addChildElement("UsernameToken", wsdlUserSec);
			SOAPElement username = usernameToken.addChildElement("Username", wsdlUserSec);
			username.addTextNode(wsdlUsername);
			SOAPElement password = usernameToken.addChildElement("Password", wsdlUserSec);
			password.addTextNode(wsdlPassword);
			logger.info("timeoutBSCS : " + timeoutBSCS);

			binding.setTimeout(timeoutBSCS);

			binding.setHeader(header);

		} catch (Exception e) {
			logger.error("",e);
		}
		logger.info("<= consumeAPCHandling out");
		return binding;
	}

	public ResiliationManager consumeResiliationManager() {
		logger.info("=> consumeResiliationManager in");
		java.net.URL url;
		ResiliationManager binding = null;
		String wsdlUsername = "";
		String wsdlPassword = "";

		try {

			wsdlUsername = this.getPropValues("wsdlPbiCMSUsername");
			wsdlPassword = this.getPropValues("wsdlPbiCMSPassword");
			url = new URL(this.getPropValues("billcomWsUrlPBICMSRES"));
			int timeoutPBICMS = Integer.parseInt(this.getPropValues("timeoutPBICMS"));

			logger.info("Binding to WS ResiliationManager : " + this.getPropValues("billcomWsUrlPBICMSRES"));

			ResiliationManagerService service = new ResiliationManagerService(url,new QName("http://manager.ws.resiliation.billcom.com/", "ResiliationManagerService"));

			WSSUsernameTokenSecurityHandler wSSUsernameTokenSecurityHandler = new WSSUsernameTokenSecurityHandler(wsdlUsername, wsdlPassword);
			binding = service.getResiliationManagerPort();
			BindingProvider bp = (BindingProvider) binding;
			List<Handler> handlerList = new ArrayList<Handler>();
			handlerList.add(wSSUsernameTokenSecurityHandler);
			bp.getBinding().setHandlerChain(handlerList);
			bp.getRequestContext().put(bp.ENDPOINT_ADDRESS_PROPERTY, this.getPropValues("billcomWsUrlPBICMSRES"));
			bp.getRequestContext().put(bp.USERNAME_PROPERTY, wsdlUsername);
			bp.getRequestContext().put(bp.PASSWORD_PROPERTY, wsdlPassword);
			//aded by fethi for fixing timeout issue
			/**/
			logger.info("timeoutPBICMS : " + timeoutPBICMS);

			bp.getRequestContext().put("com.sun.xml.ws.developer.JAXWSProperties.CONNECT_TIMEOUT", timeoutPBICMS);																// min
			bp.getRequestContext().put("com.sun.xml.ws.connect.timeout", timeoutPBICMS);
			bp.getRequestContext().put("com.sun.xml.ws.internal.connect.timeout", timeoutPBICMS);
			bp.getRequestContext().put("com.sun.xml.ws.request.timeout", timeoutPBICMS);
			bp.getRequestContext().put("com.sun.xml.internal.ws.request.timeout", timeoutPBICMS);
			/**/
		
			return binding;
		} catch (Exception e) {
			logger.error("",e);
		}
		logger.info("<= consumeResiliationManager out");
		return binding;

	}

	public JbpmOrderResiliationPortBindingStub consumeJbpmOrderResiliation() {
		logger.info("=> consumeJbpmOrderResiliation in");
		java.net.URL url;
		JbpmOrderResiliationPortBindingStub binding = null;

		try {
			logger.info("Binding to WS JbpmOrderResiliation : " + this.getPropValues("pbiJbpmWsdl"));
			url = new URL(this.getPropValues("pbiJbpmWsdl"));
			int timeoutPBIJBPM = Integer.parseInt(this.getPropValues("timeoutPBIJBPM"));
			logger.info("timeoutPBIJBPM : " + timeoutPBIJBPM);

			binding = (JbpmOrderResiliationPortBindingStub) new JbpmOrderResiliation_ServiceLocator().getjbpmOrderResiliationPort(url);
			  binding.setTimeout(timeoutPBIJBPM); // update by Fethi 

		} catch (Exception e) {
			logger.error("",e);
		}
		logger.info("<= consumeJbpmOrderResiliation out");
		return binding;
	}

	public ContractWriteServiceSoapBindingStub consumeContractWrite() {
		logger.info("=> consumeContractWrite in");
		java.net.URL url;
		ContractWriteServiceSoapBindingStub binding = null;
		String wsdlUserSec = "";
		String wsdlUsername = "";
		String wsdlPassword = "";

		try {

			wsdlUserSec = this.getPropValues("wsdlUserSec");
			wsdlUsername = this.getPropValues("wsdlUsername");
			wsdlPassword = this.getPropValues("wsdlPassword");
			url = new URL(this.getPropValues("contractWriteWsUrl"));
			int timeoutBSCS = Integer.parseInt(this.getPropValues("timeoutBSCS"));

			logger.info("Binding to WS ContractWrite : " + this.getPropValues("contractWriteWsUrl"));

			binding = (ContractWriteServiceSoapBindingStub) new ContractWriteService_ServiceLocator().getContractWriteService(url);
			SOAPHeaderElement header = new SOAPHeaderElement(new PrefixedQName(
					"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Security",
					wsdlUserSec));
			SOAPElement usernameToken = header.addChildElement("UsernameToken", wsdlUserSec);
			SOAPElement username = usernameToken.addChildElement("Username", wsdlUserSec);
			username.addTextNode(wsdlUsername);
			SOAPElement password = usernameToken.addChildElement("Password", wsdlUserSec);
			password.addTextNode(wsdlPassword);
			logger.info("timeoutBSCS : " + timeoutBSCS);

			binding.setTimeout(timeoutBSCS);
			binding.setHeader(header);

		} catch (Exception e) {
			logger.error("",e);
		}
		logger.info("<= consumeContractWrite out");
		return binding;
	}

	public ContractServicesReadServiceSoapBindingStub consumeAPCManager() {
		logger.info("=> consumeAPCManager in");
		java.net.URL url;
		ContractServicesReadServiceSoapBindingStub binding = null;
		String wsdlUserSec = "";
		String wsdlUsername = "";
		String wsdlPassword = "";

		try {

			wsdlUserSec = this.getPropValues("wsdlUserSec");
			wsdlUsername = this.getPropValues("wsdlUsername");
			wsdlPassword = this.getPropValues("wsdlPassword");
			url = new URL(this.getPropValues("billcomWsUrl"));
			int timeoutBSCS = Integer.parseInt(this.getPropValues("timeoutBSCS"));

			logger.info("Binding to WS APCManager : " + this.getPropValues("billcomWsUrl"));

			binding = (ContractServicesReadServiceSoapBindingStub) new ContractServicesReadService_ServiceLocator().getContractServicesReadService(url);
			SOAPHeaderElement header = new SOAPHeaderElement(new PrefixedQName(this.getPropValues("SecQname"), "Security", wsdlUserSec));
			SOAPElement usernameToken = header.addChildElement("UsernameToken", wsdlUserSec);
			SOAPElement username = usernameToken.addChildElement("Username", wsdlUserSec);
			username.addTextNode(wsdlUsername);
			SOAPElement password = usernameToken.addChildElement("Password", wsdlUserSec);
			password.addTextNode(wsdlPassword);
			logger.info("timeoutBSCS : " + timeoutBSCS);

			binding.setTimeout(timeoutBSCS);

			binding.setHeader(header);

		} catch (Exception e) {
			logger.error("",e);
		}
		logger.info("<= consumeAPCManager out");
		return binding;
	}

	public ContractServiceParametersReadServiceSoapBindingStub consumeWsdlContractServPrmsRead() {
		logger.info("=> consumeWsdlContractServPrmsRead in");
		ContractServiceParametersReadServiceSoapBindingStub binding = null;
		String wsdlUserSec = "";
		String wsdlUsername = "";
		String wsdlPassword = "";

		try {

			wsdlUserSec = this.getPropValues("wsdlUserSec");
			wsdlUsername = this.getPropValues("wsdlUsername");
			wsdlPassword = this.getPropValues("wsdlPassword");
			int timeoutBSCS = Integer.parseInt(this.getPropValues("timeoutBSCS"));


			binding = (ContractServiceParametersReadServiceSoapBindingStub) new ContractServiceParametersReadService_ServiceLocator()
					.getContractServiceParametersReadService();
			SOAPHeaderElement header = new SOAPHeaderElement(new PrefixedQName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Security",
					wsdlUserSec));
			SOAPElement usernameToken = header.addChildElement("UsernameToken", wsdlUserSec);
			SOAPElement username = usernameToken.addChildElement("Username", wsdlUserSec);
			username.addTextNode(wsdlUsername);
			SOAPElement password = usernameToken.addChildElement("Password", wsdlUserSec);
			password.addTextNode(wsdlPassword);
			logger.info("timeoutBSCS : " + timeoutBSCS);

			binding.setTimeout(timeoutBSCS);
			binding.setHeader(header);

		} catch (Exception e) {
			logger.error("",e);
		}
		logger.info("<= consumeWsdlContractServPrmsRead out");
		return binding;
	}

	public GrhHandlingSoapBindingStub consumeGrhHandling() {
		logger.info("=> consumeGrhHandling in");
		java.net.URL url;
		GrhHandlingSoapBindingStub binding = null;
		String wsdlUserSec = "";
		String wsdlUsername = "";
		String wsdlPassword = "";

		try {

			// "http://192.168.1.100:8080/BscsWs/services/BillcomHandling?wsdl"
			wsdlUserSec = this.getPropValues("wsdlUserSec");
			wsdlUsername = this.getPropValues("wsdlUsername");
			wsdlPassword = this.getPropValues("wsdlPassword");
			url = new URL(this.getPropValues("GrhHandlingWsUrl"));
			int timeoutBSCS = Integer.parseInt(this.getPropValues("timeoutBSCS"));

			logger.info("Binding to WS GrhHandling : " + this.getPropValues("GrhHandlingWsUrl"));

			binding = (GrhHandlingSoapBindingStub) new GrhHandlingServiceLocator().getGrhHandling(url);

			SOAPHeaderElement header = new SOAPHeaderElement(
					new PrefixedQName(this.getPropValues("SecQname"), "Security", wsdlUserSec));
			SOAPElement usernameToken = header.addChildElement("UsernameToken", wsdlUserSec);

			SOAPElement username = usernameToken.addChildElement("Username", wsdlUserSec);
			username.addTextNode(wsdlUsername);

			SOAPElement password = usernameToken.addChildElement("Password", wsdlUserSec);

			password.addTextNode(wsdlPassword);
			logger.info("timeoutBSCS : " + timeoutBSCS);

			binding.setTimeout(timeoutBSCS);

			binding.setHeader(header);

		} catch (Exception e) {
			logger.error("An exception was thrown", e);
		}
		logger.info("<= consumeGrhHandling out");
		return binding;
	}

	public ApcWebServiceWebServicePortBindingStub consumeGpsWsdl() {
		logger.info("=> consumeGpsWsdl in");
		java.net.URL url;
		ApcWebServiceWebServicePortBindingStub binding = null;

		try {

			url = new URL(this.getPropValues("GpsApcWsUrl"));
			int timeoutPBIJBPM = Integer.parseInt(this.getPropValues("timeoutPBIJBPM"));

			logger.info("Binding to WS GpsApc : " + this.getPropValues("GpsApcWsUrl"));
			logger.info("timeoutPBIJBPM : " + timeoutPBIJBPM);

			binding = (ApcWebServiceWebServicePortBindingStub) new ApcWebService_ServiceLocator().getApcWebServiceWebServicePort(url);
			  binding.setTimeout(timeoutPBIJBPM); // update by Fethi 

		} catch (Exception e) {
			logger.error("An exception was thrown", e);
		}
		logger.info("<= consumeGpsWsdl out");
		return binding;
	}

	public int isResiliationDateNow(String dueDate) { // 21/10/2019
		logger.info("=> isResiliationDateNow in");
		try {
			ResiliationConfigHandler config = new ResiliationConfigHandler();
			Date todayDate = new Date();
			String resTimeString = config.getPropValues("executionTime");// A
			String[] migTimeSplit = resTimeString.split(":");
			int h = Integer.parseInt(migTimeSplit[0]);
			int m = Integer.parseInt(migTimeSplit[1]);
			SimpleDateFormat sdf3 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			Date dteMig = sdf3.parse(dueDate);
			dteMig.setHours(0);
			dteMig.setMinutes(0);
			dteMig.setSeconds(0);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(dteMig);
			calendar.set(Calendar.MILLISECOND, 0);
	        calendar.set(Calendar.SECOND, 0);
	        calendar.set(Calendar.MINUTE, 0);
	        calendar.set(Calendar.HOUR_OF_DAY, 0);
			int migDueDateYear = calendar.get(Calendar.YEAR);
			int migDueDateMonth = calendar.get(Calendar.MONTH);
			int migDueDateDay = calendar.get(Calendar.DAY_OF_MONTH);
			logger.info("date String: " + dueDate);
			logger.info("date: " + dteMig);
			logger.info("calendar: " + calendar);
			logger.info("YEAR: " + migDueDateYear);
			logger.info("MONTH: " + (migDueDateMonth + 1)); // +1 to log the correct month, months starts from 0
			logger.info("day of month: " + migDueDateDay);
			calendar.setTime(todayDate);
			int nowDateYear = calendar.get(Calendar.YEAR);
			int nowDateMonth = calendar.get(Calendar.MONTH);
			int nowDateDay = calendar.get(Calendar.DAY_OF_MONTH); // A
			if (nowDateYear == migDueDateYear) {
				if (nowDateMonth == migDueDateMonth) {
					if (migDueDateDay == nowDateDay) {
						logger.info("<= isResiliationDateNow out");
						return 0;
					} else if (migDueDateDay > nowDateDay) {
						long diff = dteMig.getTime() - todayDate.getTime();
						Long secondsDiff = TimeUnit.MILLISECONDS.toSeconds(diff);
						logger.info("diff seconds : " + secondsDiff);
						logger.info("<= isResiliationDateNow out");
						return secondsDiff.intValue();
					}

				} else {
					if (migDueDateMonth > nowDateMonth && (migDueDateMonth - nowDateMonth == 1)) {
						logger.info("une resiliation debut mois prochain");
						calendar.setTime(dteMig);
						calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
								calendar.get(Calendar.DAY_OF_MONTH), h, m, 0);// 01:0:0
						long diff = calendar.getTime().getTime() - todayDate.getTime();
						Long secondsDiff = TimeUnit.MILLISECONDS.toSeconds(diff);
						logger.info("secondsDiff : " + secondsDiff);
						if (secondsDiff < 0) {
							logger.info("<= isResiliationDateNow out");
							return 0;
						} else {
							logger.info("<= isResiliationDateNow out");
							return secondsDiff.intValue();
						}
					}

					else {
						if (migDueDateMonth > nowDateMonth && (migDueDateMonth - nowDateMonth > 1)) {
							logger.info("Mois DueDate est > Mois Actuel && Difference > +1 (une resiliation ...)");
							calendar.setTime(dteMig);
							long diff = calendar.getTime().getTime() - todayDate.getTime();
							Long secondsDiff = TimeUnit.MILLISECONDS.toSeconds(diff);
							logger.info("secondsDiff : " + secondsDiff);
							logger.info("<= isResiliationDateNow out");
							return secondsDiff.intValue();
						}
					}

				}
			} else {
				if (nowDateYear < migDueDateYear) {
					calendar.setTime(dteMig);
					long diff = calendar.getTime().getTime() - todayDate.getTime();
					Long secondsDiff = TimeUnit.MILLISECONDS.toSeconds(diff);
					logger.info("secondsDiff: " + secondsDiff);
					logger.info("<= isResiliationDateNow out");
					return secondsDiff.intValue();
				}
			}

			return 0;
		} catch (Exception e) {
			logger.error("",e);
		}
		logger.info("<= isResiliationDateNow out");
		return 0;

	}
	public BalanceManagerV2 consumeWsdlWsPortal() {
		logger.info("=> consumeWsdlWsPortal IN");

		java.net.URL url;
		BalanceManagerV2 binding = null;
		String wsdlUserSec = "";
		String wsdlUsername = "";
		String wsdlPassword = "";

		try {

		
			url = new URL(this.getPropValues("otnWsPortalUrl"));
			logger.info("***** binding to WS :wsPortal-> "+this.getPropValues("otnWsPortalUrl")+"********");
			 BalanceManagerV2Service service = new BalanceManagerV2Service (url,new QName("http://v2.manager.ws.lucent.alcatel.com", "BalanceManagerV2Service"));
			binding = service.getBalanceManagerV2();
			
			return binding;
		} catch (Exception e) {
			logger.error("An exception was thrown", e);
		} 
		logger.info("<= consumeWsdlWsPortal out");

		return binding;

	}
	
	public APCManager consumeWsdlPBICMS() {
		logger.info("=> consumeWsdlPBICMS IN");

		java.net.URL url;
		APCManager binding = null;
		String wsdlUserSec = "";
		String wsdlUsername = "";
		String wsdlPassword = "";

		try {

			wsdlUserSec = this.getPropValues("wsdlUserSec");
			wsdlUsername = this.getPropValues("wsdlUsername");
			wsdlPassword = this.getPropValues("wsdlPassword");
			url = new URL(this.getPropValues("billcomWsUrlPBICMSAPC"));
			int timeoutPBICMS = Integer.parseInt(this.getPropValues("timeoutPBICMS"));

			logger.info("***** binding to WS :PBICMS-> "+this.getPropValues("billcomWsUrlPBICMSAPC")+"********");
			com.billcom.apc.ws.manager.APCManagerService service = new com.billcom.apc.ws.manager.APCManagerService(url,new QName("http://manager.ws.apc.billcom.com/", "APCManagerService"));

			WSSUsernameTokenSecurityHandler wSSUsernameTokenSecurityHandler = new WSSUsernameTokenSecurityHandler(wsdlUsername,wsdlPassword);
			binding =  service.getAPCManagerPort();
			
			BindingProvider bp = (BindingProvider) binding;
			List<Handler> handlerList = new ArrayList<Handler>();
			handlerList.add(wSSUsernameTokenSecurityHandler);
			bp.getBinding().setHandlerChain(handlerList);
			bp.getRequestContext().put(bp.ENDPOINT_ADDRESS_PROPERTY, this.getPropValues("billcomWsUrlPBICMSAPC"));
			bp.getRequestContext().put(bp.USERNAME_PROPERTY, wsdlUsername);
			bp.getRequestContext().put(bp.PASSWORD_PROPERTY, wsdlPassword);
  
			//aded by fethi for fixing timeout issue
			/**/
			logger.info("timeoutPBICMS : " + timeoutPBICMS);

			bp.getRequestContext().put("com.sun.xml.ws.developer.JAXWSProperties.CONNECT_TIMEOUT", timeoutPBICMS);																// min
			bp.getRequestContext().put("com.sun.xml.ws.connect.timeout", timeoutPBICMS);
			bp.getRequestContext().put("com.sun.xml.ws.internal.connect.timeout", timeoutPBICMS);
			bp.getRequestContext().put("com.sun.xml.ws.request.timeout", timeoutPBICMS);
			bp.getRequestContext().put("com.sun.xml.internal.ws.request.timeout", timeoutPBICMS);
			/**/
			return binding;
		} catch (Exception e) {
			logger.error("An exception was thrown", e);
		} 
		logger.info("<= consumeWsdlPBICMS out");

		return binding;

	}
	
	public ResiliationHandlingSoapBindingStub consumeResiliationHandlingCreateContract() {
		logger.info("=> consumeResiliationHandlingCreateContract in");
		java.net.URL url;
		ResiliationHandlingSoapBindingStub binding = null;
		String wsdlUserSec = "";
		String wsdlUsername = "";
		String wsdlPassword = "";

		try {

			wsdlUserSec = this.getPropValues("wsdlUserSec");
			wsdlUsername = this.getPropValues("wsdlUsername");
			wsdlPassword = this.getPropValues("wsdlPassword");
			url = new URL(this.getPropValues("resiliationWsUrl"));
			int timeoutBSCS_CreateContract = Integer.parseInt(this.getPropValues("timeoutBSCS_CreateContract"));


			binding = (ResiliationHandlingSoapBindingStub) new ResiliationHandlingServiceLocator().getResiliationHandling(url);
			SOAPHeaderElement header = new SOAPHeaderElement(new PrefixedQName(this.getPropValues("SecQname"), "Security", wsdlUserSec));
			SOAPElement usernameToken = header.addChildElement("UsernameToken", wsdlUserSec);
			SOAPElement username = usernameToken.addChildElement("Username", wsdlUserSec);
			username.addTextNode(wsdlUsername);
			SOAPElement password = usernameToken.addChildElement("Password", wsdlUserSec);
			password.addTextNode(wsdlPassword);
			logger.info("timeoutBSCS_CreateContract : " + timeoutBSCS_CreateContract);

			binding.setTimeout(timeoutBSCS_CreateContract);

			binding.setHeader(header);

		} catch (Exception e) {
			logger.error("",e);
		}
		logger.info("<= consumeResiliationHandlingCreateContract out");
		return binding;
	}
}
