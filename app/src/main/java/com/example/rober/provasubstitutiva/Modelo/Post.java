package com.example.rober.provasubstitutiva.Modelo;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rober.provasubstitutiva.R;

import java.util.List;

public class Post extends BaseAdapter {

    Context contexto;
    List<Aluno> trazerlista;

    public Post(Context contexto, List<Aluno> lista) {
        this.contexto = contexto;
        this.trazerlista = trazerlista;
    }

    @Override
    public int getCount() {
        return trazerlista.size();
    }

    @Override
    public Object getItem(int position) {
        return trazerlista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    /* view da imagem layout das notas */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View linha = LayoutInflater.from(contexto).inflate(R.layout.layout_nota);
        Aluno aluno = trazerlista.get(position);

        /*apontado para as ids dos campos construindos*/
        TextView nome = (TextView) linha.findViewById(R.id.textViewNome;
        TextView nota = (TextView) linha.findViewById(R.id.textViewNota);
        ImageView imagem = (ImageView) linha.findViewById(R.id.imageView);

        /*setanto os dois campos para retornar dados*/
        nome.setText(aluno.getnome());
        nota.setText(aluno.getNota() + "");

        /*regra para imagem aparecer azul ou vermelho*/
        if(aluno.getNota() > 6){
            imagem.setImageResource(R.drawable.azul);
        }
        else {
            imagem.setImageResource(R.drawable.vermelho);
        }
        return linha;
    }
}



