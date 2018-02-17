package com.accenture.afls.data.repositories;

import com.accenture.afls.data.entity.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;


public interface UsersRepository extends MongoRepository<Users,String> {

}
