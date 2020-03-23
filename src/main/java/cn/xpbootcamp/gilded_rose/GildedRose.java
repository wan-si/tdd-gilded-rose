package cn.xpbootcamp.gilded_rose;

public class GildedRose {

    ProductItem[] productItems;

    public GildedRose(ProductItem[] productItems) {
        this.productItems = productItems;
    }

    public void updateSellIn(ProductItem productItem){

        if(!productItem.getName().equals("Sulfuras")){

            productItem.setSellIn(productItem.getSellIn() - 1);

        }
    }




}
