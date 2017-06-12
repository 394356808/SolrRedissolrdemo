package cn.ssmsr.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.ssmsr.filter.FileUtil;
import cn.ssmsr.po.Jd;
import cn.ssmsr.service.Searchservice;
import cn.ssmsr.service.jdproductService;
@Controller
public class jdproductController {
	@Autowired
	private Searchservice searchservice;
	@Autowired
	private jdproductService jdproductservice;
	/**
	 * 根据电脑关键字查询所有商品标题包含电脑的商品
	 * @return
	 */
	@RequestMapping("query")
	public ModelAndView jddnproductquer(){
		//搜索关键字（一般是用户输入在这我没写用户输入的那个页面了直接写上了）
		SolrDocumentList solrdocument=searchservice.Searchproduct("电脑");
		long sumnumber=solrdocument.getNumFound();
		List<Jd> jdlist=new ArrayList<Jd>();
		for(SolrDocument doc :solrdocument){
			Jd jd=new Jd();
			jd.setId(Integer.parseInt(doc.get("id").toString()));
			jd.setTitle(doc.get("title").toString());
			jd.setLink(doc.get("link").toString());
			jd.setPrice(Integer.parseInt(doc.get("price").toString()));
			jd.setComment(Integer.parseInt(doc.get("goodcomment").toString()));
			jd.setPoorcountstr(Integer.parseInt(doc.get("poorcountstr").toString()));
			jd.setAftercount(Integer.parseInt(doc.get("aftercount").toString()));
			jdlist.add(jd);
			//System.out.println("id:"+doc.get("id")+"title:"+doc.get("title")+"link:"+doc.get("link")+"price:"+doc.get("price"));
		}
		ModelAndView model=new ModelAndView();
		model.addObject("number",sumnumber);
		model.addObject("jdlist",jdlist);
		model.setViewName("jsp/jdlist");
		//System.out.println("执行到这了2");
		return model;
	}
	/**
	 * 根据id查询商品实体（id是由solr那边来的是String类型）
	 * @param id
	 * @return
	 */
	@RequestMapping("findjdbyid")
	public ModelAndView selectproductbyid(String id){
		FileUtil utile=new FileUtil();
		//判断是否是数字
		boolean suz=utile.isNumeric(id);
		Jd jd=null;
		if(suz){
			int productid=Integer.parseInt(id);
		 jd=jdproductservice.findJd(productid);
		}
		ModelAndView model=new ModelAndView();
		model.addObject("jdst",jd);
		model.setViewName("jsp/jddat");
		return model;
	}
	/**
	 * 根据id删除商品
	 * @param id
	 * @return
	 */
	@RequestMapping("deleteproduct")
	public ModelAndView deleteproductbyid(String id){
		FileUtil utile=new FileUtil();
		boolean suz=utile.isNumeric(id);
		if(suz){
			int productid=Integer.parseInt(id);
			//根据索引id删除索引
			searchservice.queryDeleteDoc(id);
			int fhz=jdproductservice.deleteJd(productid);
		}
		ModelAndView model=new ModelAndView("redirect:/query");
		return model;
	}
	@RequestMapping("addtzproduct")
	public ModelAndView tzproduct(){
		ModelAndView model=new ModelAndView();
		model.setViewName("jsp/addproduct");
		return model;
	}
	/**
	 * 添加商品 
	 */
	@RequestMapping("addproduct")
	public ModelAndView Addproduct(Jd jd){
		//添加到数据库
		int productid=jdproductservice.insertJd(jd);
		//添加到索引
		jd.setId(productid);
		searchservice.addDoc(jd);
		ModelAndView model=new ModelAndView("redirect:/query");
		return model;
	}
}
