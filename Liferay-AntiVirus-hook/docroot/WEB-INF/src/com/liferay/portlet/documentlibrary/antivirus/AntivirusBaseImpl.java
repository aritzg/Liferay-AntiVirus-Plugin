package com.liferay.portlet.documentlibrary.antivirus;

import java.io.File;
import java.io.InputStream;

import com.liferay.portlet.documentlibrary.util.Antivirus;

public class AntivirusBaseImpl implements Antivirus {

	@Override
	public String scanFile(File file) {
		return Antivirus.VIRUS_SCAN_STATUS_SUCESS;
	}
	
	@Override
	public String scanFile(InputStream is) {
		return Antivirus.VIRUS_SCAN_STATUS_SUCESS;
	}
	
}
