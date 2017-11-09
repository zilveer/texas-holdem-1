package com.spider.factory;

import com.spider.service.inf.IGameReg;
import com.spider.service.inf.IGameRegFactory;
import com.spider.service.imp.GameRegZH;
import org.springframework.stereotype.Service;

/**
 * 创建不同国家的数据文件对正则表达式工厂
 * @author lxx
 * @Date 2017/11/9.16:35
 */
@Service
public class GameRegFactory implements IGameRegFactory{
    /**
     * 根据语言不同返回不同的正则对象类 默认中文
     * @param language 语言代码
     * @return 正则对象类
     */
    @Override
    public IGameReg createGameReg(String language){
        language=language.toLowerCase();
        switch (language) {

            case "zh":
                return new GameRegZH();
//            case "en":
//                return new GameRegEN();
            default:
                break;
        }
        return new GameRegZH();
    }
}
