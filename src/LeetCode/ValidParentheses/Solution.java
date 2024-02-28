package LeetCode.ValidParentheses;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isValid("([]){"));
    }

    public static boolean isValid(String s) {
        if (s.length() < 2) {
            return false;
        }
        boolean isOnlyOpen = (s.contains("(") || s.contains("[") || s.contains("{"))
                            && !(s.contains(")") || s.contains("]") || s.contains("}"));
        if (isOnlyOpen) {
            return false;
        }

        if (s.startsWith(")") || s.startsWith("}") || s.startsWith("]")) {
            return false;
        }
        String[] arrS = s.split("");
        MyStack stack = new MyStack(s.length());
        for (int i = 0; i < arrS.length; i++) {
            boolean isOpen = arrS[i].equals("(") ||
                            arrS[i].equals("[") ||
                            arrS[i].equals("{");
            boolean isClose = arrS[i].equals(")") ||
                            arrS[i].equals("]") ||
                            arrS[i].equals("}");
            if (isOpen) {
                stack.push(arrS[i]);
            } else {
                switch (arrS[i]) {
                    case ")":
                        if (!stack.pop().equals("(")) {
                           return false;
                        }
                        break;
                    case "}":
                        if (!stack.pop().equals("{")) {
                           return false;
                        }
                        break;
                    case "]":
                        if (!stack.pop().equals("[")) {
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
    String[] stack;
    int topIdx = 0; 

    MyStack(int length) {
        this.stack = new String[length + 1];
    }

    boolean empty() {
        return this.topIdx == 0;
    }

    void push(String element) {
        this.topIdx = this.topIdx + 1;
        this.stack[this.topIdx] = element;
    }

    String pop() {
        if (empty()) return "empty";
        this.topIdx = this.topIdx - 1;
        return this.stack[this.topIdx + 1];
    }
}
