package com.hsy.mybatis.sample.mapper;

import com.hsy.mybatis.sample.entity.TZone;
import com.hsy.mybatis.sample.entity.TZoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TZoneMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zone
     *
     * @mbg.generated
     */
    long countByExample(TZoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zone
     *
     * @mbg.generated
     */
    int deleteByExample(TZoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zone
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zone
     *
     * @mbg.generated
     */
    int insert(TZone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zone
     *
     * @mbg.generated
     */
    int insertSelective(TZone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zone
     *
     * @mbg.generated
     */
    List<TZone> selectByExample(TZoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zone
     *
     * @mbg.generated
     */
    TZone selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zone
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TZone record, @Param("example") TZoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zone
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TZone record, @Param("example") TZoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zone
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TZone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zone
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TZone record);
}