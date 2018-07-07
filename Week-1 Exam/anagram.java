import java.util.*;
class anagram{
	public static boolean check(String s1,String s2){
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(String.valueOf(ch1).equals(String.valueOf(ch2)))
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine().toLowerCase().replace(" ","");
		String s2=in.nextLine().toLowerCase().replace(" ","");
		System.out.println(check(s1,s2));
	}
}
