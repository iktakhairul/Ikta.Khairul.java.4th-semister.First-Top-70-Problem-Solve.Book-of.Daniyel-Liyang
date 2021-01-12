package com.example.ShowCurrentTime;

public class ShowCurrentTime {
	public static void main(String[]args) {
		long totalmilliseconds =System.currentTimeMillis();
		long totalseconds= totalmilliseconds /1000;
		long currentSecond=totalseconds % 60;
		long totalminutes=totalseconds%60;
		long currentMinute= totalminutes%60;
		long totalHours=totalminutes/60;
		long currentHour=totalHours%24;
		System.out.println("Current time is : "+currentHour+" : "+currentMinute+":"+currentSecond+" (GMT+6)");
	}

}
