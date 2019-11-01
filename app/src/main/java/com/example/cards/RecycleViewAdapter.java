package com.example.cards;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {
    private Context context;
    private List<Card> mCard;

    public RecycleViewAdapter(Context context, List<Card> mCard) {
        this.context = context;
        this.mCard = mCard;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.cards, parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        //holder.textOcorrencia.setText(mCard.get(position).getTextOcorrencia());
        //holder.Tipo.setText(mCard.get(position).getTipo());
        //holder.Status.setText(mCard.get(position).getStatus());
        holder.Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Act_Card.class);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return mCard.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textOcorrencia;
        TextView textTipo;
        TextView Tipo;
        TextView textStatus;
        TextView Status;
        CardView Card;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textOcorrencia = (TextView) itemView.findViewById(R.id.textOcorrencia);
            textTipo = (TextView) itemView.findViewById(R.id.textTipo);
            Tipo = (TextView) itemView.findViewById(R.id.Tipo);
            textStatus = (TextView) itemView.findViewById(R.id.textStatus);
            Status = (TextView) itemView.findViewById(R.id.Status);
            Card = (CardView) itemView.findViewById(R.id.Card);



        }
    }

}
