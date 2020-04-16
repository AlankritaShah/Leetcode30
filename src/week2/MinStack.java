package week2;

import java.util.Stack;

/**
 * 
@author alankrita
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
 

Example:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
 *
 */

public class MinStack {
	Stack<Integer> stack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        Stack<Integer> temp = (Stack<Integer>)stack.clone();
        int min = Integer.MAX_VALUE;
        while(!temp.empty()){
            int top = temp.peek();
            if(top<min)
                min = top; 
            temp.pop();
        }
        return min;
    }
    
    public static void main(String [] args)
	{
    	MinStack minStack = new MinStack();
    	minStack.push(-2);
    	minStack.push(0);
    	minStack.push(-3);
    	System.out.println(minStack.getMin());
    	
    	minStack.pop();
    	System.out.println(minStack.top());

    	System.out.println(minStack.getMin());

	}
}
