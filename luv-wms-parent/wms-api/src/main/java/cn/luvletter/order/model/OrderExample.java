package cn.luvletter.order.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample implements Serializable {
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

    public OrderExample() {
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

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIsNull() {
            addCriterion("fee_amount is null");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIsNotNull() {
            addCriterion("fee_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFeeAmountEqualTo(BigDecimal value) {
            addCriterion("fee_amount =", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotEqualTo(BigDecimal value) {
            addCriterion("fee_amount <>", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountGreaterThan(BigDecimal value) {
            addCriterion("fee_amount >", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_amount >=", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountLessThan(BigDecimal value) {
            addCriterion("fee_amount <", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_amount <=", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIn(List<BigDecimal> values) {
            addCriterion("fee_amount in", values, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotIn(List<BigDecimal> values) {
            addCriterion("fee_amount not in", values, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_amount between", value1, value2, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_amount not between", value1, value2, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNull() {
            addCriterion("total_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNotNull() {
            addCriterion("total_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCountEqualTo(Integer value) {
            addCriterion("total_count =", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotEqualTo(Integer value) {
            addCriterion("total_count <>", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThan(Integer value) {
            addCriterion("total_count >", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_count >=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThan(Integer value) {
            addCriterion("total_count <", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanOrEqualTo(Integer value) {
            addCriterion("total_count <=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountIn(List<Integer> values) {
            addCriterion("total_count in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotIn(List<Integer> values) {
            addCriterion("total_count not in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountBetween(Integer value1, Integer value2) {
            addCriterion("total_count between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_count not between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andLogisNameIsNull() {
            addCriterion("logis_name is null");
            return (Criteria) this;
        }

        public Criteria andLogisNameIsNotNull() {
            addCriterion("logis_name is not null");
            return (Criteria) this;
        }

        public Criteria andLogisNameEqualTo(String value) {
            addCriterion("logis_name =", value, "logisName");
            return (Criteria) this;
        }

        public Criteria andLogisNameNotEqualTo(String value) {
            addCriterion("logis_name <>", value, "logisName");
            return (Criteria) this;
        }

        public Criteria andLogisNameGreaterThan(String value) {
            addCriterion("logis_name >", value, "logisName");
            return (Criteria) this;
        }

        public Criteria andLogisNameGreaterThanOrEqualTo(String value) {
            addCriterion("logis_name >=", value, "logisName");
            return (Criteria) this;
        }

        public Criteria andLogisNameLessThan(String value) {
            addCriterion("logis_name <", value, "logisName");
            return (Criteria) this;
        }

        public Criteria andLogisNameLessThanOrEqualTo(String value) {
            addCriterion("logis_name <=", value, "logisName");
            return (Criteria) this;
        }

        public Criteria andLogisNameLike(String value) {
            addCriterion("logis_name like", value, "logisName");
            return (Criteria) this;
        }

        public Criteria andLogisNameNotLike(String value) {
            addCriterion("logis_name not like", value, "logisName");
            return (Criteria) this;
        }

        public Criteria andLogisNameIn(List<String> values) {
            addCriterion("logis_name in", values, "logisName");
            return (Criteria) this;
        }

        public Criteria andLogisNameNotIn(List<String> values) {
            addCriterion("logis_name not in", values, "logisName");
            return (Criteria) this;
        }

        public Criteria andLogisNameBetween(String value1, String value2) {
            addCriterion("logis_name between", value1, value2, "logisName");
            return (Criteria) this;
        }

        public Criteria andLogisNameNotBetween(String value1, String value2) {
            addCriterion("logis_name not between", value1, value2, "logisName");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
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

        public Criteria andWaybillNoIsNull() {
            addCriterion("waybill_no is null");
            return (Criteria) this;
        }

        public Criteria andWaybillNoIsNotNull() {
            addCriterion("waybill_no is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillNoEqualTo(String value) {
            addCriterion("waybill_no =", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoNotEqualTo(String value) {
            addCriterion("waybill_no <>", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoGreaterThan(String value) {
            addCriterion("waybill_no >", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoGreaterThanOrEqualTo(String value) {
            addCriterion("waybill_no >=", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoLessThan(String value) {
            addCriterion("waybill_no <", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoLessThanOrEqualTo(String value) {
            addCriterion("waybill_no <=", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoLike(String value) {
            addCriterion("waybill_no like", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoNotLike(String value) {
            addCriterion("waybill_no not like", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoIn(List<String> values) {
            addCriterion("waybill_no in", values, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoNotIn(List<String> values) {
            addCriterion("waybill_no not in", values, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoBetween(String value1, String value2) {
            addCriterion("waybill_no between", value1, value2, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoNotBetween(String value1, String value2) {
            addCriterion("waybill_no not between", value1, value2, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelIsNull() {
            addCriterion("consignee_tel is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelIsNotNull() {
            addCriterion("consignee_tel is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelEqualTo(String value) {
            addCriterion("consignee_tel =", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelNotEqualTo(String value) {
            addCriterion("consignee_tel <>", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelGreaterThan(String value) {
            addCriterion("consignee_tel >", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_tel >=", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelLessThan(String value) {
            addCriterion("consignee_tel <", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelLessThanOrEqualTo(String value) {
            addCriterion("consignee_tel <=", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelLike(String value) {
            addCriterion("consignee_tel like", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelNotLike(String value) {
            addCriterion("consignee_tel not like", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelIn(List<String> values) {
            addCriterion("consignee_tel in", values, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelNotIn(List<String> values) {
            addCriterion("consignee_tel not in", values, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelBetween(String value1, String value2) {
            addCriterion("consignee_tel between", value1, value2, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelNotBetween(String value1, String value2) {
            addCriterion("consignee_tel not between", value1, value2, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("consignee like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("consignee not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipIsNull() {
            addCriterion("consignee_zip is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipIsNotNull() {
            addCriterion("consignee_zip is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipEqualTo(String value) {
            addCriterion("consignee_zip =", value, "consigneeZip");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipNotEqualTo(String value) {
            addCriterion("consignee_zip <>", value, "consigneeZip");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipGreaterThan(String value) {
            addCriterion("consignee_zip >", value, "consigneeZip");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_zip >=", value, "consigneeZip");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipLessThan(String value) {
            addCriterion("consignee_zip <", value, "consigneeZip");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipLessThanOrEqualTo(String value) {
            addCriterion("consignee_zip <=", value, "consigneeZip");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipLike(String value) {
            addCriterion("consignee_zip like", value, "consigneeZip");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipNotLike(String value) {
            addCriterion("consignee_zip not like", value, "consigneeZip");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipIn(List<String> values) {
            addCriterion("consignee_zip in", values, "consigneeZip");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipNotIn(List<String> values) {
            addCriterion("consignee_zip not in", values, "consigneeZip");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipBetween(String value1, String value2) {
            addCriterion("consignee_zip between", value1, value2, "consigneeZip");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipNotBetween(String value1, String value2) {
            addCriterion("consignee_zip not between", value1, value2, "consigneeZip");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIsNull() {
            addCriterion("consignee_province is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIsNotNull() {
            addCriterion("consignee_province is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceEqualTo(String value) {
            addCriterion("consignee_province =", value, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceNotEqualTo(String value) {
            addCriterion("consignee_province <>", value, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceGreaterThan(String value) {
            addCriterion("consignee_province >", value, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_province >=", value, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceLessThan(String value) {
            addCriterion("consignee_province <", value, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceLessThanOrEqualTo(String value) {
            addCriterion("consignee_province <=", value, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceLike(String value) {
            addCriterion("consignee_province like", value, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceNotLike(String value) {
            addCriterion("consignee_province not like", value, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceIn(List<String> values) {
            addCriterion("consignee_province in", values, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceNotIn(List<String> values) {
            addCriterion("consignee_province not in", values, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceBetween(String value1, String value2) {
            addCriterion("consignee_province between", value1, value2, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeProvinceNotBetween(String value1, String value2) {
            addCriterion("consignee_province not between", value1, value2, "consigneeProvince");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIsNull() {
            addCriterion("consignee_city is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIsNotNull() {
            addCriterion("consignee_city is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityEqualTo(String value) {
            addCriterion("consignee_city =", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityNotEqualTo(String value) {
            addCriterion("consignee_city <>", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityGreaterThan(String value) {
            addCriterion("consignee_city >", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_city >=", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityLessThan(String value) {
            addCriterion("consignee_city <", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityLessThanOrEqualTo(String value) {
            addCriterion("consignee_city <=", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityLike(String value) {
            addCriterion("consignee_city like", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityNotLike(String value) {
            addCriterion("consignee_city not like", value, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityIn(List<String> values) {
            addCriterion("consignee_city in", values, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityNotIn(List<String> values) {
            addCriterion("consignee_city not in", values, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityBetween(String value1, String value2) {
            addCriterion("consignee_city between", value1, value2, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeCityNotBetween(String value1, String value2) {
            addCriterion("consignee_city not between", value1, value2, "consigneeCity");
            return (Criteria) this;
        }

        public Criteria andConsigneeAreaIsNull() {
            addCriterion("consignee_area is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeAreaIsNotNull() {
            addCriterion("consignee_area is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeAreaEqualTo(String value) {
            addCriterion("consignee_area =", value, "consigneeArea");
            return (Criteria) this;
        }

        public Criteria andConsigneeAreaNotEqualTo(String value) {
            addCriterion("consignee_area <>", value, "consigneeArea");
            return (Criteria) this;
        }

        public Criteria andConsigneeAreaGreaterThan(String value) {
            addCriterion("consignee_area >", value, "consigneeArea");
            return (Criteria) this;
        }

        public Criteria andConsigneeAreaGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_area >=", value, "consigneeArea");
            return (Criteria) this;
        }

        public Criteria andConsigneeAreaLessThan(String value) {
            addCriterion("consignee_area <", value, "consigneeArea");
            return (Criteria) this;
        }

        public Criteria andConsigneeAreaLessThanOrEqualTo(String value) {
            addCriterion("consignee_area <=", value, "consigneeArea");
            return (Criteria) this;
        }

        public Criteria andConsigneeAreaLike(String value) {
            addCriterion("consignee_area like", value, "consigneeArea");
            return (Criteria) this;
        }

        public Criteria andConsigneeAreaNotLike(String value) {
            addCriterion("consignee_area not like", value, "consigneeArea");
            return (Criteria) this;
        }

        public Criteria andConsigneeAreaIn(List<String> values) {
            addCriterion("consignee_area in", values, "consigneeArea");
            return (Criteria) this;
        }

        public Criteria andConsigneeAreaNotIn(List<String> values) {
            addCriterion("consignee_area not in", values, "consigneeArea");
            return (Criteria) this;
        }

        public Criteria andConsigneeAreaBetween(String value1, String value2) {
            addCriterion("consignee_area between", value1, value2, "consigneeArea");
            return (Criteria) this;
        }

        public Criteria andConsigneeAreaNotBetween(String value1, String value2) {
            addCriterion("consignee_area not between", value1, value2, "consigneeArea");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddresIsNull() {
            addCriterion("consignee_addres is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddresIsNotNull() {
            addCriterion("consignee_addres is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddresEqualTo(String value) {
            addCriterion("consignee_addres =", value, "consigneeAddres");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddresNotEqualTo(String value) {
            addCriterion("consignee_addres <>", value, "consigneeAddres");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddresGreaterThan(String value) {
            addCriterion("consignee_addres >", value, "consigneeAddres");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddresGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_addres >=", value, "consigneeAddres");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddresLessThan(String value) {
            addCriterion("consignee_addres <", value, "consigneeAddres");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddresLessThanOrEqualTo(String value) {
            addCriterion("consignee_addres <=", value, "consigneeAddres");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddresLike(String value) {
            addCriterion("consignee_addres like", value, "consigneeAddres");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddresNotLike(String value) {
            addCriterion("consignee_addres not like", value, "consigneeAddres");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddresIn(List<String> values) {
            addCriterion("consignee_addres in", values, "consigneeAddres");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddresNotIn(List<String> values) {
            addCriterion("consignee_addres not in", values, "consigneeAddres");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddresBetween(String value1, String value2) {
            addCriterion("consignee_addres between", value1, value2, "consigneeAddres");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddresNotBetween(String value1, String value2) {
            addCriterion("consignee_addres not between", value1, value2, "consigneeAddres");
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

        public Criteria andTradeTimeIsNull() {
            addCriterion("trade_time is null");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIsNotNull() {
            addCriterion("trade_time is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTimeEqualTo(Date value) {
            addCriterion("trade_time =", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotEqualTo(Date value) {
            addCriterion("trade_time <>", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThan(Date value) {
            addCriterion("trade_time >", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("trade_time >=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThan(Date value) {
            addCriterion("trade_time <", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanOrEqualTo(Date value) {
            addCriterion("trade_time <=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIn(List<Date> values) {
            addCriterion("trade_time in", values, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotIn(List<Date> values) {
            addCriterion("trade_time not in", values, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeBetween(Date value1, Date value2) {
            addCriterion("trade_time between", value1, value2, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotBetween(Date value1, Date value2) {
            addCriterion("trade_time not between", value1, value2, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeIsNull() {
            addCriterion("ship_time is null");
            return (Criteria) this;
        }

        public Criteria andShipTimeIsNotNull() {
            addCriterion("ship_time is not null");
            return (Criteria) this;
        }

        public Criteria andShipTimeEqualTo(Date value) {
            addCriterion("ship_time =", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotEqualTo(Date value) {
            addCriterion("ship_time <>", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeGreaterThan(Date value) {
            addCriterion("ship_time >", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ship_time >=", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeLessThan(Date value) {
            addCriterion("ship_time <", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeLessThanOrEqualTo(Date value) {
            addCriterion("ship_time <=", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeIn(List<Date> values) {
            addCriterion("ship_time in", values, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotIn(List<Date> values) {
            addCriterion("ship_time not in", values, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeBetween(Date value1, Date value2) {
            addCriterion("ship_time between", value1, value2, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotBetween(Date value1, Date value2) {
            addCriterion("ship_time not between", value1, value2, "shipTime");
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