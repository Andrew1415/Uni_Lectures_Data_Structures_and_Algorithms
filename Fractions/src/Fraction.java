public class Fraction {
    int fullNum;
    int numerator;
    int denominator;

    public void setFullNum(int fullNum) {
        this.fullNum = fullNum;
        this.simplify();
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        this.simplify();
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
        this.simplify();
    }

    public int getFullNum() {
        return fullNum;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String toString() {
        if (fullNum==0) {
            return " " + numerator +
                    "/" + denominator;
        }
        else {
            return " " + fullNum +
                    " " + numerator +
                    "/" + denominator;
        }

    }

    public Fraction() {
        this.fullNum = 0;
        this.numerator = 0;
        this.denominator = 0;
    }

    public Fraction( int numerator, int denominator) {
        this.fullNum = 0;
        this.numerator = numerator;
        this.denominator = denominator;
        this.simplify();
    }

    public Fraction(int fullNum, int numerator, int denominator) {
        this.fullNum = fullNum;
        this.numerator = numerator;
        this.denominator = denominator;
        this.simplify();
    }

    /**
     * @param x fullNum to add to the fraction
     */
    public void add(int x){ this.fullNum+=x; this.simplify();}

    public void add(int x, int y){

        if(y==this.denominator){
            this.numerator+=x;
        }
        else {
            this.numerator=(this.numerator*y)+(x*this.denominator);
            this.denominator=this.denominator*y;

        }
        this.simplify();

    }
    public void add(int z, int x, int y){
        this.add(z);
        this.add(x,y);
    }
    public void add(Fraction fraction) {
        this.add(fraction.fullNum, fraction.numerator, fraction.denominator);
    }

    public double toDouble(){
        return this.fullNum +(double) Math.round((this.numerator / (double) this.denominator) * 100) / 100;
    }



    public void subtract (int x){ this.fullNum-=x;}

    public void subtract(int x, int  y){
        if(y==this.denominator){
            this.numerator-=x;
        }
        else {
            this.numerator=(this.numerator*y)-(x*this.denominator);
            this.denominator=this.denominator*y;
        }
        this.simplify();
    }

    public void subtract (int z, int x, int y){
        this.subtract(z);
        this.subtract(x,y);
    }

    public void subtract (Fraction fraction){
        this.subtract(fraction.fullNum, fraction.numerator, fraction.denominator);
    }

    public void multiply(int x, int y){
        this.numerator=(this.fullNum*this.denominator+this.numerator)*x;
        this.fullNum=0;
        this.denominator=this.denominator*y;
        this.simplify();
    }

    public void multiply (int x){
        this.multiply(x,1);
    }

    public void multiply(int z, int x, int y){
        x=z*y+x;
        this.multiply(x,y);
    }

    public void multiply(Fraction fraction){
        this.multiply((fraction.numerator+fraction.fullNum*fraction.denominator),fraction.denominator);
    }
    private void simplify(){
        if(this.numerator<0){
            while(this.numerator<0 && this.fullNum>0){
                this.numerator+=this.denominator;
                this.fullNum--;
            }
        }
        if(this.numerator>denominator)
        {
            this.fullNum+=this.numerator/this.denominator;
            this.numerator=this.numerator-(this.denominator*(this.numerator/this.denominator));
        }
        int temp=this.numerator;
        while(temp>0){
            if(this.numerator%temp==0 && this.denominator%temp==0) break;
            else temp--;
        }
        if(this.numerator%temp==0 && this.denominator%temp==0){
            this.numerator=this.numerator/temp;
            this.denominator=this.denominator/temp;
        }
    }
}
