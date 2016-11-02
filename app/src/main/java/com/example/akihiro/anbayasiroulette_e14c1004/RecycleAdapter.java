package com.example.akihiro.anbayasiroulette_e14c1004;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akihiro on 2016/11/02.
 */
public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder>{
    private List<AnbayashiData> dateList = new ArrayList<>();
    public RecycleAdapter(List<AnbayashiData> dataList){
        this.dateList.addAll(dataList);

    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(dateList.get(position));

    }

    @Override
    public int getItemCount() {

        return dateList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(ViewGroup vg){

            super(LayoutInflater.from(vg.getContext()).inflate(R.layout.item, vg, false));

        }

        void bind(final AnbayashiData data){
            ((TextView)itemView.findViewById(R.id.text)).setText(data.number+"本 " + data.comment);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(),data.addition,Toast.LENGTH_SHORT).show();
                }
            });

        }

    }

}
