package it.develhope.stat;

public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber(){
        ++totalNumberOfEmployees;
    }
}
