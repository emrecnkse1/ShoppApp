package com.example.shoppapp.Activity.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners;
import com.example.shoppapp.Activity.Activity.DetailActivity;
import com.example.shoppapp.Activity.Domain.PopularDomain;
import com.example.shoppapp.R;

import java.util.ArrayList;

public class PopularListAdapter extends RecyclerView.Adapter<PopularListAdapter.Viewholder> {

    private ArrayList<PopularDomain> items;
    private Context context;

    public PopularListAdapter(ArrayList<PopularDomain> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_pop_list, parent, false);
        context = parent.getContext();
        return new Viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        PopularDomain currentItem = items.get(position);

        holder.titleTxt.setText(currentItem.getTitle());
        holder.feeTxt.setText("₺" + currentItem.getPrice());
        holder.ScoreTxt.setText(String.valueOf(currentItem.getScore()));

        String picUrl = currentItem.getPicUrl();

            int drawableResourceId = holder.itemView.getResources().getIdentifier(picUrl, "drawable", holder.itemView.getContext().getPackageName());


                Glide.with(holder.itemView.getContext())
                        .load(drawableResourceId)
                        .transform(new GranularRoundedCorners(30, 30, 0, 0))
                        .into(holder.pic);



        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
            intent.putExtra("object", currentItem);
            holder.itemView.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class Viewholder extends RecyclerView.ViewHolder {
        TextView titleTxt, feeTxt, ScoreTxt;
        ImageView pic;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            titleTxt = itemView.findViewById(R.id.titleTxt);
            feeTxt = itemView.findViewById(R.id.feeTxt);
            ScoreTxt = itemView.findViewById(R.id.scoreTxt);
            pic = itemView.findViewById(R.id.pic);
        }
    }
}
