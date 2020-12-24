package com.example.fakenewsretrofit.AdapterForEntity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fakenewsretrofit.Entity.NewsInfo;
import com.example.fakenewsretrofit.Entity.Publicity;
import com.example.fakenewsretrofit.MainActivity;
import com.example.fakenewsretrofit.R;
import com.example.fakenewsretrofit.retrogit_controller.CategoryModel;

import java.util.ArrayList;
import java.util.List;

public class AdapterForEntity extends RecyclerView.Adapter<MainNewsViewHolder> {


    //создаем массив наших новостей и передаем его на обновление в метод UpdateNews
   private List<CategoryModel> listNewsInfos;

    public AdapterForEntity(MainActivity mainActivity, List<CategoryModel> listNewsInfos) {
        this.listNewsInfos = listNewsInfos;
    }

    public void updateListNewsInfos(List<CategoryModel> listNewsInfos){
      this.listNewsInfos = listNewsInfos;
      // Уведомляем адаптор о том, что у нас поменялись данные и необходимо заново слинковать данные и вьюшки
      // То есть, заново будет вызваться метод onBindViewHolder
      notifyDataSetChanged();
  }


    //создаем ViewHolder — содержит наши элементы(поля titre, name ..) - это как бы одна ячейка из recyclerview,
    // созданый метод передастся в класс   ViewHolder и там будет его реализация    @NonNull
    // наши ViewHolder метод наследуется от abstract static class RecyclerView.Adapter
    @Override  //viewGroup - это группа отображения, где есть зависимость parent и тп от друг друга
    public MainNewsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        //Здесь мы создаем саму вьюшку, сколько может разместится на экране за раз
        // Подключаем наш Card
        //LayoutInflater -  это класс, который умеет из содержимого layout-файла создать View-элемент.
      View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card, viewGroup,false);//стандартная запись
        return new MainNewsViewHolder(view); //возвращаем наш Card с View внутри (поля прописаные в ViewHolder файле)
    }

    //bind - стандартная связь, тут мы будем нашим ViewHolder передавать новые значения,
    @Override // как бы переписывая их, так можно только 10 на экране
    public void onBindViewHolder(@NonNull MainNewsViewHolder holder, int position) {
        // Здесь мы просто вызываем метод для соединения данных и вьюшки, передаем туда необходимый объект по позиции
//        holder.bind(listNewsInfos.get(position));
        //как я понимаю они раставляются по позициям(например только 10 на экране),
        // как в массиве у каждого есть свой номер и по номеру можно удалять

        //для класса CategiryModel(retrigit_controller)
  holder.textTitle.setText("Title : " + listNewsInfos.get(position).getTitle());
  holder.textDescription.setText(listNewsInfos.get(position).getDescription());



    }

    @Override
    public int getItemCount() {
//        if (listNewsInfos == null)
//            return 0;
        return listNewsInfos.size();
    }



}

