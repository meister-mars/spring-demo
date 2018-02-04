package com.abyss.spring.demo;

import com.abyss.spring.demo.scope.AppConfig;
import com.abyss.spring.demo.scope.StoreService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class ScopeAppTest {
    private StoreService service;

    @Test
    public void test() {
        assertNotNull(service);
        System.out.println("service = " + service);
    }

    @Autowired
    public void setService(StoreService service) {
        this.service = service;
    }
}
