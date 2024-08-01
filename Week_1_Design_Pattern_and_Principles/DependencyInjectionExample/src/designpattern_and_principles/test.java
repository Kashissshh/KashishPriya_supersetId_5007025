package designpattern_and_principles;

public class test {
	public static void main(String[] args) {
       
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        CustomerService customerService = new CustomerService(customerRepository);

        String customerName = customerService.getCustomerName(1);
        System.out.println(customerName);  
    }
}
