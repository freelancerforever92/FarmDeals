package com.persist.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.DashboardTabs;
import com.persist.dao.DashboardDao;

@Repository("DashboardDao")
public class DashboardDaoImpl implements DashboardDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<DashboardTabs> getItems() {
		Session theSession = null;
		List<DashboardTabs> tabs = null;
		try {
			theSession = sessionFactory.getCurrentSession();
			Criteria criteria = theSession.createCriteria(DashboardTabs.class);
			tabs = criteria.list();
		} catch (Exception exception) {
			System.out.println("Exception :  " + exception.getMessage());
		}
		return tabs;
	}

}
