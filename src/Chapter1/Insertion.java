package Chapter1;
/*
 * 插入排序
 */
public class Insertion {
	public static void main(String[] args) {
		int[] a={1,3,2,4,6};
		sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void sort(int[] a) {
		for(int i=a.length-1;i>=0;i--){
			for(int j=0;j<a.length-1;j++){
				if(a[j]>a[i]){
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
	}

}
