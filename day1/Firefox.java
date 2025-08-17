package week1.day1;

public class Firefox {
    
    // Public variables (declared at class level, not inside main)
    public float browserVersion = 100.2f;
    public String browserName = "firefox";

    public static void main(String[] args) {
        // Create an object of Firefox class to access public variables
        Firefox fx = new Firefox();
        System.out.println("Browser name is: " + fx.browserName + 
                           "\nBrowser version is: " + fx.browserVersion);

        // Create an object of PrivateExample class
        PrivateExample pe = new PrivateExample();
        pe.displayDetails();
    }
}

class PrivateExample {
    // Private variables (class level)
    private boolean isVisible = true;
    private int releaseYear = 1998;
    private char browserLogo = 'f';

    // Public method to access private variables
    public void displayDetails() {
        System.out.println("Visibility: " + isVisible + 
                           "\nRelease year: " + releaseYear + 
                           "\nLogo: " + browserLogo);
    }
}
