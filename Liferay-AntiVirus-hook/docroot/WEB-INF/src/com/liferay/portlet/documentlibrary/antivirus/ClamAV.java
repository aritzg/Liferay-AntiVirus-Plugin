package com.liferay.portlet.documentlibrary.antivirus;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.InetAddress;

public class ClamAV extends AntivirusBaseImpl {
	
	public String scanFile(File file) {		
		InputStream inputStream;
		try {
			inputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			return VIRUS_SCAN_STATUS_ERROR;
		}
		return scanFile(inputStream);
	}
	
	public String scanFile(InputStream is) {		
		String result = Antivirus.VIRUS_SCAN_STATUS_ERROR;
		
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			/*ClamScan clamScan = new ClamScan(
				inetAddress.getHostAddress(), PORT_NUMBER, TIME_OUT);
			
			ScanResult scanResult = clamScan.scan(is);
			result = scanResult.getStatus().toString();		*/	
		}
		catch (Exception e) {
		}
		
		return result;
	}
	
	private static final int PORT_NUMBER = 3310;
	private static final int TIME_OUT = 60;
	

}
