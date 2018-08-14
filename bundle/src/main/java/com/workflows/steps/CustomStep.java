package com.workflows.steps;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




import com.adobe.granite.workflow.WorkflowException;
import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkItem;
import com.adobe.granite.workflow.exec.WorkflowProcess;
import com.adobe.granite.workflow.metadata.MetaDataMap;
/*
import org.apache.felix.scr.annotations.Reference;

import com.day.cq.mailer.MessageGateway;
import com.day.cq.mailer.MessageGatewayService;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

*/
//This is a component so it can provide or consume services
@Component
@Service
@Properties({ @Property(name = Constants.SERVICE_DESCRIPTION, value = "Test Email workflow process implementation."),
		@Property(name = Constants.SERVICE_VENDOR, value = "Adobe"),
		@Property(name = "process.label", value = "Test Email Workflow Process") })
public class CustomStep implements WorkflowProcess {

	/** Default log. */
	protected final Logger log = LoggerFactory.getLogger(this.getClass());
	// Inject a MessageGatewayService
//	@Reference
//	private MessageGatewayService messageGatewayService;

	public void execute(WorkItem item, WorkflowSession wfsession, MetaDataMap args) throws WorkflowException {
		/*

		try {
			log.info("Here in execute method"); // ensure that the execute method is invoked

			// Declare a MessageGateway service
			MessageGateway<Email> messageGateway;

			// Set up the Email message
			Email email = new SimpleEmail();

			// Set the mail values
			String emailToRecipients = "tblue@nomailserver.com";
			String emailCcRecipients = "wblue@nomailserver.com";

			email.addTo(emailToRecipients);
			email.addCc(emailCcRecipients);
			email.setSubject("AEM Custom Step");
			email.setFrom("scottm@adobe.com");
			email.setMsg("This message is to inform you that the CQ content has been deleted");

			// Inject a MessageGateway Service and send the message
			messageGateway = messageGatewayService.getGateway(Email.class);

			// Check the logs to see that messageGateway is not null
			messageGateway.send((Email) email);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	*/
	}
}