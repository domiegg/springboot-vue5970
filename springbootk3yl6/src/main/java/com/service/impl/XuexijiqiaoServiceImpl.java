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


import com.dao.XuexijiqiaoDao;
import com.entity.XuexijiqiaoEntity;
import com.service.XuexijiqiaoService;
import com.entity.vo.XuexijiqiaoVO;
import com.entity.view.XuexijiqiaoView;

@Service("xuexijiqiaoService")
public class XuexijiqiaoServiceImpl extends ServiceImpl<XuexijiqiaoDao, XuexijiqiaoEntity> implements XuexijiqiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexijiqiaoEntity> page = this.selectPage(
                new Query<XuexijiqiaoEntity>(params).getPage(),
                new EntityWrapper<XuexijiqiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexijiqiaoEntity> wrapper) {
		  Page<XuexijiqiaoView> page =new Query<XuexijiqiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexijiqiaoVO> selectListVO(Wrapper<XuexijiqiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexijiqiaoVO selectVO(Wrapper<XuexijiqiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexijiqiaoView> selectListView(Wrapper<XuexijiqiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexijiqiaoView selectView(Wrapper<XuexijiqiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
