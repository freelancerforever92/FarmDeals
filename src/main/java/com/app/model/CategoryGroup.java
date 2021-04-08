package com.app.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="CATEGORY_GROUP")

public class CategoryGroup implements Serializable {

	private static final long serialVersionUID = -2196640704714017497L;
	
	private int groupId;
	private String groupCaption;
	private String groupKeyCode;
	private String groupCategoryImage;
	private int activeStatus;
	private Date createdOn;
	private String createdBy;
	private Date updatedOn;
	private int updatedBy;
	private Set<CategoryTitle> categoryTitles = new HashSet<CategoryTitle>();
	
	public CategoryGroup(){
		
	}
	
	public CategoryGroup(String groupName,int activeStatus){
		this.groupCaption=groupName;
		this.activeStatus=activeStatus;
	}
	
	public CategoryGroup(String groupName,int activeStatus ,Set<CategoryTitle> categoryTitles ){
		this.groupCaption=groupName;
		this.activeStatus=activeStatus;
		this.categoryTitles=categoryTitles;
	}
	
	@Id
	@Column(name="GROUP_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getGroupId() {
		return groupId;
	}
	
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	
	@Column(name="GROUP_NAME")
	public String getGroupCaption() {
		return groupCaption;
	}
	
	public void setGroupCaption(String groupCaption) {
		this.groupCaption = groupCaption;
	}
	
	@Column(name="GROUP_KEYCODE")
	public String getGroupKeyCode() {
		return groupKeyCode;
	}

	public void setGroupKeyCode(String groupKeyCode) {
		this.groupKeyCode = groupKeyCode;
	}

	@Column(name="IMAGE_NAME")
	public String getGroupCategoryImage() {
		return groupCategoryImage;
	}

	public void setGroupCategoryImage(String groupCategoryImage) {
		this.groupCategoryImage = groupCategoryImage;
	}
	
	@Column(name="ACTIVE_STATUS")
	public int getActiveStatus() {
		return activeStatus;
	}
	
	public void setActiveStatus(int activeStatus) {
		this.activeStatus = activeStatus;
	}
	
	@Column(name="CREATED_DATE")
	@Temporal (TemporalType.TIMESTAMP)
	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name="UPDATED_DATE")
	@Temporal (TemporalType.TIMESTAMP)
	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Column(name="CREATED_BY")
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name="UPDATED_BY")
	public int getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}

	@OneToMany(cascade = CascadeType.ALL , fetch=FetchType.LAZY)
	@JoinTable(
			name = "GROUP_TITLE",
			joinColumns = @JoinColumn(name = "GROUP_ID"),
			inverseJoinColumns = @JoinColumn(name = "TITLE_ID")
	)
	
	public Set<CategoryTitle> getCategoryTitles() {
		return categoryTitles;
	}

	
	public void setCategoryTitles(Set<CategoryTitle> categoryTitles) {
		this.categoryTitles = categoryTitles;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CategoryGroup [groupId=" + groupId + ", groupCaption="
				+ groupCaption + ", groupKeyCode=" + groupKeyCode
				+ ", groupCategoryImage=" + groupCategoryImage
				+ ", activeStatus=" + activeStatus + ", createdOn=" + createdOn
				+ ", createdBy=" + createdBy + ", updatedOn=" + updatedOn
				+ ", updatedBy=" + updatedBy + ", categoryTitles="
				+ categoryTitles + "]";
	}
}
