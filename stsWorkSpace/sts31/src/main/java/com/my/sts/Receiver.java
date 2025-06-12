package com.my.sts;

import java.util.concurrent.atomic.AtomicInteger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Receiver {
	//캐시에 안전한 int AtomicInteger 원자성을 가지나..?
    private AtomicInteger counter = new AtomicInteger();

    public void receiveMessage(String message) {
        log.info("Received <" + message + ">");
        counter.incrementAndGet();
    }

    public int getCount() {
        return counter.get();
    }
}
