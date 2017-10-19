package com.example.manimozhisadasivam.sqlite.activities;

import java.util.ArrayList;

public class Groupinfo {

    private String name;
    private ArrayList<Childinfo> list = new ArrayList<Childinfo>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Childinfo> getProductList() {
        return list;
    }

    public void setProductList(ArrayList<Childinfo> productList) {
        this.list = productList;
    }

}