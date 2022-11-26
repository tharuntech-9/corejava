package com.exception.bean;

import java.util.Iterator;

import com.exception.customize.EvenNumber;
import com.exception.customize.OddNumber;

public class Test {
	public static void main(String[] args) {
		int[] number= {11,10};
		
		for (int i : number) {
		if(i%2<=0){
			throw new EvenNumber("you entered EVENNUMBER....");
		}
		else {
			throw new OddNumber("you entered ODDNUMBER....");
		}
	}

	}
}
