/**
* PA3 Test 2
* Test int variable declaration, assign byte type to integer variable, and boolean declaration 
*
*Rachel Weeks, rfw5wb, PA1 -- 9/16/18
*/

import meggy.Meggy;

class PA5Test2 {
	public static void main(String[] whatever){
		new checkPA5().run();
        }	
} 

class checkPA5 {
	public void run(){
		// local variable declaration 
		//variable type - integer	
		byte x;
		int y;
		int z;

		//variable type - boolean
		boolean t;
		
		//Local variable assignment
		x = (byte)1;
		y = 2;
		z = x;
		t = true; 

		//Check to see if declaration and assignment worked
		if(t){
			Meggy.setPixel( (byte)z, (byte)y, Meggy.Color.BLUE );
		}
	}
}
