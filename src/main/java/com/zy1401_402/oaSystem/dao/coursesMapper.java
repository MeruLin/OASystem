package com.zy1401_402.oaSystem.dao;

import com.zy1401_402.oaSystem.entity.courses;

public interface coursesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String courseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbggenerated
     */
    int insert(courses record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbggenerated
     */
    int insertSelective(courses record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbggenerated
     */
    courses selectByPrimaryKey(String courseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(courses record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(courses record);
}