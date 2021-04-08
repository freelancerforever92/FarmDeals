package com.app.model;

import java.util.Date;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CATEGORY_TITLE")
public class CategoryTitle implements Serializable {

	private static final long serialVersionUID = -7738943296361477344L;
	private int titleId;
	private String titleCaption;
	private Float GSTPercentage;
	private String titleKeycode;
	private String categoryGroupReferenceCode;
	private int visibility;
	private int approvalStatus;
	private Date createdOn;
	private int createdBy;
	private Date updatedOn;
	private int updatedBy;

	private String cancelFlag;
	private int cancelledBy;
	private Date cancelledOn;

	private Set<CategoryItems> categoryItemsList = new HashSet<CategoryItems>();

	public CategoryTitle() {

	}

	public CategoryTitle(int titleId, String titleCaption, String titleKeycode,
			int visibility, int approvalStatus, Date createdOn,
			int createdBy, Date updatedOn, int updatedBy, String cancelFlag,
			int cancelledBy, Date cancelledOn,
			Set<CategoryItems> categoryItemsList) {
		super();
		this.titleId = titleId;
		this.titleCaption = titleCaption;
		this.titleKeycode = titleKeycode;
		this.visibility = visibility;
		this.approvalStatus = approvalStatus;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
		this.updatedOn = updatedOn;
		this.updatedBy = updatedBy;
		this.cancelFlag = cancelFlag;
		this.cancelledBy = cancelledBy;
		this.cancelledOn = cancelledOn;
		this.categoryItemsList = categoryItemsList;
	}

	@Id
	@Column(name = "TITLE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getTitleId() {
		return titleId;
	}

	public void setTitleId(int titleId) {
		this.titleId = titleId;
	}

	@Column(name = "TITLE_CAPTION")
	public String getTitleCaption() {
		return titleCaption;
	}

	public void setTitleCaption(String titleCaption) {
		this.titleCaption = titleCaption;
	}
	
	@Column(name = "GST_TAX_PERCENTAGE")
	
	public Float getGSTPercentage() {
		return GSTPercentage;
	}

	public void setGSTPercentage(Float gSTPercentage) {
		GSTPercentage = gSTPercentage;
	}

	@Column(name = "TITLE_KEYCODE")
	public String getTitleKeycode() {
		return titleKeycode;
	}

	public void setTitleKeycode(String titleKeycode) {
		this.titleKeycode = titleKeycode;
	}
	
	@Column(name="CATEGORY_GROUP_REF")
	public String getCategoryGroupReferenceCode() {
		return categoryGroupReferenceCode;
	}

	public void setCategoryGroupReferenceCode(String categoryGroupReferenceCode) {
		this.categoryGroupReferenceCode = categoryGroupReferenceCode;
	}

	@Column(name="VISIBILTY")
	public int getVisibility() {
		return visibility;
	}

	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}

	@Column(name = "APPROVALSTATUS")
	public int getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(int approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	@Column(name = "CREATEDON")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name = "CREATEDBY")
	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "UPDATEDON")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Column(name = "UPDATEDBY")
	public int getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	// , mappedBy = ""
	@JoinTable(name = "TITLE_ITEM", joinColumns = @JoinColumn(name = "TITLE_ID"), inverseJoinColumns = @JoinColumn(name = "ITEM_ID"))
	public Set<CategoryItems> getCategoryItemsList() {
		return categoryItemsList;
	}

	public void setCategoryItemsList(Set<CategoryItems> categoryItemsList) {
		this.categoryItemsList = categoryItemsList;
	}

	@Column(name = "CANCELFLAG")
	public String getCancelFlag() {
		return cancelFlag;
	}

	public void setCancelFlag(String cancelFlag) {
		this.cancelFlag = cancelFlag;
	}

	@Column(name = "CANCELLEDBY")
	public int getCancelledBy() {
		return cancelledBy;
	}

	public void setCancelledBy(int cancelledBy) {
		this.cancelledBy = cancelledBy;
	}

	@Column(name = "CANCELLEDON")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getCancelledOn() {
		return cancelledOn;
	}

	public void setCancelledOn(Date cancelledOn) {
		this.cancelledOn = cancelledOn;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CategoryTitle [titleId=" + titleId + ", titleCaption="
				+ titleCaption + ", titleKeycode=" + titleKeycode
				+ ", visibility=" + visibility + ", approvalStatus="
				+ approvalStatus + ", createdOn=" + createdOn + ", createdBy="
				+ createdBy + ", updatedOn=" + updatedOn + ", updatedBy="
				+ updatedBy + ", cancelFlag=" + cancelFlag + ", cancelledBy="
				+ cancelledBy + ", cancelledOn=" + cancelledOn
				+ ", categoryItemsList=" + categoryItemsList + "]";
	}

	
}
