import java.util.*;
class morse{

	public static ArrayList<String> al=new ArrayList<String>();

	public static String printMorse(String arr[],String st){
		String s="";
		for (int i=0;i<st.length();i++) {
			int index=st.charAt(i)-97;
			s+=arr[index];
		}
		if(!al.contains(s))
			al.add(s);
		return s;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);


		String arr[]={".-","-...","-.-.","-..",".","..-.","--.",
		"....","..",".---","-.-",".-..",
				"--",	
				"-.",
				"---",
				".--.",
				"--.-",
				".-.",
				"...",
				"-",
				"..-",
				"...-",
				".--",
				"-..-",
				"-.--",
				"--.."};

		String a[]={"hig", "sip", "pot"};
			for (int k=0;k<a.length ;k++) {
					System.out.println(a[k]+"--->"+printMorse(arr,a[k]));	
			}
		System.out.println("total transformations = "+al.size());

	}
}



