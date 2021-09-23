package com.example.projetojunin.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.projetojunin.R;
import com.example.projetojunin.ui.pacote.Pacote;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class PackagesAdapter extends BaseAdapter {

    private final List<Pacote> pacotes;
    private Context context;

    public PackagesAdapter(List<Pacote> pacotes, Context context){
        this.pacotes = pacotes;
        this.context = context;
    }


    @Override
    public int getCount() {
        return pacotes.size();
    }

    @Override
    public Pacote getItem(int position) {
        return pacotes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View createView = LayoutInflater.from(context).inflate(R.layout.package_item,parent, false);
        Pacote pacote = pacotes.get(position);

        ImageView catalogo = createView.findViewById(R.id.imagem_catalogo);
        catalogo.setImageResource(pacote.getImagem());
        //catalogo.setImageResource(catalogo.getId());
        //Resources resources = context.getResources();
        //int drawablePackage = resources.getIdentifier(pacote.getImagem(), "drawable", context.getPackageName());
        //Drawable imageDrawable = resources.getDrawable(drawablePackage);


        TextView nomeCamisa = createView.findViewById(R.id.tshirt_name);
        nomeCamisa.setText(pacote.getName());

        TextView price = createView.findViewById(R.id.tshirt_price);
        BigDecimal pricePackage = pacote.getPrice();
        NumberFormat brazilianPrice = DecimalFormat.getCurrencyInstance(new Locale("pt", "br"));
        String precoReal = brazilianPrice.format(pricePackage).replace("R$", "R$ ");
        price.setText(precoReal);

        TextView descricaoUm = createView.findViewById(R.id.product_description);
        descricaoUm.setText(pacote.getDescriptionOne());

        TextView descricaoDois = createView.findViewById(R.id.product_description_two);
        descricaoDois.setText(pacote.getDescripitonTwo());

        TextView descricaoTres = createView.findViewById(R.id.product_description_three);
        descricaoTres.setText(pacote.getDescriptionThree());

        return createView;
    }
}
