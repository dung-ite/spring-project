package vn.com.vti.springexam.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import vn.com.vti.springexam.entity.Prefecture;
import vn.com.vti.springexam.entity.PrefectureExample;

public interface PrefectureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 28 17:23:44 JST 2024
     */
    long countByExample(PrefectureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 28 17:23:44 JST 2024
     */
    int deleteByExample(PrefectureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 28 17:23:44 JST 2024
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 28 17:23:44 JST 2024
     */
    int insert(Prefecture row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 28 17:23:44 JST 2024
     */
    int insertSelective(Prefecture row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 28 17:23:44 JST 2024
     */
    List<Prefecture> selectByExample(PrefectureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 28 17:23:44 JST 2024
     */
    Prefecture selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 28 17:23:44 JST 2024
     */
    int updateByExampleSelective(@Param("row") Prefecture row, @Param("example") PrefectureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 28 17:23:44 JST 2024
     */
    int updateByExample(@Param("row") Prefecture row, @Param("example") PrefectureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 28 17:23:44 JST 2024
     */
    int updateByPrimaryKeySelective(Prefecture row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prefecture
     *
     * @mbg.generated Sat Sep 28 17:23:44 JST 2024
     */
    int updateByPrimaryKey(Prefecture row);
}