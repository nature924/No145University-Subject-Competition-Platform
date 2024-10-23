package com.dao;

import com.entity.WangnianchengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WangnianchengjiVO;
import com.entity.view.WangnianchengjiView;


/**
 * 往年成绩
 * 
 * @author 
 * @email 
 * @date 2021-04-30 16:23:55
 */
public interface WangnianchengjiDao extends BaseMapper<WangnianchengjiEntity> {
	
	List<WangnianchengjiVO> selectListVO(@Param("ew") Wrapper<WangnianchengjiEntity> wrapper);
	
	WangnianchengjiVO selectVO(@Param("ew") Wrapper<WangnianchengjiEntity> wrapper);
	
	List<WangnianchengjiView> selectListView(@Param("ew") Wrapper<WangnianchengjiEntity> wrapper);

	List<WangnianchengjiView> selectListView(Pagination page,@Param("ew") Wrapper<WangnianchengjiEntity> wrapper);
	
	WangnianchengjiView selectView(@Param("ew") Wrapper<WangnianchengjiEntity> wrapper);
	
}
