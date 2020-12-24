package com.example.fakenewsretrofit.Entity;


import androidx.annotation.IntegerRes;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


// пока этот класс не используется
public class Publicity {

    @SerializedName("text")
    @Expose
    private String text;
   //если имя переменной такое же как в БД то ставить @SerializedName("text") не обязательно
    @IntegerRes
    private int imageView;






    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
    public int getImageView() { return imageView; }
    public void setImageView(int imageView) { this.imageView = imageView; }
}
