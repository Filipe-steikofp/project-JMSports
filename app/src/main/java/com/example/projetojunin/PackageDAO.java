package com.example.projetojunin;

import com.example.projetojunin.ui.pacote.Pacote;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PackageDAO {
    private static ArrayList<Pacote> pacote;

    public List<Pacote> full(){return (List<Pacote>)pacote.clone();}

    public void insere(Pacote pacote) {
        PackageDAO.pacote.addAll(Arrays.asList(pacote));
    }

    public List<Pacote> list() {
        List<Pacote> pacotes = new ArrayList<>(Arrays.asList(
                new Pacote(R.drawable.malmo_drawable, "Camisa Malmo 2021", new BigDecimal(299.90), "- Dry cooling", "- Silk de alta tecnologia", "- Ajustável ao corpo"),
                new Pacote(R.drawable.alajuelens_2021, "Camisa Alajuelense 2021", new BigDecimal(299.90), "- Dry cooling", "- Silk de alta tecnologia", "- Ajustável ao corpo"),
                new Pacote(R.drawable.cluj_2021, "Camisa Cluj 2021", new BigDecimal(299.90), "- Dry cooling", "- Silk de alta tecnologia", "- Ajustável ao corpo"),
                new Pacote(R.drawable.djurgardens_2021, "Camisa Djurgardens 2021", new BigDecimal(299.90), "- Dry cooling", "- Silk de alta tecnologia", "- Ajustável ao corpo"),
                new Pacote(R.drawable.kashima_2021, "Camisa Kashima Antlers 2021", new BigDecimal(299.90), "- Dry cooling", "- Silk de alta tecnologia", "- Ajustável ao corpo"),
                new Pacote(R.drawable.salzburg_2021, "Camisa Red Bull Salzbrug 2021", new BigDecimal(299.90), "- Dry cooling", "- Silk de alta tecnologia", "- Ajustável ao corpo"),
                new Pacote(R.drawable.sassuolo_2021, "Camisa Sassuolo 2021", new BigDecimal(299.90), "- Dry cooling", "- Silk de alta tecnologia", "- Ajustável ao corpo"),
                new Pacote(R.drawable.young_2021, "Camisa Young Boys 2021", new BigDecimal(299.90), "- Dry cooling", "- Silk de alta tecnologia", "- Ajustável ao corpo")
        ));
        return pacotes;
    }
}
