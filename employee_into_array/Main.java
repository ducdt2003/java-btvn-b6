package employee_into_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        array(sc);
    }
    public static void array(Scanner sc){
        System.out.println(" Nhập số phần tử của mảng ");
        int element = Integer.parseInt(sc.nextLine());
        Employee [] arr = new Employee[element];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" phần tử thứ nhất " + (i + 1));
            System.out.println("-----------");
            System.out.println(" Nhập id ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println(" Nhập tên ");
            String name = sc.nextLine();
            System.out.println(" Nhập tuổi ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println(" nhập exp ");
            double experience = Double.parseDouble(sc.nextLine());
            Employee employee = new Employee();
            employee.setId(id);
            employee.setName(name);
            employee.setAge(age);
            employee.setExperience(experience);
            System.out.println(employee);
            arr[i] = employee;
        }
        System.out.println("Các Thông tin nhập vào là ");
       /* for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println("\n-------");
        }*/
        for ( Employee employee : arr) {
            System.out.println(employee);
            System.out.println("\n-------");
        }
    }
}
