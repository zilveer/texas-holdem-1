package com.spider.dao;

import com.spider.texasinfo.SpiderPokerInfo;
import com.spider.texasinfo.SpiderPokerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpiderPokerInfoMapper {
    /**
     *
     * @mbggenerated 2017-11-10
     */
    int countByExample(SpiderPokerInfoExample example);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    int deleteByExample(SpiderPokerInfoExample example);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    int insert(SpiderPokerInfo record);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    int insertSelective(SpiderPokerInfo record);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    List<SpiderPokerInfo> selectByExample(SpiderPokerInfoExample example);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    SpiderPokerInfo selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    int updateByExampleSelective(@Param("record") SpiderPokerInfo record, @Param("example") SpiderPokerInfoExample example);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    int updateByExample(@Param("record") SpiderPokerInfo record, @Param("example") SpiderPokerInfoExample example);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    int updateByPrimaryKeySelective(SpiderPokerInfo record);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    int updateByPrimaryKey(SpiderPokerInfo record);
}