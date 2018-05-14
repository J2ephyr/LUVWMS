package cn.luvletter.out.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OutStockDtlExample implements Serializable {
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

    public OutStockDtlExample() {
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

        public Criteria andOutStockNoIsNull() {
            addCriterion("out_stock_no is null");
            return (Criteria) this;
        }

        public Criteria andOutStockNoIsNotNull() {
            addCriterion("out_stock_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutStockNoEqualTo(String value) {
            addCriterion("out_stock_no =", value, "outStockNo");
            return (Criteria) this;
        }

        public Criteria andOutStockNoNotEqualTo(String value) {
            addCriterion("out_stock_no <>", value, "outStockNo");
            return (Criteria) this;
        }

        public Criteria andOutStockNoGreaterThan(String value) {
            addCriterion("out_stock_no >", value, "outStockNo");
            return (Criteria) this;
        }

        public Criteria andOutStockNoGreaterThanOrEqualTo(String value) {
            addCriterion("out_stock_no >=", value, "outStockNo");
            return (Criteria) this;
        }

        public Criteria andOutStockNoLessThan(String value) {
            addCriterion("out_stock_no <", value, "outStockNo");
            return (Criteria) this;
        }

        public Criteria andOutStockNoLessThanOrEqualTo(String value) {
            addCriterion("out_stock_no <=", value, "outStockNo");
            return (Criteria) this;
        }

        public Criteria andOutStockNoLike(String value) {
            addCriterion("out_stock_no like", value, "outStockNo");
            return (Criteria) this;
        }

        public Criteria andOutStockNoNotLike(String value) {
            addCriterion("out_stock_no not like", value, "outStockNo");
            return (Criteria) this;
        }

        public Criteria andOutStockNoIn(List<String> values) {
            addCriterion("out_stock_no in", values, "outStockNo");
            return (Criteria) this;
        }

        public Criteria andOutStockNoNotIn(List<String> values) {
            addCriterion("out_stock_no not in", values, "outStockNo");
            return (Criteria) this;
        }

        public Criteria andOutStockNoBetween(String value1, String value2) {
            addCriterion("out_stock_no between", value1, value2, "outStockNo");
            return (Criteria) this;
        }

        public Criteria andOutStockNoNotBetween(String value1, String value2) {
            addCriterion("out_stock_no not between", value1, value2, "outStockNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoIsNull() {
            addCriterion("goods_no is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNoIsNotNull() {
            addCriterion("goods_no is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNoEqualTo(String value) {
            addCriterion("goods_no =", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotEqualTo(String value) {
            addCriterion("goods_no <>", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoGreaterThan(String value) {
            addCriterion("goods_no >", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoGreaterThanOrEqualTo(String value) {
            addCriterion("goods_no >=", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLessThan(String value) {
            addCriterion("goods_no <", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLessThanOrEqualTo(String value) {
            addCriterion("goods_no <=", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLike(String value) {
            addCriterion("goods_no like", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotLike(String value) {
            addCriterion("goods_no not like", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoIn(List<String> values) {
            addCriterion("goods_no in", values, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotIn(List<String> values) {
            addCriterion("goods_no not in", values, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoBetween(String value1, String value2) {
            addCriterion("goods_no between", value1, value2, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotBetween(String value1, String value2) {
            addCriterion("goods_no not between", value1, value2, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andPnIsNull() {
            addCriterion("pn is null");
            return (Criteria) this;
        }

        public Criteria andPnIsNotNull() {
            addCriterion("pn is not null");
            return (Criteria) this;
        }

        public Criteria andPnEqualTo(String value) {
            addCriterion("pn =", value, "pn");
            return (Criteria) this;
        }

        public Criteria andPnNotEqualTo(String value) {
            addCriterion("pn <>", value, "pn");
            return (Criteria) this;
        }

        public Criteria andPnGreaterThan(String value) {
            addCriterion("pn >", value, "pn");
            return (Criteria) this;
        }

        public Criteria andPnGreaterThanOrEqualTo(String value) {
            addCriterion("pn >=", value, "pn");
            return (Criteria) this;
        }

        public Criteria andPnLessThan(String value) {
            addCriterion("pn <", value, "pn");
            return (Criteria) this;
        }

        public Criteria andPnLessThanOrEqualTo(String value) {
            addCriterion("pn <=", value, "pn");
            return (Criteria) this;
        }

        public Criteria andPnLike(String value) {
            addCriterion("pn like", value, "pn");
            return (Criteria) this;
        }

        public Criteria andPnNotLike(String value) {
            addCriterion("pn not like", value, "pn");
            return (Criteria) this;
        }

        public Criteria andPnIn(List<String> values) {
            addCriterion("pn in", values, "pn");
            return (Criteria) this;
        }

        public Criteria andPnNotIn(List<String> values) {
            addCriterion("pn not in", values, "pn");
            return (Criteria) this;
        }

        public Criteria andPnBetween(String value1, String value2) {
            addCriterion("pn between", value1, value2, "pn");
            return (Criteria) this;
        }

        public Criteria andPnNotBetween(String value1, String value2) {
            addCriterion("pn not between", value1, value2, "pn");
            return (Criteria) this;
        }

        public Criteria andGNameIsNull() {
            addCriterion("g_name is null");
            return (Criteria) this;
        }

        public Criteria andGNameIsNotNull() {
            addCriterion("g_name is not null");
            return (Criteria) this;
        }

        public Criteria andGNameEqualTo(String value) {
            addCriterion("g_name =", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotEqualTo(String value) {
            addCriterion("g_name <>", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameGreaterThan(String value) {
            addCriterion("g_name >", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameGreaterThanOrEqualTo(String value) {
            addCriterion("g_name >=", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLessThan(String value) {
            addCriterion("g_name <", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLessThanOrEqualTo(String value) {
            addCriterion("g_name <=", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLike(String value) {
            addCriterion("g_name like", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotLike(String value) {
            addCriterion("g_name not like", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameIn(List<String> values) {
            addCriterion("g_name in", values, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotIn(List<String> values) {
            addCriterion("g_name not in", values, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameBetween(String value1, String value2) {
            addCriterion("g_name between", value1, value2, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotBetween(String value1, String value2) {
            addCriterion("g_name not between", value1, value2, "gName");
            return (Criteria) this;
        }

        public Criteria andGModelIsNull() {
            addCriterion("g_model is null");
            return (Criteria) this;
        }

        public Criteria andGModelIsNotNull() {
            addCriterion("g_model is not null");
            return (Criteria) this;
        }

        public Criteria andGModelEqualTo(String value) {
            addCriterion("g_model =", value, "gModel");
            return (Criteria) this;
        }

        public Criteria andGModelNotEqualTo(String value) {
            addCriterion("g_model <>", value, "gModel");
            return (Criteria) this;
        }

        public Criteria andGModelGreaterThan(String value) {
            addCriterion("g_model >", value, "gModel");
            return (Criteria) this;
        }

        public Criteria andGModelGreaterThanOrEqualTo(String value) {
            addCriterion("g_model >=", value, "gModel");
            return (Criteria) this;
        }

        public Criteria andGModelLessThan(String value) {
            addCriterion("g_model <", value, "gModel");
            return (Criteria) this;
        }

        public Criteria andGModelLessThanOrEqualTo(String value) {
            addCriterion("g_model <=", value, "gModel");
            return (Criteria) this;
        }

        public Criteria andGModelLike(String value) {
            addCriterion("g_model like", value, "gModel");
            return (Criteria) this;
        }

        public Criteria andGModelNotLike(String value) {
            addCriterion("g_model not like", value, "gModel");
            return (Criteria) this;
        }

        public Criteria andGModelIn(List<String> values) {
            addCriterion("g_model in", values, "gModel");
            return (Criteria) this;
        }

        public Criteria andGModelNotIn(List<String> values) {
            addCriterion("g_model not in", values, "gModel");
            return (Criteria) this;
        }

        public Criteria andGModelBetween(String value1, String value2) {
            addCriterion("g_model between", value1, value2, "gModel");
            return (Criteria) this;
        }

        public Criteria andGModelNotBetween(String value1, String value2) {
            addCriterion("g_model not between", value1, value2, "gModel");
            return (Criteria) this;
        }

        public Criteria andGUnitIsNull() {
            addCriterion("g_unit is null");
            return (Criteria) this;
        }

        public Criteria andGUnitIsNotNull() {
            addCriterion("g_unit is not null");
            return (Criteria) this;
        }

        public Criteria andGUnitEqualTo(String value) {
            addCriterion("g_unit =", value, "gUnit");
            return (Criteria) this;
        }

        public Criteria andGUnitNotEqualTo(String value) {
            addCriterion("g_unit <>", value, "gUnit");
            return (Criteria) this;
        }

        public Criteria andGUnitGreaterThan(String value) {
            addCriterion("g_unit >", value, "gUnit");
            return (Criteria) this;
        }

        public Criteria andGUnitGreaterThanOrEqualTo(String value) {
            addCriterion("g_unit >=", value, "gUnit");
            return (Criteria) this;
        }

        public Criteria andGUnitLessThan(String value) {
            addCriterion("g_unit <", value, "gUnit");
            return (Criteria) this;
        }

        public Criteria andGUnitLessThanOrEqualTo(String value) {
            addCriterion("g_unit <=", value, "gUnit");
            return (Criteria) this;
        }

        public Criteria andGUnitLike(String value) {
            addCriterion("g_unit like", value, "gUnit");
            return (Criteria) this;
        }

        public Criteria andGUnitNotLike(String value) {
            addCriterion("g_unit not like", value, "gUnit");
            return (Criteria) this;
        }

        public Criteria andGUnitIn(List<String> values) {
            addCriterion("g_unit in", values, "gUnit");
            return (Criteria) this;
        }

        public Criteria andGUnitNotIn(List<String> values) {
            addCriterion("g_unit not in", values, "gUnit");
            return (Criteria) this;
        }

        public Criteria andGUnitBetween(String value1, String value2) {
            addCriterion("g_unit between", value1, value2, "gUnit");
            return (Criteria) this;
        }

        public Criteria andGUnitNotBetween(String value1, String value2) {
            addCriterion("g_unit not between", value1, value2, "gUnit");
            return (Criteria) this;
        }

        public Criteria andGQtyIsNull() {
            addCriterion("g_qty is null");
            return (Criteria) this;
        }

        public Criteria andGQtyIsNotNull() {
            addCriterion("g_qty is not null");
            return (Criteria) this;
        }

        public Criteria andGQtyEqualTo(Integer value) {
            addCriterion("g_qty =", value, "gQty");
            return (Criteria) this;
        }

        public Criteria andGQtyNotEqualTo(Integer value) {
            addCriterion("g_qty <>", value, "gQty");
            return (Criteria) this;
        }

        public Criteria andGQtyGreaterThan(Integer value) {
            addCriterion("g_qty >", value, "gQty");
            return (Criteria) this;
        }

        public Criteria andGQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("g_qty >=", value, "gQty");
            return (Criteria) this;
        }

        public Criteria andGQtyLessThan(Integer value) {
            addCriterion("g_qty <", value, "gQty");
            return (Criteria) this;
        }

        public Criteria andGQtyLessThanOrEqualTo(Integer value) {
            addCriterion("g_qty <=", value, "gQty");
            return (Criteria) this;
        }

        public Criteria andGQtyIn(List<Integer> values) {
            addCriterion("g_qty in", values, "gQty");
            return (Criteria) this;
        }

        public Criteria andGQtyNotIn(List<Integer> values) {
            addCriterion("g_qty not in", values, "gQty");
            return (Criteria) this;
        }

        public Criteria andGQtyBetween(Integer value1, Integer value2) {
            addCriterion("g_qty between", value1, value2, "gQty");
            return (Criteria) this;
        }

        public Criteria andGQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("g_qty not between", value1, value2, "gQty");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoIsNull() {
            addCriterion("storage_location_no is null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoIsNotNull() {
            addCriterion("storage_location_no is not null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoEqualTo(String value) {
            addCriterion("storage_location_no =", value, "storageLocationNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoNotEqualTo(String value) {
            addCriterion("storage_location_no <>", value, "storageLocationNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoGreaterThan(String value) {
            addCriterion("storage_location_no >", value, "storageLocationNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoGreaterThanOrEqualTo(String value) {
            addCriterion("storage_location_no >=", value, "storageLocationNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoLessThan(String value) {
            addCriterion("storage_location_no <", value, "storageLocationNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoLessThanOrEqualTo(String value) {
            addCriterion("storage_location_no <=", value, "storageLocationNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoLike(String value) {
            addCriterion("storage_location_no like", value, "storageLocationNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoNotLike(String value) {
            addCriterion("storage_location_no not like", value, "storageLocationNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoIn(List<String> values) {
            addCriterion("storage_location_no in", values, "storageLocationNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoNotIn(List<String> values) {
            addCriterion("storage_location_no not in", values, "storageLocationNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoBetween(String value1, String value2) {
            addCriterion("storage_location_no between", value1, value2, "storageLocationNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNoNotBetween(String value1, String value2) {
            addCriterion("storage_location_no not between", value1, value2, "storageLocationNo");
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