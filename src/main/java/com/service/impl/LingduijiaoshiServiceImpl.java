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


import com.dao.LingduijiaoshiDao;
import com.entity.LingduijiaoshiEntity;
import com.service.LingduijiaoshiService;
import com.entity.vo.LingduijiaoshiVO;
import com.entity.view.LingduijiaoshiView;

@Service("lingduijiaoshiService")
public class LingduijiaoshiServiceImpl extends ServiceImpl<LingduijiaoshiDao, LingduijiaoshiEntity> implements LingduijiaoshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LingduijiaoshiEntity> page = this.selectPage(
                new Query<LingduijiaoshiEntity>(params).getPage(),
                new EntityWrapper<LingduijiaoshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LingduijiaoshiEntity> wrapper) {
		  Page<LingduijiaoshiView> page =new Query<LingduijiaoshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LingduijiaoshiVO> selectListVO(Wrapper<LingduijiaoshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LingduijiaoshiVO selectVO(Wrapper<LingduijiaoshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LingduijiaoshiView> selectListView(Wrapper<LingduijiaoshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LingduijiaoshiView selectView(Wrapper<LingduijiaoshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
