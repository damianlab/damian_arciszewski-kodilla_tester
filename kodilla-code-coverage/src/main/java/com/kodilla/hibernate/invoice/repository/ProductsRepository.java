package com.kodilla.hibernate.invoice.repository;

import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface ProductsRepository extends CrudRepository<Product, Integer> {
}
