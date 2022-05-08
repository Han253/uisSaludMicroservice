package uis.salud.userdata.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import uis.salud.userdata.dto.UserDataDetails;
import uis.salud.userdata.dto.UserDataForm;
import uis.salud.userdata.service.UserDataService;

@RestController
@RequestMapping("user")
public class UserDataController {

    @Autowired
    private UserDataService service;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public UserDataDetails create(@RequestBody @Valid UserDataForm data){        
        return service.create(data);
    }

    @GetMapping
    public List<UserDataDetails> list(){       
        return service.getAll();
    }
    
}
