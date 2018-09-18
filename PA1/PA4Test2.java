/**
* PA4 Test 2
* Tests parameter variables and function returns
*
*Rachel Weeks, rfw5wb, PA1 -- 9/16/18
*/

import meggy.Meggy;

class PA4Test2 {
	public static void main(String[] whatever){
		//Test function return with if statement		
		if( new Orange().makeOrange((byte)1, (byte)1) ){
			Meggy.setPixel((byte)1, (byte)2, Meggy.Color.BLUE);
		} 
        }
} 

class Orange {
	public void initOrange(){
	}
	
	/*
	* Function that changes pixel at (x,y) to orange
	*/
	public boolean makeOrange(byte x, byte y){
		//Tests parameter variables by sending in x and y		
		Meggy.setPixel(x, y, Meggy.Color.ORANGE);		
		return true;
	}
	
	
}
