package com.ehr.common.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by chengzy on 2016/6/12.
 */

public enum ColumTypeEnum {
    VARCHAR(1,"varchar","字符型","(100)"," not null default ''"),
    CODE(2,"tinyint","代码型","(4)"," not null default -1"),
    NUMBER(3,"double","数值型",""," not null default 0"),
    DATETIME(4,"datetime","日期型",""," not null"),
    TEXT(5,"varchar","备注型","(300)","  not null default ''");
    @Setter
    @Getter
    private int code;
    @Setter
    @Getter
    private String columType;
    @Setter
    @Getter
    private String typeDesc;
    @Setter
    @Getter
    private String defaultLength;
    @Setter
    @Getter
    private String defaultValue;
    ColumTypeEnum(int code,String columType,String typeDesc,String defaultLength,String defaultValue){
        this.code = code;
        this.columType = columType;
        this.typeDesc = typeDesc;
        this.defaultLength = defaultLength;
        this.defaultValue = defaultValue;
    }

    public static ColumTypeEnum codeOf(Integer code){
        if(code == null) return null;
        for(ColumTypeEnum typeEnum:values()){
            if(typeEnum.code == code){
                return typeEnum;
            }
        }
        return null;
    }

}
