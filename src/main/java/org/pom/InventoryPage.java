package org.pom;

import org.openqa.selenium.By;
import org.pom.common.BasePage;

public class InventoryPage extends BasePage {
    private By pageHeader = By.xpath("//span[@class='title']");
    private By item_names = By.xpath("//div[@class='inventory_item_name']");
    private By item_prices = By.xpath("//div[@class='inventory_item_price']");
    private By item_images = By.xpath("//img[@class='inventory_item_img']");
    private By item_description = By.xpath("//div[@class='inventory_item_desc']");
    private By filter_icon = By.xpath("//select[@class='product_sort_container']");
    private By shopping_cart_badge = By.xpath("//div[@id='shopping_cart_container']");
    private By cart_item_count = By.xpath("//span[@class='shopping_cart_badge']");

    private By add_to_cart_button = By.xpath("//button[text()='Add to cart']");
    public String getPageHeader(){
        return getText(pageHeader);
    }
}
