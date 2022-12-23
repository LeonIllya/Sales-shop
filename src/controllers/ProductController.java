package controllers;

import models.Product;
import utils.Rounder;
import views.SalesView;

// Controller
public class ProductController {

    Product model;
    SalesView view;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        model.getName();

        double income = 0;
        double tax = 0;
        double clearIncome = 0;

        income = model.payment(model.getQuantity(), model.getPrice());
        tax = model.tax(income);

        clearIncome= model.clearIncome(income, tax);
        income = Rounder.validatePriceInput(income, 1);
        tax = Rounder.validatePriceInput(tax, 1);
        clearIncome = Rounder.validatePriceInput(clearIncome, 1);

        String output = "Product Name :" +model.getName() + "\nTotal income (UAH):" +income +
                "\nTax amount (UAH):" +tax +"\nNet income (UAH):" +clearIncome;

        view.getOutput(output);
    }
}
