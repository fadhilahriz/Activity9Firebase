package com.example.activityfirebase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.activityfirebase.database.Teman;

import java.util.ArrayList;

public class AdapterLihatTeman extends RecyclerView.Adapter<AdapterLihatTeman.ViewHolder> {
    private ArrayList<Teman> daftarTeman;
    private Context context;

    public AdapterLihatTeman(ArrayList<Teman> temans, Context ctx) {
        daftarTeman = temans;
        context = ctx;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvTitle;
        ViewHolder(View v) {
            super(v);
            tvTitle=(TextView) v.findViewById(R.id.tv_namateman);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_teman, parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final String name = daftarTeman.get(position).getNama();
        holder.tvTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //next
            }
        });
        holder.tvTitle.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return true;
            }
        });
        holder.tvTitle.setText(name);
    }

    @Override
    public int getItemCount() {
        return daftarTeman.size();
    }
}
