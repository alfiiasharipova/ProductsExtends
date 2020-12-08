package ru.netology.manager;

import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.SmartPhone;

public class ProductsManager {
    Product[] products = new Product[0];

    public ProductsManager() {
    }

    public ProductsManager(Product[] products) {
        this.products = products;
    }

    public void add(Product item) {
        int length = products.length + 1;
        Product[] tmp = new Product[length];
        System.arraycopy(products, 0, tmp, 0, products.length);
        tmp[tmp.length - 1] = item;
        products = tmp;
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        int length = 0;
        for (Product item : products) {
             if (matches(item, text)){
                 length ++;
                 Product[] tmp = new Product[length];
                 System.arraycopy(products, 0, tmp, 0, result.length);
                 tmp[tmp.length - 1] = item;
                 result = tmp;
             }
        }
        return result;
    }

    public boolean matches(Product product, String search) {
        if (product.getName().equalsIgnoreCase(search))
            return true;
        if (product instanceof Book) {
            return ((Book) product).getAuthor().equalsIgnoreCase(search);
        }
        if (product instanceof SmartPhone) {
            return ((SmartPhone) product).getBrand().equalsIgnoreCase(search);
        }
        return false;
    }

}

