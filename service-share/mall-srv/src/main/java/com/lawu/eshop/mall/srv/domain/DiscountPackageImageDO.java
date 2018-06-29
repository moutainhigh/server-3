package com.lawu.eshop.mall.srv.domain;

import java.io.Serializable;
import java.util.Date;

public class DiscountPackageImageDO implements Serializable {
    /**
     *
     * 主键
     * discount_package_image.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 优惠套餐id
     * discount_package_image.discount_package_id
     *
     * @mbg.generated
     */
    private Long discountPackageId;

    /**
     *
     * 文字描述
     * discount_package_image.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * 图片
     * discount_package_image.image
     *
     * @mbg.generated
     */
    private String image;

    /**
     *
     * 状态(0-删除|1-正常)
     * discount_package_image.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     *
     * 创建时间
     * discount_package_image.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     *
     * 更新时间
     * discount_package_image.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table discount_package_image
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discount_package_image.id
     *
     * @return the value of discount_package_image.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discount_package_image.id
     *
     * @param id the value for discount_package_image.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discount_package_image.discount_package_id
     *
     * @return the value of discount_package_image.discount_package_id
     *
     * @mbg.generated
     */
    public Long getDiscountPackageId() {
        return discountPackageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discount_package_image.discount_package_id
     *
     * @param discountPackageId the value for discount_package_image.discount_package_id
     *
     * @mbg.generated
     */
    public void setDiscountPackageId(Long discountPackageId) {
        this.discountPackageId = discountPackageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discount_package_image.description
     *
     * @return the value of discount_package_image.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discount_package_image.description
     *
     * @param description the value for discount_package_image.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discount_package_image.image
     *
     * @return the value of discount_package_image.image
     *
     * @mbg.generated
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discount_package_image.image
     *
     * @param image the value for discount_package_image.image
     *
     * @mbg.generated
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discount_package_image.status
     *
     * @return the value of discount_package_image.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discount_package_image.status
     *
     * @param status the value for discount_package_image.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discount_package_image.gmt_create
     *
     * @return the value of discount_package_image.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discount_package_image.gmt_create
     *
     * @param gmtCreate the value for discount_package_image.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discount_package_image.gmt_modified
     *
     * @return the value of discount_package_image.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discount_package_image.gmt_modified
     *
     * @param gmtModified the value for discount_package_image.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}