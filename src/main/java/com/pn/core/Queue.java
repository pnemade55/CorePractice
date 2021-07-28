package com.pn.core;

/**
 * created by : pnema
 * on 7/27/2021
 */
public class Queue {
    int capacity, start, end, size;
    int arr[];

    Queue(int capacity) {
        this.capacity = capacity;
        this.size = this.start = 0;
        this.end = capacity - 1;
        this.arr = new int[this.capacity];
    }

    boolean isfull(Queue queue) {
        return queue.capacity == queue.size;
    }

    boolean isEmpty(Queue queue) {
        return queue.size == 0;
    }

    void enqueue(int item) {
        if (isfull(this))
            return;

        this.end = (this.end + 1) % this.capacity;

        this.arr[this.end] = item;
        this.size += 1;
    }

    void remove(int index) {
        if (isEmpty(this) && index <= this.end) return;

        int count = 0;
        boolean flag = false;
        for (int i = this.start; i <= this.end; i++) {
            if (count == index || flag) {
                this.arr[i] = this.arr[i + 1];
                flag = true;
            }
            count++;
        }
        this.size -= 1;
    }

    int dequeue() {
        if (isEmpty(this)) return -99999;

        int remove = arr[this.start];
        this.start = (this.start + 1) % this.capacity;
        this.size -= 1;
        return remove;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.remove(2);
        System.out.println(queue.dequeue());
    }
}
