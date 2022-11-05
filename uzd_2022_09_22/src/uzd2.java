import java.util.Scanner;
public class uzd2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Tikrinami metai: ");
        int metai=in.nextInt();
        if(metai%4==0)
        {
            System.out.println(metai + " yra olimpiniai metai.");
            metai-=1896;
            metai+=4;
            metai=metai/4;
            System.out.println("Olimpiniu zeidiniu numeris: " + metai);

        }
        else {
            System.out.println(metai + " Nera olimpiniai metai.");
        }
    }
}

//    Užduotis (Sąliginiai sakiniai: if)
//    Pirmosios vasaros olimpinės žaidynės įvyko 1896 m. Atėnuose.
//    Po to jos vyko arba turėjo vykti kas ketveri metai,
//    t.y. 1900 m. – antrosios, 1904 m. – trečiosios ir t.t.
//    Neįvykusioms žaidynėms skiriamas eilės numeris, o jų metai vis tiek laikomi olimpiniais.
//    Žinomi metai M. Nustatykite olimpinių žaidimų numerį, jei metai yra olimpiniai arba pasakykite,
//    kad metai ne olimpiniai. Programa turi paprašyti įvesti metus,
//    ir išvesti ar tai buvo olimpiniai metai ar ne,
//    jei tai buvo olimpiniai metai programa turi taip pat išvesti ir numerį.
