package com.yinya.orange.mymemories.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.yinya.orange.mymemories.R;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * RecyclerView Adapter
 * Created by orange on 15.07.17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {
    private ArrayList mItems;

    public RecyclerViewAdapter(Context context) {
        mItems = new ArrayList();
        mItems.addAll(Arrays.asList(context.getResources().getStringArray(R.array.recycler_name_array)));
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflateView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view, parent, false);
        return new RecyclerViewHolder(inflateView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class RecyclerViewHolder extends RecyclerView.ViewHolder {
        View inflaterView;
        final RelativeLayout roundView;
        final TextView tv_1;
        final TextView tv_2;
        final TextView tv_3;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            inflaterView = itemView;

            roundView = inflaterView.findViewById(R.id.round_view);
            tv_1 = inflaterView.findViewById(R.id.tv_recycler_view_1);
            tv_2 = inflaterView.findViewById(R.id.tv_recycler_view_2);
            tv_3 = inflaterView.findViewById(R.id.tv_recycler_view_3);
        }
    }
}