package com.example.parcial;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<MyData> data;
    private View.OnClickListener listener;

    public MyAdapter(List<MyData> data, View.OnClickListener listener) {
        this.data = data;
        this.listener = listener;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        // Aquí puedes vincular tus vistas

        public MyViewHolder(View view) {
            super(view);
            // Aquí puedes inicializar tus vistas
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        // Aquí puedes establecer los datos en tus vistas y manejar el clic en el elemento
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(data.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
