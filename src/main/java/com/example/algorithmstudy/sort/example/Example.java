package com.example.algorithmstudy.sort.example;

import com.example.algorithmstudy.component.factory.start.StartMethodFactory;
import jakarta.annotation.PostConstruct;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Component
public class Example implements StartMethodFactory {

    @Override
    public void execute() throws Exception {
        System.out.println("테스트");
    }
}
