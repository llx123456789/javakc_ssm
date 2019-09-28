package com.zhg.javakc.modules.test.entity;

import com.zhg.javakc.base.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class test extends BaseEntity<test> {
    private String id;
    private String name;
    private int age;
    private String sex;
    private Date birthday;
}
