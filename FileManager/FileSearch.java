import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class FileSearch {
    public static String searchFile(String fileName) {
        Path startPath = Paths.get("documents");

        // On vérifie d'abord si le dossier racine existe
        if (!Files.exists(startPath)) {
            return "Dossier 'documents' introuvable.";
        }

        try (Stream<Path> stream = Files.walk(startPath)) {
            // On cherche le premier fichier qui correspond au nom
            Optional<Path> foundFile = stream
                .filter(Files::isRegularFile)
                .filter(path -> path.getFileName().toString().equals(fileName))
                .findFirst();

            // Si trouvé, on retourne le chemin, sinon une chaîne vide ou null
            return foundFile.map(Path::toString).orElse(null);
        } catch (IOException e) {
            return "Erreur lors de la recherche : " + e.getMessage();
        }
    }
}