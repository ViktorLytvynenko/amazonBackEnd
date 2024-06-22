package com.example.amazon;

import org.springframework.data.annotation.Id;

import java.util.Map;

public class Data {

    @Id
    private String id;

    private Map<String, String> year;

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
}
