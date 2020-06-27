/*
 * 
 */
package listInterface;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.hasNextLine();
		while(t-- != 0)
		{
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
