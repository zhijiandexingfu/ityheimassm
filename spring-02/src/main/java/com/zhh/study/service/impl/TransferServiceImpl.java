package com.zhh.study.service.impl;

import com.zhh.study.dao.AccountDao;
import com.zhh.study.service.LogService;
import com.zhh.study.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class TransferServiceImpl implements TransferService {
    @Autowired
    private AccountDao accountDao;
    @Autowired
    private LogService logService;

    @Override
    public void transfer(String from, String to, double amt) throws IOException {
        try{
            System.out.println("start to 转账");
            accountDao.addAmount(from,amt);
//            if(true) throw new IOException();
            int i = 100/0;
            accountDao.deleteAmount(to,amt);

        }finally {
            logService.record(from, to, amt);
            System.out.println("转账记录完成");
        }


    }
}
