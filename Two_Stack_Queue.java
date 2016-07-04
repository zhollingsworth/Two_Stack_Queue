/*
Program:	Two Stack Queue
Coded by:	Zachary Hollingsworth
Date:		6/30/2016
https://www.interviewcake.com/question/java/queue-two-stacks

Implement a queue with 2 stacks. Your queue should have an enqueue and a
dequeue function and it should be "first in first out" (FIFO).

Optimize for the time cost of m function calls on your queue. These can
be any mix of enqueue and dequeue calls.

Assume you already have a stack implementation and it gives O(1) time
push and pop.
*/

public class Two_Stack_Queue
{
	int size;
	int top = -1;
	int front = 0;
	int send = 0;
	Stack stack1;
	Stack stack2;

	public Two_Stack_Queue(int queueSize)
	{
		size = queueSize;
		stack1 = new Stack(size);
		stack2 = new Stack(size);
	}

	public void enqueue(int value)
	{
		if(stack1.isFull())
			System.out.println("Queue is full");
		else
		{
			stack1.push(value);	
			if(top == -1)
				front = value;
			top++;
		}
	}

	public int dequeue()
	{
		while(!stack1.isEmpty())
		{
			stack2.push(stack1.pop());
			top--;
		}
		
		send = stack2.pop();
		front = stack2.peek();
		
		while(!stack2.isEmpty())
		{
			stack1.push(stack2.pop());
			top++;
		}
		
		return send;
	}

	public int peek()
	{
		return front;
	}
	/*
	public boolean isFull()
	{
		return top == size-1;	
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	*/
		//for(int i = 0; i < 5; i++)
		//	System.out.println(stack.pop());
}
