package cn.luvletter.out.model;

import java.io.Serializable;
import java.util.Date;

public class OutStock implements Serializable {
    private Long id;

    /**
     * 出库单号
     *
     * @mbggenerated
     */
    private String outStockNo;

    /**
     * 仓库编号
     *
     * @mbggenerated
     */
    private String warehouseNo;

    /**
     * 状态(31：新建，32：已拣货，38：已关闭)
     *
     * @mbggenerated
     */
    private String outStockStatus;

    /**
     * 备注
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * 拣货完成时间
     *
     * @mbggenerated
     */
    private Date outDate;

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

    public String getOutStockNo() {
        return outStockNo;
    }

    public void setOutStockNo(String outStockNo) {
        this.outStockNo = outStockNo;
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo;
    }

    public String getOutStockStatus() {
        return outStockStatus;
    }

    public void setOutStockStatus(String outStockStatus) {
        this.outStockStatus = outStockStatus;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
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
        sb.append(", outStockNo=").append(outStockNo);
        sb.append(", warehouseNo=").append(warehouseNo);
        sb.append(", outStockStatus=").append(outStockStatus);
        sb.append(", memo=").append(memo);
        sb.append(", outDate=").append(outDate);
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
        OutStock other = (OutStock) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOutStockNo() == null ? other.getOutStockNo() == null : this.getOutStockNo().equals(other.getOutStockNo()))
            && (this.getWarehouseNo() == null ? other.getWarehouseNo() == null : this.getWarehouseNo().equals(other.getWarehouseNo()))
            && (this.getOutStockStatus() == null ? other.getOutStockStatus() == null : this.getOutStockStatus().equals(other.getOutStockStatus()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getOutDate() == null ? other.getOutDate() == null : this.getOutDate().equals(other.getOutDate()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOutStockNo() == null) ? 0 : getOutStockNo().hashCode());
        result = prime * result + ((getWarehouseNo() == null) ? 0 : getWarehouseNo().hashCode());
        result = prime * result + ((getOutStockStatus() == null) ? 0 : getOutStockStatus().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getOutDate() == null) ? 0 : getOutDate().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        return result;
    }
}