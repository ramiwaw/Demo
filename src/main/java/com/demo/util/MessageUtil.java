package com.demo.util;

public class MessageUtil {
	
	public static final String ATOME = "Atome";
	
	public static final String ID_IS_REQUIRED = "An id is required";
	
	public static final String INTERNAL_SERVER_ERROR = "An error occured";
	
	public static final String NOT_FOUND = " does not exist";
	
	public static final String NOT_DELETED = " was not deleted";
	
	private MessageUtil() {
		
	}
	
	public static String getNotFoundMessage(String dtoName, String id) {

		return new StringBuilder()
				.append(dtoName)
				.append(id)
				.append(NOT_FOUND)
				.toString();
	}
	
	public static String getNotFoundMessage(String dtoName, Long id) {

		return new StringBuilder()
				.append(dtoName)
				.append(id)
				.append(NOT_FOUND)
				.toString();
	}
	
	public static String getNotDeletedMessage(String dtoName, String id) {
		
		return new StringBuilder()
				.append(dtoName)
				.append(id)
				.append(NOT_DELETED)
				.toString();
	}
	
public static String getNotDeletedMessage(String dtoName, Long id) {
		
		return new StringBuilder()
				.append(dtoName)
				.append(id)
				.append(NOT_DELETED)
				.toString();
	}

}
