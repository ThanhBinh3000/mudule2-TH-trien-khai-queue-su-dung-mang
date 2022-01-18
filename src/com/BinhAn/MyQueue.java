package com.BinhAn;

public class MyQueue {
    private int Capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize){
        this.Capacity = queueSize;
        queueArr = new int[this.Capacity];
    }
    public boolean isQueueFull(){
        boolean status = false;
        if (currentSize == Capacity){
            status = true;
        }
        return status;
    }
    public boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize == 0){
            status = true;
        }
        return status;
    }
    public void enqueue(int item){
        if (isQueueFull()){
            System.out.println("Overflow ! Unable to add element: "+ item);
        }else {
            tail ++;
            if (tail == Capacity - 1){
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element "+ item + "is pushed to Queue !");
        }
    }
    public void dequeue(){
        if (isQueueEmpty()){
            System.out.println("Underflow ! Unable to remove element from Queue");
        }else {
            head++;
            if (head == Capacity -1){
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            }else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
}
