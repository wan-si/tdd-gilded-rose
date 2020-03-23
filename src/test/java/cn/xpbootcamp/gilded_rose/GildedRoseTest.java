package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GildedRoseTest {

    GildedRose gildedRose = new GildedRose();

    @Test
    void shouldDecreaseSellInOne(){
        ProductItem productItem = new ProductItem("Cake",3,100);
        gildedRose.updateSellIn(productItem);
        assertTrue(productItem.getSellIn() == 2);

    }

    @Test
    void shouldNotDescreaseSellInForSulfuras(){
        ProductItem productItem = new ProductItem("Sulfuras",0,1000);
        gildedRose.updateSellIn(productItem);
        assertTrue(productItem.getSellIn() == 0);
    }

    @Test
    void updateQuality() {
    }
}