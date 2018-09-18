/**
* PA4 Test 1
* Tests function definition and function calls
*
*Rachel Weeks, rfw5wb, PA1 -- 9/16/18
*/

import meggy.Meggy;

class PA4Test1 {
	public static void main(String[] whatever){
		//Test function call
		new Orange().makeOrange(); 
        }
}

class Orange {
	public void initOrange(){
	}
	
	/*
	* Function that changes pixel at (1, 1) to orange
	*/
	public void makeOrange(){
		Meggy.setPixel((byte)1, (byte)1, Meggy.Color.ORANGE);
	}
	
	
}
