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


import com.dao.ChengjishensuDao;
import com.entity.ChengjishensuEntity;
import com.service.ChengjishensuService;
import com.entity.vo.ChengjishensuVO;
import com.entity.view.ChengjishensuView;

@Service("chengjishensuService")
public class ChengjishensuServiceImpl extends ServiceImpl<ChengjishensuDao, ChengjishensuEntity> implements ChengjishensuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChengjishensuEntity> page = this.selectPage(
                new Query<ChengjishensuEntity>(params).getPage(),
                new EntityWrapper<ChengjishensuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChengjishensuEntity> wrapper) {
		  Page<ChengjishensuView> page =new Query<ChengjishensuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChengjishensuVO> selectListVO(Wrapper<ChengjishensuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChengjishensuVO selectVO(Wrapper<ChengjishensuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChengjishensuView> selectListView(Wrapper<ChengjishensuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChengjishensuView selectView(Wrapper<ChengjishensuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
