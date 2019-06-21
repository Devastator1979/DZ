//Вывод натуральных чисел
package DZ_04_01;
public class Task02 {
    public static void main(String[] args){
    int a = 100;
    for ( int i = 2; i <= a; i++ ) {
        Integer c = i;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
              c = null;
              break;
            }
        }
        if (c != null) {
            System.out.println(c);
        }  
    }
}
}
