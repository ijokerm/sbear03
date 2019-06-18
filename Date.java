
public class Date{
	private int year;
	private int month;
	private int day;
	//构造方法
	public Date(int year,int month,int day){
		if(year<1900||year>2100){
			System.out.println("年不合法"+year);
			return;
		}
	    if(month<1||month>12){
			System.out.println("月不合法"+month);
			return;
		}
	    if(day<1||day>getDayOfMonth(year,month)){
			System.out.println("日不合法"+month);
			return;
		}
	    //name shadow
	    this.year=year;
		this.month=month;
		this.day=day;
	}
	private Date(Date other){
		this(other.year,other.month,other.day);
	}
	//加日期
	public void add(int days){
		//day必须是正数
		if(days<0){
			System.out.println("days不合法."+days);
			return;
		}
		day+=days;
    while(day>getDayOfMonth(year,month)){
		day-=getDayOfMonth(year,month);
		month++;
		if(month>12){
			month=1;
			year++;
		}
	  }	
	}
	//减日期
    public void sub(int days){
		if(days<0){
			System.out.println("days不合法."+days);
			return;
		}
		day-=days;
		while(day<1){
			month--;
			if(month<1){
				month=12;
				year--;
			}
			day+=getDayOfMonth(year,month);
		}
	}
    //日期格式
	public String toString(){
		return String.format("%04d-%02d-%02d",year,month,day);
	}
	
	private static boolean isGreatThan(Date d1,Date d2){
		if(d1.year>d2.year){
			return true;
		}
	    if(d1.year==d2.year&&d1.month>d2.month){
			return true;
		}
	    if(d1.year==d2.year&&d1.month==d2.month&&d1.day>d2.day){
			return true;
		}
	    return false;
	}
	//
	public static int differ(Date d1,Date d2){
		if(!isGreatThan(d1,d2)){
			System.out.println("必须d1大于d2");
			return -1;
		}
		int days=0;
		Date tmp=new Date(d1);
		while(isGreatThan(tmp,d2)){
			tmp.sub(1);
			days++;
		}
	    return days;
	}
	
	private static final int[] DAY_OF_MONTH={31,28,31,30,31,30,31,31,30,31,30,31};
	//2月
	private static int getDayOfMonth(int year,int month){
		int days=DAY_OF_MONTH[month-1];
		if(month==2&&isLeapyear(year)){
			days=29;
		}
	    return days;
	}
      private static boolean isLeapyear(int year){
		  if((year%4==0&&year%100!=0)||year%400==0){
			  return true;
		  }
		  return false;
	  }

    
//入口方法
public static void main(String[] args){
	Date date=new Date(2019,5,25);
	System.out.println(date.toString());
	date.add(10);
	System.out.println(date.toString());
	date.add(10);
	System.out.println(date.toString());
	date.sub(22);
	System.out.println(date.toString());
	Date today=new Date(2019,5,25);
	Date intern=new Date(2019,12,21);
	System.out.printf("距离找实习还有%d天%n",Date.differ(intern,today));
}
}