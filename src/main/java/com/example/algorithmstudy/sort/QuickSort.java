package com.example.algorithmstudy.sort;

import com.example.algorithmstudy.component.factory.start.ConstantBeanName;
import com.example.algorithmstudy.component.factory.start.StartMethodFactory;
import com.example.algorithmstudy.vo.request.InputRequest;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@NoArgsConstructor
@Component(value = ConstantBeanName.QUICK_SORT)
public class QuickSort implements StartMethodFactory {

    @Override
    public void execute(InputRequest request) throws Exception {
        log.info("퀵 정렬 실행");
    }
}
