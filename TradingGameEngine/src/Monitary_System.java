import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Monitary_System {



    public void SellItem(int AmountSold, String item, String port) throws FileNotFoundException {

        File file2 =
                new File("src/Ports/"+port+".portdata");
        Scanner por = new Scanner(file2);

        if(por.hasNext(item))
        {
            
            InitiateTrade(AmountSold, item, port);
        }
        else{
            ItemNotFound(item);
        }

    }
    
    public String InitiateTrade(int AmountSold, String item, String port) {
        //Remove Player item with removeitem(item, amountsold);
        
        File file =
                    new File("Items/"+item+".item");
            Scanner sc = new Scanner(file);

        
        int moneyowed = AmountSold * sc.hasNextInt;
        
        //Give money with giveplayermoney(moneyowed);
        
        //Add to port inventory with appendinventoryport(port);
        
        System.out.println("Successfully traded " + AmountSold + " " + item);
    }
}


