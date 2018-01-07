package com.javalec.Environment;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean {
	
	private Environment env;
	private String AdminId;
	private String AdminPw;
	
	@Override
	public void setEnvironment(Environment env) {
		// TODO Auto-generated method stub
		System.out.println("setEnvironment()");
		setEnv(env);
	}
	
	public void setEnv(Environment env){
		this.env = env;
	}
	
	public String getAdminId() {
		return AdminId;
	}
	public void setAdminId(String adminId) {
		AdminId = adminId;
	}
	public String getAdminPw() {
		return AdminPw;
	}
	public void setAdminPw(String adminPw) {
		AdminPw = adminPw;
	}	
	
	@Override
	public void afterPropertiesSet() throws Exception{
		System.out.println("afterpropertiesSet()");
		setAdminId(env.getProperty("admin.id"));
		setAdminPw(env.getProperty("admin.pw"));
	}
	
	@Override
	public void destroy() throws Exception{
		System.out.println("destroy");
	}
	
}
