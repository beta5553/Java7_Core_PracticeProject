package com.qb.israel.codefights;

public class RegularBracketSequence {
	
	public static void main(String [] args) {
		RegularBracketSequence rs = new RegularBracketSequence();
		System.out.println(rs.regularBracketSequence1("()()"));
	}
	
	boolean regularBracketSequence1(String sequence) {

		  int balance = 0;
		  for (int i = 0; i < sequence.length(); i++) {
		    if (sequence.charAt(i) == '(') {
		    	System.out.println("true--");
		      balance++;
		    }
		    else {
		      balance--;
		    }
		    if (balance < 0) {
		      return false;
		    }
		  }
		  if (balance != 0) {
		    return false;
		  }
		  return true;
		}


}
