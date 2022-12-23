package utils;

import java.util.Scanner;

// Валидатор ввода значений
public class Validator {

    // Валидация ввода наименования
    public static String validateName(Scanner scanner){
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.out.println("Empty! Enter product name: ");
            str = scanner.nextLine().trim();
        }
        return str;
    }

    // Валидация ввода количества
    public static int validateQuantityInput(Scanner scanner){
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - not number!\n", str);
            System.out.println("Enter quantity!: ");
        }
        int quantity = scanner.nextInt();
        while (quantity <= 0){
            System.out.println("Incorrect value! Enter Quantity: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - not number!\n", str);
                System.out.println("Enter quantity!: ");
            }
            quantity = scanner.nextInt();
        }
        return quantity;
    }

    // Валидация ввода цены
    public static float validatePriceInput(Scanner scanner){
        while (!scanner.hasNextFloat()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - not number!\n", str);
            System.out.println("\"Enter price!: ");
        }
        float price = scanner.nextFloat();
        while (price <= 0) {
            System.out.println("Incorrect value! Enter price: ");
            price = scanner.nextFloat();
        }
        return price;
    }
}

