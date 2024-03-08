package src.Test;

public class Main {
    public static void main(String[] args) {
        MyArrayList employees = getEmployees();
        employees.add("James");
        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }
    }

    private static MyArrayList getEmployees() {
        MyArrayList employees = new MyArrayList();
        employees.add("John");
        employees.add("Dan");
        employees.add("George");
        employees.add("Max");
        employees.add("Kate");
        return employees;
    }
}
