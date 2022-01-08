package com.tasty.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
@NoArgsConstructor
public class Book {
    private int id;
    private String name;
    private double price;
    private String author;
    private int cateId;
    private String pdate;
    private String img;
    private String description;
    private String detail;
    private String address;
    private Cate cate;
}
