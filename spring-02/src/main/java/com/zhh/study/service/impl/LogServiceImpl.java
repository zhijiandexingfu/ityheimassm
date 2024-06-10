package com.zhh.study.service.impl;

import com.zhh.study.dao.LogDao;
import com.zhh.study.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class LogServiceImpl implements LogService {

    @Autowired
    LogDao logDao;
    @Override
    public void record(String from, String to, double amt) {
        String info = from + to + amt;
        logDao.record(info);
    }
}
