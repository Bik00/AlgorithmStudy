package com.example.algorithmstudy.sort;

import com.example.algorithmstudy.component.factory.start.ConstantBeanName;
import com.example.algorithmstudy.component.factory.start.StartMethodFactory;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@NoArgsConstructor
@Component(value = ConstantBeanName.SLEEP_SORT)
public class SleepSort implements StartMethodFactory {

    @Override
    public void execute() throws Exception {
        log.info("쉘 정렬 실횅");
    }
}
