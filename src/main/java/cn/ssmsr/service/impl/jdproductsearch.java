package cn.ssmsr.service.impl;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;

import cn.ssmsr.po.Jd;
import cn.ssmsr.service.Searchservice;

public class jdproductsearch implements Searchservice{
	private static final String URL="http://172.16.163.203:8080/solr/jd_core";
	private static HttpSolrClient solrClient = null;
	private void init(){
		solrClient = new HttpSolrClient.Builder(URL).build();
		solrClient.setConnectionTimeout(3000);
		}
	/**
	 * 传入关键字查询索引 
	 */
	public SolrDocumentList Searchproduct(String keyword){
		init();
		SolrQuery query=new SolrQuery();
		query.addSort("id",ORDER.asc);
		query.setStart(0);
		query.setRows(100);
		query.set("q","title:"+keyword);
		query.setHighlight(true);  
		query.addHighlightField("title"); 
		query.setHighlightSimplePre("<font color='red'>"); 
		query.setHighlightSimplePost("</font>"); 
		SolrDocumentList solrDocumentList=null;
		try {
			QueryResponse response = solrClient.query(query);
			 solrDocumentList = response.getResults();
			 /*for (SolrDocument doc : solrDocumentList) {
				 System.out.println(doc.get("id"));
			 }*/
		} catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return solrDocumentList;
	}
	/**
	 * 根据查询删除文档
	 */
	public void queryDeleteDoc(String id){
		init();
		try {
			solrClient.deleteByQuery("id:"+id);
			solrClient.commit();
		} catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void addDoc(Jd jd){
		init();
		SolrInputDocument sd=new SolrInputDocument();
		sd.addField("id", jd.getId());
		sd.addField("title", jd.getTitle());
		sd.addField("link",jd.getLink());
		sd.addField("price", jd.getPrice());
		sd.addField("comment", jd.getComment());
		sd.addField("goodcomment", jd.getGoodcomment());
		sd.addField("poorcountstr", jd.getPoorcountstr());
		sd.addField("aftercount", jd.getAftercount());
		try {
			solrClient.add(sd);
			solrClient.commit();
		} catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
