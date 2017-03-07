package SortTest;
//插入排序
/*
 * 第一个元素认为是已经被排序
 * 如果该元素大于新元素,则将该元素移到下一个位置
 * 
 */
public class InsertSort {
	public static void main(String[] args) {
		int[] a={1,4,2,6,3,7};
		insertSort(a);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	public static void insertSort(int[] a) {
		// TODO Auto-generated constructor stub
		int n=a.length;
		for(int i=1;i<n;i++){
			//从后往前进行比较,如果有比前面小的，交换位置
			for(int j=i;(j>0)&&a[j]<a[j-1];j--){
				int temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
			}
		}
	}

}
