package com.rudra.aks.batch.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemReadListener;

public class ItemReaderListener<UserBO> implements ItemReadListener<UserBO> {

	private static Logger logger = LoggerFactory.getLogger(ItemReaderListener.class);

	
	public void beforeRead() {
		logger.info("Reading data from dump...");
	}

	public void afterRead(UserBO item) {
		logger.info("Data Read completed : " + item);
		
	}

	public void onReadError(Exception ex) {
		logger.error("Exception while reading data: " + ex);
	}

}
