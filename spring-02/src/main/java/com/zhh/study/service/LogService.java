package com.zhh.study.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

public interface LogService {
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void record(String from, String to, double amt) ;
}
