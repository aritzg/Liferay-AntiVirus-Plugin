package com.liferay.portlet.documentlibrary.antivirus;

import com.liferay.portal.NoSuchModelException;

public class InfectedFileException extends NoSuchModelException {

	public InfectedFileException() {
		super();
	}

	public InfectedFileException(String msg) {
		super(msg);
	}

	public InfectedFileException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public InfectedFileException(Throwable cause) {
		super(cause);
	}
}
