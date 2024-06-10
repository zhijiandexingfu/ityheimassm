package com.zhh.study.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

public interface TransferService {
    @Transactional
    public void transfer(String from, String to, double amt) throws IOException;
}
