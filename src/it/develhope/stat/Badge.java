package it.develhope.stat;

import java.util.Random;
import java.util.UUID;

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

    public Badge(Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        Random random = new Random();
        badgeIdCode = Integer.toString(random.nextInt(1000,2000));
    }
}
