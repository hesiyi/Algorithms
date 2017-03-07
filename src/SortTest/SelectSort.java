package SortTest;
//选择排序，首先在未排序序列中找到最小元素，存放到序列的最起始位置，然后再从剩余未排序元素中继续寻找最小元素，放到排序序列末尾
public class SelectSort {
	public static void main(String[] args) {
		int[] a={4,2,1,6,3,6,0,-5,1,1};
		SelectSort(a);
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

	private static void SelectSort(int[] a) {
		int n=a.length;
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[j]<a[i]){
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		
	}
	
	

}
