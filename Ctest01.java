public class Ctest01{
	public static int max(int[] array){
	    int maxValue=Integer.MIN_VALUE;
		// for(int item;array)
		for(int i=0;i<array.length;i++){
			if (array[i]>maxValue){
			maxValue=array[i];
		  }
	   }
	return maxValue;
   } 
	//返回第一个下标
    public static int indexof(int[] array,int key){
		for(int i=0;i<array.length;i++){
	     if(array[i]==key){
			 return 1;
		  }
		}
		return -1;
	}
	//去掉最高最低分
	public static double average(int[] scores){
	    int sum=[0];
		int temp1=scores[0];
		int temp2=scores[0];
        for(int i=0;i<scores.length;i++){
			if(scores[i]<temp1){
				temp1=scores[i];
			}
            if(scores[i]>temp2){
				temp2=scores[i];
			}			
		sum+=scores[i];
		} 	
		return (double)sum/scores.length-2;
	}
	    
    public static int[] copyof(int[] src,int new) 
  
    public static void main(String[] args){
	 int[] array={1,3,7,0,9};
	  int maxValue=max(array);
	  System.out.println("最大值是:"+maxValue);
	  int 
	}
}