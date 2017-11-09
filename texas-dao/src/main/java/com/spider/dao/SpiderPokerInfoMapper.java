package com.spider.dao;

import com.spider.texasinfo.SpiderPokerInfo;
import com.spider.texasinfo.SpiderPokerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpiderPokerInfoMapper {
    /**
     *
     * @mbggenerated 2017-11-09
     */
    int countByExample(SpiderPokerInfoExample example);

    /**
     *
     * @mbggenerated 2017-11-09
     */
    int deleteByExample(SpiderPokerInfoExample example);

    /**
     *
     * @mbggenerated 2017-11-09
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2017-11-09
     */
    int insert(SpiderPokerInfo record);

    /**
     *
     * @mbggenerated 2017-11-09
     */
    int insertSelective(SpiderPokerInfo record);

    /**
     *
     * @mbggenerated 2017-11-09
     */
    List<SpiderPokerInfo> selectByExample(SpiderPokerInfoExample example);

    /**
     *
     * @mbggenerated 2017-11-09
     */
    SpiderPokerInfo selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2017-11-09
     */
    int updateByExampleSelective(@Param("record") SpiderPokerInfo record, @Param("example") SpiderPokerInfoExample example);

    /**
     *
     * @mbggenerated 2017-11-09
     */
    int updateByExample(@Param("record") SpiderPokerInfo record, @Param("example") SpiderPokerInfoExample example);

    /**
     *
     * @mbggenerated 2017-11-09
     */
    int updateByPrimaryKeySelective(SpiderPokerInfo record);

    /**
     *
     * @mbggenerated 2017-11-09
     */
    int updateByPrimaryKey(SpiderPokerInfo record);
}