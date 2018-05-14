package cn.luvletter.order.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Order implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 订单编号
     *
     * @mbggenerated
     */
    private String orderNo;

    /**
     * 运费 可填写 0
     *
     * @mbggenerated
     */
    private BigDecimal feeAmount;

    /**
     * 总件数
     *
     * @mbggenerated
     */
    private Integer totalCount;

    /**
     * 物流企业名称
     *
     * @mbggenerated
     */
    private String logisName;

    /**
     * 订单状态(21:订单初始化,22:拣货完成，23:已发货，24:已收货，28:订单关闭)
     *
     * @mbggenerated
     */
    private String orderStatus;

    /**
     * 备注
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * 运单号
     *
     * @mbggenerated
     */
    private String waybillNo;

    /**
     * 收件人联系方式
     *
     * @mbggenerated
     */
    private String consigneeTel;

    /**
     * 收件人姓名
     *
     * @mbggenerated
     */
    private String consignee;

    /**
     * 邮编
     *
     * @mbggenerated
     */
    private String consigneeZip;

    /**
     * 收件人省份
     *
     * @mbggenerated
     */
    private String consigneeProvince;

    /**
     * 收件人城市
     *
     * @mbggenerated
     */
    private String consigneeCity;

    /**
     * 收件人区
     *
     * @mbggenerated
     */
    private String consigneeArea;

    /**
     * 收件人地址
     *
     * @mbggenerated
     */
    private String consigneeAddres;

    /**
     * 仓库编码
     *
     * @mbggenerated
     */
    private String warehouseNo;

    /**
     * 成交时间
     *
     * @mbggenerated
     */
    private Date tradeTime;

    /**
     * 发货时间
     *
     * @mbggenerated
     */
    private Date shipTime;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date gmtCreate;

    /**
     * 修改时间
     *
     * @mbggenerated
     */
    private Date gmtModified;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String getLogisName() {
        return logisName;
    }

    public void setLogisName(String logisName) {
        this.logisName = logisName;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getWaybillNo() {
        return waybillNo;
    }

    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo;
    }

    public String getConsigneeTel() {
        return consigneeTel;
    }

    public void setConsigneeTel(String consigneeTel) {
        this.consigneeTel = consigneeTel;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getConsigneeZip() {
        return consigneeZip;
    }

    public void setConsigneeZip(String consigneeZip) {
        this.consigneeZip = consigneeZip;
    }

    public String getConsigneeProvince() {
        return consigneeProvince;
    }

    public void setConsigneeProvince(String consigneeProvince) {
        this.consigneeProvince = consigneeProvince;
    }

    public String getConsigneeCity() {
        return consigneeCity;
    }

    public void setConsigneeCity(String consigneeCity) {
        this.consigneeCity = consigneeCity;
    }

    public String getConsigneeArea() {
        return consigneeArea;
    }

    public void setConsigneeArea(String consigneeArea) {
        this.consigneeArea = consigneeArea;
    }

    public String getConsigneeAddres() {
        return consigneeAddres;
    }

    public void setConsigneeAddres(String consigneeAddres) {
        this.consigneeAddres = consigneeAddres;
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public Date getShipTime() {
        return shipTime;
    }

    public void setShipTime(Date shipTime) {
        this.shipTime = shipTime;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", feeAmount=").append(feeAmount);
        sb.append(", totalCount=").append(totalCount);
        sb.append(", logisName=").append(logisName);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", memo=").append(memo);
        sb.append(", waybillNo=").append(waybillNo);
        sb.append(", consigneeTel=").append(consigneeTel);
        sb.append(", consignee=").append(consignee);
        sb.append(", consigneeZip=").append(consigneeZip);
        sb.append(", consigneeProvince=").append(consigneeProvince);
        sb.append(", consigneeCity=").append(consigneeCity);
        sb.append(", consigneeArea=").append(consigneeArea);
        sb.append(", consigneeAddres=").append(consigneeAddres);
        sb.append(", warehouseNo=").append(warehouseNo);
        sb.append(", tradeTime=").append(tradeTime);
        sb.append(", shipTime=").append(shipTime);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Order other = (Order) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getFeeAmount() == null ? other.getFeeAmount() == null : this.getFeeAmount().equals(other.getFeeAmount()))
            && (this.getTotalCount() == null ? other.getTotalCount() == null : this.getTotalCount().equals(other.getTotalCount()))
            && (this.getLogisName() == null ? other.getLogisName() == null : this.getLogisName().equals(other.getLogisName()))
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getWaybillNo() == null ? other.getWaybillNo() == null : this.getWaybillNo().equals(other.getWaybillNo()))
            && (this.getConsigneeTel() == null ? other.getConsigneeTel() == null : this.getConsigneeTel().equals(other.getConsigneeTel()))
            && (this.getConsignee() == null ? other.getConsignee() == null : this.getConsignee().equals(other.getConsignee()))
            && (this.getConsigneeZip() == null ? other.getConsigneeZip() == null : this.getConsigneeZip().equals(other.getConsigneeZip()))
            && (this.getConsigneeProvince() == null ? other.getConsigneeProvince() == null : this.getConsigneeProvince().equals(other.getConsigneeProvince()))
            && (this.getConsigneeCity() == null ? other.getConsigneeCity() == null : this.getConsigneeCity().equals(other.getConsigneeCity()))
            && (this.getConsigneeArea() == null ? other.getConsigneeArea() == null : this.getConsigneeArea().equals(other.getConsigneeArea()))
            && (this.getConsigneeAddres() == null ? other.getConsigneeAddres() == null : this.getConsigneeAddres().equals(other.getConsigneeAddres()))
            && (this.getWarehouseNo() == null ? other.getWarehouseNo() == null : this.getWarehouseNo().equals(other.getWarehouseNo()))
            && (this.getTradeTime() == null ? other.getTradeTime() == null : this.getTradeTime().equals(other.getTradeTime()))
            && (this.getShipTime() == null ? other.getShipTime() == null : this.getShipTime().equals(other.getShipTime()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getFeeAmount() == null) ? 0 : getFeeAmount().hashCode());
        result = prime * result + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        result = prime * result + ((getLogisName() == null) ? 0 : getLogisName().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getWaybillNo() == null) ? 0 : getWaybillNo().hashCode());
        result = prime * result + ((getConsigneeTel() == null) ? 0 : getConsigneeTel().hashCode());
        result = prime * result + ((getConsignee() == null) ? 0 : getConsignee().hashCode());
        result = prime * result + ((getConsigneeZip() == null) ? 0 : getConsigneeZip().hashCode());
        result = prime * result + ((getConsigneeProvince() == null) ? 0 : getConsigneeProvince().hashCode());
        result = prime * result + ((getConsigneeCity() == null) ? 0 : getConsigneeCity().hashCode());
        result = prime * result + ((getConsigneeArea() == null) ? 0 : getConsigneeArea().hashCode());
        result = prime * result + ((getConsigneeAddres() == null) ? 0 : getConsigneeAddres().hashCode());
        result = prime * result + ((getWarehouseNo() == null) ? 0 : getWarehouseNo().hashCode());
        result = prime * result + ((getTradeTime() == null) ? 0 : getTradeTime().hashCode());
        result = prime * result + ((getShipTime() == null) ? 0 : getShipTime().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        return result;
    }
}