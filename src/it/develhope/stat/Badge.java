package it.develhope.stat;

public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber(){
        ++totalNumberOfEmployees;
    }

    private String generateBadgeIdCode(){
        return "XYZ"+employee.getName()+employee.getSurname()+"ZYX";
    }

    public void showBadgeDetails(){
        System.out.printf("The total number of employees is %d",totalNumberOfEmployees);
        System.out.printf("Employee details: %s", employee.getEmployeeDetails());
        System.out.printf("Badge Id code: %s", badgeIdCode);
    }
}
