package com.cydeo.repository;


import com.cydeo.entity.Balance;
import com.cydeo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface BalanceRepository extends JpaRepository<Balance,Long> {
    //Write a derived query to check balance exists for specific customer
    boolean existsByCustomerId(Long id);
    boolean existsBalanceByCustomer(Customer customer);

    //Write a derived query to get balance for specific customer
    Balance findByCustomerId(Long id);
    //Write a native query to get top 5 max balance
    @Query(value = "SELECT * FROM Balance ORDER BY amount DESC LIMIT 5", nativeQuery = true)
    List<Balance> retrieveTop5ByOrderByAmountDesc();
    //Write a derived query to get all balances greater than or equal specific balance amount
    List<Balance> findByAmountGreaterThanEqual(BigDecimal amount);
    //Write a native query to get all balances less than specific balance amount
    @Query(value = "SELECT * FROM Balance WHERE amount < ?1", nativeQuery = true)
    List<Balance> retrieveToLessThan(BigDecimal amount);
}
