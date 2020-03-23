package cn.xpbootcamp.gilded_rose;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class GildedRose {

    ProductItem[] productItems;

    int Max_Quality = 50;
    int Low_Quality = 0;
    int SellIn_Decrease_Rate = 1;
    int Quality_Decrease_Rate = 1;
    int Quality_Increase_Rate = 1;


    public GildedRose(ProductItem[] productItems) {
        this.productItems = productItems;
    }

    public void updateSellIn(ProductItem productItem){

        if(!productItem.getName().equals("Sulfuras")){

            productItem.setSellIn(productItem.getSellIn() - SellIn_Decrease_Rate);

        }
    }

    public void updateQuality(ProductItem productItem) {


        if(productItem.getName().equals("Aged Brie")){

            updateQualityForAgedBrie(productItem);


        }else if(productItem.getName().equals("Backstage pass")){

            updateQualityForBackstagepass(productItem);

        }else if(!productItem.getName().equals("Sulfuras")){

            updateQualityFor(productItem);

        }

    }

    private void updateQualityForAgedBrie(ProductItem productItem){

        int increaseQuality = productItem.getQuality() + Quality_Increase_Rate;

        productItem.setQuality(min(increaseQuality,Max_Quality));

    }

    private void updateQualityForBackstagepass(ProductItem productItem){

        int quality = productItem.getQuality();

        if(productItem.getSellIn() <= 5){

            quality += 3;

        }else if(productItem.getSellIn() <= 10){

            quality += 2;

        }else if(productItem.getSellIn() <= 0){

            quality = Low_Quality;

        }else{

            quality += 1;
        }

        productItem.setQuality(min(quality,Max_Quality));

    }

    private void updateQualityFor(ProductItem productItem){

        int quality = productItem.getQuality();

        if(productItem.getSellIn() > 0){

            quality -= Quality_Decrease_Rate;

        }else {

            quality -= Quality_Decrease_Rate * 2;
        }

        productItem.setQuality(max(quality,Low_Quality));

    }


}
