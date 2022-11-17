package studio8;

import java.util.Objects;

public class Time {

	private int hours;
	private int minutes;
	
	
	
	public static void main(String[] args) {
		 
    	Time Time1 = new Time(7,44);
    	System.out.println(Time1.toString());
    }
	
	Time(int inithours, int initminutes) {
		this.hours = inithours;
		this.minutes = initminutes;
	}
	
	public String toString() {
		return hours + ":" + minutes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hours, minutes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hours == other.hours && minutes == other.minutes;
	}
	
	

}