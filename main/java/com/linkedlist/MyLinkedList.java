package com.linkedlist;

import com.linkedlist.MyNode.INode;


public class MyLinkedList<K extends Comparable<K>>
{
    public INode<K> tail;
    public INode<K> head;

    public MyLinkedList()
    {
        this.head = null;
        this.tail = null;
    }

    public void add(INode<K> newNode)
    {
        if(this.tail == null)
        {
            this.tail = newNode;
        }
        if(this.head == null)
        {
            this.head = newNode;
        }
        else
        {
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void append(INode<K> myNode)
    {
        if(this.head == null)
        {
            this.head = myNode;
        }
        if(this.tail == null)
        {
            this.tail = myNode;
        }
        else
        {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }

    }

    public void insert(INode<K> myNode, INode<K> newNode)
    {
        INode<K> tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode<K> pop()
    {
        INode<K> tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public INode<K> popLast()
    {
        INode<K> tempNode = head;
        while (!tempNode.getNext().equals(tail))
        {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }

    public void printMyNodes()
    {
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode<K> tempNode = head;
        while (tempNode.getNext() != null)
        {
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail))
            {
                myNodes.append("->");
            }
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    public String toString()
    {
        return "MyLinkedListNodes{" + head + '}';
    }

    public INode<K> search(K key)
    {
        if(head == null)
        {
            return null;
        }

        INode<K> tempNode = this.head;
        while (tempNode != null)
        {
            if(tempNode.getKey().equals(key))
            {
                return tempNode;
            }
            else {
                tempNode = tempNode.getNext();
            }
        }
        return null;
    }

    public INode<K> delete(K key)
    {
        INode<K> tempNode = head;
        while(! tempNode.getNext().getKey().equals(key))
        {
            tempNode = tempNode.getNext();
        }
        INode<K> deleteNode = tempNode.getNext();
        tempNode.setNext(deleteNode.getNext());
        return deleteNode;
    }

    public void sortList()
    {
        INode<K> current = head;
        while (current != null)
        {
            INode<K> index = current.getNext();
            while ( index != null )
            {
                if ((current.getKey()).compareTo(index.getKey()) > 0)
                {
                    INode<K> temp = null;
                    temp.setKey(current.getKey());
                    current.setKey(index.getKey()) ;
                    index.setKey(temp.getKey());
                }
                index = index.getNext();
            }
            current = current.getNext();
        }
    }


        /*
        INode<K> tempNode = head;
        while (! tempNode.getNext().getKey().equals(null))
        {
            int c = (tempNode.getKey()).compareTo(tempNode.getNext().getKey())
            if( c < 0)
            {
                INode<K> swapNode = tempNode;
                tempNode = tempNode.getNext();
                tempNode.getNext() = swapNode;
            }
        }

         */

}

/*
    public void printLinkedList() {
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode<K> tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.getNext().equals(null))
                myNodes.append("->");
            tempNode = tempNode.getNext();

        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);

    }

 */