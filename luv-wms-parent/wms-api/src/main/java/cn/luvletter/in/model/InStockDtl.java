package cn.luvletter.in.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class InStockDtl implements Serializable {
    private Long id;

    /**
     * 入库单号
     *
     * @mbggenerated
     */
    private String inStockNo;

    /**
     * 商品编号
     *
     * @mbggenerated
     */
    private String goodsNo;

    /**
     * 商品pn
     *
     * @mbggenerated
     */
    private String pn;

    /**
     * 商品名称
     *
     * @mbggenerated
     */
    private String gName;

    /**
     * 规格
     *
     * @mbggenerated
     */
    private String gModel;

    /**
     * 计量单位
     *
     * @mbggenerated
     */
    private String gUnit;

    /**
     * 数量
     *
     * @mbggenerated
     */
    private Integer gQty;

    /**
     * 单价
     *
     * @mbggenerated
     */
    private BigDecimal gPrice;

    /**
     * 库位编号
     *
     * @mbggenerated
     */
    private String storageLocationNo;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInStockNo() {
        return inStockNo;
    }

    public void setInStockNo(String inStockNo) {
        this.inStockNo = inStockNo;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
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

    public String getgUnit() {
        return gUnit;
    }

    public void setgUnit(String gUnit) {
        this.gUnit = gUnit;
    }

    public Integer getgQty() {
        return gQty;
    }

    public void setgQty(Integer gQty) {
        this.gQty = gQty;
    }

    public BigDecimal getgPrice() {
        return gPrice;
    }

    public void setgPrice(BigDecimal gPrice) {
        this.gPrice = gPrice;
    }

    public String getStorageLocationNo() {
        return storageLocationNo;
    }

    public void setStorageLocationNo(String storageLocationNo) {
        this.storageLocationNo = storageLocationNo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", inStockNo=").append(inStockNo);
        sb.append(", goodsNo=").append(goodsNo);
        sb.append(", pn=").append(pn);
        sb.append(", gName=").append(gName);
        sb.append(", gModel=").append(gModel);
        sb.append(", gUnit=").append(gUnit);
        sb.append(", gQty=").append(gQty);
        sb.append(", gPrice=").append(gPrice);
        sb.append(", storageLocationNo=").append(storageLocationNo);
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
        InStockDtl other = (InStockDtl) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getInStockNo() == null ? other.getInStockNo() == null : this.getInStockNo().equals(other.getInStockNo()))
            && (this.getGoodsNo() == null ? other.getGoodsNo() == null : this.getGoodsNo().equals(other.getGoodsNo()))
            && (this.getPn() == null ? other.getPn() == null : this.getPn().equals(other.getPn()))
            && (this.getgName() == null ? other.getgName() == null : this.getgName().equals(other.getgName()))
            && (this.getgModel() == null ? other.getgModel() == null : this.getgModel().equals(other.getgModel()))
            && (this.getgUnit() == null ? other.getgUnit() == null : this.getgUnit().equals(other.getgUnit()))
            && (this.getgQty() == null ? other.getgQty() == null : this.getgQty().equals(other.getgQty()))
            && (this.getgPrice() == null ? other.getgPrice() == null : this.getgPrice().equals(other.getgPrice()))
            && (this.getStorageLocationNo() == null ? other.getStorageLocationNo() == null : this.getStorageLocationNo().equals(other.getStorageLocationNo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getInStockNo() == null) ? 0 : getInStockNo().hashCode());
        result = prime * result + ((getGoodsNo() == null) ? 0 : getGoodsNo().hashCode());
        result = prime * result + ((getPn() == null) ? 0 : getPn().hashCode());
        result = prime * result + ((getgName() == null) ? 0 : getgName().hashCode());
        result = prime * result + ((getgModel() == null) ? 0 : getgModel().hashCode());
        result = prime * result + ((getgUnit() == null) ? 0 : getgUnit().hashCode());
        result = prime * result + ((getgQty() == null) ? 0 : getgQty().hashCode());
        result = prime * result + ((getgPrice() == null) ? 0 : getgPrice().hashCode());
        result = prime * result + ((getStorageLocationNo() == null) ? 0 : getStorageLocationNo().hashCode());
        return result;
    }
}