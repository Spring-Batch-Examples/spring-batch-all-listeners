package com.rudra.aks.batch.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.scope.context.ChunkContext;

public class ChunkListener implements org.springframework.batch.core.ChunkListener {

	private static Logger logger = LoggerFactory.getLogger(ChunkListener.class);

	
	public void beforeChunk(ChunkContext context) {
		logger.info("Listener executing before chunk processing... ");
	}

	public void afterChunk(ChunkContext context) {
		logger.info("Chunk is processed completely.");
	}

	public void afterChunkError(ChunkContext context) {
		logger.error("Chunk got errored with " );
		
	}

}
