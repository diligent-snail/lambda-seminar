package ru.hse.lambda.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ToDoService {
    @GET("/posts/{id}")
    Call<ToDo> getToDoById(@Path("id") long id);
}
