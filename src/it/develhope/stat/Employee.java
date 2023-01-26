package it.develhope.stat;

public class Employee {
    private final String name;
    private final String surname;
    private final String address;

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }

    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress){
        this.name = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }

    public String getEmployeeDetails(){
        return name + " - " + surname + " - " + address;
    }
}
