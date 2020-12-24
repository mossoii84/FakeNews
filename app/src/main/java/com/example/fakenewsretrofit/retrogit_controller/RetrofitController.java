package com.example.fakenewsretrofit.retrogit_controller;


import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;


public interface RetrofitController {

//    У нас есть метод getData, возвращающий объект типа Call<List<PostModel>>.
//    Методы должны всегда возвращать объект типа Call<T> и иметь аннотацию типа запроса (GET, POST, PUT, DELETE).

//    CategoryModel — наш POJO класс, сгенерированный сайтом jsonschema2pojo на основе ответа сервера.
    @GET("news")
    Call<List<CategoryModel>> listCategoryModel();

//    Call<CategoryModel> listCategoryModel(@Path("title") String title);

//    Call<List<CategoryModel>> listCategoryModel();
//    Call<CategoryModel> getPostWithID(@Path("id") int id);


//    @GET("/posts/{id}")
//    public Call<Post> getPostWithID(@Path("id") int id);

//    Поскольку мы отправляем GET-запрос, нам нужно применить к методу аннотацию @GET,
//    внутри которой находится конечная точка, на которую мы хотим отправить запрос.
//    Как вы видите, мы не добавляем полный URL, т.к. Retrofit автоматически возьмёт ENDPOINT_URL,
//    переданный в класс NetworkService, и добавит его к остальной части URL-адреса.
//
//    Возвращаемый тип метода называется Call<Post>. Call — это класс, предоставляемый
//    непосредственно самой библиотекой. И все методы в интерфейсе должны возвращать значения этого типа.
//    Это generic-класс, принимающий в себя тип объекта, который мы хотим конвертировать в JSON.
//    Мы передали Post, т.к. это именно тот объект, в который хотим преобразовать JSON-ответ.
//    В параметры мы передали целое число и аннотировали его с помощью @Path,
//    внутри которого записали id. Retrofit возьмёт это значение и в конечной точке заменит на него {id}.
//    Таким образом, если мы передадим значение 1 в качестве параметра, то конечная точка будет выглядеть так — /posts/1,
//    если передадим значение 10, то конечная точка получится — /posts/10.





}
