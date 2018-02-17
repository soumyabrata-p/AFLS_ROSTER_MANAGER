package com.accenture.afls.controller;

import com.accenture.afls.data.entity.Users;
import com.accenture.afls.data.repositories.UsersRepository;
import com.accenture.afls.model.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    @Autowired
    private UsersRepository usersRepository;

    @PostMapping("/create")
    public ResponseStatus createUser(Users users) {
        try{
            usersRepository.save(new Users("s.purakayastha","accenture123","SSE","SuperUser"));
        }catch (Exception e){
            e.printStackTrace();
        }

        ResponseStatus status = new ResponseStatus("Success");
        status.setStatus("Success");

        return status;
    }
}
