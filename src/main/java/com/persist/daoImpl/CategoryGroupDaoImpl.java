package com.persist.daoImpl;

import java.util.List;
import java.util.ResourceBundle;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.CategoryGroup;
import com.persist.dao.CategoryGroupDao;

@Repository("CategoryGroupDao")
public class CategoryGroupDaoImpl implements CategoryGroupDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/*RESOURCE BUNDLE */
	static ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle("AppProps");
	
	
	@Override
	@Transactional
	public List<CategoryGroup> getCategoryGroups() {
		Session theSession = null;
		List<CategoryGroup> categoryGroups = null;
		try {
			theSession = sessionFactory.getCurrentSession();
			Criteria criteria = theSession.createCriteria(CategoryGroup.class);
			criteria.add(Restrictions.eq("activeStatus", Integer.parseInt(RESOURCE_BUNDLE.getString("productVisibility").trim())));
			categoryGroups = criteria.list();
		}catch(Exception ex) {
			System.out.println("Exception at GetCategoryGroups :  " + ex.getMessage());
		}
		return categoryGroups;
	}

}
