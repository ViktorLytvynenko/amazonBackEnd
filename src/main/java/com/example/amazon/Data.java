package com.example.amazon;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Map;

@Document(collection = "sales")
public class Data {

    @Id
    private String id;

    @Field("year")
    private Map<String, String> year;

    public Data() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, String> getYear() {
        return year;
    }

    public void setYear(Map<String, String> year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id='" + id + '\'' +
                ", year=" + year +
                '}';
    }
}
