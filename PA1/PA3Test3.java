/**
* PA3 Test 3
*  
*Test checkButton and delay functions
*
*Rachel Weeks, rfw5wb, PA1 -- 9/16/18
*/

import meggy.Meggy;

class PA3Test3 {
	public static void main(String[] whatever){
		//Test Meggy.delay
		Meggy.setPixel( (byte)1, (byte)(1), Meggy.Color.RED ); //turn on (1,1)
		Meggy.delay(1000);
		Meggy.setPixel( (byte)1, (byte)(1), Meggy.Color.DARK ); //turn off (1,1)

		//Test Meggy.checkButton
		while (true) {
			if (Meggy.checkButton(Meggy.Button.Up)) { //Buttons up (2, 1) is red
				Meggy.setPixel( (byte)2, (byte)(1), Meggy.Color.RED );
			} else {}
			if (Meggy.checkButton(Meggy.Button.Down)) { //Buttons down (2,1) is blue
				Meggy.setPixel( (byte)2, (byte)(1), Meggy.Color.BLUE );
			} else {}
			Meggy.delay(100); //Delay 100 miliseconds (already tested delay)
		}	
        }	
}
