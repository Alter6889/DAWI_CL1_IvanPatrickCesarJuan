package edu.pe.cibertec.controller;

import edu.pe.cibertec.model.LigaModel;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LigaController {

    public String inicioLiga(Model model) {
        model.addAttribute("LigaModel", new LigaModel());
        model.addAttribute ("mostrarMensaie",false);
        return "liga" ;
    }

    @PostMapping("/liga")
    public String calcularPuntaje(@ModelAttribute("ligaModel") LigaModel ligaModel, Model model){
        int pganados = ligaModel.getPganados()*3;
        int pempatados = ligaModel.getPempatados();
        int pperdidos = ligaModel.getPperdidos()*0;
        int ptotal = 0;
        model.addAttribute ("mostrarMensaie",false);
        model.addAttribute("resultado","Tiene " + ptotal + "puntos");
        return "liga";

    }

}
