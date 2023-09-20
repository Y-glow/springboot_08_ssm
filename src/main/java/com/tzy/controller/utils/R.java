package com.tzy.controller.utils;/*
 * @author 田中耀
 * @version 1.0
 */

import lombok.Data;

@Data
public class R {
    private Boolean flag;
    private Object data;
    private String message;
    public R(){}
    public R(Boolean flag){
        this.flag = flag;
    }
    public R(Boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }
    public R(String message) {
        this.flag = false;
        this.message = message;
    }
    public R(Boolean flag,String message) {
        this.flag = flag;
        this.message = message;
    }
}
