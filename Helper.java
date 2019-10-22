iimport java.awt.Desktop;
import java.net.URI;

public class Helper {


    public static void openURL (String url) {

        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(new URI(url));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Sorry could not open URL...");
        }

    }

}
