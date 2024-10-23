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


import com.dao.CansaimingdanDao;
import com.entity.CansaimingdanEntity;
import com.service.CansaimingdanService;
import com.entity.vo.CansaimingdanVO;
import com.entity.view.CansaimingdanView;

@Service("cansaimingdanService")
public class CansaimingdanServiceImpl extends ServiceImpl<CansaimingdanDao, CansaimingdanEntity> implements CansaimingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CansaimingdanEntity> page = this.selectPage(
                new Query<CansaimingdanEntity>(params).getPage(),
                new EntityWrapper<CansaimingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CansaimingdanEntity> wrapper) {
		  Page<CansaimingdanView> page =new Query<CansaimingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CansaimingdanVO> selectListVO(Wrapper<CansaimingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CansaimingdanVO selectVO(Wrapper<CansaimingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CansaimingdanView> selectListView(Wrapper<CansaimingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CansaimingdanView selectView(Wrapper<CansaimingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
