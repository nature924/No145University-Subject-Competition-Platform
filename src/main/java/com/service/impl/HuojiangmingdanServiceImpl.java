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


import com.dao.HuojiangmingdanDao;
import com.entity.HuojiangmingdanEntity;
import com.service.HuojiangmingdanService;
import com.entity.vo.HuojiangmingdanVO;
import com.entity.view.HuojiangmingdanView;

@Service("huojiangmingdanService")
public class HuojiangmingdanServiceImpl extends ServiceImpl<HuojiangmingdanDao, HuojiangmingdanEntity> implements HuojiangmingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuojiangmingdanEntity> page = this.selectPage(
                new Query<HuojiangmingdanEntity>(params).getPage(),
                new EntityWrapper<HuojiangmingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuojiangmingdanEntity> wrapper) {
		  Page<HuojiangmingdanView> page =new Query<HuojiangmingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuojiangmingdanVO> selectListVO(Wrapper<HuojiangmingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuojiangmingdanVO selectVO(Wrapper<HuojiangmingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuojiangmingdanView> selectListView(Wrapper<HuojiangmingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuojiangmingdanView selectView(Wrapper<HuojiangmingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
