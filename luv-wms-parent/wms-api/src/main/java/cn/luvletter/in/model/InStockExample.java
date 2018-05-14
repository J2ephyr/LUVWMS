package cn.luvletter.in.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InStockExample implements Serializable {
    private String start;
    private String limit;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public InStockExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andInStockNoIsNull() {
            addCriterion("in_stock_no is null");
            return (Criteria) this;
        }

        public Criteria andInStockNoIsNotNull() {
            addCriterion("in_stock_no is not null");
            return (Criteria) this;
        }

        public Criteria andInStockNoEqualTo(String value) {
            addCriterion("in_stock_no =", value, "inStockNo");
            return (Criteria) this;
        }

        public Criteria andInStockNoNotEqualTo(String value) {
            addCriterion("in_stock_no <>", value, "inStockNo");
            return (Criteria) this;
        }

        public Criteria andInStockNoGreaterThan(String value) {
            addCriterion("in_stock_no >", value, "inStockNo");
            return (Criteria) this;
        }

        public Criteria andInStockNoGreaterThanOrEqualTo(String value) {
            addCriterion("in_stock_no >=", value, "inStockNo");
            return (Criteria) this;
        }

        public Criteria andInStockNoLessThan(String value) {
            addCriterion("in_stock_no <", value, "inStockNo");
            return (Criteria) this;
        }

        public Criteria andInStockNoLessThanOrEqualTo(String value) {
            addCriterion("in_stock_no <=", value, "inStockNo");
            return (Criteria) this;
        }

        public Criteria andInStockNoLike(String value) {
            addCriterion("in_stock_no like", value, "inStockNo");
            return (Criteria) this;
        }

        public Criteria andInStockNoNotLike(String value) {
            addCriterion("in_stock_no not like", value, "inStockNo");
            return (Criteria) this;
        }

        public Criteria andInStockNoIn(List<String> values) {
            addCriterion("in_stock_no in", values, "inStockNo");
            return (Criteria) this;
        }

        public Criteria andInStockNoNotIn(List<String> values) {
            addCriterion("in_stock_no not in", values, "inStockNo");
            return (Criteria) this;
        }

        public Criteria andInStockNoBetween(String value1, String value2) {
            addCriterion("in_stock_no between", value1, value2, "inStockNo");
            return (Criteria) this;
        }

        public Criteria andInStockNoNotBetween(String value1, String value2) {
            addCriterion("in_stock_no not between", value1, value2, "inStockNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoIsNull() {
            addCriterion("warehouse_no is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoIsNotNull() {
            addCriterion("warehouse_no is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoEqualTo(String value) {
            addCriterion("warehouse_no =", value, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoNotEqualTo(String value) {
            addCriterion("warehouse_no <>", value, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoGreaterThan(String value) {
            addCriterion("warehouse_no >", value, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_no >=", value, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoLessThan(String value) {
            addCriterion("warehouse_no <", value, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoLessThanOrEqualTo(String value) {
            addCriterion("warehouse_no <=", value, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoLike(String value) {
            addCriterion("warehouse_no like", value, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoNotLike(String value) {
            addCriterion("warehouse_no not like", value, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoIn(List<String> values) {
            addCriterion("warehouse_no in", values, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoNotIn(List<String> values) {
            addCriterion("warehouse_no not in", values, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoBetween(String value1, String value2) {
            addCriterion("warehouse_no between", value1, value2, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoNotBetween(String value1, String value2) {
            addCriterion("warehouse_no not between", value1, value2, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andInStockStatusIsNull() {
            addCriterion("in_stock_status is null");
            return (Criteria) this;
        }

        public Criteria andInStockStatusIsNotNull() {
            addCriterion("in_stock_status is not null");
            return (Criteria) this;
        }

        public Criteria andInStockStatusEqualTo(String value) {
            addCriterion("in_stock_status =", value, "inStockStatus");
            return (Criteria) this;
        }

        public Criteria andInStockStatusNotEqualTo(String value) {
            addCriterion("in_stock_status <>", value, "inStockStatus");
            return (Criteria) this;
        }

        public Criteria andInStockStatusGreaterThan(String value) {
            addCriterion("in_stock_status >", value, "inStockStatus");
            return (Criteria) this;
        }

        public Criteria andInStockStatusGreaterThanOrEqualTo(String value) {
            addCriterion("in_stock_status >=", value, "inStockStatus");
            return (Criteria) this;
        }

        public Criteria andInStockStatusLessThan(String value) {
            addCriterion("in_stock_status <", value, "inStockStatus");
            return (Criteria) this;
        }

        public Criteria andInStockStatusLessThanOrEqualTo(String value) {
            addCriterion("in_stock_status <=", value, "inStockStatus");
            return (Criteria) this;
        }

        public Criteria andInStockStatusLike(String value) {
            addCriterion("in_stock_status like", value, "inStockStatus");
            return (Criteria) this;
        }

        public Criteria andInStockStatusNotLike(String value) {
            addCriterion("in_stock_status not like", value, "inStockStatus");
            return (Criteria) this;
        }

        public Criteria andInStockStatusIn(List<String> values) {
            addCriterion("in_stock_status in", values, "inStockStatus");
            return (Criteria) this;
        }

        public Criteria andInStockStatusNotIn(List<String> values) {
            addCriterion("in_stock_status not in", values, "inStockStatus");
            return (Criteria) this;
        }

        public Criteria andInStockStatusBetween(String value1, String value2) {
            addCriterion("in_stock_status between", value1, value2, "inStockStatus");
            return (Criteria) this;
        }

        public Criteria andInStockStatusNotBetween(String value1, String value2) {
            addCriterion("in_stock_status not between", value1, value2, "inStockStatus");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andDhDateIsNull() {
            addCriterion("dh_date is null");
            return (Criteria) this;
        }

        public Criteria andDhDateIsNotNull() {
            addCriterion("dh_date is not null");
            return (Criteria) this;
        }

        public Criteria andDhDateEqualTo(Date value) {
            addCriterion("dh_date =", value, "dhDate");
            return (Criteria) this;
        }

        public Criteria andDhDateNotEqualTo(Date value) {
            addCriterion("dh_date <>", value, "dhDate");
            return (Criteria) this;
        }

        public Criteria andDhDateGreaterThan(Date value) {
            addCriterion("dh_date >", value, "dhDate");
            return (Criteria) this;
        }

        public Criteria andDhDateGreaterThanOrEqualTo(Date value) {
            addCriterion("dh_date >=", value, "dhDate");
            return (Criteria) this;
        }

        public Criteria andDhDateLessThan(Date value) {
            addCriterion("dh_date <", value, "dhDate");
            return (Criteria) this;
        }

        public Criteria andDhDateLessThanOrEqualTo(Date value) {
            addCriterion("dh_date <=", value, "dhDate");
            return (Criteria) this;
        }

        public Criteria andDhDateIn(List<Date> values) {
            addCriterion("dh_date in", values, "dhDate");
            return (Criteria) this;
        }

        public Criteria andDhDateNotIn(List<Date> values) {
            addCriterion("dh_date not in", values, "dhDate");
            return (Criteria) this;
        }

        public Criteria andDhDateBetween(Date value1, Date value2) {
            addCriterion("dh_date between", value1, value2, "dhDate");
            return (Criteria) this;
        }

        public Criteria andDhDateNotBetween(Date value1, Date value2) {
            addCriterion("dh_date not between", value1, value2, "dhDate");
            return (Criteria) this;
        }

        public Criteria andTallyDateIsNull() {
            addCriterion("tally_date is null");
            return (Criteria) this;
        }

        public Criteria andTallyDateIsNotNull() {
            addCriterion("tally_date is not null");
            return (Criteria) this;
        }

        public Criteria andTallyDateEqualTo(Date value) {
            addCriterion("tally_date =", value, "tallyDate");
            return (Criteria) this;
        }

        public Criteria andTallyDateNotEqualTo(Date value) {
            addCriterion("tally_date <>", value, "tallyDate");
            return (Criteria) this;
        }

        public Criteria andTallyDateGreaterThan(Date value) {
            addCriterion("tally_date >", value, "tallyDate");
            return (Criteria) this;
        }

        public Criteria andTallyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("tally_date >=", value, "tallyDate");
            return (Criteria) this;
        }

        public Criteria andTallyDateLessThan(Date value) {
            addCriterion("tally_date <", value, "tallyDate");
            return (Criteria) this;
        }

        public Criteria andTallyDateLessThanOrEqualTo(Date value) {
            addCriterion("tally_date <=", value, "tallyDate");
            return (Criteria) this;
        }

        public Criteria andTallyDateIn(List<Date> values) {
            addCriterion("tally_date in", values, "tallyDate");
            return (Criteria) this;
        }

        public Criteria andTallyDateNotIn(List<Date> values) {
            addCriterion("tally_date not in", values, "tallyDate");
            return (Criteria) this;
        }

        public Criteria andTallyDateBetween(Date value1, Date value2) {
            addCriterion("tally_date between", value1, value2, "tallyDate");
            return (Criteria) this;
        }

        public Criteria andTallyDateNotBetween(Date value1, Date value2) {
            addCriterion("tally_date not between", value1, value2, "tallyDate");
            return (Criteria) this;
        }

        public Criteria andSjDateIsNull() {
            addCriterion("sj_date is null");
            return (Criteria) this;
        }

        public Criteria andSjDateIsNotNull() {
            addCriterion("sj_date is not null");
            return (Criteria) this;
        }

        public Criteria andSjDateEqualTo(Date value) {
            addCriterion("sj_date =", value, "sjDate");
            return (Criteria) this;
        }

        public Criteria andSjDateNotEqualTo(Date value) {
            addCriterion("sj_date <>", value, "sjDate");
            return (Criteria) this;
        }

        public Criteria andSjDateGreaterThan(Date value) {
            addCriterion("sj_date >", value, "sjDate");
            return (Criteria) this;
        }

        public Criteria andSjDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sj_date >=", value, "sjDate");
            return (Criteria) this;
        }

        public Criteria andSjDateLessThan(Date value) {
            addCriterion("sj_date <", value, "sjDate");
            return (Criteria) this;
        }

        public Criteria andSjDateLessThanOrEqualTo(Date value) {
            addCriterion("sj_date <=", value, "sjDate");
            return (Criteria) this;
        }

        public Criteria andSjDateIn(List<Date> values) {
            addCriterion("sj_date in", values, "sjDate");
            return (Criteria) this;
        }

        public Criteria andSjDateNotIn(List<Date> values) {
            addCriterion("sj_date not in", values, "sjDate");
            return (Criteria) this;
        }

        public Criteria andSjDateBetween(Date value1, Date value2) {
            addCriterion("sj_date between", value1, value2, "sjDate");
            return (Criteria) this;
        }

        public Criteria andSjDateNotBetween(Date value1, Date value2) {
            addCriterion("sj_date not between", value1, value2, "sjDate");
            return (Criteria) this;
        }

        public Criteria andFinDateIsNull() {
            addCriterion("fin_date is null");
            return (Criteria) this;
        }

        public Criteria andFinDateIsNotNull() {
            addCriterion("fin_date is not null");
            return (Criteria) this;
        }

        public Criteria andFinDateEqualTo(Date value) {
            addCriterion("fin_date =", value, "finDate");
            return (Criteria) this;
        }

        public Criteria andFinDateNotEqualTo(Date value) {
            addCriterion("fin_date <>", value, "finDate");
            return (Criteria) this;
        }

        public Criteria andFinDateGreaterThan(Date value) {
            addCriterion("fin_date >", value, "finDate");
            return (Criteria) this;
        }

        public Criteria andFinDateGreaterThanOrEqualTo(Date value) {
            addCriterion("fin_date >=", value, "finDate");
            return (Criteria) this;
        }

        public Criteria andFinDateLessThan(Date value) {
            addCriterion("fin_date <", value, "finDate");
            return (Criteria) this;
        }

        public Criteria andFinDateLessThanOrEqualTo(Date value) {
            addCriterion("fin_date <=", value, "finDate");
            return (Criteria) this;
        }

        public Criteria andFinDateIn(List<Date> values) {
            addCriterion("fin_date in", values, "finDate");
            return (Criteria) this;
        }

        public Criteria andFinDateNotIn(List<Date> values) {
            addCriterion("fin_date not in", values, "finDate");
            return (Criteria) this;
        }

        public Criteria andFinDateBetween(Date value1, Date value2) {
            addCriterion("fin_date between", value1, value2, "finDate");
            return (Criteria) this;
        }

        public Criteria andFinDateNotBetween(Date value1, Date value2) {
            addCriterion("fin_date not between", value1, value2, "finDate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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