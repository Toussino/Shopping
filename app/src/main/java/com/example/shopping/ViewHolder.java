package com.example.shopping;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class ViewHolder extends RecyclerView.ViewHolder {

    static View mView;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        mView = itemView;

    }

    public static void setDetails(Context ctx, String title, String description, String image){

        TextView mTitleView = mView.findViewById(R.id.rTitleTv);
        TextView mDetailTv = mView.findViewById(R.id.rdescriptionTv);
        ImageView mImageTv = mView.findViewById(R.id.rImageView);

        mTitleView.setText(title);
        mDetailTv.setText(description);

        Picasso.get().load(image).into(mImageTv);


    }

}
