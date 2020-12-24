package com.example.fakenewsretrofit.Entity;


import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NewsInfo  extends RecyclerView.ViewHolder{
    private String title;
    private String description;



    public NewsInfo(@NonNull View itemView) {
        super(itemView);
    }
//    @IntegerRes
//    private int imageView;






//    Метод ToString служит для получения строкового представления данного объекта.
//    @Override
//    public String toString() {
//        return "NewsInfo{" +
//                "title='" + title + '\'' +
//                ", description='" + description + '\'' +
//                ", imageView=" + imageView +
//                '}';
//    }
}
