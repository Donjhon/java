package com.springquartz.bean;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.springquartz.service.IPrintInfoService;

/** 
 * @className:Mission.java
 * @classDescription:
 * @author:Wentasy
 * @createTime:2012-7-15 ����07:14:36
 * @since:JDK 1.6
 */
public class PrintInfoJob extends QuartzJobBean{
	
	private IPrintInfoService prinfInfoService = null;
	public IPrintInfoService getPrinfInfoService() {
		return prinfInfoService;
	}
	public void setPrinfInfoService(IPrintInfoService prinfInfoService) {
		this.prinfInfoService = prinfInfoService;
	}
	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		// TODO Auto-generated method stub
		this.prinfInfoService.save();
		
	}
}
