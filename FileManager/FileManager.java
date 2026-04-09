import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        Files.writeString(Paths.get(fileName), content);
    }

    public static String getContentFile(String fileName) throws IOException {
        return Files.readString(Paths.get(fileName));
    }

    public static void deleteFile(String fileName) {
        try {
            Files.deleteIfExists(Paths.get(fileName));
        } catch (IOException e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}