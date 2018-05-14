package cn.luvletter.in.model;

import java.io.Serializable;
import java.util.Date;

public class InStock implements Serializable {
    private Long id;

    /**
     * 入库单号
     *
     * @mbggenerated
     */
    private String inStockNo;

    /**
     * 仓库编号
     *
     * @mbggenerated
     */
    private String warehouseNo;

    /**
     * 状态(10:新建,11:已到货,12:已理货,13:已上架,14:入库完成,18:已关闭)
     *
     * @mbggenerated
     */
    private String inStockStatus;

    /**
     * 备注
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * 到货时间
     *
     * @mbggenerated
     */
    private Date dhDate;

    /**
     * 理货完成时间
     *
     * @mbggenerated
     */
    private Date tallyDate;

    /**
     * 上架完成时间
     *
     * @mbggenerated
     */
    private Date sjDate;

    /**
     * 入库完成时间
     *
     * @mbggenerated
     */
    private Date finDate;

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

    public String getInStockNo() {
        return inStockNo;
    }

    public void setInStockNo(String inStockNo) {
        this.inStockNo = inStockNo;
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo;
    }

    public String getInStockStatus() {
        return inStockStatus;
    }

    public void setInStockStatus(String inStockStatus) {
        this.inStockStatus = inStockStatus;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Date getDhDate() {
        return dhDate;
    }

    public void setDhDate(Date dhDate) {
        this.dhDate = dhDate;
    }

    public Date getTallyDate() {
        return tallyDate;
    }

    public void setTallyDate(Date tallyDate) {
        this.tallyDate = tallyDate;
    }

    public Date getSjDate() {
        return sjDate;
    }

    public void setSjDate(Date sjDate) {
        this.sjDate = sjDate;
    }

    public Date getFinDate() {
        return finDate;
    }

    public void setFinDate(Date finDate) {
        this.finDate = finDate;
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
        sb.append(", inStockNo=").append(inStockNo);
        sb.append(", warehouseNo=").append(warehouseNo);
        sb.append(", inStockStatus=").append(inStockStatus);
        sb.append(", memo=").append(memo);
        sb.append(", dhDate=").append(dhDate);
        sb.append(", tallyDate=").append(tallyDate);
        sb.append(", sjDate=").append(sjDate);
        sb.append(", finDate=").append(finDate);
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
        InStock other = (InStock) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getInStockNo() == null ? other.getInStockNo() == null : this.getInStockNo().equals(other.getInStockNo()))
            && (this.getWarehouseNo() == null ? other.getWarehouseNo() == null : this.getWarehouseNo().equals(other.getWarehouseNo()))
            && (this.getInStockStatus() == null ? other.getInStockStatus() == null : this.getInStockStatus().equals(other.getInStockStatus()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getDhDate() == null ? other.getDhDate() == null : this.getDhDate().equals(other.getDhDate()))
            && (this.getTallyDate() == null ? other.getTallyDate() == null : this.getTallyDate().equals(other.getTallyDate()))
            && (this.getSjDate() == null ? other.getSjDate() == null : this.getSjDate().equals(other.getSjDate()))
            && (this.getFinDate() == null ? other.getFinDate() == null : this.getFinDate().equals(other.getFinDate()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getInStockNo() == null) ? 0 : getInStockNo().hashCode());
        result = prime * result + ((getWarehouseNo() == null) ? 0 : getWarehouseNo().hashCode());
        result = prime * result + ((getInStockStatus() == null) ? 0 : getInStockStatus().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getDhDate() == null) ? 0 : getDhDate().hashCode());
        result = prime * result + ((getTallyDate() == null) ? 0 : getTallyDate().hashCode());
        result = prime * result + ((getSjDate() == null) ? 0 : getSjDate().hashCode());
        result = prime * result + ((getFinDate() == null) ? 0 : getFinDate().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        return result;
    }
}