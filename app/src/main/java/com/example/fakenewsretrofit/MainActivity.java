package com.example.fakenewsretrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fakenewsretrofit.AdapterForEntity.AdapterForEntity;
import com.example.fakenewsretrofit.Entity.NewsInfo;
import com.example.fakenewsretrofit.retrogit_controller.CategoryModel;
import com.example.fakenewsretrofit.retrogit_controller.RetrofitController;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";

    private RecyclerView recyclerView;
    private AdapterForEntity adapterForEntity;
    List<CategoryModel> categoryModel = new ArrayList<>();
    //   Retrofit ссылка на наш url где лижат json массивы
    // Это наш  ENDPOINT
    public static final String ENDPOINT_URL = "https://my-json-server.typicode.com/Shiplayer/ExampleJsonData/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


                recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapterForEntity = new AdapterForEntity(this, categoryModel);  //item это как бы данные указанных переменных
        recyclerView.setAdapter(adapterForEntity);


        TextView textViewGet = findViewById(R.id.id);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ENDPOINT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
         RetrofitController retrofitController =  retrofit.create(RetrofitController.class);
          Call<List<CategoryModel>> call = retrofitController.listCategoryModel();






        //Создаем объект, при помощи которого будем выполнять запросы, асинхроный вариант(.enqueue)
         call.enqueue(new Callback<List<CategoryModel>>() {
            @Override
            public void onResponse(Call<List<CategoryModel>> call, Response<List<CategoryModel>> response) {
                categoryModel.addAll(response.body()); //записываем все приходящие данные в обьект класса

                    recyclerView.getAdapter().notifyDataSetChanged();



//                textViewGet.setText(response.code() + "\n");
//                TextView textViewId = findViewById(R.id.id);
//
//
//       for(CategoryModel mylist : categoryModel){
//
//           String content = "";
//           content = "id:" + mylist.getId() + "\n";
//           content += "Title: " + mylist.getTitle() + "\n";
//           textViewId.append(content);
//        }
                    }

                    @Override //Произошла ошибка
                    public void onFailure(Call<List<CategoryModel>> call, Throwable t) {
                        TextView textViewError = findViewById(R.id.errorId);
                        textViewError.setText(t.getMessage());
                       textViewError.append("Error occurred while getting request!");
                        t.printStackTrace();
                        Toast.makeText(MainActivity.this, "An error occurred during networking", Toast.LENGTH_SHORT).show();
                    }
                });



    }




}



//    textViewResult = findViewById(R.id.text_view_result);
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://jsonplaceholder.typicode.com/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        RetrofitController jsonPlaceHolderApi = retrofit.create(RetrofitController.class);
//        Call<List<Post>> call = jsonPlaceHolderApi.getPosts();
//        call.enqueue(new Callback<List<Post>>() {
//            @Override
//            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
//                if (!response.isSuccessful()) {
//                    textViewResult.setText("Code: " + response.code());
//                    return;
//                }
//                List<Post> posts = response.body();
//                for (Post post : posts) {
//                    String content = "";
//                    content += "ID: " + post.getId() + "\n";
//                    content += "User ID: " + post.getUserId() + "\n";
//                    content += "Title: " + post.getTitle() + "\n";
//                    content += "Text: " + post.getText() + "\n\n";
//                    textViewResult.append(content);
//                }
//            }
//            @Override
//            public void onFailure(Call<List<Post>> call, Throwable t) {
//                textViewResult.setText(t.getMessage());
//            }
//        });
//    }