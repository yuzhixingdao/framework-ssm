package com.aac.framework.exception;

public class ControllerException extends BaseException {
	public ControllerException(Throwable cause) {
		super(cause);
	}

	public ControllerException(String message) {
		super(message);
	}

	public ControllerException(String msg, Throwable ex) {
		super(msg, ex);
	}
}
