/**
* PA5 Test 3
* Object creation and more variable declaration (not local variable)
*
* Rachel Weeks, PA1 -- 9/16/18
*/

import meggy.Meggy;
class PA5Test3 {
	public static void main(String[] whatever){
		new checkPA5().run();
	}
}

//Create object
class checkPA5 {
	public void run(){
		//Declare object variables		
		Dot dot1;
		Dot dot2;
		
		//Assign object variables
		dot1 = new Dot();
		dot2 = new Dot();
		
		//Initialize object variables
		dot1.init1();
		dot2.init2((byte)4,(byte)5);

		dot1.drawDot();
		dot2.drawDot();
	}
}

//Object definition
class Dot {
	//Variable declaration (not local)
	byte x;
	byte y;

	public void init1() {
		//variable assignment
		x = (byte)2;
		y = (byte)2;
	}
	
	public void init2(byte x1, byte y1){
		x = x1;
		y = y1;
	}

	public void drawDot(){
		Meggy.setPixel( x, y, Meggy.Color.BLUE );	
	}
	
}

