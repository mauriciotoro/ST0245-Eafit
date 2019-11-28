import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        Scan n = new Scan();
        try {
            n.readBicolor();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
