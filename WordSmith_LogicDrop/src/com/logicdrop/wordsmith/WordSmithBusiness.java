package com.logicdrop.wordsmith;

public class WordSmithBusiness {
	String result=null;
	public String checkForResult(int num){		
		 if(num%15==0){
			result="wordsmith";
			return result;
			}
		else if(num%5==0){
			result="smith";
			return result;
			}
		else if(num%3==0){
			result="word";
			return result;
			}
		else {result=Integer.toString(num);
		return result;
		}
	}
}
