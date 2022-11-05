import java.io.File;  // Import the File class
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileNotFoundException;  // Import this class to handle errors
public class uzd5 {
    public static void main(String[] args){
        try {
            File myObj = new File("file1.txt");
            Scanner in = new Scanner(myObj);
            int nelyg=0, lyg=0;
            while (in.hasNext()) {
                if (in.hasNextInt()) {

                    int temp = in.nextInt();
                    if (temp <= 0) {
                        continue;
                    }

                    if (temp % 2 == 0) {
                        lyg++;
                    } else {
                        nelyg++;
                    }

                } else {
                    in.next();
                }
            }
            in.close();
            System.out.println("Sekoje yra "+ lyg + " lyginiai ir "+ nelyg + " nelyginiai skaiciai.");

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
