package org.dsa.filas;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Map;

public class Filas {
    int[] data;
    int head;
    int tail;
    private static final int MAX_SIZE = 100;
    Filas() {
        data = new int[MAX_SIZE];
        head = 0;
        tail = 0;
    }

    Filas(int size) {
        data = new int[size];
        head = 0;
        tail = 0;
    }

    boolean isEmpty() {
        return head == tail;
    }
    boolean isFull() {
        return tail == MAX_SIZE;
    }

    int size() {
        return tail - head;
    }

    void push(int value) {
        data[tail] = value;
        tail = (tail + 1) % MAX_SIZE;
    }

    int pop() {
        if (isEmpty()) throw new EmptyStackException();
        return data[head++];
    }

    int peek() {
        if (isEmpty()) throw new EmptyStackException();
        return data[head];
    }

    boolean contains(int value) {
        for  (int i = head; i != tail; i = (i + 1) % MAX_SIZE) {
            if (data[i] == value) return true;
        }
        return false;
    }

    void clear() {
        head = 0;
        tail = 0;
    }
    void print() {
        for (int i = head; i != tail; i = (i + 1) % MAX_SIZE) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Filas filas = new Filas(MAX_SIZE);

        filas.push(1);
        filas.push(2);

        filas.print();
        System.out.println(filas.contains(2));
    }
}
