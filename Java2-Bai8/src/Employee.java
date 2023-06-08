public class Employee extends Person implements Comparable<Employee> {
    private double baseSalary;
    private double salaryCoefficient;

    public Employee() {
        //Constructor mặc định
    }

    public Employee(String name, String address, double luongCanBan, float heSoLuong) {
        super(name, address);
        this.baseSalary = luongCanBan;
        this.salaryCoefficient = heSoLuong;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setSalaryCoefficient(float heSoLuong) {
        this.salaryCoefficient = heSoLuong;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    //Tính lương
    public double calcSalary(){
        return baseSalary*salaryCoefficient;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLương căn bản : " + baseSalary +
                "\nHệ số lương : " + salaryCoefficient +
                "\nLương : " + calcSalary() +
                "\n--------------------------";
    }

    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }
}
