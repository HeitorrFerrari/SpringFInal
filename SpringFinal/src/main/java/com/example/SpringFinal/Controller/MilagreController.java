package com.example.SpringFinal.Controller;


import com.example.SpringFinal.Models.MilagreModel;
import com.example.SpringFinal.Services.MilagreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/milagre")

public class MilagreController {

    @Autowired
    private MilagreServices milagreServices;

    @PostMapping
    public MilagreModel criarMilagre(@RequestBody MilagreModel milagreModel) {
        return milagreServices.criarMilagre(milagreModel);
    }

    @GetMapping
    public List<MilagreModel> buscarMilagre(){
        return milagreServices.findAll();
    }

    @DeleteMapping ("{id}")
    public void deletarMilagre(@PathVariable Long id) {
        milagreServices.deletarMilagre(id);
    }

    @PostMapping("{id}")
    public Optional <MilagreModel> buscarMilagreId(@PathVariable Long id) {
        return milagreServices.buscarId(id);
    }

}
