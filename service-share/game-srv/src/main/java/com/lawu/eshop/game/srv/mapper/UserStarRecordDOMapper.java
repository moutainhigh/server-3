package com.lawu.eshop.game.srv.mapper;

import com.lawu.eshop.game.srv.domain.UserStarRecordDO;
import com.lawu.eshop.game.srv.domain.UserStarRecordDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UserStarRecordDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_star_record
     *
     * @mbg.generated
     */
    long countByExample(UserStarRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_star_record
     *
     * @mbg.generated
     */
    int deleteByExample(UserStarRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_star_record
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_star_record
     *
     * @mbg.generated
     */
    int insert(UserStarRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_star_record
     *
     * @mbg.generated
     */
    int insertSelective(UserStarRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_star_record
     *
     * @mbg.generated
     */
    List<UserStarRecordDO> selectByExampleWithRowbounds(UserStarRecordDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_star_record
     *
     * @mbg.generated
     */
    List<UserStarRecordDO> selectByExample(UserStarRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_star_record
     *
     * @mbg.generated
     */
    UserStarRecordDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_star_record
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserStarRecordDO record, @Param("example") UserStarRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_star_record
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserStarRecordDO record, @Param("example") UserStarRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_star_record
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserStarRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_star_record
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserStarRecordDO record);
}