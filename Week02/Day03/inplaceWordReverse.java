import java.util.*;
class wordReverse {

    public static void reverseWords(char[] message) {
    
      int n=message.length;    
      reverse(message,0,n-1);
      
      int wordStart=0;
      for(int index=0;index<n;index++){
          if(wordStart==n || message[index]==' '){
              reverse(message,wordStart,index-1);
          }
          wordStart=index+1;
      }
      
    }


    public static void reverse(char[] a,int start,int stop) {
        
        // reverse input array of characters in place
        for(int i=start;i<stop/2;i++){
            swap(a,i,stop-i);
        }
        System.out.println(Arrays.toString(a));
    }
    
    public static void swap(char[] a,int i,int j){
        char temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }



    public static void main(String[] args) {
        char a[]={'a','k','h','i','l',' ','k','o','r','e','d','l','a'};
        reverseWords(a);
        System.out.println(Arrays.toString(a));
    }
}
