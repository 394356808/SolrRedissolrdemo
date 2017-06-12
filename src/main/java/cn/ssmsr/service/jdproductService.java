package cn.ssmsr.service;

import cn.ssmsr.po.Jd;

public interface jdproductService {
	/**
	 * 根据id查找实体类
	 * @param id
	 * @return
	 */
	public Jd findJd(int id);
	/**
	 * 根据id删除信息
	 * @param id
	 * @return
	 */
	public int deleteJd(int id);
	/**
	 * 根据实体对象添加信息
	 * @param jd
	 * @return
	 */
	public int insertJd(Jd jd);
}
