package com.liferay.portlet.documentlibrary.antivirus;

import java.io.File;
import java.io.InputStream;

public interface Antivirus {

	public static final int TIME_OUT = 60;
	public static final String VIRUS_SCAN_STATUS_SUCESS = "PASSED";
	public static final String VIRUS_SCAN_STATUS_FAILURE = "FAILED";
	public static final String VIRUS_SCAN_STATUS_ERROR = "ERROR";
	
	public String scanFile(File file);

	public String scanFile(InputStream is);
	
}
