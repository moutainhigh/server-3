package com.lawu.eshop.activity.srv.domain;

import java.io.Serializable;
import java.util.Date;

public class RichConfigDO implements Serializable {
    /**
     *
     * 主键
     * rich_config.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 瑞奇岛E钻配置生效时间，第二天凌晨更新
     * rich_config.diamond_effective_time
     *
     * @mbg.generated
     */
    private Date diamondEffectiveTime;

    /**
     *
     * 动力任务配置生效时间，第二天凌晨更新
     * rich_config.power_effective_time
     *
     * @mbg.generated
     */
    private Date powerEffectiveTime;

    /**
     *
     * 商家动力任务配置生效时间
     * rich_config.merchant_power_effective_time
     *
     * @mbg.generated
     */
    private Date merchantPowerEffectiveTime;

    /**
     *
     * 公告
     * rich_config.notice
     *
     * @mbg.generated
     */
    private String notice;

    /**
     *
     * 商家公告
     * rich_config.merchant_notice
     *
     * @mbg.generated
     */
    private String merchantNotice;

    /**
     *
     * 更新时间
     * rich_config.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * 创建时间
     * rich_config.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     *
     * 瑞奇岛E钻配置信息json
     * rich_config.diamond_config
     *
     * @mbg.generated
     */
    private String diamondConfig;

    /**
     *
     * 动力任务配置信息json
     * rich_config.power_task_config
     *
     * @mbg.generated
     */
    private String powerTaskConfig;

    /**
     *
     * 商家动力任务配置信息json
     * rich_config.merchant_power_task_config
     *
     * @mbg.generated
     */
    private String merchantPowerTaskConfig;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rich_config
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rich_config.id
     *
     * @return the value of rich_config.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rich_config.id
     *
     * @param id the value for rich_config.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rich_config.diamond_effective_time
     *
     * @return the value of rich_config.diamond_effective_time
     *
     * @mbg.generated
     */
    public Date getDiamondEffectiveTime() {
        return diamondEffectiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rich_config.diamond_effective_time
     *
     * @param diamondEffectiveTime the value for rich_config.diamond_effective_time
     *
     * @mbg.generated
     */
    public void setDiamondEffectiveTime(Date diamondEffectiveTime) {
        this.diamondEffectiveTime = diamondEffectiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rich_config.power_effective_time
     *
     * @return the value of rich_config.power_effective_time
     *
     * @mbg.generated
     */
    public Date getPowerEffectiveTime() {
        return powerEffectiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rich_config.power_effective_time
     *
     * @param powerEffectiveTime the value for rich_config.power_effective_time
     *
     * @mbg.generated
     */
    public void setPowerEffectiveTime(Date powerEffectiveTime) {
        this.powerEffectiveTime = powerEffectiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rich_config.merchant_power_effective_time
     *
     * @return the value of rich_config.merchant_power_effective_time
     *
     * @mbg.generated
     */
    public Date getMerchantPowerEffectiveTime() {
        return merchantPowerEffectiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rich_config.merchant_power_effective_time
     *
     * @param merchantPowerEffectiveTime the value for rich_config.merchant_power_effective_time
     *
     * @mbg.generated
     */
    public void setMerchantPowerEffectiveTime(Date merchantPowerEffectiveTime) {
        this.merchantPowerEffectiveTime = merchantPowerEffectiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rich_config.notice
     *
     * @return the value of rich_config.notice
     *
     * @mbg.generated
     */
    public String getNotice() {
        return notice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rich_config.notice
     *
     * @param notice the value for rich_config.notice
     *
     * @mbg.generated
     */
    public void setNotice(String notice) {
        this.notice = notice == null ? null : notice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rich_config.merchant_notice
     *
     * @return the value of rich_config.merchant_notice
     *
     * @mbg.generated
     */
    public String getMerchantNotice() {
        return merchantNotice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rich_config.merchant_notice
     *
     * @param merchantNotice the value for rich_config.merchant_notice
     *
     * @mbg.generated
     */
    public void setMerchantNotice(String merchantNotice) {
        this.merchantNotice = merchantNotice == null ? null : merchantNotice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rich_config.gmt_modified
     *
     * @return the value of rich_config.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rich_config.gmt_modified
     *
     * @param gmtModified the value for rich_config.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rich_config.gmt_create
     *
     * @return the value of rich_config.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rich_config.gmt_create
     *
     * @param gmtCreate the value for rich_config.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rich_config.diamond_config
     *
     * @return the value of rich_config.diamond_config
     *
     * @mbg.generated
     */
    public String getDiamondConfig() {
        return diamondConfig;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rich_config.diamond_config
     *
     * @param diamondConfig the value for rich_config.diamond_config
     *
     * @mbg.generated
     */
    public void setDiamondConfig(String diamondConfig) {
        this.diamondConfig = diamondConfig == null ? null : diamondConfig.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rich_config.power_task_config
     *
     * @return the value of rich_config.power_task_config
     *
     * @mbg.generated
     */
    public String getPowerTaskConfig() {
        return powerTaskConfig;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rich_config.power_task_config
     *
     * @param powerTaskConfig the value for rich_config.power_task_config
     *
     * @mbg.generated
     */
    public void setPowerTaskConfig(String powerTaskConfig) {
        this.powerTaskConfig = powerTaskConfig == null ? null : powerTaskConfig.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rich_config.merchant_power_task_config
     *
     * @return the value of rich_config.merchant_power_task_config
     *
     * @mbg.generated
     */
    public String getMerchantPowerTaskConfig() {
        return merchantPowerTaskConfig;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rich_config.merchant_power_task_config
     *
     * @param merchantPowerTaskConfig the value for rich_config.merchant_power_task_config
     *
     * @mbg.generated
     */
    public void setMerchantPowerTaskConfig(String merchantPowerTaskConfig) {
        this.merchantPowerTaskConfig = merchantPowerTaskConfig == null ? null : merchantPowerTaskConfig.trim();
    }
}