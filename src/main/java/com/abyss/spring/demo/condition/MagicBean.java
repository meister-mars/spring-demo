package com.abyss.spring.demo.condition;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Data
@Conditional(MagicExistsCondition.class)
public class MagicBean {
    @Value("${magic}")
    private String magic;
}
