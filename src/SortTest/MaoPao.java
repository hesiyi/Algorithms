package SortTest;
//主要思想：外层循环从1到n-1，内循环从当前外层的元素的下一个位置开始，依次和外层的元素比较，出现逆序就交换。 

public class MaoPao {
	public static void main(String[] args) {
		int[] a={1,4,2,6,3,7};
		int n=a.length;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(a[j]>a[i]){
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		
		for(int k=0;k<n;k++){
			System.out.print(a[k]+" ");
		}
	}

}
