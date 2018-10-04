/**
* PA4 Test 3
* Check less than and tone function.
*
*Rachel Weeks, rfw5wb, PA1 -- 9/16/18
*/

import meggy.Meggy;

class PA4Test3 {
	public static void main(String[] whatever){
		//Check less than expressions
		if(1<2){
			Meggy.setPixel( (byte)1, (byte)(1), Meggy.Color.RED );
		}
		else{
			Meggy.setPixel( (byte)1, (byte)(2), Meggy.Color.BLUE );
		}
		
		if(2<1){
			Meggy.setPixel( (byte)1, (byte)(3), Meggy.Color.RED );
		}
		else{
			Meggy.setPixel( (byte)1, (byte)(4), Meggy.Color.RED );
		} //Board should be: Red, dark, dark, Red
		
		//Check tone function
		Meggy.toneStart(Meggy.Tone.C3, 50);
		Meggy.delay(1000);
        }
}
