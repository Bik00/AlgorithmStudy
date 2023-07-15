package com.example.algorithmstudy.component.factory.start;

public abstract interface StartFactory {
    public abstract StartMethodFactory createFactory(StartMethod method);
}
