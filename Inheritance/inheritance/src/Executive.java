public class Executive extends Employee{

    public double bonus=0;

    public Executive(String name, String surname, String phone, String socSecurityNumb, double salary) {
        super(name, surname, phone, socSecurityNumb, salary);
    }
    public Executive awardBonus(double bonus){this.bonus=bonus;return this;}

    @Override
    public double pay() {
        double bonus2=this.bonus;
        this.bonus=0;
        return salary+bonus2;
    }
}
