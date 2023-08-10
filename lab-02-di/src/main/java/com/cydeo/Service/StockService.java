package com.cydeo.Service;

import com.cydeo.model.Product;

public interface StockService {
    boolean checkStockIsAvailable(Product product, int quantity);
}
