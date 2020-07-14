package com.kodilla.selenium.visual;

import com.testautomationguru.ocular.Ocular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class OcularExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        Ocular.config()
                .resultPath(Paths.get("D:\\Kodilla_course_private\\results"))
                .snapshotPath(Paths.get("D:\\Kodilla_course_private\\snapshots"))
                .globalSimilarity(95)
                .saveSnapshot(true);

        WorldTimePage page = new WorldTimePage(driver);

        page.open();
        page.compare();
        page.close();

    }
}