import java.util.Stack;

public class BasicCalculatorII {

    
    public static int calculate(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        int currentNum = 0;
        char prevSign = '+'; // Tracks operator before current number
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            // 1. Build multi-digit numbers
            if (Character.isDigit(c)) {
                currentNum = currentNum * 10 + (c - '0');
            }

            // 2. Evaluate upon hitting an operator or reaching the end of the string
            if ((!Character.isDigit(c) && c != ' ') || i == n - 1) {
                if (prevSign == '+') {
                    stack.push(currentNum);
                } else if (prevSign == '-') {
                    stack.push(-currentNum);
                } else if (prevSign == '*') {
                    stack.push(stack.pop() * currentNum);
                } else if (prevSign == '/') {
                    stack.push(stack.pop() / currentNum);
                }

                prevSign = c;       // Update operator
                currentNum = 0;     // Reset accumulator
            }
        }

        // 3. Sum up all evaluated terms
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        // Test suite
        String[] testCases = {
            "3+2*2",      // Expected: 7
            " 3/2 ",       // Expected: 1
            " 3+5 / 2 ",   // Expected: 5
            "42",          // Expected: 42
            "1-1+1",       // Expected: 1
            "2*3+4*5"      // Expected: 26
        };

        for (String test : testCases) {
            System.out.printf("calculate(\"%s\") = %d%n", test, calculate(test));
        }
    }
}
