/*
 * 
Check for balanced parentheses in an expression
Given an expression string exp , write a program to examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.

Example:

Input: exp = “[()]{}{[()()]()}”
Output: Balanced

Input: exp = “[(])”
Output: Not Balanced
Algorithm:


Declare a character stack S.
Now traverse the expression string exp.
If the current character is a starting bracket (‘(‘ or ‘{‘ or ‘[‘) then push it to stack.
If the current character is a closing bracket (‘)’ or ‘}’ or ‘]’) then pop from stack and if the popped character is the matching starting bracket then fine else parenthesis are not balanced.
After complete traversal, if there is some starting bracket left in stack then “not balanced”\


 */
package listInterface;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of test cases");
		int t = sc.nextInt();
		sc.hasNextLine();
		while(t-- != 0)
		{
			System.out.println("Enter the combination");	
			String s = sc.next();
			Stack<Character> stack = new Stack<>();
			boolean isBalanced = true;
			for(int i=0;i<s.length();i++)
			{
				char ch= s.charAt(i);
				if(ch == '(' || ch == '[' || ch == '{')
				{
					stack.push(ch);
					continue;
				}
				if(stack.isEmpty())
				{
					isBalanced = false;
					break;
				}
				if(ch == ')')
				{
					if(stack.peek() == '(')
					{
						stack.pop();						
					}
					else
					{
						isBalanced = false;
						break;
					}
				}
				if(ch == '}')
				{
					if(stack.peek() == '{')
					{
						stack.pop();						
					}
					else
					{
						isBalanced = false;
						break;
					}
				}
				if(ch == ']')
				{
					if(stack.peek() == '[')
					{
						stack.pop();						
					}
					else
					{
						isBalanced = false;
						break;
					}
				}
			}
			if(!stack.isEmpty())
			{
				isBalanced = false;
			}
			if(isBalanced)
			{
				System.out.print("Balanced");
			}
			else
			{
				System.out.print("Not Balanced");
			}
		}
	}
}
