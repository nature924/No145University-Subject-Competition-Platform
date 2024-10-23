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


import com.dao.HuojiangqingkuangDao;
import com.entity.HuojiangqingkuangEntity;
import com.service.HuojiangqingkuangService;
import com.entity.vo.HuojiangqingkuangVO;
import com.entity.view.HuojiangqingkuangView;

@Service("huojiangqingkuangService")
public class HuojiangqingkuangServiceImpl extends ServiceImpl<HuojiangqingkuangDao, HuojiangqingkuangEntity> implements HuojiangqingkuangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuojiangqingkuangEntity> page = this.selectPage(
                new Query<HuojiangqingkuangEntity>(params).getPage(),
                new EntityWrapper<HuojiangqingkuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuojiangqingkuangEntity> wrapper) {
		  Page<HuojiangqingkuangView> page =new Query<HuojiangqingkuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuojiangqingkuangVO> selectListVO(Wrapper<HuojiangqingkuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuojiangqingkuangVO selectVO(Wrapper<HuojiangqingkuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuojiangqingkuangView> selectListView(Wrapper<HuojiangqingkuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuojiangqingkuangView selectView(Wrapper<HuojiangqingkuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
