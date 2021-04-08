package com.app.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="DASHBOARD_TABS")
public class DashboardTabs {
	private int id;
	private String keycode;
	private String tabcaption;
	private String taburl;
	private int activetab;
	private Date createdOn;
	private int createdby;
	private Date updatedOn;
	private int updatedby;
	
	public DashboardTabs() {
		super();
	}
	
	public DashboardTabs(int id, String keycode, String tabcaption,String taburl, int activetab, Date createdOn, int createdby,	Date updatedOn, int updatedby) {
		super();
		this.id = id;
		this.keycode = keycode;
		this.tabcaption = tabcaption;
		this.taburl = taburl;
		this.activetab = activetab;
		this.createdOn = createdOn;
		this.createdby = createdby;
		this.updatedOn = updatedOn;
		this.updatedby = updatedby;
	}

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="KEYCODE")
	public String getKeycode() {
		return keycode;
	}

	public void setKeycode(String keycode) {
		this.keycode = keycode;
	}

	@Column(name="TAB_CAPTION")
	public String getTabcaption() {
		return tabcaption;
	}

	public void setTabcaption(String tabcaption) {
		this.tabcaption = tabcaption;
	}

	@Column(name="TAB_URL")
	public String getTaburl() {
		return taburl;
	}

	public void setTaburl(String taburl) {
		this.taburl = taburl;
	}

	@Column(name="TAB_ACTIVE_STATUS")
	public int getActivetab() {
		return activetab;
	}

	public void setActivetab(int activetab) {
		this.activetab = activetab;
	}

	@Column(name="CREATED_ON")
	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name="CREATED_BY")
	public int getCreatedby() {
		return createdby;
	}

	public void setCreatedby(int createdby) {
		this.createdby = createdby;
	}

	@Column(name="UPDATED_ON")
	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Column(name="UPDATED_BY")
	public int getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(int updatedby) {
		this.updatedby = updatedby;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DashboardTabs [id=" + id + ", keycode=" + keycode
				+ ", tabcaption=" + tabcaption + ", taburl=" + taburl
				+ ", activetab=" + activetab + ", createdOn=" + createdOn
				+ ", createdby=" + createdby + ", updatedOn=" + updatedOn
				+ ", updatedby=" + updatedby + "]";
	}
	
	
	
}
