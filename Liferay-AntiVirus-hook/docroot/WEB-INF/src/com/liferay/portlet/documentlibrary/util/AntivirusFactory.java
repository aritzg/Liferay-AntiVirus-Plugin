package com.liferay.portlet.documentlibrary.util;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portlet.documentlibrary.antivirus.Antivirus;

public class AntivirusFactory {
	public static Antivirus getIsntance(){
		if(_antivirus==null){
			ClassLoader classLoader = PortalClassLoaderUtil.getClassLoader();
			try {
				//TODO: get class from properties file.
				_antivirus = (Antivirus)classLoader.loadClass("com.liferay.portlet.documentlibrary.antivirus.ClamAV").newInstance();
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		if (_log.isDebugEnabled()) {
			_log.debug("Return " + _antivirus.getClass().getName());
		}
		return _antivirus;
	}
	
	private static Log _log = LogFactoryUtil.getLog(AntivirusFactory.class);
	private static Antivirus _antivirus;

}
