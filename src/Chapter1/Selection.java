package Chapter1;
/*
 * 选择排序:选择最小或者最大的排在第一个,第二遍从第i个元素开始。
 */
public class Selection {

	public static void main(String[] args) {
		int[] a={1,3,2,6,4};
		sort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void sort(int[] a){
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[j]>a[i]){
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
	}
}
