package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ChengjishensuEntity;
import com.entity.view.ChengjishensuView;

import com.service.ChengjishensuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 成绩申诉
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-30 16:23:55
 */
@RestController
@RequestMapping("/chengjishensu")
public class ChengjishensuController {
    @Autowired
    private ChengjishensuService chengjishensuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChengjishensuEntity chengjishensu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			chengjishensu.setXueshengzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("lingduijiaoshi")) {
			chengjishensu.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ChengjishensuEntity> ew = new EntityWrapper<ChengjishensuEntity>();
		PageUtils page = chengjishensuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chengjishensu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChengjishensuEntity chengjishensu, 
		HttpServletRequest request){
        EntityWrapper<ChengjishensuEntity> ew = new EntityWrapper<ChengjishensuEntity>();
		PageUtils page = chengjishensuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chengjishensu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChengjishensuEntity chengjishensu){
       	EntityWrapper<ChengjishensuEntity> ew = new EntityWrapper<ChengjishensuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chengjishensu, "chengjishensu")); 
        return R.ok().put("data", chengjishensuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChengjishensuEntity chengjishensu){
        EntityWrapper< ChengjishensuEntity> ew = new EntityWrapper< ChengjishensuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chengjishensu, "chengjishensu")); 
		ChengjishensuView chengjishensuView =  chengjishensuService.selectView(ew);
		return R.ok("查询成绩申诉成功").put("data", chengjishensuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChengjishensuEntity chengjishensu = chengjishensuService.selectById(id);
        return R.ok().put("data", chengjishensu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChengjishensuEntity chengjishensu = chengjishensuService.selectById(id);
        return R.ok().put("data", chengjishensu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChengjishensuEntity chengjishensu, HttpServletRequest request){
    	chengjishensu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chengjishensu);
        chengjishensuService.insert(chengjishensu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChengjishensuEntity chengjishensu, HttpServletRequest request){
    	chengjishensu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chengjishensu);
        chengjishensuService.insert(chengjishensu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ChengjishensuEntity chengjishensu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chengjishensu);
        chengjishensuService.updateById(chengjishensu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chengjishensuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ChengjishensuEntity> wrapper = new EntityWrapper<ChengjishensuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xueshengzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("lingduijiaoshi")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = chengjishensuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
