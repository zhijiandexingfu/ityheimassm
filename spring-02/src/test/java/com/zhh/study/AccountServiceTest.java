package com.zhh.study;

import com.zhh.study.config.SpringConfig;
import com.zhh.study.service.TransferService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {
    @Autowired
    TransferService transferService;

    @Test
    public void testTranfer() throws IOException {
        transferService.transfer("tom","jerry",50d);
    }
}
