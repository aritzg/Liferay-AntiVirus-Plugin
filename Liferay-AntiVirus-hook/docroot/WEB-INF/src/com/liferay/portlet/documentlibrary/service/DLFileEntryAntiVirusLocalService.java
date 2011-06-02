package com.liferay.portlet.documentlibrary.service;

import java.io.File;
import java.io.InputStream;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;

public class DLFileEntryAntiVirusLocalService extends DLFileEntryLocalServiceWrapper{

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
		return super.addFileEntry(userId, groupId, folderId, name, title, description,
				changeLog, extraSettings, file, serviceContext);
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
