package ru.hse.lambda.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        ToDoService toDoService = retrofit.create(ToDoService.class);


        ToDo body = toDoService.getToDoById(1).execute().body();
        System.out.println(body);
    }
}
