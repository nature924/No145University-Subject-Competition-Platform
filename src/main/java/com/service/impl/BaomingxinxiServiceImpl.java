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


import com.dao.BaomingxinxiDao;
import com.entity.BaomingxinxiEntity;
import com.service.BaomingxinxiService;
import com.entity.vo.BaomingxinxiVO;
import com.entity.view.BaomingxinxiView;

@Service("baomingxinxiService")
public class BaomingxinxiServiceImpl extends ServiceImpl<BaomingxinxiDao, BaomingxinxiEntity> implements BaomingxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaomingxinxiEntity> page = this.selectPage(
                new Query<BaomingxinxiEntity>(params).getPage(),
                new EntityWrapper<BaomingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaomingxinxiEntity> wrapper) {
		  Page<BaomingxinxiView> page =new Query<BaomingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaomingxinxiVO> selectListVO(Wrapper<BaomingxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaomingxinxiVO selectVO(Wrapper<BaomingxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaomingxinxiView> selectListView(Wrapper<BaomingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaomingxinxiView selectView(Wrapper<BaomingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
