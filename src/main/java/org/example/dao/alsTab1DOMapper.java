package org.example.dao;

import org.example.dataobject.alsTab1DO;

import java.util.List;

public interface alsTab1DOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alstab1
     *
     * @mbg.generated Thu Dec 02 13:48:17 CST 2021
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alstab1
     *
     * @mbg.generated Thu Dec 02 13:48:17 CST 2021
     */
    int insert(alsTab1DO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alstab1
     *
     * @mbg.generated Thu Dec 02 13:48:17 CST 2021
     */
    int insertSelective(alsTab1DO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alstab1
     *
     * @mbg.generated Thu Dec 02 13:48:17 CST 2021
     */
    alsTab1DO selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alstab1
     *
     * @mbg.generated Thu Dec 02 13:48:17 CST 2021
     */
    int updateByPrimaryKeySelective(alsTab1DO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alstab1
     *
     * @mbg.generated Thu Dec 02 13:48:17 CST 2021
     */
    int updateByPrimaryKey(alsTab1DO record);

    public List<alsTab1DO> selectByUserId(Integer userId);
}