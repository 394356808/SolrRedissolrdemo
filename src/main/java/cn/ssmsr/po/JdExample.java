package cn.ssmsr.po;

import java.util.ArrayList;
import java.util.List;

public class JdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JdExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andLinkIsNull() {
            addCriterion("link is null");
            return (Criteria) this;
        }

        public Criteria andLinkIsNotNull() {
            addCriterion("link is not null");
            return (Criteria) this;
        }

        public Criteria andLinkEqualTo(String value) {
            addCriterion("link =", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotEqualTo(String value) {
            addCriterion("link <>", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThan(String value) {
            addCriterion("link >", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThanOrEqualTo(String value) {
            addCriterion("link >=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThan(String value) {
            addCriterion("link <", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThanOrEqualTo(String value) {
            addCriterion("link <=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLike(String value) {
            addCriterion("link like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotLike(String value) {
            addCriterion("link not like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkIn(List<String> values) {
            addCriterion("link in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotIn(List<String> values) {
            addCriterion("link not in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkBetween(String value1, String value2) {
            addCriterion("link between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotBetween(String value1, String value2) {
            addCriterion("link not between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(Integer value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(Integer value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(Integer value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(Integer value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(Integer value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<Integer> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<Integer> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(Integer value1, Integer value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(Integer value1, Integer value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andGoodcommentIsNull() {
            addCriterion("goodcomment is null");
            return (Criteria) this;
        }

        public Criteria andGoodcommentIsNotNull() {
            addCriterion("goodcomment is not null");
            return (Criteria) this;
        }

        public Criteria andGoodcommentEqualTo(Integer value) {
            addCriterion("goodcomment =", value, "goodcomment");
            return (Criteria) this;
        }

        public Criteria andGoodcommentNotEqualTo(Integer value) {
            addCriterion("goodcomment <>", value, "goodcomment");
            return (Criteria) this;
        }

        public Criteria andGoodcommentGreaterThan(Integer value) {
            addCriterion("goodcomment >", value, "goodcomment");
            return (Criteria) this;
        }

        public Criteria andGoodcommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodcomment >=", value, "goodcomment");
            return (Criteria) this;
        }

        public Criteria andGoodcommentLessThan(Integer value) {
            addCriterion("goodcomment <", value, "goodcomment");
            return (Criteria) this;
        }

        public Criteria andGoodcommentLessThanOrEqualTo(Integer value) {
            addCriterion("goodcomment <=", value, "goodcomment");
            return (Criteria) this;
        }

        public Criteria andGoodcommentIn(List<Integer> values) {
            addCriterion("goodcomment in", values, "goodcomment");
            return (Criteria) this;
        }

        public Criteria andGoodcommentNotIn(List<Integer> values) {
            addCriterion("goodcomment not in", values, "goodcomment");
            return (Criteria) this;
        }

        public Criteria andGoodcommentBetween(Integer value1, Integer value2) {
            addCriterion("goodcomment between", value1, value2, "goodcomment");
            return (Criteria) this;
        }

        public Criteria andGoodcommentNotBetween(Integer value1, Integer value2) {
            addCriterion("goodcomment not between", value1, value2, "goodcomment");
            return (Criteria) this;
        }

        public Criteria andPoorcountstrIsNull() {
            addCriterion("poorcountstr is null");
            return (Criteria) this;
        }

        public Criteria andPoorcountstrIsNotNull() {
            addCriterion("poorcountstr is not null");
            return (Criteria) this;
        }

        public Criteria andPoorcountstrEqualTo(Integer value) {
            addCriterion("poorcountstr =", value, "poorcountstr");
            return (Criteria) this;
        }

        public Criteria andPoorcountstrNotEqualTo(Integer value) {
            addCriterion("poorcountstr <>", value, "poorcountstr");
            return (Criteria) this;
        }

        public Criteria andPoorcountstrGreaterThan(Integer value) {
            addCriterion("poorcountstr >", value, "poorcountstr");
            return (Criteria) this;
        }

        public Criteria andPoorcountstrGreaterThanOrEqualTo(Integer value) {
            addCriterion("poorcountstr >=", value, "poorcountstr");
            return (Criteria) this;
        }

        public Criteria andPoorcountstrLessThan(Integer value) {
            addCriterion("poorcountstr <", value, "poorcountstr");
            return (Criteria) this;
        }

        public Criteria andPoorcountstrLessThanOrEqualTo(Integer value) {
            addCriterion("poorcountstr <=", value, "poorcountstr");
            return (Criteria) this;
        }

        public Criteria andPoorcountstrIn(List<Integer> values) {
            addCriterion("poorcountstr in", values, "poorcountstr");
            return (Criteria) this;
        }

        public Criteria andPoorcountstrNotIn(List<Integer> values) {
            addCriterion("poorcountstr not in", values, "poorcountstr");
            return (Criteria) this;
        }

        public Criteria andPoorcountstrBetween(Integer value1, Integer value2) {
            addCriterion("poorcountstr between", value1, value2, "poorcountstr");
            return (Criteria) this;
        }

        public Criteria andPoorcountstrNotBetween(Integer value1, Integer value2) {
            addCriterion("poorcountstr not between", value1, value2, "poorcountstr");
            return (Criteria) this;
        }

        public Criteria andAftercountIsNull() {
            addCriterion("aftercount is null");
            return (Criteria) this;
        }

        public Criteria andAftercountIsNotNull() {
            addCriterion("aftercount is not null");
            return (Criteria) this;
        }

        public Criteria andAftercountEqualTo(Integer value) {
            addCriterion("aftercount =", value, "aftercount");
            return (Criteria) this;
        }

        public Criteria andAftercountNotEqualTo(Integer value) {
            addCriterion("aftercount <>", value, "aftercount");
            return (Criteria) this;
        }

        public Criteria andAftercountGreaterThan(Integer value) {
            addCriterion("aftercount >", value, "aftercount");
            return (Criteria) this;
        }

        public Criteria andAftercountGreaterThanOrEqualTo(Integer value) {
            addCriterion("aftercount >=", value, "aftercount");
            return (Criteria) this;
        }

        public Criteria andAftercountLessThan(Integer value) {
            addCriterion("aftercount <", value, "aftercount");
            return (Criteria) this;
        }

        public Criteria andAftercountLessThanOrEqualTo(Integer value) {
            addCriterion("aftercount <=", value, "aftercount");
            return (Criteria) this;
        }

        public Criteria andAftercountIn(List<Integer> values) {
            addCriterion("aftercount in", values, "aftercount");
            return (Criteria) this;
        }

        public Criteria andAftercountNotIn(List<Integer> values) {
            addCriterion("aftercount not in", values, "aftercount");
            return (Criteria) this;
        }

        public Criteria andAftercountBetween(Integer value1, Integer value2) {
            addCriterion("aftercount between", value1, value2, "aftercount");
            return (Criteria) this;
        }

        public Criteria andAftercountNotBetween(Integer value1, Integer value2) {
            addCriterion("aftercount not between", value1, value2, "aftercount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}