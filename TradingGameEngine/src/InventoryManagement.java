import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InventoryManagement {
    public void display_inventory(String user) throws FileNotFoundException {
        File file =
                new File("Users/"+user+".inventory");
        Scanner sc = new Scanner(file);
    }
}