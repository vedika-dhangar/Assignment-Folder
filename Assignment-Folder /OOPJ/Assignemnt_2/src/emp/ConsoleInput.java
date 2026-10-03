package emp;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ConsoleInput {

    private static BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

    public static String getString() {

        try {
            return br.readLine();
        }
        catch (IOException e) {
            return "";
        }
    }

    public static int getInt() {

        try {
            return Integer.parseInt(br.readLine());
        }
        catch (Exception e) {
            return 0;
        }
    }
    
    public static double getDouble() {

        try {
            return Double.parseDouble(br.readLine());
        }
        catch (Exception e) {
            return 0.0;
        }
    }

    public static float getFloat() {

        try {
            return Float.parseFloat(br.readLine());
        }
        catch (Exception e) {
            return 0.0f;
        }
    }
}