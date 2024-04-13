package edu.pe.cibertec.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import edu.pe.cibertec.model.Trabajador;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    public String inicioTrabajador(Model model) {
        model.addAttribute("Trabajador", new Trabajador());
        model.addAttribute("mostrarMensaie", false);
        return "trabajador";
    }

    @PostMapping
    public String calculutil(@ModelAttribute("Trabajador")Trabajador trabajador, Model model){
        if (trabajador.getTiempotrabajador()<1)
            return 0.05*trabajador.getSalariotrabajador()
            else if (trabajador.getTiempotrabajador()<2)
                return 0.07*trabajador.getSalariotrabajador()
                        else if (trabajador.getTiempotrabajador()<5)
                            return 0.10*trabajador.getSalariotrabajador()
                            else if (trabajador.getTiempotrabajador()<10)
                                return 0.15*trabajador.getTiempotrabajador()
                                else
                                    return 0.20*trabajador.getTiempotrabajador()
    }
}