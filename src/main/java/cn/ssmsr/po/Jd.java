package cn.ssmsr.po;

import java.io.Serializable;

public class Jd implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 4583336827049548757L;

	private Integer id;

    private String title;

    private String link;

    private Integer price;

    private Integer comment;

    private Integer goodcomment;

    private Integer poorcountstr;

    private Integer aftercount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getComment() {
        return comment;
    }

    public void setComment(Integer comment) {
        this.comment = comment;
    }

    public Integer getGoodcomment() {
        return goodcomment;
    }

    public void setGoodcomment(Integer goodcomment) {
        this.goodcomment = goodcomment;
    }

    public Integer getPoorcountstr() {
        return poorcountstr;
    }

    public void setPoorcountstr(Integer poorcountstr) {
        this.poorcountstr = poorcountstr;
    }

    public Integer getAftercount() {
        return aftercount;
    }

    public void setAftercount(Integer aftercount) {
        this.aftercount = aftercount;
    }
}