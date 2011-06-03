package com.liferay.portlet.documentlibrary.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalService;
import com.philvarner.clamavj.ClamScan;
import com.philvarner.clamavj.ScanResult;

public class DLFileEntryAntiVirusLocalService extends DLFileEntryLocalServiceWrapper{

        private static final int PORT_NUMBER = 3310;
	private static final int TIME_OUT = 60;
	private static final String VIRUS_SCAN_STATUS_SUCESS = "PASSED";
	private static final String VIRUS_SCAN_STATUS_FAILURE = "FAILED";
	private static final String VIRUS_SCAN_STATUS_ERROR = "ERROR";

	public DLFileEntryAntiVirusLocalService(
			DLFileEntryLocalService dlFileEntryLocalService) {
		super(dlFileEntryLocalService);
	}
	
	@Override
	public DLFileEntry addDLFileEntry(DLFileEntry dlFileEntry)
			throws SystemException {
		// TODO Auto-generated method stub
		return super.addDLFileEntry(dlFileEntry);
	}
	
	@Override
	public DLFileEntry addFileEntry(long userId, long groupId, long folderId,
			String name, String title, String description, String changeLog,
			String extraSettings, byte[] bytes, ServiceContext serviceContext)
			throws PortalException, SystemException {
		// TODO Auto-generated method stub
		return super.addFileEntry(userId, groupId, folderId, name, title, description,
				changeLog, extraSettings, bytes, serviceContext);
	}
	
	@Override
	public DLFileEntry addFileEntry(long userId, long groupId, long folderId,
			String name, String title, String description, String changeLog,
			String extraSettings, File file, ServiceContext serviceContext)
			throws PortalException, SystemException {

		// TODO Auto-generated method stub

		DLFileEntry dlFileEntry = null;
		
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			ClamScan clamScan = new ClamScan(inetAddress.getHostAddress(), PORT_NUMBER, TIME_OUT);
			InputStream inputStream;
			
			try {
				inputStream = new FileInputStream(file);
				ScanResult scanResult =  clamScan.scan(inputStream);
				
				if(scanResult.getStatus().toString().equals(VIRUS_SCAN_STATUS_SUCESS)){
					dlFileEntry = super.addFileEntry(userId, groupId, folderId, name, title, description,
							changeLog, extraSettings, file, serviceContext);
					//System.out.println("Scanned sucess fully..");
				}else if(scanResult.getStatus().toString().equals(VIRUS_SCAN_STATUS_FAILURE)){
					
					File virusFile = new File("");
					dlFileEntry = super.addFileEntry(userId, groupId, folderId, name, title, description,
							changeLog, extraSettings, virusFile, serviceContext);
					
					//System.out.println("Virus detected!!!");
				}else{
					//System.out.println("Error !!");
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dlFileEntry;
	}
	
	@Override
	public DLFileEntry addFileEntry(long userId, long groupId, long folderId,
			String name, String title, String description, String changeLog,
			String extraSettings, InputStream is, long size,
			ServiceContext serviceContext) throws PortalException,
			SystemException {
		// TODO Auto-generated method stub
		return super.addFileEntry(userId, groupId, folderId, name, title, description,
				changeLog, extraSettings, is, size, serviceContext);
	}
	
	@Override
	public DLFileEntry createDLFileEntry(long fileEntryId) {
		// TODO Auto-generated method stub
		return super.createDLFileEntry(fileEntryId);
	}
	
	@Override
	public DLFileEntry updateDLFileEntry(DLFileEntry dlFileEntry)
			throws SystemException {
		// TODO Auto-generated method stub
		return super.updateDLFileEntry(dlFileEntry);
	}
	
	@Override
	public DLFileEntry updateDLFileEntry(DLFileEntry dlFileEntry, boolean merge)
			throws SystemException {
		// TODO Auto-generated method stub
		return super.updateDLFileEntry(dlFileEntry, merge);
	}
	
	@Override
	public DLFileEntry updateFileEntry(long userId, long groupId,
			long folderId, String name, String sourceFileName, String title,
			String description, String changeLog, boolean majorVersion,
			String extraSettings, byte[] bytes, ServiceContext serviceContext)
			throws PortalException, SystemException {
		// TODO Auto-generated method stub
		return super.updateFileEntry(userId, groupId, folderId, name, sourceFileName,
				title, description, changeLog, majorVersion, extraSettings, bytes,
				serviceContext);
	}
	
	@Override
	public DLFileEntry updateFileEntry(long userId, long groupId,
			long folderId, String name, String sourceFileName, String title,
			String description, String changeLog, boolean majorVersion,
			String extraSettings, File file, ServiceContext serviceContext)
			throws PortalException, SystemException {
		// TODO Auto-generated method stub
		return super.updateFileEntry(userId, groupId, folderId, name, sourceFileName,
				title, description, changeLog, majorVersion, extraSettings, file,
				serviceContext);
	}
	
	@Override
	public DLFileEntry updateFileEntry(long userId, long groupId,
			long folderId, String name, String sourceFileName, String title,
			String description, String changeLog, boolean majorVersion,
			String extraSettings, InputStream is, long size,
			ServiceContext serviceContext) throws PortalException,
			SystemException {
		// TODO Auto-generated method stub
		return super.updateFileEntry(userId, groupId, folderId, name, sourceFileName,
				title, description, changeLog, majorVersion, extraSettings, is, size,
				serviceContext);
	}
	
	
}
