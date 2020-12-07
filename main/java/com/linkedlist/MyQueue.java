package com.linkedlist;

import com.linkedlist.MyNode.INode;
import com.linkedlist.MyNode.MyNode;

public class MyQueue
{
    private final MyLinkedList myLinkedList;

    public MyQueue()
    {
        this.myLinkedList = new MyLinkedList();
    }
    
    public void enqueue(INode myNode)
    {
        myLinkedList.append(myNode);
    }

    public void printQueue()
    {
        myLinkedList.printMyNodes();
    }

    public void dequeue()
    {
        myLinkedList.pop();
    }
}
