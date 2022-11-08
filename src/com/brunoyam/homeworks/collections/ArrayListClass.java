package com.brunoyam.homeworks.collections;

import java.util.Arrays;

public class ArrayListClass {
    private int arr[];
    private int capacity;
    private int current;

    public ArrayListClass()
    {
        arr = new int[1];
        capacity = 1;
        current = 0;
    }

    public void push(int element)
    {
        if(current == capacity){
            int temp[] = new int[2*capacity];
            for(int i = 0; i < capacity; i ++)
                temp[i] = arr[i];
            capacity *= 2;
            arr = temp;
        }
        arr[current] = element;
        current++;
    }
    void print()
    {
        for (int i = 0; i < current; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < current; i++){
            string.append(arr[i]).append(" ");
        }
        return String.valueOf(string);
    }

    int get(int index)
    {
        if (index < current)
            return arr[index];
        return -1;
    }
}
