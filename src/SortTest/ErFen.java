package SortTest;

public class ErFen {
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7};
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
		
		return -1;
		
	}

}
