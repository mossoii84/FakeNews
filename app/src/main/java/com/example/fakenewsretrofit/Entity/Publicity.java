package com.example.fakenewsretrofit.Entity;

import android.view.View;

import androidx.annotation.IntegerRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


//Как вы видите, это простой POJO-класс. Переменные мы аннотировали с помощью @SerializedName(),
//        передав туда имя. Эти имена фактически являются ключами в возвращаемых из API JSON-данных,
//        поэтому вы можете как угодно изменять имя переменной,
//        но убедитесь, что имя, переданное в аннотацию @SerializedName(), точно присутствует в JSON.


//Аннотация @SerializedName необходима Gson для сопоставления ключей JSON с нашими полями
//Аннотация @Expose указывает, что этот член должен быть @Expose для сериализации или десериализации JSON.

// Если не ошибаюсь Pojo класс это стандартный класс который получит данные, а дальше мы их можем уже передать в
    // в несколько других классом по их переменным или в одни если хотим


public class Publicity extends RecyclerView.ViewHolder {

    @SerializedName("text")
    @Expose
    private String text;
   //если имя переменной такое же как в БД то ставить @SerializedName("text") не обязательно
    @IntegerRes
    private int imageView;



    public Publicity(@NonNull View itemView) {
        super(itemView);
    }



    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
    public int getImageView() { return imageView; }
    public void setImageView(int imageView) { this.imageView = imageView; }
}
