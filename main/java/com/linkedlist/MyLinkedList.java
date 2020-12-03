package com.linkedlist;

public class MyLinkedList
{
    private INode tail;
    private INode head;

    public MyLinkedList()
    {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode)
    {
        if(this.tail == null)
        {
            this.tail = newNode;
        }
        if(this.head = null)
        {
            this.head = newNode;
        }
        else
        {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.serNext(tempNode);
        }
    }
}
