package day07calisma;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String name;
    private int code;
    private double price;

    public Menu() {
    }

    public Menu(int code, String name, double price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", price=" + price +
                '}';
    }
}
