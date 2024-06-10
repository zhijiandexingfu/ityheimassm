package com.zhh.study.service;

import org.springframework.transaction.annotation.Transactional;

public interface CarService {
    @Transactional
    void save();
}
