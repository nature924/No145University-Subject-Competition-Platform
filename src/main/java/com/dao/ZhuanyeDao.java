package com.dao;

import com.entity.ZhuanyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanyeVO;
import com.entity.view.ZhuanyeView;


/**
 * 专业
 * 
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public interface ZhuanyeDao extends BaseMapper<ZhuanyeEntity> {
	
	List<ZhuanyeVO> selectListVO(@Param("ew") Wrapper<ZhuanyeEntity> wrapper);
	
	ZhuanyeVO selectVO(@Param("ew") Wrapper<ZhuanyeEntity> wrapper);
	
	List<ZhuanyeView> selectListView(@Param("ew") Wrapper<ZhuanyeEntity> wrapper);

	List<ZhuanyeView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanyeEntity> wrapper);
	
	ZhuanyeView selectView(@Param("ew") Wrapper<ZhuanyeEntity> wrapper);
	
}
