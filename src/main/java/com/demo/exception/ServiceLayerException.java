package com.demo.exception;

/**
 * Exception to encapsulate any thrown exception by the SERVICE layer And render
 * it to client REST API
 * 
 * @author Ramroum
 *
 */
public class ServiceLayerException extends Exception {

	public ServiceLayerException(String exceptionMessage) {
		
		super(exceptionMessage);
		
	}
}
