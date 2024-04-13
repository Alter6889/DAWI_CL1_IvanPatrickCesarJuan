package edu.pe.cibertec.controller;

import edu.pe.cibertec.model.NumeroModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class NumeroController {

    @GetMapping("/numero")
public String inicioNumero(Model model){
    model.addAttribute("numModel", new NumeroModel());
    model.addAttribute("mostrarMensaje",false);
    return "numero";

}
public String calcularNumero(@ModelAttribute("numModel") NumeroModel numeroModel, Model model){
        int n1= numeroModel.getN1();
        int n2= numeroModel.getN2();
        int n3= numeroModel.getN3();
        int n4= numeroModel.getN4();
        String resultado="";
        if(n1 != n2 && n1 != n3 && n1 !=n4 && n2 != n3 && n2 != n4 && n3 != n4){
            if(n1>n2){
            if(n1>n3){
            if(n1>n4){
            resultado= "El numero mayor es:  "+n1;}
            }
            }
        }
}

}
