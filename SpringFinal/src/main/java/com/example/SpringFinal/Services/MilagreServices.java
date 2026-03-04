package com.example.SpringFinal.Services;

import com.example.SpringFinal.Models.MilagreModel;
import com.example.SpringFinal.Repositories.MilagreRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class MilagreServices {

    @Autowired
    private MilagreRepositories milagreRepositories;

    public List<MilagreModel> findAll() {
            return milagreRepositories.findAll();
    }

    public MilagreModel criarMilagre(MilagreModel milagreModel) {
        return milagreRepositories.save(milagreModel);
    }

    public void deletarMilagre(Long id) {
        milagreRepositories.deleteById(id);
    }

    public Optional<MilagreModel> buscarId(Long id) {
        return milagreRepositories.findById(id);
    }

    public MilagreModel atualizarMilargre(Long id, MilagreModel milagreModel) {
        MilagreModel novoMilagre = milagreRepositories.save(milagreModel);

        milagreModel.setNome(novoMilagre.getNome());

        return milagreRepositories.save(milagreModel);
    }

}
