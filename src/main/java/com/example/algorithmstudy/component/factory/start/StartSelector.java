package com.example.algorithmstudy.component.factory.start;

import com.example.algorithmstudy.vo.request.InputRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class StartSelector  {

    private final Map<String, StartMethodFactory> maps;

    public void select(String method, InputRequest request) throws Exception {
        maps.get(method).execute(request);
    }
}
