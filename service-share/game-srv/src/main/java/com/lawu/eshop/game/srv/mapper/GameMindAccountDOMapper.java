package com.lawu.eshop.game.srv.mapper;

import com.lawu.eshop.game.srv.domain.GameMindAccountDO;
import com.lawu.eshop.game.srv.domain.GameMindAccountDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GameMindAccountDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_mind_account
     *
     * @mbg.generated
     */
    long countByExample(GameMindAccountDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_mind_account
     *
     * @mbg.generated
     */
    int deleteByExample(GameMindAccountDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_mind_account
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_mind_account
     *
     * @mbg.generated
     */
    int insert(GameMindAccountDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_mind_account
     *
     * @mbg.generated
     */
    int insertSelective(GameMindAccountDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_mind_account
     *
     * @mbg.generated
     */
    List<GameMindAccountDO> selectByExampleWithRowbounds(GameMindAccountDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_mind_account
     *
     * @mbg.generated
     */
    List<GameMindAccountDO> selectByExample(GameMindAccountDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_mind_account
     *
     * @mbg.generated
     */
    GameMindAccountDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_mind_account
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") GameMindAccountDO record, @Param("example") GameMindAccountDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_mind_account
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") GameMindAccountDO record, @Param("example") GameMindAccountDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_mind_account
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(GameMindAccountDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_mind_account
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GameMindAccountDO record);
}