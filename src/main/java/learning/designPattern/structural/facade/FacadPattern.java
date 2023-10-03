package learning.designPattern.structural.facade;

public class FacadPattern {
    public static void main(String[] args) {

        WebExplorerHelperFacade.generateExplorerReport("chrome", "html", "test");
        WebExplorerHelperFacade.generateExplorerReport("chrome", "Junit", "test");
        WebExplorerHelperFacade.generateExplorerReport("Firefox", "html", "test");
        WebExplorerHelperFacade.generateExplorerReport("Firefox", "Junit", "test");

    }
}

class WebExplorerHelperFacade {
    public static void generateExplorerReport(String explorer, String report, String test) {
        Driver driver = null;
        switch (explorer) {

            case "chrome" -> {
                driver = Chrome.getDriver();
                switch (report) {
                    case "html" -> Chrome.generateHtmlReport(test, driver);
                    case "Junit" -> Chrome.generateJunitReport(test, driver);
                }
            }
            case "Firefox" -> {
                driver = FireFox.getDriver();
                switch (report) {
                    case "html" -> FireFox.generateHtmlReport(test, driver);
                    case "Junit" -> FireFox.generateJunitReport(test, driver);
                }
            }

        }
    }
}


class Chrome {

    public static Driver getDriver() {
        return null;
    }

    public static void generateHtmlReport(String test, Driver driver) {
        System.out.println("Chrome HTML report is generated ....");
    }

    public static void generateJunitReport(String test, Driver driver) {
        System.out.println("Chrome Junit report is generated ....");
    }

}

class FireFox {

    public static Driver getDriver() {
        return null;
    }

    public static void generateHtmlReport(String test, Driver driver) {
        System.out.println("FireFox HTML report is generated ....");
    }

    public static void generateJunitReport(String test, Driver driver) {
        System.out.println("FireFox Junit report is generated ....");
    }
}


class Driver {

}