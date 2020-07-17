package com.kodilla.hibernate.invoice.repository;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceRepositoryTestSuite {

    @Autowired
    InvoiceRepository invoiceRepository;

    @Test
    public void testInvoiceRepositorySave() {
        // given
        Product product1 = new Product("Product1");
        Product product2 = new Product("Product2");
        Item item1 = new Item(new BigDecimal("12"), 2, new BigDecimal("24"), product1);
        Item item2 = new Item(new BigDecimal("3"), 3, new BigDecimal("9"), product2);
        Invoice invoice = new Invoice("3", Arrays.asList(item1,item2));

        //When
        invoiceRepository.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceRepository.deleteById(id);


    }
}
