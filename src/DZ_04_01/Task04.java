package DZ_04_01;
//import java.util.*;
import java.lang.*;
import java.io.*;
public class Task04 {
public static void main(String [] args)throws java.lang.Exception{
    //Scanner in = new Scanner(System.in);
    long n, m, t, sum;
    n = 10; 
    m = 100;
    for(long i = 1; i < n; i++) {
       	t = i;
       	sum = 0;
        System.out.println(t);
        while(t != 0)
	    sum += t%10;
	    t /= 10;
            System.out.println(t);
    }
       // if(sum*sum == m) System.out.print(i + " ");
    	//} 
}
}


