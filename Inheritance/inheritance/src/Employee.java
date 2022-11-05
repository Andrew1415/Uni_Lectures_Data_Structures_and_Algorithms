public class Employee extends StaffMember{

    public String socSecurityNumb;
    public double salary;

    public Employee(String name, String surname, String phone, String socSecurityNumb, double salary) {
        super(name, surname, phone);
        this.socSecurityNumb = socSecurityNumb;
        this.salary = salary;
    }

    public Employee() {
    }

    @Override
    public double pay() {
        return this.salary;
    }
}
