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
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View linha = LayoutInflater.from(contexto).inflate(R.layout.aluno, null);
        Aluno aluno = trazerlista.get(position);

        TextView nome = (TextView) linha.findViewById(R.id.textViewNome;
        TextView nota = (TextView) linha.findViewById(R.id.textViewNota);
        ImageView imagem = (ImageView) linha.findViewById(R.id.imageView);

        nome.setText(aluno.getnome());
        nota.setText(aluno.getNota() + "");

        if(aluno.getNota() < 6){
            imagem.setImageResource(R.drawable.vermelha);
        }
        else {
            imagem.setImageResource(R.drawable.azul);
        }

        return linha;
    }
}