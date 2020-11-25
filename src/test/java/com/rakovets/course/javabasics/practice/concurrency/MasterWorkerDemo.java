package com.rakovets.course.javabasics.practice.concurrency;

public class MasterWorkerDemo {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        WorkerThread workerThread = new WorkerThread(commonResource);
        Thread jThread = new Thread(workerThread);
        jThread.start();
        MasterWorker masterWorker = new MasterWorker(commonResource);
        Thread dThread = new Thread(masterWorker);
        dThread.start();

    }
}
