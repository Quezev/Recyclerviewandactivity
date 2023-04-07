package com.example.projectapliacation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterM extends RecyclerView.Adapter<AdapterM.MViewHolder> {
    Context context;
    List<Motor>listd;
    OnClickShowListener mOnClickShowListener;

    public AdapterM(Context context, List<Motor> listd, OnClickShowListener onClickShowListener) {
        this.context = context;
        this.listd = listd;
        this.mOnClickShowListener = onClickShowListener;
    }

    @NonNull
    @Override
    public MViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item, parent,false);
        return new MViewHolder(view, mOnClickShowListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MViewHolder holder, int position) {
        String name = listd.get(position).getNama();
        int gambar = listd.get(position).getFoto();


        holder.tvm.setText(name);
        holder.imgm.setImageResource(gambar);

    }

    @Override
    public int getItemCount() {
        return listd.size();
    }

    public class MViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvm;
        ImageView imgm;
        OnClickShowListener onClickShowListener;
        public MViewHolder(@NonNull View itemView, OnClickShowListener onClickShowListener) {
            super(itemView);
            tvm = itemView.findViewById(R.id.tw);
            imgm = itemView.findViewById(R.id.imgw);
            this.onClickShowListener = onClickShowListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onClickShowListener.onClickShowListener(getAbsoluteAdapterPosition());
        }
    }

    public interface OnClickShowListener{
        void onClickShowListener (int position);
    }
}

