package com.louis.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "csvpartbase")
public class Csvpartbase {
	@Id
	private String id;
	
	private String mac;
	
	private String ip;
	
	private String upip;
	
	private String upname;
	
	private String upindex;
	
	private String modifytime;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}
	
	public String getMac() {
		return mac;
	}
	
	public void setMac(String mac) {
		this.mac = mac == null ? null : mac.trim();
	}
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip == null ? null : ip.trim();
	}
	
	public String getUpip() {
		return upip;
	}
	
	public void setUpip(String upip) {
		this.upip = upip == null ? null : upip.trim();
	}
	
	public String getUpname() {
		return upname;
	}
	
	public void setUpname(String upname) {
		this.upname = upname == null ? null : upname.trim();
	}
	
	public String getUpindex() {
		return upindex;
	}
	
	public void setUpindex(String upindex) {
		this.upindex = upindex == null ? null : upindex.trim();
	}
	
	public String getModifytime() {
		return modifytime;
	}
	
	public void setModifytime(String modifytime) {
		this.modifytime = modifytime == null ? null : modifytime.trim();
	}
	
	@Override
	public String toString() {
		return "Csvpartbase{" +
				"id='" + id + '\'' +
				", mac='" + mac + '\'' +
				", ip='" + ip + '\'' +
				", upip='" + upip + '\'' +
				", upname='" + upname + '\'' +
				", upindex='" + upindex + '\'' +
				", modifytime='" + modifytime + '\'' +
				'}';
	}
}