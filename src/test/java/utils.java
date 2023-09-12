//package dev.selenium.getting_started;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class utils {


  @Test
  public void eightComponents() {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.michaelkors.es/");
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
    WebElement regalos = driver.findElement(By.xpath("//a[contains(text(),'regalos')]"));
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
    WebElement chat = driver.findElement(By.xpath("//div[@id='webchatRoot']"));
    WebElement dosbusquedas = driver.findElement(
        By.xpath("//*[contains(text(),'miradas') and contains(text(),'permiten')]"));
    WebElement links = driver.findElement(By.xpath("//a[@class='pphMessageLink']"));
    WebElement iframe = driver.findElement(By.xpath("/html/iframe"));
    WebElement union = driver.findElement(
        By.xpath("//a[@href='/EUSLVLLS' and @class='pphMessageLink']"));
    driver.get("https://www.michaelkors.es/promocion/calzado/_/N-p1u9ws");
    WebElement textlink = driver.findElement(By.xpath("//*[contains(text(),'CALZADO')]"));
    driver.get("https://www.michaelkors.es/tendencia/novedades-en-rebajas/_/N-frjbzp");
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
    WebElement ultimo = driver.findElement(By.xpath("/html/body/div[last()]"));

    WebElement primero = driver.findElement(By.xpath("/html/body/div[1]"));

    driver.get("https://www.michaelkors.es/tendencia/novedades-en-rebajas/_/N-frjbzp");
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
    WebElement meta = driver.findElement(By.xpath("/html/head/meta[@property='og:description']"));


  }

}
