package com.dao;

import com.entity.JinjimingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JinjimingdanVO;
import com.entity.view.JinjimingdanView;


/**
 * 晋级名单
 * 
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public interface JinjimingdanDao extends BaseMapper<JinjimingdanEntity> {
	
	List<JinjimingdanVO> selectListVO(@Param("ew") Wrapper<JinjimingdanEntity> wrapper);
	
	JinjimingdanVO selectVO(@Param("ew") Wrapper<JinjimingdanEntity> wrapper);
	
	List<JinjimingdanView> selectListView(@Param("ew") Wrapper<JinjimingdanEntity> wrapper);

	List<JinjimingdanView> selectListView(Pagination page,@Param("ew") Wrapper<JinjimingdanEntity> wrapper);
	
	JinjimingdanView selectView(@Param("ew") Wrapper<JinjimingdanEntity> wrapper);
	
}
