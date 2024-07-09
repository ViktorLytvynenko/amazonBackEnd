package com.example.amazon.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor
@Data
@FieldDefaults(level = PRIVATE)
@Document(collection = "sales")
public class Sales {

    @Id
    String id;

    @Field("year")
    String year;

    @Field("sales")
    String sales;

    public Sales(String year, String sales) {
        this.year = year;
        this.sales = sales;
    }
}