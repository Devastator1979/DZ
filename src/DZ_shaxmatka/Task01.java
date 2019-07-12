package DZ_shaxmatka;

class M {

    int mas[][];
    private Object DZ_shaxmatka;

    public void init(int a) {
        mas = new int[a][a];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if ((i+j) % 2 == 0) {
                    mas[i][j] = 1;
                    //System.out.print(mas[i][j]);
                } else {
                    mas[i][j] = 0;
                    //System.out.print(mas[i][j]);
                }
            }
        }
    }
public void print(){
      // DZ_shaxmatka.M(int 10,int 10);
       for (int i = 0; i < mas.length; i++) {
           for (int j = 0; j < mas[i].length; j++) {
               System.out.print(mas[i][j] + "  ");
           }
           System.out.println();
       }
}
}

public class Task01 {

    public static void main(String arg[]) {
      M mas1 = new  M ();
      mas1.init(10);
      mas1.print();
    }

}
