package com.edulab.config;

import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable
{
	@CreatedBy
	@JsonIgnore
	protected String createdBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	@JsonIgnore
	protected Date creadtedDate;
	
	@LastModifiedBy
	@JsonIgnore
	protected String lastModifiedBy;
	
	@LastModifiedDate
	@JsonIgnore
	@Temporal(TemporalType.TIMESTAMP)
	protected Date lastModifiedDate;

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreadtedDate() {
		return creadtedDate;
	}

	public void setCreadtedDate(Date creadtedDate) {
		this.creadtedDate = creadtedDate;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public Auditable(String createdBy, Date creadtedDate, String lastModifiedBy, Date lastModifiedDate) {
		super();
		this.createdBy = createdBy;
		this.creadtedDate = creadtedDate;
		this.lastModifiedBy = lastModifiedBy;
		this.lastModifiedDate = lastModifiedDate;
	}

	public Auditable() {
		super();
	}

	@Override
	public String toString() {
		return "Auditable [createdBy=" + createdBy + ", creadtedDate=" + creadtedDate + ", lastModifiedBy="
				+ lastModifiedBy + ", lastModifiedDate=" + lastModifiedDate + "]";
	}
	
	
	
}
