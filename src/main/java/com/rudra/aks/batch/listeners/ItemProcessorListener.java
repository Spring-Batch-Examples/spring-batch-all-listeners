package com.rudra.aks.batch.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemProcessListener;

import com.rudra.aks.batch.model.UserBO;

public class ItemProcessorListener implements ItemProcessListener<UserBO, UserBO> {

	private static Logger logger = LoggerFactory.getLogger(ItemProcessorListener.class);

	
	public void beforeProcess(UserBO item) {
		logger.info("Processing data from dump..." + item.getUsername());
	}

	public void afterProcess(UserBO item, UserBO result) {
		logger.info("Data Process completed : " + result.getUsername());
	}

	public void onProcessError(UserBO item, Exception e) {
		logger.error("Exception occurred while processing username : " + item.getUsername() + e);
	}

}
