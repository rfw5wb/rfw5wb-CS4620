/**
* PA2 Test 1
* Set one pixel using Meggy.setPixel and a color. Tests setPixel, colors, and byte casting
*
*Rachel Weeks, rfw5wb, PA1 -- 9/16/18
*/

import meggy.Meggy;

class PA2Test1 {
	public static void main(String[] whatever){
		Meggy.setPixel( (byte)1, (byte)2, Meggy.Color.RED ); //Turn (1,2) red
		Meggy.setPixel( (byte)1, (byte)3, Meggy.Color.BLUE ); //Turn (1,3) blue
        }	
}
