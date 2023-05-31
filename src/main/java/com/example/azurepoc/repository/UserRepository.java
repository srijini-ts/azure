package com.example.azurepoc.repository;

import com.example.azurepoc.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
