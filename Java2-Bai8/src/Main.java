import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Van A","HCM",5,7);
        Employee employee1 = new Employee("Thi B", "HN", 2000,1.5F);
        Customer customer1 = new Customer("Van C", "DN", "Cty XXX", 7000);

//        System.out.println(student1);
//        System.out.println(employee1);
//        System.out.println(customer1);
        int n = 5;

        Management management = new Management(n);
        management.addStudent(student1);
        management.addEmployee(employee1);
        management.addCustomer(customer1);

        System.out.println("Trước khi xoá");
        management.printAllPerson();

        // Lấy tổng số người hiện tại
        int totalCount = management.getTotalPerson();
        System.out.println("Total count: " + totalCount);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên cần xoá : ");
        String removeName = scanner.nextLine();
        management.removePersonByName(removeName);

        System.out.println("\nSau khi xoá");
        management.printAllPerson();
        int totalCountAfter= management.getTotalPerson();
        System.out.println("Total count: " + totalCountAfter);

//        management.sortPersonByName();
//        management.printAllPerson();
    }
}