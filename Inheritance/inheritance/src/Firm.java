public class Firm {
    public static Staff createFirm(){
        Staff staff=new Staff();
        staff.addStaffMember(new Employee("Homer","Simpson","+37064123456","321",444));
        staff.addStaffMember(new Employee("Marge","Simpson","+37064123456","321",541));
        staff.addStaffMember(new Trainee("Maggie","Simpson","+37064123456"));
        staff.addStaffMember(new Executive("Abe","Simpson","+37064123456","321",1500).awardBonus(150));
        staff.addStaffMember(new Hourly("Lisa","Simpson","+37064123456","321",0).addHours(10));
        staff.addStaffMember(new Hourly("Bart","Simpson","+37064123456","321",0).addHours(20));
        return staff;
    }

}
