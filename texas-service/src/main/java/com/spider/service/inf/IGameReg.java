package com.spider.service.inf;

/**
 * 数据文件解析抽象类
 * @author lxx
 * @Date 2017/11/9.16:44
 */
public interface IGameReg {

    /**
     *     拆解所有步骤
     */
    String getProcedureAll();


//    __procedureAll__=r'\*+ #+ [0-9]+ ' #插接所有步骤
//            __gameInfo__ = r'\*{14}[\s\S]+?\*' #牌局基本信息获取
//            __gameId__=r'#\d+' #牌局id
//            __gameTime__=r'\d{0,4}年\d{0,4}日\d{1,2}:\d{1,2}:\d{1,2}.+' #牌局时间
//            __userListReg__=r'座位[0-9].+?\n'#用户 基本信息
//    __number_people__=r'\d+-max' #几人桌
//            __btnPlace__=r'第\d号座位现在是庄家'#寻找庄家位置
//            __levelinfo__='：.+- '#级别信息
//            __street__=r'\*\* [\u4e00-\u9fa5]+? \*\*\*[\s\S]+?\*'#每一条街的内容

}
