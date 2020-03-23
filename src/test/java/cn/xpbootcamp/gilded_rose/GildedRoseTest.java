package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GildedRoseTest {

    GildedRose gildedRose = new GildedRose();

    @Test
    void shouldDecreaseSellInOne(){
        ProductItem productItem = new ProductItem("Cake",3,40);
        gildedRose.updateSellIn(productItem);
        assertTrue(productItem.getSellIn() == 2);

    }

    @Test
    void shouldNotDescreaseSellInForSulfuras(){
        ProductItem productItem = new ProductItem("Sulfuras",0,40);
        gildedRose.updateSellIn(productItem);
        assertTrue(productItem.getSellIn() == 0);
    }

    @Test
    void shouldIncreaseQualityOneForAgedBrie(){
        ProductItem productItem = new ProductItem("Aged Brie",0,40);
        gildedRose.updateQuality(productItem);
//        System.out.println(productItem.getQuality());
        assertTrue(productItem.getQuality() == 41);

    }

    @Test
    void shouldNotIncreaseQualityWhenMaxQualityForAgedBrie(){
        ProductItem productItem = new ProductItem("Aged Brie",0,50);
        gildedRose.updateQuality(productItem);
//        System.out.println(productItem.getQuality());
        assertTrue(productItem.getQuality() == 50);
    }

    @Test
    void shouldNotIncreaseQualityOneForSulfuras(){
        ProductItem productItem = new ProductItem("Sulfuras",0,40);
        gildedRose.updateQuality(productItem);
//        System.out.println(productItem.getQuality());
        assertTrue(productItem.getQuality() == 40);

    }

    @Test
    void shouldIncreaseQualityOneForBackstagepassWhenSellInIs11(){
        ProductItem productItem = new ProductItem("Backstage pass",11,40);
        gildedRose.updateQuality(productItem);
//        System.out.println(productItem.getQuality());
        assertTrue(productItem.getQuality() == 41);
    }

    @Test
    void shouldIncreaseQualityOneForBackstagepassWhenSellInIs10(){
        ProductItem productItem = new ProductItem("Backstage pass",10,40);
        gildedRose.updateQuality(productItem);
//        System.out.println(productItem.getQuality());
        assertTrue(productItem.getQuality() == 42);
    }

    @Test
    void shouldIncreaseQualityTwoForBackstagepassWhenSellInIs6(){
        ProductItem productItem = new ProductItem("Backstage pass",6,40);
        gildedRose.updateQuality(productItem);
//        System.out.println(productItem.getQuality());
        assertTrue(productItem.getQuality() == 42);
    }

    @Test
    void shouldIncreaseQualityThreeForBackstagepassWhenSellInIs5(){
        ProductItem productItem = new ProductItem("Backstage pass",5,40);
        gildedRose.updateQuality(productItem);
//        System.out.println(productItem.getQuality());
        assertTrue(productItem.getQuality() == 43);
    }

    @Test
    void shouldIncreaseQualityThreeForBackstagepassWhenSellInIs1(){
        ProductItem productItem = new ProductItem("Backstage pass",1,47);
        gildedRose.updateQuality(productItem);
//        System.out.println(productItem.getQuality());
        assertTrue(productItem.getQuality() == 50);
    }

    @Test
    void shouldUpdateQualityZeroForBackstagepassWhenSellInIs0(){
        ProductItem productItem = new ProductItem("Backstage pass",0,40);
        gildedRose.updateQuality(productItem);
        System.out.println(productItem.getQuality());
        assertTrue(productItem.getQuality() == 0);
    }

    @Test
    void shouldUpdateQualityMaxQualityForBackstagepassWhenQualityGreaterThanMaxQuality(){
        ProductItem productItem = new ProductItem("Backstage pass",4,49);
        gildedRose.updateQuality(productItem);
//        System.out.println(productItem.getQuality());
        assertTrue(productItem.getQuality() == gildedRose.Max_Quality);
    }

    @Test
    void shouldDecreaseQualityOneForCommanItemWhenSellInIs1(){
        ProductItem productItem = new ProductItem("Cake",1,40);
        gildedRose.updateQuality(productItem);
//        System.out.println(productItem.getQuality());
        assertTrue(productItem.getQuality() == 39);
    }

    @Test
    void shouldDecreaseQualityTwoForCommanItemWhenSellInIs0(){
        ProductItem productItem = new ProductItem("Cake",0,40);
        gildedRose.updateQuality(productItem);
//        System.out.println(productItem.getQuality());
        assertTrue(productItem.getQuality() == 38);
    }

    @Test
    void shouldDecreaseQualityTwoForCommanItemWhenQualityIs0(){
        ProductItem productItem = new ProductItem("Cake",0,0);
        gildedRose.updateQuality(productItem);
//        System.out.println(productItem.getQuality());
        assertTrue(productItem.getQuality() == 0);
    }


}