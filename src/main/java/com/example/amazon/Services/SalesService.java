package com.example.amazon.Services;

import com.example.amazon.DAO.CollectionSalesDao;
import com.example.amazon.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService {
    private final CollectionSalesDao collectionSalesDao;

    @Autowired
    public SalesService(CollectionSalesDao collectionSalesDao) {
        this.collectionSalesDao = collectionSalesDao;
    }

    public List<Data> getAllData() {
        return collectionSalesDao.findAll();
    }
}
