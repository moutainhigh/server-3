package com.lawu.eshop.user.srv.mapper;

import com.lawu.eshop.user.srv.domain.FavoriteMerchantDO;
import com.lawu.eshop.user.srv.domain.FavoriteMerchantDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface FavoriteMerchantDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite_merchant
     *
     * @mbg.generated
     */
	long countByExample(FavoriteMerchantDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite_merchant
     *
     * @mbg.generated
     */
    int deleteByExample(FavoriteMerchantDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite_merchant
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite_merchant
     *
     * @mbg.generated
     */
    int insert(FavoriteMerchantDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite_merchant
     *
     * @mbg.generated
     */
    int insertSelective(FavoriteMerchantDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite_merchant
     *
     * @mbg.generated
     */
    List<FavoriteMerchantDO> selectByExampleWithRowbounds(FavoriteMerchantDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite_merchant
     *
     * @mbg.generated
     */
    List<FavoriteMerchantDO> selectByExample(FavoriteMerchantDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite_merchant
     *
     * @mbg.generated
     */
    FavoriteMerchantDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite_merchant
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FavoriteMerchantDO record, @Param("example") FavoriteMerchantDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite_merchant
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FavoriteMerchantDO record, @Param("example") FavoriteMerchantDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite_merchant
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FavoriteMerchantDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite_merchant
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FavoriteMerchantDO record);
}