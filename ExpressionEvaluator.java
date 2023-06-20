import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

/**
 * 
 * @author John Waugh
 * @version 1.0
 * @date 6/19/2023
 * 
 */
public class ExpressionEvaluator
{

    public static final Pattern UNSIGNED_DOUBLE =
        Pattern.compile("((\\d+\\.?\\d*)|(\\.\\d+))([Ee][-+]?\\d+)?.*?");
    public static final Pattern CHARACTER = Pattern.compile("\\S.*?");

    /**
     * Takes an infix expression and converts it to postfix.
     * 
     * @param expression
     *            The infix expression.
     * @return the postfix expression.
     */
    public String toPostfix(String expression)
    {
        // ... other local variables
        Scanner input = new Scanner(expression);
        String next;
        char symbol;
        String postfixExpression = "";

        Stack<Character> stack = new Stack<Character>();

        while (input.hasNext())
        {
            if (input.hasNext(UNSIGNED_DOUBLE))
            {
                next = input.findInLine(UNSIGNED_DOUBLE);
                // TODO: do what you want to with a String that
                // holds a number
                postfixExpression += next + " ";
            }
            else
            {
                next = input.findInLine(CHARACTER);
                symbol = next.charAt(0);
                // TODO: do what you want to with a symbol
                // such as (, ), *, /, +, -
                if (symbol == '(')
                {
                    stack.push(symbol);
                }
                else if (symbol == '+' || symbol == '-' ||
                         symbol == '*' || symbol == '/')
                {
                    while(stack.isEmpty() != true &&
                        stack.peek() != '(' && 
                        compareOperators(stack.peek(), symbol))
                    {
                        postfixExpression += stack.pop() + " ";
                    }
                    stack.push(symbol);
                }
                else if (symbol == ')')
                {
                    while(!stack.isEmpty() && stack.peek() != '(')
                    {
                        postfixExpression += stack.pop() + " ";
                    }
                    stack.pop();
                }
                else
                {
                    throw new UnsupportedOperationException();
                }
          

            }
        }
        while(!stack.isEmpty())
        {
            postfixExpression += stack.pop() + " ";
        }
        return postfixExpression;
    }
    
    public boolean compareOperators(char op1, char op2)
    {
        if(op1 == '+' && op2 == '*')
        {
            return false;
        }
        else if(op1 == '+' && op2 == '/')
        {
            return false;
        }
        else if(op1 == '-' && op2 == '*')
        {
            return false;
        }
        else if(op1 == '-' && op2 == '/')
        {
            return false;
        }
        else
        {
            return true;
        }
        
    }

    /**
     * Evaluates a postfix expression and returns the result.
     * 
     * @param postfixExpression
     *            The postfix expression.
     * @return The result of the expression.
     */
    public double evaluate(String postfixExpression) throws EmptyStackException
    {
        // other local variables you may need
        Scanner input = new Scanner(postfixExpression);
        String next;
        char operator;
        double answer = Double.NaN;

        Stack<Double> stack = new Stack<Double>();

        while (input.hasNext())
        {
            if (input.hasNext(UNSIGNED_DOUBLE))
            {
                next = input.findInLine(UNSIGNED_DOUBLE);
                // TODO: do what you want to with a String that
                // holds a number
                stack.push(Double.parseDouble(next));
            }
            else
            {
                next = input.findInLine(CHARACTER);
                operator = next.charAt(0);
                // TODO: do what you want to with an operator
                // such as *, /, +, -
                double num1 = stack.pop();
                double num2 = stack.pop();
                switch (operator)
                {
                    case '+':
                        stack.push(num2 + num1);
                        break;
                    case '-':
                        stack.push(num2 - num1);
                        break;
                    case '*':
                        stack.push(num2 * num1);
                        break;
                    case '/':
                        stack.push(num2 / num1);
                        break;
                }
            }
        }
        double ans = stack.pop();
        if(!stack.isEmpty())
        {
            throw new EmptyStackException();
        }
        return ans;
    }

}
