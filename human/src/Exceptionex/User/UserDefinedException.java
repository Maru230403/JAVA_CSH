package Exceptionex.User;

import java.util.Calendar;

public class UserDefinedException extends Exception {
	private String msg;
	public UserDefinedException() {}
	public  UserDefinedException(String msg) {
		this.msg =msg;
	}
	public String toString() {
		return"예외 메시지는 : " + msg;
	}
public String getUserException() {
	String errMsg = "예외 발생 시간: " +showTime() + "예외 내용:" + msg;
	return errMsg;
}
public static String showTime() {
	String date = null;
	String time = null;
	Calendar cal = Calendar.getInstance();
	
	int hour =cal.get(Calendar.HOUR);
	int min = cal.get(Calendar.MINUTE);
	int sec = cal.get(Calendar.SECOND);
	
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH)+1;
	int day = cal.get(Calendar.DATE);
	
	date = year+ "-" + month + "-"+ day;
	time = hour + ":" + min + ":" + sec;
	return date + "" + time;
}

}