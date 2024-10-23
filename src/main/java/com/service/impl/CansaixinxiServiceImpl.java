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


import com.dao.CansaixinxiDao;
import com.entity.CansaixinxiEntity;
import com.service.CansaixinxiService;
import com.entity.vo.CansaixinxiVO;
import com.entity.view.CansaixinxiView;

@Service("cansaixinxiService")
public class CansaixinxiServiceImpl extends ServiceImpl<CansaixinxiDao, CansaixinxiEntity> implements CansaixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CansaixinxiEntity> page = this.selectPage(
                new Query<CansaixinxiEntity>(params).getPage(),
                new EntityWrapper<CansaixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CansaixinxiEntity> wrapper) {
		  Page<CansaixinxiView> page =new Query<CansaixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CansaixinxiVO> selectListVO(Wrapper<CansaixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CansaixinxiVO selectVO(Wrapper<CansaixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CansaixinxiView> selectListView(Wrapper<CansaixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CansaixinxiView selectView(Wrapper<CansaixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
