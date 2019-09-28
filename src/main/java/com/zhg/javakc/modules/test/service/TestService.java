package com.zhg.javakc.modules.test.service;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.service.BaseService;
import com.zhg.javakc.modules.test.dao.TestDao;
import com.zhg.javakc.modules.test.entity.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService extends BaseService<TestDao, test> {
    @Autowired
    private TestDao testDao;
    public Page<test> findbypage(Page<test> page, test a){
        a.setPage(page);
        return page.setList(testDao.findList(a));
    }
}
