package com.brunoyam.homeworks.collections;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList()
    {
        head = null;
        tail = null;
    }

    private boolean isEmpty()
    {
        return head == null;
    }

    public void addFirst(int data){
        Node temp = new Node(data);

        if (isEmpty()){
            tail = temp;
        } else {
            head.prev = head;
        }
        temp.next = head;
        head = temp;
    }

    public void print()
    {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void addLast(int data)
    {
        Node temp = new Node(data);
        if(isEmpty())
            head = temp;
        else
            tail.next = temp;

        temp.prev = tail;
        tail = temp;
    }

    public void removeFirst()
    {
        Node temp = head;
        if(head.next == null)
            tail = null;
        else
            head.next.prev = null;
        head = head.next;
    }

    public void removeLast(){
        if(head.next == null)
            head = null;
        else
            tail.prev.next = null;
        tail = tail.prev;
    }

    public int get(int index)
    {
        Node curr = head;
        int c = 0;

        while (curr!= null && c != index){
            curr = curr.next;
            c++;
        }
        return curr.data;
    }

}
