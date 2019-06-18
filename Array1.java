public class Array1{
	//初始化和打印
	public static int[] init(){
		return new int[] {1,2,3,4,5};
	}
	
	public static void printArray1(int[] temp1){
		for(int i=0;i<temp1.length;i++){
			System.out.println(temp1[i]);
		}
	}
	//排序int char
	public static void printArray2(int[] temp2){
		for(int i=0;i<temp2.length;i++){
			System.out.println(temp2[i]);
	    }
	}
	//重载
	public static void printArray2(char[] temp2){
		for(int i=0;i<temp2.length;i++){
			System.out.println(temp2[i]);
	   }
	}
	
	
	public static void main(String[] args){
		/*int[] data=init();
		printArray(data);
		int[] data=new int[]{1,3,5,2,21,23};
		char[] data1=new char[]{'a','u','c'};
		java.util.Arrays.sort(data);
		java.util.Arrays.sort(data1);
		printArray2(data); 
 		printArray2(data1);*/
		int[] dataA=new int[]{1,2,3,4,7,9,8};
		int[] dataB=new int[]{11,22,33,44,77,99,88};
		//数组拷贝
		System.arraycopy(dataB,2,dataA,1,3);
	    printArray1(dataA);
	}
	
}