import java.util.*;
class Hamming{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		String s1=getBinary(x);
		String s2=getBinary(y);
		int l1=s1.length();
		int l2=s2.length();
		if(l1<l2){
			String str="";
			for(int i=0;i<l2-l1;i++){
				str+="0";
			}
			s1=str+s1;
		}
		if(l1>l2){
			String str="";
			for(int i=0;i<l1-l2;i++){
				str+="0";
			}
			s2=str+s2;
		}
		System.out.println(check(s1,s2));				
	}


	public static int check(String s1,String s2){
		int c=0;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(i))
				c++;
		}
		return c;

	}

	public static String getBinary(int n){
		String st="";
		while(n!=0){
			st+=n%2;
			n/=2;
		}
		return new StringBuffer(st).reverse().toString();
	}
}
