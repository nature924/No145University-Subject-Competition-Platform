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


import com.dao.ZhuanyeDao;
import com.entity.ZhuanyeEntity;
import com.service.ZhuanyeService;
import com.entity.vo.ZhuanyeVO;
import com.entity.view.ZhuanyeView;

@Service("zhuanyeService")
public class ZhuanyeServiceImpl extends ServiceImpl<ZhuanyeDao, ZhuanyeEntity> implements ZhuanyeService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuanyeEntity> page = this.selectPage(
                new Query<ZhuanyeEntity>(params).getPage(),
                new EntityWrapper<ZhuanyeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuanyeEntity> wrapper) {
		  Page<ZhuanyeView> page =new Query<ZhuanyeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuanyeVO> selectListVO(Wrapper<ZhuanyeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuanyeVO selectVO(Wrapper<ZhuanyeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuanyeView> selectListView(Wrapper<ZhuanyeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuanyeView selectView(Wrapper<ZhuanyeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
