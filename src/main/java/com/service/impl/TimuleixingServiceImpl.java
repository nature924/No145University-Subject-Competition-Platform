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


import com.dao.TimuleixingDao;
import com.entity.TimuleixingEntity;
import com.service.TimuleixingService;
import com.entity.vo.TimuleixingVO;
import com.entity.view.TimuleixingView;

@Service("timuleixingService")
public class TimuleixingServiceImpl extends ServiceImpl<TimuleixingDao, TimuleixingEntity> implements TimuleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TimuleixingEntity> page = this.selectPage(
                new Query<TimuleixingEntity>(params).getPage(),
                new EntityWrapper<TimuleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TimuleixingEntity> wrapper) {
		  Page<TimuleixingView> page =new Query<TimuleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TimuleixingVO> selectListVO(Wrapper<TimuleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TimuleixingVO selectVO(Wrapper<TimuleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TimuleixingView> selectListView(Wrapper<TimuleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TimuleixingView selectView(Wrapper<TimuleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
