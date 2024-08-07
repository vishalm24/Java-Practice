import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        // int month = Integer.parseInt(firstMultipleInput[0]);

        // int day = Integer.parseInt(firstMultipleInput[1]);

        // int year = Integer.parseInt(firstMultipleInput[2]);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the month");
        int month = sc.nextInt();
        System.out.println("Please enter the day");
        int day = sc.nextInt();
        System.out.println("Please enter the year");
        int year = sc.nextInt();
        Result result = new Result();

        String res = result.findDay(month, day, year);

        System.out.println("Month= "+month+", Date= "+day+", Year= "+year+", Day= "+res);

        // bufferedWriter.write(res);
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}
