/**
* PA3 Test 2
*  Test if statements, and boolean expressions.
*
*Rachel Weeks, rfw5wb, PA1 -- 9/16/18
*/

import meggy.Meggy;

class PA3Test2 {
	public static void main(String[] whatever){
		//Test if Statement
		if(1 == 1){
			Meggy.setPixel((byte)1, (byte)1, Meggy.Color.BLUE);
		}
		
		//Test if/else statement
		if(1==2){
			Meggy.setPixel((byte)1, (byte)2, Meggy.Color.BLUE);
		}
		else{
			Meggy.setPixel((byte)1, (byte)2, Meggy.Color.RED);
		}

		//Test Boolean Expressions - TRUE
		if(true){
			Meggy.setPixel((byte)1, (byte)3, Meggy.Color.BLUE);
		}
		//Test Boolean Expressions - FALSE
		if(false){
			Meggy.setPixel((byte)1, (byte)4, Meggy.Color.BLUE);
		}
		
		
		//if correct, board should now have : Blue, Red, Blue, Dark

        }	
}
