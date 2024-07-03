import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {

        int num = 0;

        //I instantiated bufferedReader in the try parenthesis to avoid closing it manually after getting user input
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            num = Integer.parseInt(br.readLine());
            System.out.println(num);

        } catch (Exception  e){
            System.out.println("something went wrong ");

        } finally {

        }
    }
}