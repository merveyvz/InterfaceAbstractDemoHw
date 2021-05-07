import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.StarbucksCustomerManager;
import entities.Customer;
import java.time.LocalDate;



public class Main {

    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        
        Customer customer1 = new Customer("Demiroð", "Engin", LocalDate.of(1985,1,6) , "28861499108");
        
        customerManager.save(customer1);
                
        System.out.println();

    }
}