package com.ddn.restservice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class ValidParanthesis {
	
	public static void main(String args[]) {
		//String s = "[(])";
		String s ="){";
		int threshold =50;
		List<Employee> employees  = new ArrayList();
		employees.add(new Employee("dileep",52));
		employees.add(new Employee("dan",51));
		employees.add(new Employee("Rahul",22));
		employees.add(new Employee("Varun",45));
		
		employees = employees.stream().filter(p->p.getAge()>threshold).collect(Collectors.toList());
		Collections.sort(employees, (o1,o2)->o1.getName().compareTo(o2.getName()));
		
		System.out.println(checkIfValidParanthesis(s));
	}

	private static boolean checkIfValidParanthesis(String s) {
		
		if(s.length()%2 != 0)
			return false;
		Stack<Character> stackPara = new Stack();
		
		for(int i=0 ;i<s.length();i++) {
			if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
				stackPara.push(s.charAt(i));
			}else if (s.charAt(i) == ']' || s.charAt(i) == '}' || s.charAt(i) == ')') {
				if(s.charAt(i) == ']'&&  !stackPara.empty() && stackPara.peek() == '[') {
					stackPara.pop();
				}
				else if(s.charAt(i) == '}'&& !stackPara.empty() && stackPara.peek() == '{') {
					stackPara.pop();
				}
				else if(s.charAt(i) == ')'&& !stackPara.empty() && stackPara.peek() == '(') {
					stackPara.pop();
				}else {
					return false;
				}
				
			}
		}
		return stackPara.isEmpty();
		
	}

}
