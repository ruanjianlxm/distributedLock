package com.jason.pandaLock.core.bean;

import java.util.Date;
import java.util.List;

import org.apache.zookeeper.CreateMode;

/**
 * @author 作者 E-mail:ruanjianlxm@sina.com
 * @version 创建时间：2015年9月11日 下午11:08:15
 * 类说明 每个锁的信息
 */
public class LockInfo {
	private String lockName;//锁名
	private String lockDescription;//锁的描述信息
	private CreateMode lockType;//锁的类型
	private Date createTime;//锁的创建时间
	private List<String> childNodesList;//该锁目前的所有子节点竞争者
	public String getLockName() {
		return lockName;
	}
	public void setLockName(String lockName) {
		this.lockName = lockName;
	}
	public String getLockDescription() {
		return lockDescription;
	}
	public void setLockDescription(String lockDescription) {
		this.lockDescription = lockDescription;
	}
	public CreateMode getLockType() {
		return lockType;
	}
	public void setLockType(CreateMode lockType) {
		this.lockType = lockType;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public List<String> getChildNodesList() {
		return childNodesList;
	}
	public void setChildNodesList(List<String> childNodesList) {
		this.childNodesList = childNodesList;
	}
	

}
