package ru.hse.lambda.retrofit;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

// https://jsonplaceholder.typicode.com/posts/1
public class ToDo {
    private long userId;
    private long id;
    private String title;
    private String body;

    public ToDo() {
    }

    public ToDo(String body) {
        this.body = body;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        System.out.println("getBody");
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        //language=JSON
        String json = """
                {
                  "userId": 1,
                  "id": 1,
                  "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
                  "body": "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"
                }
                """;

        ToDo toDo = objectMapper.readValue(json, ToDo.class);

        System.out.println(toDo.getBody());
        System.out.println(toDo.getId());
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
