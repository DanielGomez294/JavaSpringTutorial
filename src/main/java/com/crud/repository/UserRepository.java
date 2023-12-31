
package com.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}