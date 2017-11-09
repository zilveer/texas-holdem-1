package com.spider.enums;



/**
 * 语言枚举
 * @author lxx
 * @Date 2017/11/9.17:10
 */
public enum LanguageEnum {
    ZH("zh","中文"),
    EN("en","英文");

    private String code;
    private String desc;
    /**
     *
     * @param code
     * @param desc
     */
    LanguageEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     *
     * @param code
     * @return
     */
    public static LanguageEnum getByCode(String code){
        for (LanguageEnum temp : LanguageEnum.values()) {
            if(temp.code.equals(code)){
                return temp;
            }
        }
        return null;
    }
}
