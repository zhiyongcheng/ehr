package com.ehr.model;

import java.util.Date;
import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
public class CustomAttributeTableTypeDO {
    private int id;
    private int siteId;
    private String name;
    private String nameEn;
    private String cattCode;
    private String attributeTablePreName;
    private Date createDate;
    public void combineTablePreName(){
        attributeTablePreName =  new StringBuffer(cattCode).append("_INFO")
                                                           .append(siteId).toString();
    }
}
