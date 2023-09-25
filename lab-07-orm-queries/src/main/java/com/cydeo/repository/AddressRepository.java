package com.cydeo.repository;

import com.cydeo.entity.Address;
import com.cydeo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
    //Write a derived query to get all address with a specific customer
    List<Address> findAllByCustomer(Customer customer);
    //List<Address> findByCustomerFirstName(String name);

    //Write a derived query to get address with a specific street
    Address findByStreet(String street);

    //Write a derived query to get top 3 address with a specific customer email
    List<Address> findTop3ByCustomerEmail(String email);

    //Write a derived query to get all address with a specific customer and name
    List<Address> findAllByCustomerAndName(Customer customer, String name);
    //List<Address> findByCustomerIdAndCustomerFirstName(Long id,String name);


    //Write a derived query to list all address where the beginning of the street contains the keyword
    List<Address> findByStreetStartingWith(String pattern);

    //Write a JPQL query to get all address with a specific customerId
    @Query("SELECT e FROM Address e WHERE e.customer.id = ?1")
    List<Address> retrieveAllAddressWithId(Long id);
}
