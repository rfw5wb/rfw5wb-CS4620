/**
* PA3 Test 1
* Set three pixels using arithmetic expressions. Tests arithmetic expressions and while loops
*
*Rachel Weeks, rfw5wb, PA1 -- 9/18/18
*/

import meggy.Meggy;

class PA3Test1 {
	public static void main(String[] whatever){
		//TEST ARITHMETIC EXPRESSIONS
		Meggy.setPixel( (byte)1, (byte)(2-1), Meggy.Color.RED ); //Check subtraction
		Meggy.setPixel( (byte)1, (byte)(1+1), Meggy.Color.BLUE ); //Check addition
		Meggy.setPixel( (byte)1, (byte)((byte)3*(byte)1), Meggy.Color.ORANGE ); //Check addition
		
		//Test while loop
		while(true){
			Meggy.setPixel((byte)1, (byte)5, Meggy.Color.GREEN);
		}
		
        }	
}
