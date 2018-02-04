package com.abyss.spring.demo;

import com.abyss.spring.demo.expressive.env.AppConfig;
import com.abyss.spring.demo.expressive.env.BlankDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class ExpressiveEnvTest {
    private BlankDisc disc;

    @Test
    public void test() {
        assertNotNull(disc);
        System.out.println("disc = " + disc);
    }

    @Autowired
    public void setDisc(BlankDisc disc) {
        this.disc = disc;
    }
}
