package com.example.demo.bootstrap;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Division;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;



    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Customer Kali = new Customer("Kali", "Lohse", "123 Hollister",
                "48067", "4064801996", "US");
        Division Michigan = new Division("Michigan");
        Kali.getDivision().add(Michigan);
        Michigan.getCustomers().add(Kali);

        customerRepository.save(Kali);
        divisionRepository.save(Michigan);

        Customer Becca = new Customer("Becca", "Smith", "555 Hollywood Blvd",
                "90210", "5862228670", "US");
        Division California = new Division("California");
        Becca.getDivision().add(California);
        California.getCustomers().add(Becca);

        customerRepository.save(Becca);
        divisionRepository.save(California);

        Customer Kraig = new Customer("Kraig", "Lohse", "123 Hollister",
                "48067", "5553452121", "US");
        Division Vermont = new Division("Vermont");
        Kraig.getDivision().add(Vermont);
        Vermont.getCustomers().add(Kraig);

        customerRepository.save(Kraig);
        divisionRepository.save(Vermont);

        Customer Nola = new Customer("Nola", "Gentry", "2111 Woodson Drive",
                "59102", "3459991001", "US");
        Division Montana = new Division("Montana");
        Nola.getDivision().add(Montana);
        Montana.getCustomers().add(Nola);

        customerRepository.save(Nola);
        divisionRepository.save(Montana);

        Customer Jenna = new Customer("Jenna", "Lechner", "457 Great Street",
                "44321", "3210001021", "US");
        Division Oregon = new Division("Oregon");
        Jenna.getDivision().add(Oregon);
        Oregon.getCustomers().add(Jenna);

        customerRepository.save(Jenna);
        divisionRepository.save(Oregon);




    }
}
