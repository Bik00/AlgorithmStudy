package com.example.algorithmstudy;

import com.example.algorithmstudy.component.factory.start.StartFactory;
import com.example.algorithmstudy.component.factory.start.StartMethod;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmStudyApplication {

    private static StartFactory factory = null;

    public AlgorithmStudyApplication(StartFactory factory) {
        this.factory = factory;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AlgorithmStudyApplication.class, args);
        factory.createFactory(StartMethod.EXAMPLE).execute();
    }

}