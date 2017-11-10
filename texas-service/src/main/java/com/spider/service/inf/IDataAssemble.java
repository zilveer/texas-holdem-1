package com.spider.service.inf;

import com.spider.texasinfo.SpiderPokerInfo;
import com.spider.texasinfo.SpiderUserActionInfo;
import com.spider.texasinfo.SpiderUserPokerOutline;

import java.util.List;
import java.util.Map;


/**
 * @author lxx
 * @Date 2017/11/9.18:30
 */
public interface IDataAssemble {
    /**
     * 拼装牌局对象信息
     * @param gameStr
     * @return
     */
    List<Map<String,String>> assembleGameBean(String gameStr);
    /**
     * 获取所有的牌局
     * @param gameAllStr
     * @return
     */
    List<String> getGameAll(String gameAllStr,String language);

    /**
     * 获取牌局基本信息
     * @param gameStr
     * @return
     */
    String getGameBaseInfo(String gameStr,String language);

    /**
     * 填充牌局基本信息
     * @param gameInfo
     * @return 牌局基本信息对象
     */
    SpiderPokerInfo assembleGameInfoBean(String gameInfo,String language);

    /**
     * 获取用户步骤信息
     * @param gameStr
     * @return
     */
    List<String> getUserActionInfo(String gameStr,String language);

    /**
     * 组装用户动作
     * @param userActionStr
     * @return
     */
    List<SpiderUserActionInfo> assembleUserActionBean(String userActionStr);

    /**
     * 获取牌局概要
     * @param gameStr
     * @return
     */
    String getPokerOutline(String gameStr,String language);

    /**
     *组装用户牌局概要
     * @param userOutline
     * @return
     */
    List<SpiderUserPokerOutline> assemblePokerOutline(String userOutline);
}
