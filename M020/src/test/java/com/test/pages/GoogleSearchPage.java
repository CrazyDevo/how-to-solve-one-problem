package com.test.pages;


import com.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {


    @FindBy(name = "q")
    public WebElement searchBox;

}
