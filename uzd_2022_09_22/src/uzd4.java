import java.util.Scanner;
public class uzd4 {
    public static void main(String[] args){
        System.out.println("Armstrongo skaiciai intervale nuo 1 iki:");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("Armstrongo skaiciai:");
        for (int i=1;i<=n;i++)
        {
            int temp=i;
            int sum=0;
            int length = String.valueOf(i).length();
            while(temp>0){
                sum=sum+((int) Math.pow(temp%10,length));
                temp=temp/10;
            }
            if (i==sum) {
                System.out.println(sum + " Yra armstrongo skaicius.");
            }

        }
    }
}
