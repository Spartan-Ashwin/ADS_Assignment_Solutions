package Assignment06;
import java.util.*;
public class Pro5 {
	
	// 5. Java Program to Check for balanced parenthesis by using Stacks
	
	public static void main(String[] args) {
		
		String str="{[()]}";
		
		System.out.println(isBalance(str));
	}
	

	
	static String isBalance(String str) {
		Stack<Character> stk=new Stack<>();
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			
			if(ch=='(') {
				stk.push(')');
			}else if(ch=='{') {
				stk.push('}');
			}else if(ch=='[') {
				stk.push(']');
			}else {
				
				if(stk.isEmpty()) {
					return "NO";
				}
				
				if(stk.pop()!=ch) {
					return "NO";
				}
			}
			
			
		}
		
		if(stk.isEmpty()) {
			return "YES";
		}
		return "NO";
	}

}
