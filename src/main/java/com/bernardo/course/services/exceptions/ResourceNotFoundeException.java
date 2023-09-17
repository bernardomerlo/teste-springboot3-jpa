package com.bernardo.course.services.exceptions;

public class ResourceNotFoundeException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundeException(Object id) {
		super("Resouce not found " + id);
	}

}
