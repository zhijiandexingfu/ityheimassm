package com.zhh.study.service.impl;

import com.zhh.study.service.CarService;

import java.util.*;

public class CarServiceImpl implements CarService {

    private int[] array;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;
    private Properties properties;
    @Override
    public void save() {
        System.out.println("CarServiceImpl initializing");
        System.out.println("foreach arrays"+ Arrays.toString(array));
        System.out.println("foreach list"+ list);
        System.out.println("foreach set"+ set);
        System.out.println("foreach map"+ map);
        System.out.println("foreach properties"+ properties);

    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
