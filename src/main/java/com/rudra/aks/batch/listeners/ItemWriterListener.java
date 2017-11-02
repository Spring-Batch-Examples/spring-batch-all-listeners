package com.rudra.aks.batch.listeners;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemWriteListener;

import com.rudra.aks.batch.model.UserBO;

public class ItemWriterListener implements ItemWriteListener<UserBO> {

	private static Logger logger = LoggerFactory.getLogger(ItemWriterListener.class);

	public void beforeWrite(List<? extends UserBO> items) {
		logger.info("Data Writing of size : " + items.size());
	}

	public void afterWrite(List<? extends UserBO> items) {
		logger.info("Items written to db : " + items.size());
	}

	public void onWriteError(Exception exception, List<? extends UserBO> items) {
		logger.error("Exception occurred while writing data to db: " + exception);
	}

}
