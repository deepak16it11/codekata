    import java.util.*;
    public class Palindrome{  
     public static void main(String args[]){  
      int r,sum=0,temp;    
      Scanner deepak = new Scanner(System.in);
      int n= deepak.nextInt();  
      
      temp=n;    
      while(n>0){    
       r=n%10;  
       sum=(sum*10)+r;    
       n=n/10;    
      }    
      if(temp==sum)    
       System.out.println("yes");    
      else    
       System.out.println("no");    
    }  
    }  
