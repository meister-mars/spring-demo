package com.abyss.spring.demo;

import com.abyss.spring.demo.condition.AppConfig;
import com.abyss.spring.demo.condition.MagicBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class ConditionAppTest {
    @Autowired(required = false)
    MagicBean magicBean;
    @Test
    public void test() {
        assertNotNull(magicBean);
        System.out.println("magicBean = " + magicBean);
    }
}
