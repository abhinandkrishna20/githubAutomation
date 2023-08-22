/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.scientechtamils.githubautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author USER1
 */
public class GithubAutomation {

    public static void main(String[] args) {
        System.out.println("Hello GitHub!");
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/login");
        driver.manage().window().maximize();
        String mailid = "your id",pwd = "your password";
        driver.findElement(By.id("login_field")).sendKeys(mailid);
        driver.findElement(By.id("password")).sendKeys(pwd);
        String submit = "//*[@id=\"login\"]/div[4]/form/div/input[13]";
        driver.findElement(By.xpath(submit)).click();
        
    }
}
