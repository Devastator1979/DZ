package DZ_04_01;
public class Task01 {
    public static void main(String[] args) {
        // TODO code application logic here
       int n1 = 0;
       int n2 = 1;
       int n = n1+n2;
       while (n<1000000){

           System.out.println("Сумма чисел " + n1 + " + " + n2 + " = " + n );
           n1 = n2;
           n2 = n;
           n = n1 + n2;
    }
} 
}
