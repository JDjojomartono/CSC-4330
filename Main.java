import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException
    {
        System.setIn(new FileInputStream(new File("test.txt")));
        Lexer lexer = new Lexer();
        Parser parser = new Parser(lexer);
        parser.start();
    }
}
