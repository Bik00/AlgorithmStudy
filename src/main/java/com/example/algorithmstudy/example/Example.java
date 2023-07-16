package com.example.algorithmstudy.example;

import com.example.algorithmstudy.component.factory.start.ConstantBeanName;
import com.example.algorithmstudy.component.factory.start.StartMethodFactory;
import jakarta.annotation.PostConstruct;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@NoArgsConstructor
@Component(ConstantBeanName.EXAMPLE)
public class Example implements StartMethodFactory {

    @Override
    public void execute() throws Exception {
        log.info("테스트");
    }
}
