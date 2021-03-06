package com.lawu.eshop.user.srv.mapper;

import com.lawu.eshop.user.srv.domain.FansInviteContentDO;
import com.lawu.eshop.user.srv.domain.FansInviteContentDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface FansInviteContentDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fans_invite_content
     *
     * @mbg.generated
     */
    int countByExample(FansInviteContentDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fans_invite_content
     *
     * @mbg.generated
     */
    int deleteByExample(FansInviteContentDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fans_invite_content
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fans_invite_content
     *
     * @mbg.generated
     */
    int insert(FansInviteContentDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fans_invite_content
     *
     * @mbg.generated
     */
    int insertSelective(FansInviteContentDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fans_invite_content
     *
     * @mbg.generated
     */
    List<FansInviteContentDO> selectByExampleWithRowbounds(FansInviteContentDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fans_invite_content
     *
     * @mbg.generated
     */
    List<FansInviteContentDO> selectByExample(FansInviteContentDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fans_invite_content
     *
     * @mbg.generated
     */
    FansInviteContentDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fans_invite_content
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FansInviteContentDO record, @Param("example") FansInviteContentDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fans_invite_content
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FansInviteContentDO record, @Param("example") FansInviteContentDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fans_invite_content
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FansInviteContentDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fans_invite_content
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FansInviteContentDO record);
}