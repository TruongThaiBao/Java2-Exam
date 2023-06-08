import java.lang.reflect.Array;
import java.util.*;

public class Management {
    private List<Student> students;
    private List<Employee> employees;
    private List<Customer> customers;

    public Management() {
        //Constructor mặc định
        students = new ArrayList<>();
        employees = new ArrayList<>();
        customers = new ArrayList<>();
    }
    public Management(int n){
        students = new ArrayList<>(n);
        employees = new ArrayList<>(n);
        customers = new ArrayList<>(n);
    }

    public Management(List<Student> students, List<Employee> employees, List<Customer> customers) {
        this.students = students;
        this.employees = employees;
        this.customers = customers;
    }

    //Thêm Student
    public void addStudent(Student student){
        students.add(student);
    }
    //Thêm Employee
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    //Thêm Customer
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    //Tính tổng số người có trong danh sách
    public int getTotalPerson(){
        return students.size() + employees.size()+customers.size();
    }
    //Xoá Person theo thên
    public void removePersonByName(String name){
        //Kiểm tra và xoá Student
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()){
            Student student = studentIterator.next();
            if (student.getName().equals(name)){
                studentIterator.remove();
                return;
            }
        }
        //Employee
        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            if (employee.getName().equals(name)){
                employeeIterator.remove();
                return;
            }
        }
        //Customer
        Iterator<Customer> customerIterator = customers.iterator();
        while (customerIterator.hasNext()){
            Customer customer = customerIterator.next();
            if (customer.getName().equals(name)){
                customerIterator.remove();
                return;
            }
        }

        System.out.println("Không tìm thấy tên " + name + " cần xoá");
    }
    //In ra tất cả Person có trong list Management
    public void printAllPerson(){
        for (Student student : students){
            System.out.println(student.toString());
        }
        for (Employee employee : employees){
            System.out.println(employee.toString());
        }
        for (Customer customer : customers){
            System.out.println(customer.toString());
        }
    }
    
    //Sắp xếp lại danh sách theo tên
    public void sortPersonByName(){
        Collections.sort(students);
        Collections.sort(employees);
        Collections.sort(customers);
    }
}
