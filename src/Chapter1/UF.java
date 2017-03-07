package Chapter1;

import java.util.Scanner;

public class UF {

	private int[] id;
	private int count;
	
	public UF(int N){
		//初始化id数组
		count=N;
		id=new int[N];
		for(int i=0;i<N;i++){
			id[i]=i;
		}
	}
	
	public int count(){
		return count;
	}

	public boolean connected(int p, int q) {
		return find(p) == find(q);

	}
	
	public int find(int p){
		return id[p];
	}
	public void union(int p,int q) {
		//将p、q归并到相同的分量当中
		int pID=find(p);
		int qID=find(p);
		
		if(pID==qID) return;
		
		for(int i=0;i<id.length;i++){
			if(id[i]==pID)
				id[i]=pID;
			count--;
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		UF uf=new UF(N);
		while(scanner.hasNext()){
			int p=scanner.nextInt();
			int q=scanner.nextInt();
			if(uf.connected(p, q)) continue;
			uf.union(p, q);
			System.out.println(p+""+q);
		}
		System.out.println(uf.count+"components");
	}
	
}
