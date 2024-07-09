package com.example.amazon.controllers;

import com.example.amazon.entity.Sales;
import com.example.amazon.services.SalesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {
        "https://amazon-front-2v8b5i1a1-viktorlytvynenkos-projects.vercel.app",
        "https://amazon-front-end-one.vercel.app/",
        "http://localhost:3000"
}, allowedHeaders = "*")
public class SalesController {

    private final SalesService salesService;

    @GetMapping("/data")
    public ResponseEntity<List<Sales>> getAllData() {
        List<Sales> dataList = salesService.getAllData();
        return new ResponseEntity<>(dataList, HttpStatus.OK);
    }
}
