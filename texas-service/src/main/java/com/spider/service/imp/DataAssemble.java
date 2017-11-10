package com.spider.service.imp;

import bsh.StringUtil;
import com.spider.enums.LanguageEnum;
import com.spider.factory.GameRegFactory;
import com.spider.service.inf.IDataAssemble;
import com.spider.service.inf.IGameReg;
import com.spider.texasinfo.SpiderPokerInfo;
import com.spider.texasinfo.SpiderUserActionInfo;
import com.spider.texasinfo.SpiderUserPokerOutline;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * @author lxx
 * @Date 2017/11/9.19:31
 */
@Service
public class DataAssemble implements IDataAssemble {
    String gameAllStr="PokerStars扑克之星第#177351177268局：  德州扑克 无限注 （0.01$/0.02$ USD） - 2017年1025日1:31:28 ET\n" +
            "”Phaeo II” 牌桌 6-max 第2号座位现在是庄家\n" +
            "座位1：renachori（3.34$筹码） \n" +
            "座位2：raisamustdie（4.55$筹码） \n" +
            "座位3：xkwlx（2$筹码） \n" +
            "座位4：skingliu666（0.78$筹码） \n" +
            "座位5：turbotel13（2.41$筹码） \n" +
            "座位6：radja878（1.41$筹码） \n" +
            "xkwlx: 下小盲注 0.01$\n" +
            "skingliu666: 下大盲注 0.02$\n" +
            "*** 底牌 ***\n" +
            "发牌给skingliu666 [4s 3h]\n" +
            "turbotel13: 跟注 0.02$\n" +
            "radja878: 盖牌 \n" +
            "renachori: 盖牌 \n" +
            "raisamustdie: 盖牌 \n" +
            "xkwlx: 跟注 0.01$\n" +
            "skingliu666: 过牌 \n" +
            "*** 翻牌 *** [4d 8s Js]\n" +
            "xkwlx: 过牌 \n" +
            "skingliu666: 下注 0.02$\n" +
            "turbotel13: 加注 0.02$至 0.04$\n" +
            "xkwlx: 盖牌 \n" +
            "skingliu666: 跟注 0.02$\n" +
            "*** 转牌 *** [4d 8s Js] [4h]\n" +
            "skingliu666: 过牌 \n" +
            "turbotel13: 下注 0.02$\n" +
            "skingliu666: 加注 0.12$至 0.14$\n" +
            "turbotel13: 加注 0.12$至 0.26$\n" +
            "skingliu666: 加注 0.46$至 0.72$ 全下\n" +
            "turbotel13: 跟注 0.46$\n" +
            "*** 河牌 *** [4d 8s Js 4h] [6h]\n" +
            "*** 亮牌 ***\n" +
            "skingliu666: 亮出底牌 [4s 3h] (三条：三张4)\n" +
            "turbotel13: 亮出底牌 [4c Ts] (三条：三张4 - J+10 踢子)\n" +
            "turbotel13从底池中赢得1.52$\n" +
            "*** 概要 ***\n" +
            "底池总金额1.58$ |抽成0 .06$ \n" +
            "牌桌发下[4d 8s Js 4h 6h]\n" +
            "第1号座位：renachori 盖牌 早于 翻牌 （未下注）\n" +
            "第2号座位：raisamustdie （按钮） 盖牌 早于 翻牌 （未下注）\n" +
            "第3号座位：xkwlx （小盲注） 盖牌 在上面 翻牌\n" +
            "第4号座位：skingliu666 （大盲注） 亮出底牌：[4s 3h] ，败北 其获胜牌组为三条：三张4\n" +
            "第5号座位：turbotel13 亮出底牌：[4c Ts] ，胜出 （1.52$） 其获胜牌组为三条：三张4\n" +
            "第6号座位：radja878 盖牌 早于 翻牌 （未下注）\n" +
            "\n" +
            "\n" +
            "*********** # 23 **************\n" +
            "PokerStars扑克之星第#177351140238局：  德州扑克 无限注 （0.01$/0.02$ USD） - 2017年1025日1:28:37 ET\n" +
            "”Phaeo II” 牌桌 6-max 第5号座位现在是庄家\n" +
            "座位1：renachori（3.37$筹码） \n" +
            "座位2：raisamustdie（4.56$筹码） \n" +
            "座位3：2ndReality（2.19$筹码） \n" +
            "座位4：skingliu666（0.78$筹码） \n" +
            "座位5：turbotel13（2.77$筹码） \n" +
            "座位6：radja878（1.04$筹码） \n" +
            "radja878: 下小盲注 0.01$\n" +
            "renachori: 下大盲注 0.02$\n" +
            "*** 底牌 ***\n" +
            "发牌给skingliu666 [4c 8h]\n" +
            "raisamustdie: 盖牌 \n" +
            "2ndReality: 盖牌 \n" +
            "skingliu666: 盖牌 \n" +
            "turbotel13: 跟注 0.02$\n" +
            "radja878: 跟注 0.01$\n" +
            "renachori: 过牌 \n" +
            "*** 翻牌 *** [Ac 7h 7s]\n" +
            "radja878: 过牌 \n" +
            "renachori: 过牌 \n" +
            "turbotel13: 过牌 \n" +
            "*** 转牌 *** [Ac 7h 7s] [Tc]\n" +
            "radja878: 过牌 \n" +
            "renachori: 过牌 \n" +
            "turbotel13: 下注 0.02$\n" +
            "radja878: 跟注 0.02$\n" +
            "renachori: 盖牌 \n" +
            "*** 河牌 *** [Ac 7h 7s Tc] [8d]\n" +
            "radja878: 过牌 \n" +
            "turbotel13: 下注 0.02$\n" +
            "radja878: 盖牌 \n" +
            "无人跟注（0.02$），筹码归还给turbotel13\n" +
            "turbotel13从底池中赢得0.10$\n" +
            "turbotel13: 不公开底牌 \n" +
            "*** 概要 ***\n" +
            "底池总金额0.10$ |抽成0$ \n" +
            "牌桌发下[Ac 7h 7s Tc 8d]\n" +
            "第1号座位：renachori （大盲注） 盖牌 在上面 转牌\n" +
            "第2号座位：raisamustdie 盖牌 早于 翻牌 （未下注）\n" +
            "第3号座位：2ndReality 盖牌 早于 翻牌 （未下注）\n" +
            "第4号座位：skingliu666 盖牌 早于 翻牌 （未下注）\n" +
            "第5号座位：turbotel13 （按钮） 赢得 （0.10$）\n" +
            "第6号座位：radja878 （小盲注） 盖牌 在上面 河牌\n" +
            "\n" +
            "\n" +
            "*********** # 9 **************\n" +
            "PokerStars扑克之星第#177351334283局： 锦标赛#2078519244， 0.92$+0 .08$ USD 德州扑克 无限注 -第III级 （20/40） - 2017年1025日1:43:36 ET\n" +
            "”2078519244 1” 牌桌 3-max 第1号座位现在是庄家\n" +
            "座位1：skingliu666（1305筹码） \n" +
            "座位3：german224（195筹码） \n" +
            "skingliu666: 下小盲注 20\n" +
            "german224: 下大盲注 40\n" +
            "*** 底牌 ***\n" +
            "发牌给skingliu666 [8c Kd]\n" +
            "skingliu666: 加注 1265至 1305 全下\n" +
            "german224: 跟注 155 全下\n" +
            "无人跟注（1110），筹码归还给skingliu666\n" +
            "*** 翻牌 *** [3s Qd Ks]\n" +
            "*** 转牌 *** [3s Qd Ks] [4s]\n" +
            "*** 河牌 *** [3s Qd Ks 4s] [Jh]\n" +
            "*** 亮牌 ***\n" +
            "german224: 亮出底牌 [7h Ad] (散牌，最大牌为A)\n" +
            "skingliu666: 亮出底牌 [8c Kd] (一对K)\n" +
            "skingliu666从底池中赢得390\n" +
            "german224赢得本锦标赛第2名\n" +
            "玩家skingliu666赢得本锦标赛冠军，并获得6.00$，恭喜！\n" +
            "*** 概要 ***\n" +
            "底池总金额390 |抽成0 \n" +
            "牌桌发下[3s Qd Ks 4s Jh]\n" +
            "第1号座位：skingliu666 （按钮） （小盲注） 亮出底牌：[8c Kd] ，胜出 （390） 其获胜牌组为一对K\n" +
            "第3号座位：german224 （大盲注） 亮出底牌：[7h Ad] ，败北 其获胜牌组为散牌，最大牌为A\n";

