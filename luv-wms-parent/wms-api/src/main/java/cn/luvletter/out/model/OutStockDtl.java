package cn.luvletter.out.model;

import java.io.Serializable;

public class OutStockDtl implements Serializable {
    private Long id;

    /**
     * 出库单号
     *
     * @mbggenerated
     */
    private String outStockNo;

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

    public String getOutStockNo() {
        return outStockNo;
    }

    public void setOutStockNo(String outStockNo) {
        this.outStockNo = outStockNo;
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
        sb.append(", outStockNo=").append(outStockNo);
        sb.append(", goodsNo=").append(goodsNo);
        sb.append(", pn=").append(pn);
        sb.append(", gName=").append(gName);
        sb.append(", gModel=").append(gModel);
        sb.append(", gUnit=").append(gUnit);
        sb.append(", gQty=").append(gQty);
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
        OutStockDtl other = (OutStockDtl) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOutStockNo() == null ? other.getOutStockNo() == null : this.getOutStockNo().equals(other.getOutStockNo()))
            && (this.getGoodsNo() == null ? other.getGoodsNo() == null : this.getGoodsNo().equals(other.getGoodsNo()))
            && (this.getPn() == null ? other.getPn() == null : this.getPn().equals(other.getPn()))
            && (this.getgName() == null ? other.getgName() == null : this.getgName().equals(other.getgName()))
            && (this.getgModel() == null ? other.getgModel() == null : this.getgModel().equals(other.getgModel()))
            && (this.getgUnit() == null ? other.getgUnit() == null : this.getgUnit().equals(other.getgUnit()))
            && (this.getgQty() == null ? other.getgQty() == null : this.getgQty().equals(other.getgQty()))
            && (this.getStorageLocationNo() == null ? other.getStorageLocationNo() == null : this.getStorageLocationNo().equals(other.getStorageLocationNo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOutStockNo() == null) ? 0 : getOutStockNo().hashCode());
        result = prime * result + ((getGoodsNo() == null) ? 0 : getGoodsNo().hashCode());
        result = prime * result + ((getPn() == null) ? 0 : getPn().hashCode());
        result = prime * result + ((getgName() == null) ? 0 : getgName().hashCode());
        result = prime * result + ((getgModel() == null) ? 0 : getgModel().hashCode());
        result = prime * result + ((getgUnit() == null) ? 0 : getgUnit().hashCode());
        result = prime * result + ((getgQty() == null) ? 0 : getgQty().hashCode());
        result = prime * result + ((getStorageLocationNo() == null) ? 0 : getStorageLocationNo().hashCode());
        return result;
    }
}