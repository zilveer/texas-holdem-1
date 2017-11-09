package com.spider.service.imp;

import com.spider.service.inf.IGameReg;

/**
 * @author lxx
 * @Date 2017/11/9.16:49
 */
public class GameRegZH implements IGameReg {
    @Override
    public String getProcedureAll() {
        return "\\*+ #+ [0-9]+ ";
    }
}
