package com.dao;

import com.entity.BaomingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaomingxinxiVO;
import com.entity.view.BaomingxinxiView;


/**
 * 报名信息
 * 
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public interface BaomingxinxiDao extends BaseMapper<BaomingxinxiEntity> {
	
	List<BaomingxinxiVO> selectListVO(@Param("ew") Wrapper<BaomingxinxiEntity> wrapper);
	
	BaomingxinxiVO selectVO(@Param("ew") Wrapper<BaomingxinxiEntity> wrapper);
	
	List<BaomingxinxiView> selectListView(@Param("ew") Wrapper<BaomingxinxiEntity> wrapper);

	List<BaomingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BaomingxinxiEntity> wrapper);
	
	BaomingxinxiView selectView(@Param("ew") Wrapper<BaomingxinxiEntity> wrapper);
	
}
