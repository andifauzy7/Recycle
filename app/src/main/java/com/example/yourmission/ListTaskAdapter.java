package com.example.yourmission;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListTaskAdapter extends RecyclerView.Adapter<ListTaskAdapter.ListViewHolder> {
    private ArrayList<Task> listTasks;

    public ListTaskAdapter(ArrayList<Task> list) {
        this.listTasks = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_hero, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Task task = listTasks.get(position);
        holder.tvName.setText(task.getName());
        holder.tvDetail.setText(task.getDetail());
    }

    @Override
    public int getItemCount() {
        return listTasks.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
