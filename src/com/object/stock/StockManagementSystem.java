package com.object.stock;

import java.util.Scanner;

public class StockManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of stocks: ");
        int numStocks = scanner.nextInt();

        StockPortfolio stockPortfolio = new StockPortfolio(numStocks);

        stockPortfolio.readStocks(scanner);
        stockPortfolio.printStockReport();
    }
}
