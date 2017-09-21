package com.louis.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "operations")
public class Operations {
	@Id
	private String id;
	
	private String args;
	
	private String classmethod;
	
	private String ip;
	
	private String method;
	
	private Date reqdatetime;
	
	private Byte reqresult = 1;
	
	private Date savedatetime;
	
	private String url;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}
	
	public String getArgs() {
		return args;
	}
	
	public void setArgs(String args) {
		this.args = args == null ? null : args.trim();
	}
	
	public String getClassmethod() {
		return classmethod;
	}
	
	public void setClassmethod(String classmethod) {
		this.classmethod = classmethod == null ? null : classmethod.trim();
	}
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip == null ? null : ip.trim();
	}
	
	public String getMethod() {
		return method;
	}
	
	public void setMethod(String method) {
		this.method = method == null ? null : method.trim();
	}
	
	public Date getReqdatetime() {
		return reqdatetime;
	}
	
	public void setReqdatetime(Date reqdatetime) {
		this.reqdatetime = reqdatetime;
	}
	
	public Byte getReqresult() {
		return reqresult;
	}
	
	public void setReqresult(Byte reqresult) {
		this.reqresult = reqresult;
	}
	
	public Date getSavedatetime() {
		return savedatetime;
	}
	
	public void setSavedatetime(Date savedatetime) {
		this.savedatetime = savedatetime;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}
}