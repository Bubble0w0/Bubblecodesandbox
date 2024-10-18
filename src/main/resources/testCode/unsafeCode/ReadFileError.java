import java.io.File;
import java.nio.file.Files;
import java.util.List;

public class ReadFileError {
    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");
        String filePath = userDir + File.separator + "src/main/resources/application.yml";
        List<String> alllines = Files.readAllLines(Path.get(filePath));
        System.out.println(String.join("\n",alllines));
    }
}