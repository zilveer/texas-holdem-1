package com.spider.web;

import com.spider.core.Result;
import com.spider.enums.LanguageEnum;
import com.spider.service.inf.IGameReg;
import com.spider.service.inf.IGameRegFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 数据组装
 * @author lxx
 * @Date 2017/11/9.17:28
 */
@RestController
@RequestMapping(value = "datapush")
public class DataAssembleController extends BaseController{

    @Autowired
    private IGameRegFactory gameRegFactory;


    @RequestMapping(value ="/updateDataGame",method = RequestMethod.GET)
    public Result updateDataGame(){
        IGameReg gameReg=gameRegFactory.createGameReg(LanguageEnum.ZH.getCode());
        System.out.println(gameReg.getProcedureAll());
        return successResponse(null);
    }
}
