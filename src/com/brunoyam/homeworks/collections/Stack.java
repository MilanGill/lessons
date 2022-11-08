package com.brunoyam.homeworks.collections;

import java.util.Arrays;

public class Stack {
    private int mSize; //mSize - максимальный размер
    private int[] stackArray;
    private int top;

    public Stack(int m) {
        this.mSize = m;
        stackArray = new int[mSize];
        top = -1;
    }

    public void addElement(int element)
    {
        stackArray[++top] = element;
    }

    public int deleteElement()
    {
        return stackArray[top--];
    }
    public int readTop()
    {
        return stackArray[top];
    }

    public boolean isEmpty()
    {
        return (top == -1);
    }

    @Override
    public String toString() {
        return Arrays.toString(stackArray);
    }
}
