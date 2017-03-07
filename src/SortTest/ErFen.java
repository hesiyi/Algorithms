package SortTest;
//二分排序,查找一个数组为n长度,则比较几次
public class ErFen {
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,8};
		System.out.println(binarySearch(a,4));
	}
	
	public static int binarySearch(int[] a,int key){
		int start=0;
		int end=a.length-1;
		while(start<=end){
			int middle=(start+end)/2;
			if(key>a[middle]){ 
			    start=middle+1;
			}else if(key<a[middle]){
				end=middle-1;
			}else {
				return middle;
			}
		}
		//没有找到返回-1
		return -1;
		
	}

}
