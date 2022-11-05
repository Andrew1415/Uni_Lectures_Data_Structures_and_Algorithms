import java.util.Scanner;

public class uzd3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Tikrinami metai: ");
        int metai=in.nextInt();
        int last_digit=metai%10;
        String spalva="none";
        switch (last_digit) {
            case 4,5 -> spalva="ŽALIA";
            case 6,7 -> spalva="RAUDONA";
            case 8,9 -> spalva="GELTONA";
            case 0,1 -> spalva="BALTA";
            case 2,3 -> spalva="JUODA";
        }
        System.out.println(metai + " - " + spalva);
    }
}
