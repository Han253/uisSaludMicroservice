package uis.salud.userdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import uis.salud.userdata.entity.UserData;

public interface UserDataRepository extends JpaRepository<UserData,Long>{
    
}
