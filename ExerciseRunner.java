public class ExerciseRunner {
    public static void main(String[] args) {
        String result = FileSearch.searchFile("file.txt");
        if (result != null) {
            System.out.println(result.replace("\\", "/")); // Force le slash pour le format attendu
        }
    }
}