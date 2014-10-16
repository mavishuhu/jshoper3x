package com.jshop.entity;

// Generated 2014-10-9 18:51:28 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ActHiIdentitylink generated by hbm2java
 */
@Entity
@Table(name = "act_hi_identitylink", catalog = "jshoper3")
public class ActHiIdentitylink implements java.io.Serializable {

	private String id;
	private String groupId;
	private String type;
	private String userId;
	private String taskId;
	private String procInstId;

	public ActHiIdentitylink() {
	}

	public ActHiIdentitylink(String id) {
		this.id = id;
	}

	public ActHiIdentitylink(String id, String groupId, String type,
			String userId, String taskId, String procInstId) {
		this.id = id;
		this.groupId = groupId;
		this.type = type;
		this.userId = userId;
		this.taskId = taskId;
		this.procInstId = procInstId;
	}

	@Id
	@Column(name = "ID_", unique = true, nullable = false, length = 64)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "GROUP_ID_")
	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	@Column(name = "TYPE_")
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "USER_ID_")
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "TASK_ID_", length = 64)
	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	@Column(name = "PROC_INST_ID_", length = 64)
	public String getProcInstId() {
		return this.procInstId;
	}

	public void setProcInstId(String procInstId) {
		this.procInstId = procInstId;
	}

}
