package com.example.algorithmstudy.sort;

import com.example.algorithmstudy.component.factory.start.ConstantBeanName;
import com.example.algorithmstudy.component.factory.start.StartMethodFactory;
import com.example.algorithmstudy.vo.request.InputRequest;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@NoArgsConstructor
@Component(value = ConstantBeanName.BUBBLE_SORT)
public class BubbleSort implements StartMethodFactory {

    @Override
    public void execute(InputRequest request) throws Exception {

        log.info("버블 정렬 실행");
        List<Integer> input = (List<Integer>) request.getRequest1();
        input.forEach(System.out::println);

        for(int i = 0; i < input.size(); i++) {
            for(int j = 0; j < input.size() - i - 1; j++) {
                if(input.get(j) > input.get(j + 1)) {
                    int temp = input.get(j);
                    input.set(j, input.get(j + 1));
                    input.set(j + 1, temp);
                }
            }
        }

        log.info("버블 정렬 결과");
        input.forEach(System.out::println);
    }
}