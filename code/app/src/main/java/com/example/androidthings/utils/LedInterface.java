package com.example.androidthings.utils;

public interface LedInterface {
    void PersonHappyDetected(boolean estado);
    void PersonNormalDetected(boolean estado);
    void PersonSadDetected(boolean estado);
    void noPersonDetected();
}
