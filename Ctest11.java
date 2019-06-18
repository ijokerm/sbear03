class Person{
	private String name;
    private int age;

    /*public Person(String n,int i){
		name=n;
		setAge(i);
	}	
	
	public void setName(String n){
		name=n;
	}
	
	public String getName(){
		  return name;
	}
	
	public void setAge(int i){
		if (i>0&&i<=200){
			age=i;
		}
		else{
			age=0;
		}
	}
	
	public int getAge(){
		return age;
	}
	
	public void getPersonInfo(){
		System.out.println("姓名："+name+",年龄："+age);
	}
}*/

public Person(){
	System.out.println("********产生一个新的person对象*******");
}

public Person(String name){
	System.out.println("********产生一个新的person对象*******");
	this.name=name;
}

public Person(String name,int age){
	System.out.println("********产生一个新的person对象*******");
	this.name=name;
	this.age=age;
}

public String getPersonInfo(){
	return "姓名："+name+",年龄："+age;
   }
}

public class Ctest11{
    public static void main(String[] args){
	/*	Person person=new Person("张三",-200);
		person.getPersonInfo();*/
	    Person per1=new Person();
        Person per2=new Person("张三");
        Person per3=new Person("李四",20);
        System.out.println(per1.getPersonInfo());
		System.out.println(per2.getPersonInfo());
        System.out.println(per3.getPersonInfo());
	}
}