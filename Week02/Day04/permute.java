
import java.util.*;

public class permute {

    public static HashSet<String> hs=new HashSet<String>();


    public static Set<String> getPermutations(String ip) {

        // generate all permutations of the input string
        recPermutation(ip,0,ip.length());

        return hs;
    }

      
    public static Set<String> recPermutation(String st,int start,int end){

        if(start==end){
            hs.add(st);
        }
        for(int i=start;i<end;i++){
            st=swap(st,start,i);
            recPermutation(st,start+1,end);
        }
        return hs;
    }
    
    public static String swap(String st,int i,int j){
        char ch[]=st.toCharArray();
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        return String.valueOf(ch);
    }


    public static void main(String[] args) {
        System.out.println(getPermutations("abc"));    
    }
}
