package cn.ssmsr.service;

import org.apache.solr.common.SolrDocumentList;

import cn.ssmsr.po.Jd;

public interface Searchservice {
	public SolrDocumentList Searchproduct(String keyword);
	public void queryDeleteDoc(String id);
	public void addDoc(Jd jd);
}
