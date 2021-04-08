package com.app.to;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.DashboardTabs;

public class TestCornJob {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void run() {
		Session theSession = null;
		try {
			theSession = sessionFactory.getCurrentSession();
			Criteria criteria = theSession.createCriteria(DashboardTabs.class);
			criteria.add(Restrictions.eq("id", 1));
			DashboardTabs dashboardTabs = (DashboardTabs) criteria.uniqueResult();
			int temp = dashboardTabs.getActivetab();
			System.out.println("Before Update :  "+temp);
			dashboardTabs.setActivetab(temp == 0 ? 1 : 0);
			theSession.saveOrUpdate(dashboardTabs);
			System.out.println("After Update  :  "+dashboardTabs.getActivetab());
		} catch (Exception ex) {
			System.out.println("Exception :  " + ex.getMessage());
		}

	}

}
