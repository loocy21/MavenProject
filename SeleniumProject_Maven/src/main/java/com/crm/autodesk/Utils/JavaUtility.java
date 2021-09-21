package com.crm.autodesk.Utils;
/**
 * This class contains generics methods partining to java
 * @author ANSHUL
 *
 */

import java.util.Random;

public class JavaUtility {
	
	/**
	 * this method genrates random partaining to java 
	 * @return
	 */
	public int getRandomNum() {
		Random ran = new Random();
		int randomNum= ran.nextInt(100);
		return randomNum;
		
	

}
}

