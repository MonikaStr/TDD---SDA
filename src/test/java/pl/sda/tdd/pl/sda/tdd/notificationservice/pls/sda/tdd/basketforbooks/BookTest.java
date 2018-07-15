package pl.sda.tdd.pl.sda.tdd.notificationservice.pls.sda.tdd.basketforbooks;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class BookTest {

    private final String BOOK_AUTHOR = "Henryk Sienkiewicz";
    private final String BOOK_TITLE = "W pustyni i w puszczy";
    private final BigDecimal BOOK_PRICE = new BigDecimal(30);

    private Book book;

    @Before
    public void setUp() {
        book = Book.builder()
                .author(BOOK_AUTHOR)
                .title(BOOK_TITLE)
                .price(BOOK_PRICE)
                .build();
    }

    @Test
    public void ifBookIsCreated() {
        assertEquals(BOOK_AUTHOR, book.getAuthor());
        assertEquals(BOOK_TITLE, book.getTitle());
        assertEquals(BOOK_PRICE, book.getPrice());
    }

    @Test
    public void changePriceTest() {
        BigDecimal newPrice = new BigDecimal(50);
        book.changePrice(newPrice);
        assertEquals(newPrice, book.getPrice());
    }

    @Test
    public void changePriceByPercentageTest() {
        BigDecimal percentage = new BigDecimal(50);
        book.changePriceByPercentage(percentage.intValue());

        assertEquals(BOOK_PRICE.multiply(percentage)
                .divide(new BigDecimal(100)), book.getPrice());

    }

    @Test (expected = IllegalArgumentException.class)
        public void changePriceByPercentageExceptionTest () {
        book.changePriceByPercentage(-10);
        }

        /*
        @Test
        public void changePriceByPercentageExceptionTest() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Procent musi być dodatni");
        book.changePriceByPercentage(0);
        }
         */

    }
