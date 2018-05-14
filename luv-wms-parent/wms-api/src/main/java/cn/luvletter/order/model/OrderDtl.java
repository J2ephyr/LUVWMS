package cn.luvletter.order.model;

import java.io.Serializable;
import java.util.Date;

public class OrderDtl implements Serializable {
    private Long id;

    /**
     * 订单编号
     *
     * @mbggenerated
     */
    private String orderNo;

    /**
     * 物品名称
     *
     * @mbggenerated
     */
    private String gName;

    /**
     * 商品规格
     *
     * @mbggenerated
     */
    private String gModel;

    /**
     * 颜色
     *
     * @mbggenerated
     */
    private String gColor;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date gmtCreate;

    /**
     * 更新时间
     *
     * @mbggenerated
     */
    private Date gmtModified;

    /**
     * 商品编号
     *
     * @mbggenerated
     */
    private String gNo;

    /**
     * 商品编码
     *
     * @mbggenerated
     */
    private String pn;

    /**
     * 数量
     *
     * @mbggenerated
     */
    private Integer qty;

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

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public String getgModel() {
        return gModel;
    }

    public void setgModel(String gModel) {
        this.gModel = gModel;
    }

    public String getgColor() {
        return gColor;
    }

    public void setgColor(String gColor) {
        this.gColor = gColor;
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

    public String getgNo() {
        return gNo;
    }

    public void setgNo(String gNo) {
        this.gNo = gNo;
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", gName=").append(gName);
        sb.append(", gModel=").append(gModel);
        sb.append(", gColor=").append(gColor);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", gNo=").append(gNo);
        sb.append(", pn=").append(pn);
        sb.append(", qty=").append(qty);
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
        OrderDtl other = (OrderDtl) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getgName() == null ? other.getgName() == null : this.getgName().equals(other.getgName()))
            && (this.getgModel() == null ? other.getgModel() == null : this.getgModel().equals(other.getgModel()))
            && (this.getgColor() == null ? other.getgColor() == null : this.getgColor().equals(other.getgColor()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getgNo() == null ? other.getgNo() == null : this.getgNo().equals(other.getgNo()))
            && (this.getPn() == null ? other.getPn() == null : this.getPn().equals(other.getPn()))
            && (this.getQty() == null ? other.getQty() == null : this.getQty().equals(other.getQty()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getgName() == null) ? 0 : getgName().hashCode());
        result = prime * result + ((getgModel() == null) ? 0 : getgModel().hashCode());
        result = prime * result + ((getgColor() == null) ? 0 : getgColor().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getgNo() == null) ? 0 : getgNo().hashCode());
        result = prime * result + ((getPn() == null) ? 0 : getPn().hashCode());
        result = prime * result + ((getQty() == null) ? 0 : getQty().hashCode());
        return result;
    }
}