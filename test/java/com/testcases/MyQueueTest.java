package com.testcases;

import com.linkedlist.MyNode.INode;
import com.linkedlist.MyNode.MyNode;
import com.linkedlist.MyQueue;
import com.linkedlist.MyStack;
import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest
{
    @Test
    public void createAQueueUsingEnqueue()
    {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();
    }

    @Test
    public void deleteElementUsingDequeue()
    {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();
        myQueue.dequeue();
        myQueue.printQueue();
    }
}
