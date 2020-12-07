package com.testcases;

import com.linkedlist.MyBinaryTree;
import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest
{
    @Test
    public void given3NosWhenAddedToBinaryTreeShouldReturnSizeThree()
    {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        int size = myBinaryTree.getSize();
        Assert.assertEquals(3, size);
    }

    @Test
    public void givenNos_WhenAdded_ReturnTreeSize()
    {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(40);
        myBinaryTree.add(22);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(65);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        myBinaryTree.add(11);
        myBinaryTree.add(3);
        myBinaryTree.add(16);

        int size = myBinaryTree.getSize();
        Assert.assertEquals(13, size);
    }

    @Test
    public void searchForElement_IfPresent_ReturnTrue()
    {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(40);
        myBinaryTree.add(22);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(65);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        myBinaryTree.add(11);
        myBinaryTree.add(3);
        myBinaryTree.add(16);

        boolean check = myBinaryTree.search(63);
        Assert.assertTrue(check);
    }
}
