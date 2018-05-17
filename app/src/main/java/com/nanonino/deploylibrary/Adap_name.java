package com.nanonino.deploylibrary;

import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by nnandroid04user on 17/5/18.
 */

public class Adap_name extends RecyclerView.Adapter<Adap_name.ViewHolder> {

    private List<String> contnet;
    private Inter_adap objInterAdap;

    public Adap_name(List<String> content,Inter_adap objInterAdap){
        this.contnet=content;
        this.objInterAdap=objInterAdap;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
    return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txt_content.setText(contnet.get(position));
    }

    @Override
    public int getItemCount() {
        return contnet.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        AppCompatTextView txt_content;
        ViewHolder(View itemView) {
            super(itemView);
            txt_content=itemView.findViewById(R.id.Id_txt);
            txt_content.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.Id_txt:
                    objInterAdap.clicked(getAdapterPosition());
                    break;
            }
        }
    }
}
