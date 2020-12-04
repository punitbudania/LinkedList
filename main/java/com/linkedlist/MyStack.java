package com.linkedlist;

import com.linkedlist.MyNode.INode;

public class MyStack
{
    private final MyLinkedList myLinkedList;

    public MyStack()
    {
        this.myLinkedList = new MyLinkedList();
    }

    public void push(INode myNode)
    {
        myLinkedList.add(myNode);
    }

    public void printStack()
    {
        myLinkedList.printMyNodes();
    }

    public INode peak()
    {
        return myLinkedList.head;
    }

    public INode pop()
    {

    }
}
