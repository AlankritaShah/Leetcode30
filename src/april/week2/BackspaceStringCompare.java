package april.week2;

import java.util.Stack;

/**
 * 
@author alankrita
Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
Note:

1 <= S.length <= 200
1 <= T.length <= 200
S and T only contain lowercase letters and '#' characters.
Follow up:

Can you solve it in O(N) time and O(1) space?
 *
 */

public class BackspaceStringCompare {
	public boolean backspaceCompare(String S, String T) {
        Stack<Character> s_stack = new Stack<>();
        Stack<Character> t_stack = new Stack<>();
        
        for(int i=0; i<S.length(); i++)
        {
            Character s = S.charAt(i);
            if(s == '#'){
                if(!s_stack.empty())
                    s_stack.pop();
            }
            else
                s_stack.push(s);
        }
        
        for(int i=0; i<T.length(); i++)
        {
            Character t = T.charAt(i);
            if(t == '#'){
                if(!t_stack.empty())
                    t_stack.pop();
            }
            else
                t_stack.push(t);
        }
        // System.out.println(s_stack);
        // System.out.println(t_stack);
        return s_stack.equals(t_stack);
        
    }
	
	public static void main(String [] args)
	{
		System.out.println(new BackspaceStringCompare().backspaceCompare("ab#c", "ad#c"));
	}
}
