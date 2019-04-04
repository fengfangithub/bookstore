package com.fengfan.bookstore.service;

import com.fengfan.bookstore.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName TestService
 * @Author fengfan
 * @Date 2019/4/4 14:53
 * @Description TODO
 * @Version 1.0
 **/
@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    public int select() {
        return testDao.select();
    }
}
