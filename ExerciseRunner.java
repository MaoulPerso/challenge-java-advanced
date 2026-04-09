import java.io.IOException;

public class ExerciseRunner {
    public static void main(String[] args) throws IOException {
        // Test 1: Only Alpha
        System.out.println(RegexMatch.containsOnlyAlpha("azejkdfhjsdf"));    // true
        System.out.println(RegexMatch.containsOnlyAlpha("azejkd fhjsdf"));   // false (à cause de l'espace)
        
        // Test 2: Start letter, End number
        System.out.println(RegexMatch.startWithLetterAndEndWithNumber("asjd jd34jds jkfd6f5")); // true
        System.out.println(RegexMatch.startWithLetterAndEndWithNumber("asjd jd34jds jkfd6."));   // false
        
        // Test 3: 3 successive A
        System.out.println(RegexMatch.containsAtLeast3SuccessiveA("sdjkAAAAAsdjksj"));    // true
        System.out.println(RegexMatch.containsAtLeast3SuccessiveA("sdjkAAsdaaasdjksj")); // false
    }
}