package com.jars.shopping.ProductList;

import javax.persistence.*;

/**
 * Created by marcinpankowski on 20.11.16.
 */

@Entity
@NamedQueries({
        @NamedQuery(name= Products.GET_PRODUCTS_LIST,
                query = "select p " +
                        "from Products p")
})
public class Products {
    final public static String GET_PRODUCTS_LIST = "Products.GET_PRODUCTS_LIST";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String product;
    private String user;

    public Products() {
    }

    public Products(String product, String user) {
        this.product = product;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Products{" + "product='" + product + "'" + " user='" + user + '}' + '\'';
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Products(String product) {

        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}