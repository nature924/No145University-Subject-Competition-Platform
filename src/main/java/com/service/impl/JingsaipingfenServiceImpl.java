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


import com.dao.JingsaipingfenDao;
import com.entity.JingsaipingfenEntity;
import com.service.JingsaipingfenService;
import com.entity.vo.JingsaipingfenVO;
import com.entity.view.JingsaipingfenView;

@Service("jingsaipingfenService")
public class JingsaipingfenServiceImpl extends ServiceImpl<JingsaipingfenDao, JingsaipingfenEntity> implements JingsaipingfenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingsaipingfenEntity> page = this.selectPage(
                new Query<JingsaipingfenEntity>(params).getPage(),
                new EntityWrapper<JingsaipingfenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingsaipingfenEntity> wrapper) {
		  Page<JingsaipingfenView> page =new Query<JingsaipingfenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingsaipingfenVO> selectListVO(Wrapper<JingsaipingfenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingsaipingfenVO selectVO(Wrapper<JingsaipingfenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingsaipingfenView> selectListView(Wrapper<JingsaipingfenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingsaipingfenView selectView(Wrapper<JingsaipingfenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
