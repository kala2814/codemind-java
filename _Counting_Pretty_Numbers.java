/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner Sc=new Scanner(System.in);
        int T = Sc.nextInt();
        try{for (int i =0;i<=T;i++){
            int L = Sc.nextInt();
            int R = Sc.nextInt();
            int length = R-L+1;
            int num [] = new int[length];
            int max = 0;
            for (int j = 0;j<length;j++){
                num[j]= L;
                L++;
                int x = num[j]%10;
                if(x == 2 || x==3 || x==9){
                    max++;
                   
                } 
                }
                
            System.out.println(max);
            
        }
        
        
        }   
	catch(Exception e){
            return;
	}
	}
}