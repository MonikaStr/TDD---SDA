package pl.sda.tdd.pl.sda.tdd.notificationservice.pls.sda.tdd.basketforbooks;
/*
Dodaj także klasę reprezentującą koszyk o nazwie Basket.
   1. Tworzenie obiektów klasy Book podając tytuł, autora i cenę książki
   2. Możliwość zmiany ceny książki (np. 2 sposoby: podając nową kwotę lub % o ile należy zmienić cenę)
   3. Pobranie listy wszystkich książek dodanych do koszyka
   4. Dodawanie / usuwanie książek z koszyka//metoda licząca cenę
   5. Czyszczenie koszyka
   6. Suma wszystkich produktów znajdujących się w koszyku
   7. Usuwanie z koszyka na podstawie np nazwy
   8. Zliczanie ilości książek w koszyku danego tytułu.
   */

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
