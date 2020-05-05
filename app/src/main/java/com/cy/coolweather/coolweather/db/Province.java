package com.cy.coolweather.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2020/5/5.
 */

public class Province extends DataSupport{
    private int id;// 省会id
    private String provinceName;// 省会名字
    private int provinceCode;// 记录省会代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
