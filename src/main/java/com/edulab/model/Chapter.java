package com.edulab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.edulab.config.Auditable;

@Entity
public class Chapter extends Auditable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="chapterId", unique=true)
	@NotNull
	private int chapterId;
	
	@Column(name="chapterName")
	@NotNull
	private String chapterName;
	
	@Column(name="description", unique=true)
	@NotNull
	private String description;

	public int getChapterId() {
		return chapterId;
	}

	public void setChapterId(int chapterId) {
		this.chapterId = chapterId;
	}

	public String getChapterName() {
		return chapterName;
	}

	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Chapter() {
		super();
	}

	@Override
	public String toString() {
		return "Chapter [chapterId=" + chapterId + ", chapterName=" + chapterName + ", description=" + description
				+ "]";
	}
		
}
