package com.service.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.DashboardTabs;
import com.persist.dao.DashboardDao;
import com.service.dao.DashboardService;

@Service("DashboardService")
public class DashboardServiceImpl implements DashboardService {

	@Autowired
	DashboardDao dashboardDao;

	@Override
	@Transactional
	public List<DashboardTabs> getItems() {
		return dashboardDao.getItems();
	}

}
