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


import com.dao.WangnianchengjiDao;
import com.entity.WangnianchengjiEntity;
import com.service.WangnianchengjiService;
import com.entity.vo.WangnianchengjiVO;
import com.entity.view.WangnianchengjiView;

@Service("wangnianchengjiService")
public class WangnianchengjiServiceImpl extends ServiceImpl<WangnianchengjiDao, WangnianchengjiEntity> implements WangnianchengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WangnianchengjiEntity> page = this.selectPage(
                new Query<WangnianchengjiEntity>(params).getPage(),
                new EntityWrapper<WangnianchengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WangnianchengjiEntity> wrapper) {
		  Page<WangnianchengjiView> page =new Query<WangnianchengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WangnianchengjiVO> selectListVO(Wrapper<WangnianchengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WangnianchengjiVO selectVO(Wrapper<WangnianchengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WangnianchengjiView> selectListView(Wrapper<WangnianchengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WangnianchengjiView selectView(Wrapper<WangnianchengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
