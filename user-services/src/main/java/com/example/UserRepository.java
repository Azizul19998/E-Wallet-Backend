package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    //define all the function in such a manne
    User findByUserName(String userName);

    List<User> findAllByUserNameAndAge(String userName, int age);

    boolean existsByUserName(String userName);


}
