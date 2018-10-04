/**
* PA5 Test 1
* Test byte variable declarations and variable assignment 
*
*Rachel Weeks, rfw5wb, PA1 -- 9/16/18
*/

import meggy.Meggy;

class PA5Test1 {
	public static void main(String[] whatever){
		new checkPA5().run();
        }	
} 

class checkPA5 {
	public void run(){
		// local variable declaration 
		//variable type - byte		
		byte x;
		byte y;
		
		//Local variable assignment
		x = (byte)1;
		y = (byte)2;

		//Check to see if declaration and assignment worked
		Meggy.setPixel( x, y, Meggy.Color.BLUE );	
	}
}
