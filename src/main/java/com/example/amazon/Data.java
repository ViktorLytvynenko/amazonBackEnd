package com.example.amazon;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "sales")
public class Data {

    @Id
    private String id;

    @Field("year")
    private String year;

    @Field("sales")
    private String sales;

    public Data() {
    }

    public Data(String year, String sales) {
        this.year = year;
        this.sales = sales;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id='" + id + '\'' +
                ", year='" + year + '\'' +
                ", sales='" + sales + '\'' +
                '}';
    }
}