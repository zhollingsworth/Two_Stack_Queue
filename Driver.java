public class Driver
{
	public static void main(String[] args)
	{
		Two_Stack_Queue queue = new Two_Stack_Queue(5);
		queue.enqueue(5);
		queue.enqueue(12);
		queue.enqueue(107);
		queue.enqueue(7);
		queue.enqueue(27);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.peek());
	}
}
