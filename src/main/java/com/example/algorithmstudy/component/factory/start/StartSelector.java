package com.example.algorithmstudy.component.factory.start;

import com.example.algorithmstudy.sort.example.Example;
import org.springframework.stereotype.Component;

@Component
public class StartSelector implements StartFactory {

    @Override
    public StartMethodFactory createFactory(StartMethod method) {

        StartMethodFactory factory = null;

        switch(method) {
            case EXAMPLE : factory = new Example();
        }

        return factory;
    }
}
