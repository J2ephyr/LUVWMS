package cn.luvletter.base.model;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;
import java.util.Date;

public class Goods implements Serializable {
    private Long id;

    /**
     * 商品编号
     *
     * @mbggenerated
     */
    private String goodsNo;

    /**
     * 条形码
     *
     * @mbggenerated
     */
    @NotEmpty(message = "条形码不能为空")
    private String pn;

    /**
     * 商品名称
     *
     * @mbggenerated
     */
    @NotEmpty(message = "商品名称不能为空")
    private String goodsName;

    /**
     * 商品简介
     *
     * @mbggenerated
     */
    private String goodsBrief;

    /**
     * 商品图片
     *
     * @mbggenerated
     */
    private String goodsImg;

    /**
     * 规格
     *
     * @mbggenerated
     */
    private String goodsModel;

    /**
     * 颜色
     *
     * @mbggenerated
     */
    private String goodsColor;

    /**
     * 仓库
     *
     * @mbggenerated
     */
    private String warehouseNo;

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
     * 备注
     *
     * @mbggenerated
     */
    private String memo;

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

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsBrief() {
        return goodsBrief;
    }

    public void setGoodsBrief(String goodsBrief) {
        this.goodsBrief = goodsBrief;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public String getGoodsModel() {
        return goodsModel;
    }

    public void setGoodsModel(String goodsModel) {
        this.goodsModel = goodsModel;
    }

    public String getGoodsColor() {
        return goodsColor;
    }

    public void setGoodsColor(String goodsColor) {
        this.goodsColor = goodsColor;
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo;
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

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goodsNo=").append(goodsNo);
        sb.append(", pn=").append(pn);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsBrief=").append(goodsBrief);
        sb.append(", goodsImg=").append(goodsImg);
        sb.append(", goodsModel=").append(goodsModel);
        sb.append(", goodsColor=").append(goodsColor);
        sb.append(", warehouseNo=").append(warehouseNo);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", memo=").append(memo);
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
        Goods other = (Goods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoodsNo() == null ? other.getGoodsNo() == null : this.getGoodsNo().equals(other.getGoodsNo()))
            && (this.getPn() == null ? other.getPn() == null : this.getPn().equals(other.getPn()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getGoodsBrief() == null ? other.getGoodsBrief() == null : this.getGoodsBrief().equals(other.getGoodsBrief()))
            && (this.getGoodsImg() == null ? other.getGoodsImg() == null : this.getGoodsImg().equals(other.getGoodsImg()))
            && (this.getGoodsModel() == null ? other.getGoodsModel() == null : this.getGoodsModel().equals(other.getGoodsModel()))
            && (this.getGoodsColor() == null ? other.getGoodsColor() == null : this.getGoodsColor().equals(other.getGoodsColor()))
            && (this.getWarehouseNo() == null ? other.getWarehouseNo() == null : this.getWarehouseNo().equals(other.getWarehouseNo()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGoodsNo() == null) ? 0 : getGoodsNo().hashCode());
        result = prime * result + ((getPn() == null) ? 0 : getPn().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getGoodsBrief() == null) ? 0 : getGoodsBrief().hashCode());
        result = prime * result + ((getGoodsImg() == null) ? 0 : getGoodsImg().hashCode());
        result = prime * result + ((getGoodsModel() == null) ? 0 : getGoodsModel().hashCode());
        result = prime * result + ((getGoodsColor() == null) ? 0 : getGoodsColor().hashCode());
        result = prime * result + ((getWarehouseNo() == null) ? 0 : getWarehouseNo().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        return result;
    }
}