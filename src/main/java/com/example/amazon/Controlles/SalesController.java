package com.example.amazon.Controlles;

import com.example.amazon.Data;
import com.example.amazon.Services.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SalesController {

    private final SalesService salesService;

    @Autowired
    public SalesController(SalesService salesService) {
        this.salesService = salesService;
    }

    @GetMapping("/data")
    public ResponseEntity<List<Data>> getAllData() {
        List<Data> dataList = salesService.getAllData();
        return new ResponseEntity<>(dataList, HttpStatus.OK);
    }
}
