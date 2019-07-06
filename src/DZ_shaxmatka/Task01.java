package DZ_shaxmatka;
public class Task01 {
    public static void main(String arg[]){
       pmas(4);
    }
    public static void mas(){
       int [] mas = {0,1,0,1,0,1,0,1};
       int [] mas1 = {1,0,1,0,1,0,1,0};
       for (int i = 0; i<mas.length ; i++){
           System.out.print(mas[i] +"  ");
       }
       System.out.println();
       for (int i = 0; i<mas1.length ; i++){
           System.out.print(mas1[i] +"  ");
       }
       
    }
    public static void pmas(int a){
        for (int i=0; i<a; i++){
            mas();
            System.out.println();
        }
        
    }
}
