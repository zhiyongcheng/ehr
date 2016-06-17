package com.ehr.model;

import lombok.Data;

/**
 * Created by cheng on 2016/6/17.
 */
@Data
public class MenuTreeNode {
    private int id;
    private int pId;
    private String name;
    private boolean open;
    private String iconSkin;
}
