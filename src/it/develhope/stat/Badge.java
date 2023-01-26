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
}
