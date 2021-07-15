package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
   public WebDriver wd;

    public NavigationHelper(WebDriver wd) {
        this.wd = wd;
    }

    public NavigationHelper() {

    }

    public void gotoGroupPage() {
        wd.findElement(By.linkText("groups")).click();    }
}
