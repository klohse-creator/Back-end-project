package com.example.demo.bootstrap;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entity.Customer;
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

        Customer kali = new Customer();
        kali.setId(1L);
        kali.setFirstName("Kali");
        kali.setLastName("Lohse");
        kali.setAddress("123 Hollister");
        kali.setPostal_code("48067");
        kali.setPhone("4064801996");
        kali.setDivision(divisionRepository.getReferenceById(20L));

        if (!customerRepository.existsById(1L)) {
            customerRepository.save(kali);
        }

        Customer becca = new Customer();
        becca.setId(2L);
        becca.setFirstName("Becca");
        becca.setLastName("Smith");
        becca.setAddress("555 Hollywood Blvd");
        becca.setPostal_code("90210");
        becca.setPhone("5862228670");
        becca.setDivision(divisionRepository.getReferenceById(5L));

        if (!customerRepository.existsById(2L)) {
            customerRepository.save(becca);
        }

        Customer reese = new Customer();
        reese.setId(3L);
        reese.setFirstName("Reese");
        reese.setLastName("Talton");
        reese.setAddress("451 Thompson St");
        reese.setPostal_code("48069");
        reese.setPhone("5553452121");
        reese.setDivision(divisionRepository.getReferenceById(6L));

        if (!customerRepository.existsById(3L)) {
            customerRepository.save(reese);
        }

        Customer nola = new Customer();
        nola.setId(4L);
        nola.setFirstName("Nola");
        nola.setLastName("Gentry");
        nola.setAddress("2111 Woodson Drive");
        nola.setPostal_code("59102");
        nola.setPhone("5555555555");
        nola.setDivision(divisionRepository.getReferenceById(10L));

        if (!customerRepository.existsById(4L)) {
            customerRepository.save(nola);
        }

        Customer jenna = new Customer();
        jenna.setId(5L);
        jenna.setFirstName("Jenna");
        jenna.setLastName("Lechner");
        jenna.setAddress("457 Great Street");
        jenna.setPostal_code("44321");
        jenna.setPhone("3210001021");
        jenna.setDivision(divisionRepository.getReferenceById(12L));

        if (!customerRepository.existsById(5L)) {
            customerRepository.save(jenna);
        }





    }
}
