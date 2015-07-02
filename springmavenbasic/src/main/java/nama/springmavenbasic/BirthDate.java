package nama.springmavenbasic;

public class BirthDate implements MyDate{
	
	int date;
	int month;
	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	int year;
	
	 public String toString()
	 {
		 return ("date"+date+"/"+month+"/"+year);
	 }
	 
	 public void addMonth(int m)
	 {
		 month+=m;
	 }

}
