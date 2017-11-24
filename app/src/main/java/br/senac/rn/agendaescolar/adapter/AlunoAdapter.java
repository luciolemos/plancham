package br.senac.rn.agendaescolar.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.senac.rn.agendaescolar.models.Aluno;
import br.senac.rn.agendaescolar.views.R;

/**
 * Created by a9231701 on 22/11/2017.
 */

public class AlunoAdapter extends BaseAdapter {
    private List<Aluno> alunos;
    private Context context;

    public AlunoAdapter(Context context,List<Aluno> alunos) {
        this.alunos = alunos;
        this.context=context;
    }
        @Override
        public int getCount () {
            return this.alunos.size();
        }

        @Override
        public Object getItem ( int posicao){
            return this.alunos.get(posicao);
        }

        @Override
        public long getItemId ( int posicao){
            return this.alunos.get(posicao).getId();
        }

        @Override
        public View getView ( int posicao, View view, ViewGroup parent){
            LayoutInflater inflater=LayoutInflater.from(context);
            View moldura = inflater.inflate(R.layout.item_lista, null);

            TextView campoNome=(TextView) moldura.findViewById(R.id.lista_nome);
            TextView campoEndereco=(TextView) moldura.findViewById(R.id.lista_endereco);
            TextView campoFone=(TextView) moldura.findViewById(R.id.lista_fone);
            TextView campoSite=(TextView) moldura.findViewById(R.id.lista_site);
            TextView campoNota=(TextView) moldura.findViewById(R.id.lista_nota);

            Aluno aluno=(Aluno) getItem(posicao);

            campoNome.setText(aluno.getNome());
            campoEndereco.setText(aluno.getEndereco());
            campoFone.setText(aluno.getFone());
            campoSite.setText(aluno.getSite());
            campoNota.setText(aluno.getNota().toString());

            return moldura;
        }
    }

