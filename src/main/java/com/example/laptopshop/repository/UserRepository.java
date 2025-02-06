package com.example.laptopshop.repository;

import com.example.laptopshop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User doduy);
    List<User> findByEmail(String email);
    List<User> findByEmailAndAddress(String email,String address);
    List<User> findByid(long id);

}
