    import java.util.*;
    public class PalindromeExample{  
     public static void main(String args[]){  
      Scanner deepak = new Scanner(System.in);
      int n= deepak.nextInt();  
       int flag=0;
       for(int i=1;i<=n;i++) 
       {
        
           if(n%i==0)
           {
               flag++;
           }
       }
      if(flag==2)   
       System.out.println("o");
      else    
       System.out.println("2345");
    }  
    }  
