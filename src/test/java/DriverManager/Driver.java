package DriverManager;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import io.appium.java_client.windows.WindowsDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public final class Driver {
    private Driver() { // private constructor

    }
    static private String userName="teamit_eh8STI";
    static private String accessKey="UxZABzizx1iwPbzH1qnM";
    static public Object driver;
    static private final List<AppiumDriverLocalService> appiumDriverLocalServices = new ArrayList<>();

    public static void setUp(String environment) {
        try {
            switch (environment.toLowerCase()) {
                case "android" -> openAndroidDriver();
                case "ios" -> openIOSDriver();
                case "windows" -> openWindowsDriver();
                case "browser" -> openNativeBrowser();
                case "browserstack-android"-> openBrowserStackDriver("Android");
                case "browserstack-ios"-> openBrowserStackDriver("iOS");
                default -> {
                    driver = null;
                    System.out.println("No driver found in switch method from json file");
                }
            }
        } catch (Exception e) {
            System.out.println("Source: " + e.getCause());
            System.out.println("Message: " + e.getMessage());
            System.out.println("Stack Trace: " + Arrays.toString(e.getStackTrace()));
        }
    }

    private static void openBrowserStackDriver(String type) throws MalformedURLException {
        System.out.println("Starting BrowserStack Driver");
        System.out.println("Mobile Type: "+type);
        String url = "https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub";
        System.out.println("URL: "+url);
        if(type.equalsIgnoreCase("android")) {
            DesiredCapabilities capabilities = readCapabilities("./src/test/resources/data/browserStackAndroid.properties");
            driver = new AndroidDriver(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), capabilities);
        }
        else if(type.equalsIgnoreCase("ios")){
            DesiredCapabilities capabilities = readCapabilities("./src/test/resources/data/browserStackIOS.properties");
            driver = new IOSDriver(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), capabilities);
        }
        else throw new RuntimeException("BrowserStack Type:"+type+" is wrong");
        System.out.println("BrowserStack Driver: " + driver);
    }
    private static void openAndroidDriver() throws MalformedURLException {
        System.out.println("Starting Android Appium Service");
//        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        AppiumDriverLocalService setAppiumDriverLocalService = startAppium();
        DesiredCapabilities capabilities = readCapabilities("./src/test/resources/data/samsungS22Ultra.properties");
        capabilities.setCapability("enableMultiWindows", true);
        driver = new AndroidDriver(setAppiumDriverLocalService.getUrl(), capabilities);
        System.out.println("Appium Started");
        System.out.println("Android Driver: " + driver);
    }

    private static void openIOSDriver() {
        System.out.println("Starting IOS Appium Service");
        AppiumDriverLocalService iosAppiumDriverLocalService = startAppium();
        DesiredCapabilities capabilities = readCapabilities("./src/test/resources/data/iPoneProMax.properties");
        driver = new IOSDriver(iosAppiumDriverLocalService.getUrl(), capabilities);
        System.out.println("Appium Started");
        System.out.println("IOS Driver: " + driver);
    }

    private static void openWindowsDriver() {
        System.out.println("Starting Windows Appium Service");
        AppiumDriverLocalService windowsAppiumDriverLocalService = startAppium();
        DesiredCapabilities capabilities = readCapabilities("./src/test/resources/data/windows.properties");
        driver = new WindowsDriver(windowsAppiumDriverLocalService.getUrl(), capabilities);
        System.out.println("Appium Started");
        System.out.println("Windows Driver: " + driver);
    }

    private static void openNativeBrowser() {
        System.out.println("Starting Browser Driver Service");
        String browserName = getBrowserName();
        switch (browserName.toLowerCase()) {
            case "chrome" -> setupChromeBrowser();
            case "firefox" -> setupFirefoxBrowser();
            case "edge" -> setupEdgeBrowser();
            case "safari"-> setupSafariBrowser();
        }
        System.out.println("Initiated Browser Driver: " + driver);
    }

    private static void setupChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    private static void setupFirefoxBrowser() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    private static void setupSafariBrowser() {
        WebDriverManager.safaridriver().setup();
        driver = new SafariDriver();
    }

    private static void setupEdgeBrowser() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }

    private static AppiumDriverLocalService startAppium() {
        System.out.println("Setting Appium");
        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        AppiumDriverLocalService appiumDriverLocalService = builder.usingAnyFreePort().withArgument(GeneralServerFlag.BASEPATH, "/wd/hub/").withArgument(GeneralServerFlag.SESSION_OVERRIDE).build();
//        System.out.println("Service URL: " + appiumDriverLocalService.getUrl());
        if (!appiumDriverLocalService.isRunning()) {
            System.out.println("Appium Service Not Running");
            appiumDriverLocalService.start();
            System.out.println("Appium Service Started");
        }
        System.out.println("Appium Service: " + appiumDriverLocalService);
        appiumDriverLocalServices.add(appiumDriverLocalService);
        return appiumDriverLocalService;
    }

    private static DesiredCapabilities readCapabilities(String path) {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(path));
            DesiredCapabilities capabilities = new DesiredCapabilities();
            Enumeration<?> e = prop.propertyNames();

            while (e.hasMoreElements()) {
                String key = (String) e.nextElement();
                capabilities.setCapability(key, prop.getProperty(key));
            }
            return capabilities;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String getBrowserName() {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("./src/test/resources/data/browserConfig.properties"));
            return prop.getProperty("browser");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void stopAppium() {
        appiumDriverLocalServices.forEach(AppiumDriverLocalService::stop);
    }

    public static void stopBrowserDriver() {
        var browserName = getBrowserName();
        switch (browserName.toLowerCase()) {
            case "chrome" -> {
                var chromeDriver = (ChromeDriver) driver;
                chromeDriver.quit();
            }
            case "firefox" -> {
                var foreFoxDriver = (FirefoxDriver) driver;
                foreFoxDriver.quit();
            }
            case "edge" -> {
                var edgeDriver = (EdgeDriver) driver;
                edgeDriver.quit();
            }
        }
    }
}

