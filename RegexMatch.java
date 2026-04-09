public class RegexMatch {

    /**
     * Vérifie si la chaîne ne contient QUE des lettres (majuscules ou minuscules).
     */
    public static boolean containsOnlyAlpha(String s) {
        // ^ : début, [a-zA-Z] : lettres, * : n'importe quelle quantité, $ : fin
        return s.matches("^[a-zA-Z]*$");
    }
    
    /**
     * Vérifie si la chaîne commence par une lettre et finit par un chiffre.
     */
    public static boolean startWithLetterAndEndWithNumber(String s) {
        // [a-zA-Z] : une lettre au début
        // .* : n'importe quoi au milieu
        // [0-9] : un chiffre à la fin
        return s.matches("^[a-zA-Z].*[0-9]$");
    }
    
    /**
     * Vérifie si la chaîne contient au moins 3 'A' successifs.
     */
    public static boolean containsAtLeast3SuccessiveA(String s) {
        // .* : n'importe quoi avant
        // A{3,} : la lettre A, 3 fois ou plus
        // .* : n'importe quoi après
        return s.matches(".*A{3,}.*");
    }
}