package com.example.algorithmstudy.sort;

import com.example.algorithmstudy.component.factory.start.ConstantBeanName;
import com.example.algorithmstudy.component.factory.start.StartMethodFactory;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@NoArgsConstructor
@Component(value = ConstantBeanName.COUNTING_SORT)
public class CountingSort implements StartMethodFactory {
    @Override
    public void execute() throws Exception {
        log.info("칵테일 정렬 실행");
    }
}
