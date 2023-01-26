package it.develhope.stat;
public class Badge {
    private static int totalNumberOfEmployees;
    private final String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber(){
        ++totalNumberOfEmployees;
    }

    private String generateBadgeIdCode(){
        return "XYZ"+employee.getName()+employee.getSurname()+"ZYX";
    }

    public Badge(Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        badgeIdCode = generateBadgeIdCode();
    }

    public void showBadgeDetails(){
        System.out.printf("The total number of employees is %d %n",totalNumberOfEmployees);
        System.out.printf("Employee details: %s %n", employee.getEmployeeDetails());
        System.out.printf("Badge Id code: %s %n", badgeIdCode);
    }
}
