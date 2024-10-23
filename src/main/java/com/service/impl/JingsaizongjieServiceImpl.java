package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JingsaizongjieDao;
import com.entity.JingsaizongjieEntity;
import com.service.JingsaizongjieService;
import com.entity.vo.JingsaizongjieVO;
import com.entity.view.JingsaizongjieView;

@Service("jingsaizongjieService")
public class JingsaizongjieServiceImpl extends ServiceImpl<JingsaizongjieDao, JingsaizongjieEntity> implements JingsaizongjieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingsaizongjieEntity> page = this.selectPage(
                new Query<JingsaizongjieEntity>(params).getPage(),
                new EntityWrapper<JingsaizongjieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingsaizongjieEntity> wrapper) {
		  Page<JingsaizongjieView> page =new Query<JingsaizongjieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingsaizongjieVO> selectListVO(Wrapper<JingsaizongjieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingsaizongjieVO selectVO(Wrapper<JingsaizongjieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingsaizongjieView> selectListView(Wrapper<JingsaizongjieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingsaizongjieView selectView(Wrapper<JingsaizongjieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
