package com.testcases;

import com.linkedlist.MyNode.MyNode;
import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest
{
    @Test
    public void given3NumbersWhenLinkedShouldPassedLinkedListTest()
    {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                         mySecondNode.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }
}
