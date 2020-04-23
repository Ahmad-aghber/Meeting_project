import java.util.Calendar;
import java.util.Date;

public class test {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee("Ahmad" , "Jordanian");
        Employee secondEmployee = new Employee("Mohammed" , "Jordanian");
        Employee thirdEmployee = new Employee("Khaled" , "Jordanian");
        Employee fourthEmployee = new Employee("Isa" , "Jordanian");

        Meeting meeting = new Meeting(new Date(2020, Calendar.JANUARY,3));
        meeting.addEmployee(firstEmployee);
        meeting.addEmployee(secondEmployee);
        meeting.addEmployee(thirdEmployee);
        meeting.addEmployee(fourthEmployee);
        meeting.removeLastEmployee();
        meeting.printEmployees();
    }
}
