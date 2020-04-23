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

    //todo add method called addEmployee to add employee to the list employees for dev1

    //todo add method called removeLastEmployee to remove last employee in the list employees for dev2



    public void printEmployees(){
        //todo print employee number for dev1
        for (int i = 0; i < employees.size(); i++) {
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
