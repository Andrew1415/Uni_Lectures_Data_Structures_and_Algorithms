/*
    Andrius Stulgys JNII21
    Fractions Classes
 */
public class Main {
    public static void main(String[] arg){
        //Fraction myObj=new Fraction(5,5,6);
        //System.out.println(myObj);
        Fraction myObj=new Fraction(5,6);
        Fraction myObj2=new Fraction(2,3,5);

        System.out.println("Addition:");
        System.out.println(myObj);
        myObj.add(7);
        System.out.println(myObj);
        myObj.add(1,3);
        System.out.println(myObj);
        myObj.add(1,15,12);
        System.out.println(myObj);
        myObj.add(myObj2);
        System.out.println(myObj);
        System.out.println(myObj.toDouble());

        System.out.println("Subtraction");
        myObj.subtract(1);
        System.out.println(myObj);
        myObj.subtract(1,2);
        System.out.println(myObj);
        myObj.subtract(1,2,5);
        System.out.println(myObj);
        myObj.subtract(myObj2);
        System.out.println(myObj);
        System.out.println(myObj.toDouble());

        System.out.println("Multiplication");
        myObj.multiply(1);
        System.out.println(myObj);
        myObj.multiply(1,2);
        System.out.println(myObj);
        myObj.multiply(1,2,5);
        System.out.println(myObj);
        myObj.multiply(myObj2);
        System.out.println(myObj);
        System.out.println(myObj.toDouble());

    }
}

