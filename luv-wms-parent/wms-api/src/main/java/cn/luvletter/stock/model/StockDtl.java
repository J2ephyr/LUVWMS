package cn.luvletter.stock.model;

import java.io.Serializable;
import java.util.Date;

public class StockDtl implements Serializable {
    private Long id;

    /**
     * 商品编号
     *
     * @mbggenerated
     */
    private String goodsNo;

    /**
     * 库位编号
     *
     * @mbggenerated
     */
    private String storageLocationNo;

    /**
     * 库区编号
     *
     * @mbggenerated
     */
    private String areaNo;

    /**
     * 数量
     *
     * @mbggenerated
     */
    private Integer gQty;

    /**
     * 记录创建时间
     *
     * @mbggenerated
     */
    private Date gmtCreate;

    /**
     * 库存更新时间
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

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getStorageLocationNo() {
        return storageLocationNo;
    }

    public void setStorageLocationNo(String storageLocationNo) {
        this.storageLocationNo = storageLocationNo;
    }

    public String getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo;
    }

    public Integer getgQty() {
        return gQty;
    }

    public void setgQty(Integer gQty) {
        this.gQty = gQty;
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
        sb.append(", goodsNo=").append(goodsNo);
        sb.append(", storageLocationNo=").append(storageLocationNo);
        sb.append(", areaNo=").append(areaNo);
        sb.append(", gQty=").append(gQty);
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
        StockDtl other = (StockDtl) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoodsNo() == null ? other.getGoodsNo() == null : this.getGoodsNo().equals(other.getGoodsNo()))
            && (this.getStorageLocationNo() == null ? other.getStorageLocationNo() == null : this.getStorageLocationNo().equals(other.getStorageLocationNo()))
            && (this.getAreaNo() == null ? other.getAreaNo() == null : this.getAreaNo().equals(other.getAreaNo()))
            && (this.getgQty() == null ? other.getgQty() == null : this.getgQty().equals(other.getgQty()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGoodsNo() == null) ? 0 : getGoodsNo().hashCode());
        result = prime * result + ((getStorageLocationNo() == null) ? 0 : getStorageLocationNo().hashCode());
        result = prime * result + ((getAreaNo() == null) ? 0 : getAreaNo().hashCode());
        result = prime * result + ((getgQty() == null) ? 0 : getgQty().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        return result;
    }
}