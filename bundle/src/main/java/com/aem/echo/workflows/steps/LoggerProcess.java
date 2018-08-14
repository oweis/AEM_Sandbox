package com.aem.echo.workflows.steps;
 
import com.adobe.granite.workflow.WorkflowException;
import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkItem;
import com.adobe.granite.workflow.exec.WorkflowData;
import com.adobe.granite.workflow.exec.WorkflowProcess;
import com.adobe.granite.workflow.metadata.MetaDataMap;
 
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
   
import javax.jcr.Node;
import javax.jcr.RepositoryException;
import java.util.Arrays;
   
/**
 * Sample workflow process that logs arguments into the logfile.
 */
@Component
@Service
@Properties({
        @Property(name = Constants.SERVICE_DESCRIPTION, value = "Logger process implementation."),
        @Property(name = Constants.SERVICE_VENDOR, value = "Adobe"),
        @Property(name = "process.label", value = "Logger Process")})
public class LoggerProcess implements WorkflowProcess {
   
   private static final Logger log = LoggerFactory.getLogger(LoggerProcess.class);
   
    public void execute(WorkItem item, WorkflowSession session, MetaDataMap args) throws WorkflowException {
        String singleValue = args.get("argSingle", "not set");
        String[] multiValue = args.get("argMulti", new String[]{"not set"});
   
        log.info("---> Single Value: {}", singleValue);
        log.info("---> Multi Value: {}", Arrays.toString(multiValue));
    }
}