package cn.ssmsr.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.ssmsr.mapper.JdMapper;
import cn.ssmsr.po.Jd;
import cn.ssmsr.service.jdproductService;

public class jdproductServiceImpl implements jdproductService{
	@Autowired
	private JdMapper jdmapper;
	public Jd findJd(int id) {
		Jd jd=jdmapper.selectByPrimaryKey(id);
		// TODO Auto-generated method stub
		return jd;
	}

	public int deleteJd(int id) {
		int fand=jdmapper.deleteByPrimaryKey(id);
		// TODO Auto-generated method stub
		return fand;
	}

	public int insertJd(Jd jd) {
		int fand=jdmapper.insert(jd);
		fand=jd.getId();
		//System.out.println("刚插入的数据返回的ID为："+jd.getId());
		// TODO Auto-generated method stub
		return fand;
	}

}
