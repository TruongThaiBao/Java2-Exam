import java.beans.Customizer;

public class Customer extends Person implements Comparable<Customer> {
    private String companyName;
    private double invoiceValue;

    public Customer() {
        //Constructor mặc định
    }

    public Customer(String name, String address, String companyName, double invoiceValue) {
        super(name, address);
        this.companyName = companyName;
        this.invoiceValue = invoiceValue;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setInvoiceValue(double invoiceValue) {
        this.invoiceValue = invoiceValue;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getInvoiceValue() {
        return invoiceValue;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTên công ty : " + companyName + '\'' +
                "\nGiá trị hoá đơn : " + invoiceValue;
    }

    @Override
    public int compareTo(Customer o) {
        return this.getName().compareTo(o.getName());
    }
}
