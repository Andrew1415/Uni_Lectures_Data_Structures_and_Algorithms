import java.util.Scanner;
public class Main {
    public static int Area(int x, int y){
        int area=x*y;
        return area;
    }
    public static int Perimeter(int x, int y){
        int perimeter=x*2+y*2;
        return perimeter;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);


        System.out.println("Virsutinio kairiojo kampo kordinates:");
        System.out.print("X1:");
        int x1=in.nextInt();
        System.out.print("Y1:");
        int y1=in.nextInt();
        System.out.println("Apatinio desiniojo kampo kordinates:");
        System.out.print("X2:");
        int x2=in.nextInt();
        System.out.print("Y2:");
        int y2=in.nextInt();
        int x, y;
            x=Math.abs(x2-x1);
            y=Math.abs(y2-y1);

        System.out.println("Plotas: "+ Area(x,y));
        System.out.println("Perimetras: "+ Perimeter(x,y));
    }
}


//1. Užduotis (Veiksmai)
//        Parašykite programą, kuri suskaičiuotų stačiakampio,
//        kurio viršutinio kairiojo taško (x1;y1) ir apatino dešiniojo taško (x2;y2) coordinates sveikieji skaičiai,
//        plotą s  ir perimetrą p. Nurodykitų taškų coordinates įveskite klaviatūra.
//        Stačiakampio kraštinės lygiagrečios koordinačių ašims.
//        Pvz.: x1=0, y1=5, x2=4, y2=0, tai s=20 ir p=18.
//
//        Duomenys x1, y1, x2 ir y2 įvedami klaviatūra.
