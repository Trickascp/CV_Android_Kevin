package com.example.cvkevin;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ModulView> {

    private ArrayList<Modul> listmodul;

    public RecyclerAdapter(ArrayList<Modul> list){
        this.listmodul = list;
    }

    @NonNull
    @Override
    public ModulView onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_modul, viewGroup, false);
        return new ModulView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ModulView modulView, int i) {

        final Modul modul = listmodul.get(i);

        modulView.tit.setText(modul.getJudul());
        modulView.det.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(modulView.itemView.getContext(), DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_TITLE, modul.getJudul());
                intent.putExtra(DetailActivity.EXTRA_DESC, modul.getDeskripsi());
                modulView.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listmodul.size();
    }

    public class ModulView extends RecyclerView.ViewHolder {

        private TextView tit;
        private CardView det;

        public ModulView(@NonNull View itemView) {
            super(itemView);

            tit = itemView.findViewById(R.id.title_modul);
            det = itemView.findViewById(R.id.det_modul);

        }
    }
}
