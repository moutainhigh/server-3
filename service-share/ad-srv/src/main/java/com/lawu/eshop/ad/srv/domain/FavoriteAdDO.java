package com.lawu.eshop.ad.srv.domain;

import java.io.Serializable;
import java.util.Date;

public class FavoriteAdDO implements Serializable {
    /**
     *
     * 主键
     * favorite_ad.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 广告ID
     * favorite_ad.ad_id
     *
     * @mbg.generated
     */
    private Long adId;

    /**
     *
     * 会员ID
     * favorite_ad.member_id
     *
     * @mbg.generated
     */
    private Long memberId;

    /**
     *
     * 会员编号
     * favorite_ad.member_num
     *
     * @mbg.generated
     */
    private String memberNum;

    /**
     *
     * 是否发送消息
     * favorite_ad.is_send
     *
     * @mbg.generated
     */
    private Boolean isSend;

    /**
     *
     * 创建时间
     * favorite_ad.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table favorite_ad
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column favorite_ad.id
     *
     * @return the value of favorite_ad.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column favorite_ad.id
     *
     * @param id the value for favorite_ad.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column favorite_ad.ad_id
     *
     * @return the value of favorite_ad.ad_id
     *
     * @mbg.generated
     */
    public Long getAdId() {
        return adId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column favorite_ad.ad_id
     *
     * @param adId the value for favorite_ad.ad_id
     *
     * @mbg.generated
     */
    public void setAdId(Long adId) {
        this.adId = adId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column favorite_ad.member_id
     *
     * @return the value of favorite_ad.member_id
     *
     * @mbg.generated
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column favorite_ad.member_id
     *
     * @param memberId the value for favorite_ad.member_id
     *
     * @mbg.generated
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column favorite_ad.member_num
     *
     * @return the value of favorite_ad.member_num
     *
     * @mbg.generated
     */
    public String getMemberNum() {
        return memberNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column favorite_ad.member_num
     *
     * @param memberNum the value for favorite_ad.member_num
     *
     * @mbg.generated
     */
    public void setMemberNum(String memberNum) {
        this.memberNum = memberNum == null ? null : memberNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column favorite_ad.is_send
     *
     * @return the value of favorite_ad.is_send
     *
     * @mbg.generated
     */
    public Boolean getIsSend() {
        return isSend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column favorite_ad.is_send
     *
     * @param isSend the value for favorite_ad.is_send
     *
     * @mbg.generated
     */
    public void setIsSend(Boolean isSend) {
        this.isSend = isSend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column favorite_ad.gmt_create
     *
     * @return the value of favorite_ad.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column favorite_ad.gmt_create
     *
     * @param gmtCreate the value for favorite_ad.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}