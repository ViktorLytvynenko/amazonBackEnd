package com.example.amazon.Services;

import com.example.amazon.DAO.CollectionSalesDao;
import com.example.amazon.Data;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SalesService {
    private final CollectionSalesDao collectionSalesDao;

    public List<Data> getAllData() {
        System.out.println(collectionSalesDao.findAll());
        return collectionSalesDao.findAll();
    }
}
