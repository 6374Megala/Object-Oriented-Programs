package com.object.stock;

public class Stock {
    String stockName;
    int numberOfShares;
    double sharePrice;

    Stock(String stockName, int numberOfShares, double sharePrice) {
        this.stockName = stockName;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    double calculateStockValue() {
        return numberOfShares * sharePrice;
    }

}
