package designpattern_and_principles;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        // Simulating a database lookup
        return "Customer ID " + id;
    }
}