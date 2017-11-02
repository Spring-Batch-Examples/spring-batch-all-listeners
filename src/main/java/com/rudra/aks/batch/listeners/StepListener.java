package com.rudra.aks.batch.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class StepListener implements StepExecutionListener {

	
	private static Logger logger = LoggerFactory.getLogger(StepListener.class);

	
	public void beforeStep(StepExecution stepExecution) {
		logger.info("Step " + stepExecution.getStepName() + " is being executed...");
	}

	public ExitStatus afterStep(StepExecution stepExecution) {
		logger.info("Step is completed for job with staus as : " + stepExecution.getStatus());
		
		return stepExecution.getExitStatus();
	}

}
