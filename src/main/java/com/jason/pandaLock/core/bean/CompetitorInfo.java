package com.jason.pandaLock.core.bean;
/**
 * @author 作者 E-mail:ruanjianlxm@sina.com
 * @version 创建时间：2015年9月11日 下午11:16:04
 * 类说明 每个锁的竞争者节点信息
 */
public class CompetitorInfo implements Comparable<Object> {
	private String nodeName;//锁竞争者信息
	private String nodeDescription;//锁竞争者描述
    private Long sequentialId;//该锁信息目前的ID
	public String getNodeName() {
		return nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	public String getNodeDescription() {
		return nodeDescription;
	}
	public void setNodeDescription(String nodeDescription) {
		this.nodeDescription = nodeDescription;
	}
	public  Long getSequentialId() {
		return sequentialId;
	}
	public void setSequentialId( Long sequentialId) {
		this.sequentialId = sequentialId;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nodeDescription == null) ? 0 : nodeDescription.hashCode());
		result = prime * result
				+ ((nodeName == null) ? 0 : nodeName.hashCode());
		result = prime * result
				+ ((sequentialId == null) ? 0 : sequentialId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompetitorInfo other = (CompetitorInfo) obj;
		if (nodeDescription == null) {
			if (other.nodeDescription != null)
				return false;
		} else if (!nodeDescription.equals(other.nodeDescription))
			return false;
		if (nodeName == null) {
			if (other.nodeName != null)
				return false;
		} else if (!nodeName.equals(other.nodeName))
			return false;
		if (sequentialId == null) {
			if (other.sequentialId != null)
				return false;
		} else if (!sequentialId.equals(other.sequentialId))
			return false;
		return true;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		CompetitorInfo competitorInfo=(CompetitorInfo)o;
		
		if (nodeName.equals(competitorInfo.getNodeName())) {
			return 0 ;
		}
		if (competitorInfo.getSequentialId()>this.sequentialId) {
			return 1;
		}else  {
			return -1;
		}
	}
}
