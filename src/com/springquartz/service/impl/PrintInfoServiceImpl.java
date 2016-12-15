package com.springquartz.service.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import com.springquartz.bean.User;
import com.springquartz.service.IPrintInfoService;

/** 
 * @className:PrintInfoServiceImpl.java
 * @classDescription:
 * @author:Wentasy
 * @createTime:2012-7-15 ����07:59:33
 * @since:JDK 1.6
 */
public class PrintInfoServiceImpl extends SimpleJdbcDaoSupport implements IPrintInfoService{

	public User save() {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		System.out.println("现在是北京时间：" + this.format(now.getTime()));
		String sql = "insert into user (name,date) values(?,?)";
		User user = new User();
		user.setName("zhangsan");
		user.setDate("1212");
		Object[] param = new Object[]{user.getName(),user.getDate()};
		getSimpleJdbcTemplate().update(sql, param);
		return user;
	}
	
	public String format(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}
	
}
