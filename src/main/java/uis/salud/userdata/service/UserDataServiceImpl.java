package uis.salud.userdata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uis.salud.userdata.dto.UserDataDetails;
import uis.salud.userdata.dto.UserDataForm;
import uis.salud.userdata.entity.UserData;
import uis.salud.userdata.repository.UserDataRepository;

@Service
public class UserDataServiceImpl implements UserDataService{

    @Autowired
    private UserDataRepository repository;

    @Override
    public UserDataDetails create(UserDataForm formData) {
        
        UserData udata = formData.getEntity();
        System.out.println(udata.getGlucosa());
        UserDataDetails udata_detail = new UserDataDetails();
        udata_detail.setEntity(repository.save(udata));
        return udata_detail;        
    }

    @Override
    public List<UserDataDetails> getAll() {
        Iterable<UserData> list_udata = repository.findAll();
        List<UserDataDetails> list_details = new ArrayList<>();

        list_udata.forEach(udata ->{
            UserDataDetails detail = new UserDataDetails();
            detail.setEntity(udata);
            list_details.add(detail);
        });

        return list_details;
    }
    
}