    @Autowired
    GameRegFactory gameRegFactory;

    public static void main(String[] args) {
        DataAssemble d = new DataAssemble();
        d.assembleGameBean(d.gameAllStr);




    }
    @Override
    public List<Map<String, String>> assembleGameBean(String gameAllStr) {
        //TODO 判断文件属于那种语言. 目前默认ZH
        //获取所有牌局
        if (StringUtils.isNotEmpty(gameAllStr)){
            List<String> gameStrList=getGameAll(gameAllStr, LanguageEnum.ZH.getCode());
        }


        return null;
    }

    @Override
    public List<String> getGameAll(String gameAllStr, String language) {
        gameRegFactory=new GameRegFactory();
        IGameReg gameReg = gameRegFactory.createGameReg(language);
        Pattern r =Pattern.compile( gameReg.getProcedureAll());
        String[] split = r.split(gameAllStr);
        List list = Arrays.asList(split);
        return null;
    }

    @Override
    public String getGameBaseInfo(String gameStr, String language) {
        return null;
    }

    @Override
    public SpiderPokerInfo assembleGameInfoBean(String gameInfo, String language) {
        return null;
    }

    @Override
    public List<String> getUserActionInfo(String gameStr, String language) {
        return null;
    }

    @Override
    public List<SpiderUserActionInfo> assembleUserActionBean(String userActionStr) {
        return null;
    }

    @Override
    public String getPokerOutline(String gameStr, String language) {
        return null;
    }

    @Override
    public List<SpiderUserPokerOutline> assemblePokerOutline(String userOutline) {
        return null;
    }
}
