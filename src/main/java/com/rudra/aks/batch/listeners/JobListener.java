package com.rudra.aks.batch.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class JobListener implements JobExecutionListener {

	private static Logger logger = LoggerFactory.getLogger(JobListener.class);
	
	
	public void beforeJob(JobExecution jobExecution) {
		logger.info("Job " + jobExecution.getJobId() + " is being started.");
	}

	public void afterJob(JobExecution jobExecution) {
		logger.info("Job is executed with status as : " + jobExecution.getStatus() + " .");
	}

}
