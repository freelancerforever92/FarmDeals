package com.service.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.CategoryGroup;
import com.persist.dao.CategoryGroupDao;
import com.service.dao.CategoryGroupService;

@Service("CategoryGroupService")
public class CategoryGroupServiceImpl implements CategoryGroupService {

	
	@Autowired
	CategoryGroupDao categoryGroupDao;
	
	@Override
	@Transactional
	public List<CategoryGroup> getCategoryGroups() {
		return categoryGroupDao.getCategoryGroups();
	}

}
