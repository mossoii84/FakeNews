package com.example.fakenewsretrofit.AdapterForEntity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fakenewsretrofit.Entity.NewsInfo;
import com.example.fakenewsretrofit.R;
import com.example.fakenewsretrofit.retrogit_controller.CategoryModel;

// MainNewsViewHolder - создали обертку в Адаптере, она захватывает наше View (то что выводится на экран) в адаптере мы
// указали путь к Card, и мы передали в качестве аргументов туда View то есть поля из Card
public class MainNewsViewHolder extends RecyclerView.ViewHolder{

      TextView textTitle, textDescription;

    //в этом методе мы как бы подключаем доступ к нашему Card (т.е RecyclerView) через Адаптер
    // itemView - строка(колонка) нашего View, в нашем случаи одна ячейка Card на экарне,
    // при прокрутке экрана только эти значения пересоздается внутри 1 Card
    public MainNewsViewHolder(@NonNull View itemView) {
        super(itemView);

        //находим тут наши поля (мы прописываем их не в активити а тут и в адаптере) и потом добавляем их в адаптере
        textTitle = itemView.findViewById(R.id.textTitle);
        textDescription = itemView.findViewById(R.id.textDescription);

    }

    // метод bind создается автоматически при привязке
    // holder.bind(moneyList.get(position)); в классе Adapter
    public void bind(CategoryModel categoryModel) {
//        textTitle.setText(categoryModel.getDescription());
//        textDescription.setText(categoryModel.getTitle());
//        imageView.setImageResource(newsInfo.getImageView());
    }
}

