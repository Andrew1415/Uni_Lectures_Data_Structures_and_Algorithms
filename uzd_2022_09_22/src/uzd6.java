import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class uzd6 {
    public static void main(String[] args){
        try {
            File myObj = new File("file2.txt");
            Scanner in = new Scanner(myObj);
            int nelyg, lyg, nelyggyv=0, lyggyv=0;
            int n=in.nextInt();
            int[] arr=new int[n];
            int gyvall=0;
            int i=0;
            while (in.hasNext()) {
                if (in.hasNextInt()) {
                    arr[i] = in.nextInt();
                    gyvall+=arr[i];
                    if(i%2!=0){
                        lyggyv+=arr[i];
                    }
                    else {
                        nelyggyv+=arr[i];
                    }
                    i++;
                } else {
                    in.next();
                }
            }
            in.close();
            if(n%2==0){
                lyg=n/2;
                nelyg=n/2;
            }
            else {
                lyg=n/2;
                nelyg=n/2+1;
            }
            int vidlyggyv=lyggyv/lyg;
            int vidnelyggyv=nelyggyv/nelyg;
            System.out.println("Gatveje isviso gyvena: " + gyvall);
            System.out.println("Kairiojoje puseje gyvena: " + nelyggyv);
            System.out.println("Desiniojoje puseje gyvena: " + lyggyv);
            System.out.println("Vidutiniskai Kairiojoje puseje gyvena: " + vidnelyggyv);
            System.out.println("Vidutiniskai Desiniojoje puseje gyvena: " + vidlyggyv);

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
