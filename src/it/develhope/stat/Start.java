package it.develhope.stat;

public class Start {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Luca", "Rossi", "Via Nino Bixio");
        Employee employee2 = new Employee("Giulia", "Contarino", "Via Giuseppe Gribaldi");

        Badge employee1Badge = new Badge(employee1);
        Badge employee2Badge = new Badge(employee2);
    }
}
