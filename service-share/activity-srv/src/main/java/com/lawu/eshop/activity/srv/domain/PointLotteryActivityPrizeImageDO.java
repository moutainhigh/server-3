package com.lawu.eshop.activity.srv.domain;

import java.io.Serializable;
import java.util.Date;

public class PointLotteryActivityPrizeImageDO implements Serializable {
    /**
     *
     * 主键
     * point_lottery_activity_prize_image.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 幸运抽奖活动id
     * point_lottery_activity_prize_image.point_lottery_activity_id
     *
     * @mbg.generated
     */
    private Long pointLotteryActivityId;

    /**
     *
     * 图片路径
     * point_lottery_activity_prize_image.image_path
     *
     * @mbg.generated
     */
    private String imagePath;

    /**
     *
     * 序号
     * point_lottery_activity_prize_image.order_num
     *
     * @mbg.generated
     */
    private Integer orderNum;

    /**
     *
     * 1--活动介绍，2--中奖信息
     * point_lottery_activity_prize_image.type
     *
     * @mbg.generated
     */
    private Byte type;

    /**
     *
     * 修改时间
     * point_lottery_activity_prize_image.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * 创建时间
     * point_lottery_activity_prize_image.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table point_lottery_activity_prize_image
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column point_lottery_activity_prize_image.id
     *
     * @return the value of point_lottery_activity_prize_image.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column point_lottery_activity_prize_image.id
     *
     * @param id the value for point_lottery_activity_prize_image.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column point_lottery_activity_prize_image.point_lottery_activity_id
     *
     * @return the value of point_lottery_activity_prize_image.point_lottery_activity_id
     *
     * @mbg.generated
     */
    public Long getPointLotteryActivityId() {
        return pointLotteryActivityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column point_lottery_activity_prize_image.point_lottery_activity_id
     *
     * @param pointLotteryActivityId the value for point_lottery_activity_prize_image.point_lottery_activity_id
     *
     * @mbg.generated
     */
    public void setPointLotteryActivityId(Long pointLotteryActivityId) {
        this.pointLotteryActivityId = pointLotteryActivityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column point_lottery_activity_prize_image.image_path
     *
     * @return the value of point_lottery_activity_prize_image.image_path
     *
     * @mbg.generated
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column point_lottery_activity_prize_image.image_path
     *
     * @param imagePath the value for point_lottery_activity_prize_image.image_path
     *
     * @mbg.generated
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath == null ? null : imagePath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column point_lottery_activity_prize_image.order_num
     *
     * @return the value of point_lottery_activity_prize_image.order_num
     *
     * @mbg.generated
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column point_lottery_activity_prize_image.order_num
     *
     * @param orderNum the value for point_lottery_activity_prize_image.order_num
     *
     * @mbg.generated
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column point_lottery_activity_prize_image.type
     *
     * @return the value of point_lottery_activity_prize_image.type
     *
     * @mbg.generated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column point_lottery_activity_prize_image.type
     *
     * @param type the value for point_lottery_activity_prize_image.type
     *
     * @mbg.generated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column point_lottery_activity_prize_image.gmt_modified
     *
     * @return the value of point_lottery_activity_prize_image.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column point_lottery_activity_prize_image.gmt_modified
     *
     * @param gmtModified the value for point_lottery_activity_prize_image.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column point_lottery_activity_prize_image.gmt_create
     *
     * @return the value of point_lottery_activity_prize_image.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column point_lottery_activity_prize_image.gmt_create
     *
     * @param gmtCreate the value for point_lottery_activity_prize_image.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}