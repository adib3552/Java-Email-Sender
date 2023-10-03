package com.EmailAuthentication.Repository;

import com.EmailAuthentication.Entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

}
