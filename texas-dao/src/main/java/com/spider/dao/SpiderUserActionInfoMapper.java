package com.spider.dao;

import com.spider.texasinfo.SpiderUserActionInfo;
import com.spider.texasinfo.SpiderUserActionInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpiderUserActionInfoMapper {
    /**
     *
     * @mbggenerated 2017-11-09
     */
    int countByExample(SpiderUserActionInfoExample example);

    /**
     *
     * @mbggenerated 2017-11-09
     */
    int deleteByExample(SpiderUserActionInfoExample example);

    /**
     *
     * @mbggenerated 2017-11-09
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2017-11-09
     */
    int insert(SpiderUserActionInfo record);

    /**
     *
     * @mbggenerated 2017-11-09
     */
    int insertSelective(SpiderUserActionInfo record);

    /**
     *
     * @mbggenerated 2017-11-09
     */
    List<SpiderUserActionInfo> selectByExample(SpiderUserActionInfoExample example);

    /**
     *
     * @mbggenerated 2017-11-09
     */
    SpiderUserActionInfo selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2017-11-09
     */
    int updateByExampleSelective(@Param("record") SpiderUserActionInfo record, @Param("example") SpiderUserActionInfoExample example);

    /**
     *
     * @mbggenerated 2017-11-09
     */
    int updateByExample(@Param("record") SpiderUserActionInfo record, @Param("example") SpiderUserActionInfoExample example);

    /**
     *
     * @mbggenerated 2017-11-09
     */
    int updateByPrimaryKeySelective(SpiderUserActionInfo record);

    /**
     *
     * @mbggenerated 2017-11-09
     */
    int updateByPrimaryKey(SpiderUserActionInfo record);
}