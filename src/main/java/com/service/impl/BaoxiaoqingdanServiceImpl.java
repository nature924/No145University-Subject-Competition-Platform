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


import com.dao.BaoxiaoqingdanDao;
import com.entity.BaoxiaoqingdanEntity;
import com.service.BaoxiaoqingdanService;
import com.entity.vo.BaoxiaoqingdanVO;
import com.entity.view.BaoxiaoqingdanView;

@Service("baoxiaoqingdanService")
public class BaoxiaoqingdanServiceImpl extends ServiceImpl<BaoxiaoqingdanDao, BaoxiaoqingdanEntity> implements BaoxiaoqingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaoxiaoqingdanEntity> page = this.selectPage(
                new Query<BaoxiaoqingdanEntity>(params).getPage(),
                new EntityWrapper<BaoxiaoqingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaoxiaoqingdanEntity> wrapper) {
		  Page<BaoxiaoqingdanView> page =new Query<BaoxiaoqingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaoxiaoqingdanVO> selectListVO(Wrapper<BaoxiaoqingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaoxiaoqingdanVO selectVO(Wrapper<BaoxiaoqingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaoxiaoqingdanView> selectListView(Wrapper<BaoxiaoqingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaoxiaoqingdanView selectView(Wrapper<BaoxiaoqingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
