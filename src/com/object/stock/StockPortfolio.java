package com.object.stock;

import java.util.Scanner;

public class StockPortfolio {
    Stock[] stocks;
    StockPortfolio(int numStocks) {
        stocks = new Stock[numStocks];
    }
    void readStocks(Scanner scanner) {
        for (int i = 0; i < stocks.length; i++) {
            System.out.println("Enter details for Stock " + (i + 1));
            System.out.print("Stock Name: ");
            String stockName = scanner.next();
            System.out.print("Number of Shares: ");
            int numberOfShares = scanner.nextInt();
            System.out.print("Share Price: ");
            double sharePrice = scanner.nextDouble();

            stocks[i] = new Stock(stockName, numberOfShares, sharePrice);
        }
    }

    void printStockReport() {
        double totalPortfolioValue = 0;

        System.out.println("\nStock Report:");
//        System.out.printf("%-15s %-20s %-15s %-15s\n", "Stock Name", "Number of Shares", "Share Price", "Stock Value");
        System.out.println( "Stock Name  " + "Number of Shares     "+ "Share Price      "+"Stock Value     ");
        System.out.println("--------------------------------------------------");

        for (Stock stock : stocks) {
            double stockValue = stock.calculateStockValue();
            totalPortfolioValue += stockValue;

            System.out.println( stock.stockName+"           "+ stock.numberOfShares+"                  "+stock.sharePrice+"               "+ stockValue);
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Total Portfolio Value:                                 " +totalPortfolioValue);
    }
}
