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


import com.dao.JingsaileixingDao;
import com.entity.JingsaileixingEntity;
import com.service.JingsaileixingService;
import com.entity.vo.JingsaileixingVO;
import com.entity.view.JingsaileixingView;

@Service("jingsaileixingService")
public class JingsaileixingServiceImpl extends ServiceImpl<JingsaileixingDao, JingsaileixingEntity> implements JingsaileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingsaileixingEntity> page = this.selectPage(
                new Query<JingsaileixingEntity>(params).getPage(),
                new EntityWrapper<JingsaileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingsaileixingEntity> wrapper) {
		  Page<JingsaileixingView> page =new Query<JingsaileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingsaileixingVO> selectListVO(Wrapper<JingsaileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingsaileixingVO selectVO(Wrapper<JingsaileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingsaileixingView> selectListView(Wrapper<JingsaileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingsaileixingView selectView(Wrapper<JingsaileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
