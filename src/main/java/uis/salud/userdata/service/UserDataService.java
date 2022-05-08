package uis.salud.userdata.service;

import java.util.List;

import uis.salud.userdata.dto.UserDataDetails;
import uis.salud.userdata.dto.UserDataForm;

public interface UserDataService {
    
    /**
     * Saves a new userdata data in database
     * 
     * @param formData userdata data to save
     */
    UserDataDetails create(UserDataForm formData);

    /**
     * 
     *Return all userdata 
     *@return {@link UserDataDetails}
    */
    List<UserDataDetails> getAll();

}
