package com.liferay.portlet.documentlibrary.util;

import java.io.File;
import java.io.InputStream;

public interface Antivirus {
	
	public String scanFile(File file);
	
	public String scanFile(InputStream is);
	
	public static final String VIRUS_SCAN_STATUS_SUCESS = "PASSED";
	public static final String VIRUS_SCAN_STATUS_FAILURE = "FAILED";
	public static final String VIRUS_SCAN_STATUS_ERROR = "ERROR";	
}
