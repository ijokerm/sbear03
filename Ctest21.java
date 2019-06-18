import java.util.Arrays;
public class Ctest21{

	//property
		private int[] array;
		private int size;
	
	//construct method
	public Ctest21(){
		array=new int[11];
		//初始化size，没有数据所以size=0
		size=0;
	}
	//-头插 
	public void pushFront(int element){
		ensureCapacity();
		//size is the length
		//element is what we want to input
		for(int i=size-1;i>=0;i--){
		array[i+1]=array[i];
		}
		array[0]=element;
		size++;
	}
	//-尾插
	public void pushBack(int element){
		ensureCapacity();
			array[size++]=element;
		
	}
	//中间插
	public void insert(int index,int element){
		//index is a symbol of the location
		if(index<0||index>size){
			System.out.println("index不合法");
			return;
		}
		// i represents spacenumber
		for(int i=size;i>index;i--){
			array[i]=array[i-1]; 
		}
		/*// i represents traveltimes
		for(int i=0;i<size-index;i++){
			array[size-i]=array[size-i-1];
		}*/
		array[index]=element;
		size++;
	}
	//头删
	public void popFront(){
		if(size==0){
			System.out.println("the sequence is empty,can not be deleted");
			return;
		}
		for(int i=0;i<size-1;i++){
	        array[i]=array[i+1];
		}
	    array[--size]=0;
	}
	//中间删   



	//尾删
	public void popBack(){
		if(size==0){
			System.out.println("the sequence is empty,can not be deleted");
			return;
		}
		array[--size]=0;
	}
	//delete element
	public void erase(int index){
        if(size==0){
			System.out.println("the sequence is empty,can not be deleted");
			return;
		}
	}
	//find element
	public int indexOf(int element){
		for(int i=0;i<size;i++){
			if(array[i]==element){
				return 1;
			}
		}
		return -1;
	}
	//get element
	public int get(int index){
		if(index<0||index>=size){
			System.out.println("error index");
			return -1;
		}
		return array[index];
	}
	//modify the num of element 
	public  void set(int index,int element){
		array[index]=element;
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return size==0;
	}
	public int capacity(){
		return array.length;
	}
	
	//make sure it has enough space
	public void ensureCapacity(){
		if(size<array.length){
			return;
		}
		//1
		int newCap=array.length+array.length/2;
		int[] newArray=new int[newCap];
		//2
		for(int i=0;i<array.length;i++){
			newArray[i]=array[i];
		}
		//3
		this.array=newArray;
	    //4
	}
	
	public static void remove(){};
	 
	//便于打印
	public String toString(){
		return Arrays.toString(
		Arrays.copyOf(array,size)
		);
	}
	
	public static void test1(String[] args){
		Ctest21 seqList=new Ctest21();
		System.out.println(seqList.toString());
		//尾插1 2  3
		seqList.pushBack(1);
	    seqList.pushBack(2);
		seqList.pushBack(3);
		System.out.println(seqList.toString());
		//头插 10 20 30
		seqList.pushFront(10);
		seqList.pushFront(20);
		seqList.pushFront(30);
		//中间插 2,100、4,200
		System.out.println(seqList.toString());
		seqList.insert(2,100);
		seqList.insert(4,200);
		// 10 100 20 200 30 1 2 3
		System.out.println(seqList.toString());
        System.out.printf("current capacity:%d%n",seqList.capacity());
        seqList.pushBack(0);
		seqList.pushBack(0);
		seqList.pushBack(0);
		seqList.pushBack(0);
		
		
		System.out.printf("current capacity:%d%n", seqList.capacity());
	    seqList.popFront();
		seqList.popFront();
		seqList.popFront();
		System.out.println(seqList.toString());
	    seqList.popBack();
		System.out.println(seqList.toString());
	}
	
	public static void test2(String[] args){
		Ctest21 s=new Ctest21();
		System.out.println(s.toString());
		s.pushBack(1);
		s.pushBack(2);
		s.pushBack(3);
		s.pushBack(4);
		s.pushFront(1);
		s.pushFront(2);
		s.pushFront(3);
		s.pushFront(24);
		System.out.println(s.toString());
		s.erase(24);
		System.out.println(s.toString());
		
	}
	
	public static void main(String[] args){
    test1(args);	
    test2(args);	
		}
} 