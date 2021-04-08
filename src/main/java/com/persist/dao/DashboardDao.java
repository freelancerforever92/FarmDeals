package com.persist.dao;

import java.util.List;

import com.app.model.DashboardTabs;

public interface DashboardDao {
	public List<DashboardTabs> getItems();
}
