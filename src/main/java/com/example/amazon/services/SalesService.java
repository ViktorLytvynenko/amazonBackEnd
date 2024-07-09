package com.example.amazon.services;

import com.example.amazon.dao.CollectionSalesDao;
import com.example.amazon.entity.Sales;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SalesService {
    private final CollectionSalesDao collectionSalesDao;

    public List<Sales> getAllData() {
        System.out.println(collectionSalesDao.findAll());
        return collectionSalesDao.findAll();
    }
}
