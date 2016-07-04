/*
Program:	Java Stack
Coded by:	Zachary Hollingsworth
Date:		7/1/2016
*/
import java.util.Arrays;

public class Stack
{
	int top;
	int size;
	int[] stack;

	public Stack(int arraySize)
	{
        	size = arraySize;
        	stack = new int[size];
        	top = -1;
 	}

	public void push(int value)
	{
		if(isFull())
			System.out.println("Stack is full");
		else
			stack[++top] = value;
	}

	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return 0;
		}
		else
			return stack[top--];
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}

	public boolean isFull()
	{
		return top == size-1;
	}

	public int peek()
	{
		return stack[top];
	}
}
