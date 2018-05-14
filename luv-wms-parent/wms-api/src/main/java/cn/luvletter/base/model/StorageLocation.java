package cn.luvletter.base.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StorageLocation implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 库位编号
     *
     * @mbggenerated
     */
    private String storageLocationNo;

    /**
     * 库位名称
     *
     * @mbggenerated
     */
    private String storageLocationName;

    /**
     * 区域编号
     *
     * @mbggenerated
     */
    private String areaNo;

    /**
     * 仓库编号
     *
     * @mbggenerated
     */
    private String warehouseNo;

    /**
     * 长
     *
     * @mbggenerated
     */
    private BigDecimal length;

    /**
     * 宽
     *
     * @mbggenerated
     */
    private BigDecimal width;

    /**
     * 高
     *
     * @mbggenerated
     */
    private BigDecimal height;

    /**
     * 库位类型
     *
     * @mbggenerated
     */
    private String storageLocationType;

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

    /**
     * 创建人
     *
     * @mbggenerated
     */
    private String createUser;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStorageLocationNo() {
        return storageLocationNo;
    }

    public void setStorageLocationNo(String storageLocationNo) {
        this.storageLocationNo = storageLocationNo;
    }

    public String getStorageLocationName() {
        return storageLocationName;
    }

    public void setStorageLocationName(String storageLocationName) {
        this.storageLocationName = storageLocationName;
    }

    public String getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo;
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public String getStorageLocationType() {
        return storageLocationType;
    }

    public void setStorageLocationType(String storageLocationType) {
        this.storageLocationType = storageLocationType;
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

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", storageLocationNo=").append(storageLocationNo);
        sb.append(", storageLocationName=").append(storageLocationName);
        sb.append(", areaNo=").append(areaNo);
        sb.append(", warehouseNo=").append(warehouseNo);
        sb.append(", length=").append(length);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", storageLocationType=").append(storageLocationType);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", createUser=").append(createUser);
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
        StorageLocation other = (StorageLocation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStorageLocationNo() == null ? other.getStorageLocationNo() == null : this.getStorageLocationNo().equals(other.getStorageLocationNo()))
            && (this.getStorageLocationName() == null ? other.getStorageLocationName() == null : this.getStorageLocationName().equals(other.getStorageLocationName()))
            && (this.getAreaNo() == null ? other.getAreaNo() == null : this.getAreaNo().equals(other.getAreaNo()))
            && (this.getWarehouseNo() == null ? other.getWarehouseNo() == null : this.getWarehouseNo().equals(other.getWarehouseNo()))
            && (this.getLength() == null ? other.getLength() == null : this.getLength().equals(other.getLength()))
            && (this.getWidth() == null ? other.getWidth() == null : this.getWidth().equals(other.getWidth()))
            && (this.getHeight() == null ? other.getHeight() == null : this.getHeight().equals(other.getHeight()))
            && (this.getStorageLocationType() == null ? other.getStorageLocationType() == null : this.getStorageLocationType().equals(other.getStorageLocationType()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStorageLocationNo() == null) ? 0 : getStorageLocationNo().hashCode());
        result = prime * result + ((getStorageLocationName() == null) ? 0 : getStorageLocationName().hashCode());
        result = prime * result + ((getAreaNo() == null) ? 0 : getAreaNo().hashCode());
        result = prime * result + ((getWarehouseNo() == null) ? 0 : getWarehouseNo().hashCode());
        result = prime * result + ((getLength() == null) ? 0 : getLength().hashCode());
        result = prime * result + ((getWidth() == null) ? 0 : getWidth().hashCode());
        result = prime * result + ((getHeight() == null) ? 0 : getHeight().hashCode());
        result = prime * result + ((getStorageLocationType() == null) ? 0 : getStorageLocationType().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        return result;
    }
}