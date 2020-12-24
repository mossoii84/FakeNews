package com.example.fakenewsretrofit.retrogit_controller;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


// это простой POJO-класс. Переменные мы аннотировали с помощью @SerializedName(),
//        передав туда имя. Эти имена фактически являются ключами в возвращаемых из API JSON-данных,
//        поэтому вы можете как угодно изменять имя переменной,
//        но убедитесь, что имя, переданное в аннотацию @SerializedName(), точно присутствует в JSON.



//Аннотация @SerializedName необходима Gson для сопоставления ключей JSON с нашими полями
//Аннотация @Expose указывает, что этот член должен быть @Expose для сериализации или десериализации JSON.
public class CategoryModel {
// Если не ошибаюсь Pojo класс это стандартный класс который получит данные, а дальше мы их можем уже передать в
    // в несколько других классом по их переменным или в одни если хотим
    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("title")
    @Expose
    private String title;  // это с данными из массива которые мы ждем от get, post

    @SerializedName("description")
    @Expose
    private String description;
//
//    @SerializedName("author")
//    @Expose
//    private String author;


//    {
//        "id": 1,
//            "title": "CNN сообщил о причастности 8 сотрудников ФСБ к отравлению Навального",
//            "description": "Издания The Insider, Bellingcat и CNN по итогам совместного расследования опубликовали материал, в котором утверждается, что к отравлению Алексея Навального причастны сотрудники ФСБ.",
//            "author": "Артем Филипенок",
//            "url": "https://www.rbc.ru/politics/14/12/2020/5fd768749a7947bca0739bef",
//            "news_company": "РБК",
//            "timestamp": 1607961609
//    }
//



//    @SerializedName("imageView")
//    @Expose
//    private int imageView;




    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public int getImageView() {
//        return imageView;
//    }
//
//    public void setImageView(int imageView) {
//        this.imageView = imageView;
//    }

//    @SerializedName("image")
//    private Image image;
//
//    @SerializedName("text")
//    private Text text;


    @Override
    public String toString() {
        return "CategoryModel{" +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
