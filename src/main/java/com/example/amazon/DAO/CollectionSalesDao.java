package com.example.amazon.DAO;

import com.example.amazon.Data;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CollectionSalesDao extends MongoRepository<Data, String> {}