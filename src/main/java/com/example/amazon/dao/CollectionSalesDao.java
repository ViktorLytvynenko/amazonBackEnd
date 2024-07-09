package com.example.amazon.dao;

import com.example.amazon.entity.Sales;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectionSalesDao extends MongoRepository<Sales, String> {}