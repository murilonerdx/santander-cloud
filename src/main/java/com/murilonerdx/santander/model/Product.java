package com.murilonerdx.santander.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@EntityScan
@Document(indexName="product", type="catalog")
public class Product {
    @Id
    private Long id;
    private String name;
    private Double amount;

    public Product(Long id, String name, Double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
