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


import com.dao.JinjimingdanDao;
import com.entity.JinjimingdanEntity;
import com.service.JinjimingdanService;
import com.entity.vo.JinjimingdanVO;
import com.entity.view.JinjimingdanView;

@Service("jinjimingdanService")
public class JinjimingdanServiceImpl extends ServiceImpl<JinjimingdanDao, JinjimingdanEntity> implements JinjimingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JinjimingdanEntity> page = this.selectPage(
                new Query<JinjimingdanEntity>(params).getPage(),
                new EntityWrapper<JinjimingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JinjimingdanEntity> wrapper) {
		  Page<JinjimingdanView> page =new Query<JinjimingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JinjimingdanVO> selectListVO(Wrapper<JinjimingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JinjimingdanVO selectVO(Wrapper<JinjimingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JinjimingdanView> selectListView(Wrapper<JinjimingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JinjimingdanView selectView(Wrapper<JinjimingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
