package dsa;

import java.util.ArrayDeque;
import java.util.Queue;

class MyStack {

	private Queue<Integer> queue1;

	public MyStack() {

		queue1 = new ArrayDeque<Integer>();
		
	}

	public void push(int x) {

		queue1.add(x);
		int size = queue1.size();
		
		for(int i = 0; i < size - 1; i++) {
			
			queue1.add(queue1.poll());
		
		}
		
	}

	public int pop() {

		return queue1.poll();
		
	}

	public int top() {

		return queue1.peek();
		
	}

	public boolean empty() {

		return queue1.isEmpty();
		
	}
}

public class ImplementStackUsingQueue {

}
