import java.util.Arrays;
public class Ctest02{
	//二分查找
	public static int binarysearch(int[]array,int key){
		int left=0;
		int right=array.length-1;
		//可以继续循环的条件，left<right 
		//left=right无需循环
		while(left<=right){
			int middle=left+(right-left)/2;
			if(key==array[middle]){
				return middle;
			}else if(key<array[middle]){
				right=middle-1;
			}else{
				left=middle+1;
			}	
		}
			return -1;
	}
	//二分查找
	/*public static void binarrySearch(int[] array,int key){
		int left=0;
		int right=array.length-1;
		while(left<=right){
			int mid=(left+right)/2;
	        if(key==array[mid]){
				return mid;
			}		
		else if(key<=array[mid]){
			right=mid-1;
		}
		else{
			left=mid+1;
		}	
			}
			return -1;
		}
	}*/
	
	
	//冒泡排序n-1
	public static void swap(int[] array,int i,int j){
			int temp=array[i];
            array[i]=array[j];
            array[j]=temp;		
	}
	
	public static void bubblesort(int[] array){
        int temp=0;
		for(int i=0;i<array.length;i++){ 
			boolean isSwapped=false;
			for(int j=0;j<array.length-i-1;j++){
			if(array[j]>array[j+1]){
		    swap(array,j,j+1);
			isSwapped=true;
			 }
		   }
		if(!isSwapped){
			return;
		   }
		}
		
	}
	//toString 文件头部
	public static void main(String[] args){
		int[] Array1=new int[] {1,3,2,4,7,5,0};
		int key1=4;
		binarysearch(Array1,key1);
		
		/*int[] randomArray=new int[] {2,4,1,5,3,6};
		bubblesort(randomArray);
		System.out.println(Arrays.toString(Array1,key1));
*/
		//text it's function
		int position=binarysearch(Array1,key1);
		if(position==0){
			System.out.println("the number you search does not exit");
		}
		else
			System.out.println("the number you search is:"+key1+",location is"+position);
	}
}