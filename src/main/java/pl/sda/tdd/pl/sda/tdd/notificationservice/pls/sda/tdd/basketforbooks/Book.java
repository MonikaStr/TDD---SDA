package pl.sda.tdd.pl.sda.tdd.notificationservice.pls.sda.tdd.basketforbooks;
/*
Utwórz klasę reprezentującą Książkę o nazwie Book.
Dla ułatwienia przyjmijmy, że książka na początku posiada  tylko 3 parametry:
1. Tytuł
2. Autor
3. Cena
 */

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Builder
@Data
public class Book {
    private String author;
    private String title;
    private BigDecimal price;

    public void changePrice(BigDecimal newPrice) {
        setPrice(newPrice);
    }

    public void changePriceByPercentage(int percentage) {
        if (percentage < 0) {
            throw new IllegalArgumentException("Procent musi być dodatni");
        }
        setPrice(BigDecimal.valueOf(percentage)
                .multiply(this.price)
                .divide(new BigDecimal(100)));
    }



    public Book(String author, String title, BigDecimal price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }



}
