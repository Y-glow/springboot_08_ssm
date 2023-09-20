package com.tzy.domain;/*
 * @author 田中耀
 * @version 1.0
 */

import lombok.Data;

//lombok
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
