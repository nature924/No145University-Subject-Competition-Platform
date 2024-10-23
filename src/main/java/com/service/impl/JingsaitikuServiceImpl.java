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


import com.dao.JingsaitikuDao;
import com.entity.JingsaitikuEntity;
import com.service.JingsaitikuService;
import com.entity.vo.JingsaitikuVO;
import com.entity.view.JingsaitikuView;

@Service("jingsaitikuService")
public class JingsaitikuServiceImpl extends ServiceImpl<JingsaitikuDao, JingsaitikuEntity> implements JingsaitikuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingsaitikuEntity> page = this.selectPage(
                new Query<JingsaitikuEntity>(params).getPage(),
                new EntityWrapper<JingsaitikuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingsaitikuEntity> wrapper) {
		  Page<JingsaitikuView> page =new Query<JingsaitikuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingsaitikuVO> selectListVO(Wrapper<JingsaitikuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingsaitikuVO selectVO(Wrapper<JingsaitikuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingsaitikuView> selectListView(Wrapper<JingsaitikuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingsaitikuView selectView(Wrapper<JingsaitikuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
