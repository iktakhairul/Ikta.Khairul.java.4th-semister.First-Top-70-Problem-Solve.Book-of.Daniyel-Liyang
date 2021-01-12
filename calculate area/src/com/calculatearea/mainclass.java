package com.calculatearea;

public class mainclass extends CalciulateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height = 10;
		int length= 40;
		CalciulateArea r = new CalciulateArea();
		r.area( height , length);
		System.out.println("ans : "+ r.area(height, length));
	}

}
