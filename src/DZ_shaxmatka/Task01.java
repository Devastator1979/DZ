package DZ_shaxmatka;

class M {

    int mas[][];
    private Object DZ_shaxmatka;

    public void init(int a) {
        mas = new int[a][a];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i % 2 == 0) {
                    mas[i][j] = 0;
                    System.out.print(mas[i][j]);
                } else {
                    mas[i][j] = 1;
                    System.out.print(mas[i][j]);
                }
            }
        }
        //for (int i = 0; i<mas.length ; i++){
        //    i%2==0;
        //    mas[i]=0;
        //    
        //}
        //System.out.print(mas[i] +"  ");
    }

    //System.out.println (mas[][]);
    //for (int i = 0; i<mas1.length ; i++){
    //    System.out.print(mas1[i] +"  ");
    //}
public void print(){
      // DZ_shaxmatka.M(int 10,int 10);
}
}

public class Task01 {

    public static void main(String arg[]) {
      M mas1 = new  M ();
      mas1.mas = int [10][10];
      //for (int i = 0; i<M.mas.length ; i++){
    //    System.out.print(mas1[i] +"  ");
      //}
    //print();
    }

}
