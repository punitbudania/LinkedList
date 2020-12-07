package com.testcases;

import com.linkedlist.MyLinkedList;
import com.linkedlist.MyNode.INode;
import com.linkedlist.MyNode.MyNode;
import com.linkedlist.MyStack;
import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest
{
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop()
    {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        boolean result = myLinkedList.head.equals(myThirdNode) &&
                         myLinkedList.head.getNext().equals(mySecondNode) &&
                         myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenAppendedToLinkedListShouldBeAddedToLast()
    {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenInsertingSecondInBetweenShouldPassResult()
    {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode, mySecondNode);
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void GivenSeq_SearchKey_AddKey_ReturnUpdatedSeq()
    {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(40);
        MyNode<Integer> myFourthNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myFourthNode);
        INode a = myLinkedList.search(30);
        myLinkedList.insert(a,myThirdNode );
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                mySecondNode.getNext().equals(myThirdNode) &&
                myLinkedList.tail.equals(myFourthNode);
        Assert.assertTrue(result);
    }

    @Test
    public void GivenSeq_DeleteKey_ReturnUpdatedSeq()
    {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(40);
        MyNode<Integer> myFourthNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.append(myFourthNode);
        myLinkedList.printMyNodes();
        myLinkedList.delete(40);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myFourthNode);
        Assert.assertTrue(result);
    }

    /*
    @Test
    public void givenKey_WhenSearch_ReturnTrueOrFalse()
    {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        boolean result = myLinkedList.search(30);
        Assert.assertTrue(result);
    }

     */
}
