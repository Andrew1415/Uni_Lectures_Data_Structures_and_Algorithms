public class Hourly extends Employee{

    public int hoursWorked=0;
    protected double rate=4.47;

    public Hourly(String name, String surname, String phone, String socSecurityNumb, double salary) {
        super(name, surname, phone, socSecurityNumb, salary);
    }

    public Hourly addHours(int hoursWorked){this.hoursWorked=hoursWorked;return this;}
    @Override
    public double pay() {
        double pay=rate*hoursWorked;
        hoursWorked=0;
        return pay;
    }
}
