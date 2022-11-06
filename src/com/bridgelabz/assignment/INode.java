package com.bridgelabz.assignment;

import com.bridgelabz.doubtsession.Node;

public class INode <T>
{
    private T data;
    private INode<T> next;
    public INode() {
    }

    public INode(T data)
    {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public INode<T> getNext() {
        return next;
    }

    public void setNext(INode<T> next) {
        this.next = next;
    }

}
