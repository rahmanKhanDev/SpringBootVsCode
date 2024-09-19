package com.nt.test;
import com.nt.comps.*;
import com.nt.factory.*;

public class StrategyPatternTest {

	public static void main(String[] args) {
	Flipkart fpkt=FlipkartFactory.getInstance("DTDC");
	String resultMsg=fpkt.shopping(new String[] {"shirt", "pant","t-shirt"},new int[] {3000,2000,1500     });
    System.out.println(resultMsg);
	}

}
