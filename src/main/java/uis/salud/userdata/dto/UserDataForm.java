package uis.salud.userdata.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import uis.salud.userdata.entity.UserData;

@Data
@NoArgsConstructor
public class UserDataForm {
    
    private Float glucosa;

    private Float perimetro;

    private Float peso;

    private Integer presionarterialdiastolica;

    private Integer presionarterialsistolica;

    @NotNull(message = "Paciente no puede ser Nulo.")
    private Long paciente;

    public UserData getEntity(){
        UserData udata = new UserData();
        setEntity(udata);
        return udata;
    }

    public void setEntity(UserData udata){
        udata.setGlucosa(glucosa);
        udata.setPerimetro(perimetro);
        udata.setPeso(peso);
        udata.setPresionarterialdiastolica(presionarterialdiastolica);
        udata.setPresionarterialsistolica(presionarterialsistolica);
        udata.setPaciente(paciente);
    }

}
