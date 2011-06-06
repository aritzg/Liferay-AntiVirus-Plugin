package com.liferay.portlet.documentlibrary.antivirus;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.InetAddress;

import com.liferay.portlet.documentlibrary.service.ClamScan;
import com.liferay.portlet.documentlibrary.service.ScanResult;
import com.liferay.portlet.documentlibrary.util.Antivirus;

public class ClamAV extends AntivirusBaseImpl {
	
	public String scanFile(File file) {		
		InputStream inputStream = new FileInputStream(file);
		return scanFile(inputStream);
	}
	
	public String scanFile(InputStream is) {		
		String result = Antivirus.VIRUS_SCAN_STATUS_ERROR;
		
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			ClamScan clamScan = new ClamScan(
				inetAddress.getHostAddress(), PORT_NUMBER, TIME_OUT);
			
			ScanResult scanResult = clamScan.scan(is);
			result = scanResult.getStatus().toString();			
		}
		catch (Exception e) {
		}
		
		return result;
	}
	
	private static final int PORT_NUMBER = 3310;
	private static final int TIME_OUT = 60;
	

}
