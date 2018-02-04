package com.abyss.spring.demo;

import com.abyss.spring.demo.qualifier.Cold;
import com.abyss.spring.demo.qualifier.Dessert;
import com.abyss.spring.demo.qualifier.Fruity;
import com.abyss.spring.demo.qualifier.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class QualifierAppTest {
    private Dessert dessert;

    @Test
    public void test() {
        assertNotNull(dessert);
        System.out.println("dessert = " + dessert);
    }

    @Autowired
    @Cold
    @Fruity
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }
}
