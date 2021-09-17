import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Monitary_System {



    public int SellItem(int AmountSold, String item, String port) throws FileNotFoundException {

        File file2 =
                new File("src/Ports/"+port+".portdata");
        Scanner por = new Scanner(file2);

        if(por.hasNext(item))
        {
            File file =
                    new File("src/Items/"+item+".item");
            Scanner sc = new Scanner(file);

            return AmountSold * sc.nextInt();
        }
        else{
            return 0;
        }

    }
}


