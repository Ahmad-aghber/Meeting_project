import java.util.ArrayList;
import java.util.Date;

public class Meeting {
    private ArrayList<Employee> employees ;
    private Date dateOfMeeting;

    public Meeting(Date dateOfMeeting){
        if(dateOfMeeting == null)
            throw new IllegalArgumentException();
        employees = new ArrayList<>();
        this.dateOfMeeting = dateOfMeeting;
    }

    public void addEmployee(Employee employee){
        if(employee == null)
            throw new IllegalArgumentException();
        employees.add(employee);
    }


    public void removeLastEmployee(){
        if(employees.size() <= 0)
            throw new IllegalStateException();
        employees.remove(employees.size() - 1);
    }


    public void printEmployees(){
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Employee number : " + i);
            System.out.println(employees.get(i));
        }
    }
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public Date getDateOfMeeting() {
        return dateOfMeeting;
    }

    public void setDateOfMeeting(Date dateOfMeeting) {
        this.dateOfMeeting = dateOfMeeting;
    }
}
