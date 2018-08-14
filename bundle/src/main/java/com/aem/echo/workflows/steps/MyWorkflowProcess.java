package com.aem.echo.workflows.steps;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;
import org.osgi.framework.Constants;

import com.adobe.granite.workflow.WorkflowException;
import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkItem;
import com.adobe.granite.workflow.exec.WorkflowProcess;
import com.adobe.granite.workflow.metadata.MetaDataMap;


@Component
@Service
@Properties({ @Property(name = Constants.SERVICE_DESCRIPTION, value = "A simple custom workflow step."),
		@Property(name = Constants.SERVICE_VENDOR, value = "SQLI"),
		@Property(name = "process.label", value = "Add Customer Workflow Process") })
public class MyWorkflowProcess implements WorkflowProcess {

	public void execute(WorkItem workItem, WorkflowSession workflowSession, MetaDataMap metaDataMap)
			throws WorkflowException {

		// code

	}

}