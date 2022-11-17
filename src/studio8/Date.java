package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Date {


	private int month;
	private int day;
	private int year;
	private boolean holiday;
	
	public Date(int initmonth, int initday, int inityear, boolean initholiday) {
		this.month = initmonth;
		this.day = initday;
		this.year = inityear;
		this.holiday = initholiday;
		}
	
	public String toString() {
		return month+"/"+day+"/"+year+ " - " + "holiday: " + holiday;
	}
	
    public static void main(String[] args) {
    	Date someDay = new Date(12,1,2003,true);
    	Date someDay2 = new Date(12,2,2003,false);
    	Date someDay3 = new Date(7,4,1776,true);
    	Date someDay4 = new Date(1,1,1111,true);
    	Date someDay5 = new Date(2,2,9999,true);
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(someDay);
    	list.add(someDay2);
    	list.add(someDay3);
    	list.add(someDay4);
    	list.add(someDay5);
    	System.out.println(list);
    	System.out.println(someDay.equals(someDay2));
    	System.out.println(someDay.toString());
    }

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	
    
    

}
