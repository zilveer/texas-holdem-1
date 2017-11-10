package com.spider.dao;

import com.spider.texasinfo.SpiderUserActionInfo;
import com.spider.texasinfo.SpiderUserActionInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpiderUserActionInfoMapper {
    /**
     *
     * @mbggenerated 2017-11-10
     */
    int countByExample(SpiderUserActionInfoExample example);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    int deleteByExample(SpiderUserActionInfoExample example);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    int insert(SpiderUserActionInfo record);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    int insertSelective(SpiderUserActionInfo record);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    List<SpiderUserActionInfo> selectByExample(SpiderUserActionInfoExample example);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    SpiderUserActionInfo selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    int updateByExampleSelective(@Param("record") SpiderUserActionInfo record, @Param("example") SpiderUserActionInfoExample example);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    int updateByExample(@Param("record") SpiderUserActionInfo record, @Param("example") SpiderUserActionInfoExample example);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    int updateByPrimaryKeySelective(SpiderUserActionInfo record);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    int updateByPrimaryKey(SpiderUserActionInfo record);
}