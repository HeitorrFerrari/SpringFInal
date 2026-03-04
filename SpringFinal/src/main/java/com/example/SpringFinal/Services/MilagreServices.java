package com.example.SpringFinal.Services;

import com.example.SpringFinal.Models.MilagreModel;
import com.example.SpringFinal.Repositories.MilagreRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;

@Service

public class MilagreServices {

    @Autowired
    private MilagreRepositories milagreRepositories;

    public List<MilagreModel> findAll(MilagreModel milagreModel) {
            return milagreRepositories.findAll();
    }

    public MilagreModel criarMilagre(MilagreModel milagreModel) {
        return milagreRepositories.save(milagreModel);
    }

    public void deletarMilagre(Long id) {
        milagreRepositories.deleteById(id);
    }

}
