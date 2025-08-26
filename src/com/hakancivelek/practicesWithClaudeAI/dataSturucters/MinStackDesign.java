package com.hakancivelek.practicesWithClaudeAI.dataSturucters;

/**
 * Min Stack Design
 * <p>
 * A stack implementation that supports:
 * - push(x)
 * - pop()
 * - top()
 * - getMin() → returns minimum element in O(1)
 * <p>
 * Uses an extra stack (minStack) to track minimum values.
 * <p>
 *
 * @author <a href="mailto:hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @version 1.0
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */

import java.util.Objects;
import java.util.Stack;

public class MinStackDesign {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public static void main(String[] args) {
        MinStackDesign minStack = new MinStackDesign();

        System.out.println("=== Test ===");

        minStack.push(-2);
        System.out.println("push(-2) → min: " + minStack.getMin());

        minStack.push(0);
        System.out.println("push(0) → min: " + minStack.getMin());

        minStack.push(-3);
        System.out.println("push(-3) → min: " + minStack.getMin());

        System.out.println("getMin(): " + minStack.getMin());

        minStack.pop();
        System.out.println("pop() → top: " + minStack.top() + ", min: " + minStack.getMin());

        System.out.println("final getMin(): " + minStack.getMin());


    }

    void push(int value) {
        stack.push(value);

        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    void pop() {
        if (stack.isEmpty()) return;
        if (Objects.equals(stack.peek(), minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }

    int top() {
        return stack.peek();
    }

    int getMin() {
        return minStack.peek();
    }
}
