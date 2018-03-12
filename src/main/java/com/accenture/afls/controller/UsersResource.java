package com.accenture.afls.controller;

import com.accenture.afls.data.entity.Users;
import com.accenture.afls.data.repositories.UsersRepository;
import com.accenture.afls.model.ResponseStatus;
import com.accenture.afls.util.ExportExcelUtil;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    @Qualifier("exportExcelUtil")
    private ExportExcelUtil exportExcelUtil;

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

    @GetMapping("/exportUsers")
    public HttpServletResponse exportUsers(HttpServletRequest request,
                                          HttpServletResponse response) {
        try{
            List<Users> userList = usersRepository.findAll();
            Workbook wb = exportExcelUtil.exportUsers(userList);
            response.setHeader("Content-disposition", "attachment; filename=Users.xls");
            wb.write( response.getOutputStream() );
        }catch (Exception e){
            e.printStackTrace();
        }
        return response;
    }
}
