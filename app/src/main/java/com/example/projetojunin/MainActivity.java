package com.example.projetojunin;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projetojunin.ui.PackagesAdapter;
import com.example.projetojunin.ui.pacote.Pacote;

import java.math.BigDecimal;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("JM Sports");

        ListView catalogoCamisa = findViewById(R.id.recyclerview_jmsport);

        List<Pacote> pacots = new PackageDAO().list();

        catalogoCamisa.setAdapter(new PackagesAdapter(pacots, this));


    }
}