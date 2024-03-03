package LeetCode.ValidParentheses;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isValid("([]){"));
    }

    public static boolean isValid(String s) {
        if (s.length() < 2) {
            return false;
        }

        MyStack stack = new MyStack(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean isOpen = c == '(' ||
                    c == '[' ||
                    c == '{';

            if (isOpen) {
                stack.push(s.charAt(i));
            } else {
                switch (c) {
                    case ')':
                        if (stack.pop() != '(') {
                            return false;
                        }
                        break;
                    case '}':
                        if (stack.pop() != '{') {
                            return false;
                        }
                        break;
                    case ']':
                        if (stack.pop() != '[') {
                            return false;
                        }
                        break;
                }
            }
        }
        return stack.empty();
    }
}

class MyStack {
    char[] stack;
    int topIdx = 0;

    MyStack(int length) {
        stack = new char[length];
    }

    boolean empty() {
        return topIdx == 0;
    }

    void push(char element) {
        stack[topIdx] = element;
        topIdx = topIdx + 1;
    }

    char pop() {
        if (empty()) return '\u0000';
        topIdx = topIdx - 1;
        return stack[topIdx + 1];
    }
}
