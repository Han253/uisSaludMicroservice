package uis.salud.userdata.dto;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;
import uis.salud.userdata.entity.UserData;

@Data
@NoArgsConstructor
public class UserDataDetails {

    private Long id;
    private Date fecharegistro;
    private Float glucosa;
    private Float perimetro;
    private Float peso;
    private Integer presionarterialdiastolica;
    private Integer presionarterialsistolica;
    private Long paciente;

    public void setEntity(UserData udata){
        id = udata.getId();
        fecharegistro = udata.getFecharegistro();
        glucosa = udata.getGlucosa();
        perimetro = udata.getPerimetro();
        peso = udata.getPeso();
        presionarterialdiastolica = udata.getPresionarterialdiastolica();
        presionarterialsistolica = udata.getPresionarterialsistolica();
        paciente = udata.getPaciente();
    }
    
}
