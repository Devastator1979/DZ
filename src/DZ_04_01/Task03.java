//Числа армстронга
package DZ_04_01;
public class Task03 {
public static void main(String [] args){
    int x = 1000000;
    int n  ;
    //Цикл перебора чисел
    for(int i = 1; i<=x; i++)
    {
        n = i;
        double sum = 0;
        //Определяем колличество цифр в числе
        int pow = (int)Math.log10(i)+1;
    while(n != 0)
    {
         //Суммируем цифры числа возведенные в степень равную колличиеству цифр числа
         sum += Math.pow((n % 10),pow);
         n/=10;
    }
    //Проверяем сумма чисел возведенных в степень равную колличеству цифр числа равна
    //исходному числу то выводим на экран
    if (i == sum)
    {
        System.out.println(i);
    }
    }
}
}

    

