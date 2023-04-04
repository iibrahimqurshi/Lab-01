package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProductTest
{
    @Test
    public void shouldCountQuantity()
    {
        Product p1 = new Product(6745, 5.50, "Penne Pasta");
        Product p2 = new Product(8853, 6.50, "Spaghetti Pasta");
        Product p3 = new Product(2106, 4.50, "Linguine Pasta");
        assertEquals(p3.getTotalQuantity(), 3);
    }
}
