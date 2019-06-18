//如何定义一个类
class Group{
	String name;
	int num;
	
//方法
//构造方法 无返回值 名称和类名称一样
//定义类的时候，没有明确给出构造方法Java编译器会补一个默认的构造方法
Group(String n,int m){
   name =n;
   num=m;   
}
  void print(String welcome){
		System.out.printf("%s %s的 %d位同学们%n",
		welcome,
		name, 
		num);
	}
}
//定义对象B
class B {
	int sum;
	B(int a,int b,int c){
		System.out.println(a+b+c);
		sum=a+b+c;
	}
	void print(){
		System.out.println(sum);
	}
}


public class Ctest03{
	public static void main(String[] args){
		Group group=new Group("信息171",30);
		group.print("欢迎来到鬼屋：");
	
	B b=new B(1,3,4);
    b.print();
	}
}