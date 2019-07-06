package DZ_shaxmatka;
public class Task01 {
    public static void main(String arg[]){
       //System.out.println(Task01.mas.lenght);
       //System.out.print(DZ_shaxmatka.Task01.mas());
       pmas(8);
    }
    public static void mas(){
        int [] mas = {0,1,0,1,0,1,0,1};
       for (int i = 0; i<mas.length ; i++){
           System.out.print(mas[i] +"  ");
       }
    }
    public static void pmas(int a){
        for (int i=0; i<a; i++){
            mas();
            System.out.println();
        }
        
    }
}
