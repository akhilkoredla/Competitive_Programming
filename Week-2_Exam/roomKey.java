import java.util.*;
class roomKey{

	public static boolean check(int a[][]){

		int n=a.length;

		boolean marked[]=new boolean[n];
		marked[0]=true;
		for (int i=0;i<n;i++) {
			for (int j=0;j<a[i].length;j++ ) {
				int x=a[i][j];
                if(x<marked.length) {
                    if (!marked[x] && x!=i) marked[x] = true;
                }
			}
		}

		for (int k=0;k<n;k++) {
			if(marked[k]==false) 
				return false;
		}
		return true;
	}


	public static void main(String[] args) {
		int a[][]={{1},{1,3},{2},{2,4,6},{},{1,2,3},{1}};
		System.out.println(check(a));		
	}
}

//
