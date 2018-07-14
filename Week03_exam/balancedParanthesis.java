import java.util.*;
class balancedParanthesis{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n =in.nextInt();
		check(n,n,"");
		System.out.println(al+"---"+c);
	}

	public static int c=0;

	public static ArrayList<String> al=new ArrayList<String>();

	public static void check(int open,int close,String st){

		if(open==0 && close==0){
			al.add(st);
			c++;
			return;
		}
		else if(open>close)
			return;
		if(open>0)
			check(open-1,close,st+"(");
		if(close>0)
			check(open,close-1,st+")");
	}
}
