package com.spider.dao;

import com.spider.texasinfo.SpiderUserPokerOutline;
import com.spider.texasinfo.SpiderUserPokerOutlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpiderUserPokerOutlineMapper {
    /**
     *
     * @mbggenerated 2017-11-10
     */
    int countByExample(SpiderUserPokerOutlineExample example);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    int deleteByExample(SpiderUserPokerOutlineExample example);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    int insert(SpiderUserPokerOutline record);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    int insertSelective(SpiderUserPokerOutline record);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    List<SpiderUserPokerOutline> selectByExample(SpiderUserPokerOutlineExample example);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    SpiderUserPokerOutline selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    int updateByExampleSelective(@Param("record") SpiderUserPokerOutline record, @Param("example") SpiderUserPokerOutlineExample example);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    int updateByExample(@Param("record") SpiderUserPokerOutline record, @Param("example") SpiderUserPokerOutlineExample example);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    int updateByPrimaryKeySelective(SpiderUserPokerOutline record);

    /**
     *
     * @mbggenerated 2017-11-10
     */
    int updateByPrimaryKey(SpiderUserPokerOutline record);
}