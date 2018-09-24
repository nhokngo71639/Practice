import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) throws FileNotFoundException {
        int dem = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input student list: ");
        File file = new File(scanner.nextLine());
        sc = new Scanner(file);
        System.out.println("Hello World This is TDTU");
        while(sc.hasNextLine()){
            System.out.print("Hello World I am " + scanner.nextLine()+ "\n");
            dem++;
        }
        System.out.print("Total " + count + " Students");
   }
}
