package discountstrategy;

/**
 *
 * @author Lane Schultz
 */
public class FakeDatabase implements DatabaseStrategy{
     private Customer[] customers = {
        new Customer("Herpicus", "Mcderpington", "1010"),
        new Customer("John", "Hammond", "4231"),
        new Customer("Sarah", "Connor", "1111")
    };
    
    private Product[] products = {
        new Product("P0011", "Duck Cap", 12.99),
        new Product("P0002", "Beer Shirt", 26.20),
        new Product("P0340", "Cooler", 40.23),
        new Product("P0341", "Parisole", 15.00)
    };

    
    
     @Override
    public Customer getCustomers(String customerID) {
        Customer customer = null;
        for (Customer sc : customers) {
            if (sc.getCustomerID().equals(customerID)) {
                customer = sc;
            } else {
            }
        }
         return customer;
    }



     @Override
    public Product getProduct(String productId) {
        Product product = null;
        for (Product p : products) {
            if (productId.equals(p.getProductID())) {
                product = p;
            }
        }
        return product;
    }

    
}
