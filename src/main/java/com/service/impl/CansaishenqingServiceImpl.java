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


import com.dao.CansaishenqingDao;
import com.entity.CansaishenqingEntity;
import com.service.CansaishenqingService;
import com.entity.vo.CansaishenqingVO;
import com.entity.view.CansaishenqingView;

@Service("cansaishenqingService")
public class CansaishenqingServiceImpl extends ServiceImpl<CansaishenqingDao, CansaishenqingEntity> implements CansaishenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CansaishenqingEntity> page = this.selectPage(
                new Query<CansaishenqingEntity>(params).getPage(),
                new EntityWrapper<CansaishenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CansaishenqingEntity> wrapper) {
		  Page<CansaishenqingView> page =new Query<CansaishenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CansaishenqingVO> selectListVO(Wrapper<CansaishenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CansaishenqingVO selectVO(Wrapper<CansaishenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CansaishenqingView> selectListView(Wrapper<CansaishenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CansaishenqingView selectView(Wrapper<CansaishenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
