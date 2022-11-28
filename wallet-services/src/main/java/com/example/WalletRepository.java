package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<Wallet,Integer> {
   // Wallet findByUserName();

    //Wallet findByUserName(String userName);

//    @Query(value = "select * from wallets where user_name = :username", nativeQuery = true)
//    Wallet findByUserName( String username);
    @Query("select w from Wallet w where w.userName = :username")
    Wallet findByUserName( String username);

//    @Modifying
//    @Query("select wallet w from wallets set w.amount = w.amount + :amount where w.userName = :userName")
//    int updateWallet(String userName, int amount);


}
