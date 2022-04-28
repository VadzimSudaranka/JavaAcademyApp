public class JavaAcademyApp {
    public static void main(String[] args) {
        String argument = "JavaAcademy";
            int[] symbols = new int[26];
            for (char c : argument.toCharArray()) {
                if ((c >= 'a') && (c <= 'z')) {
                    symbols[c - 'a']++;
                } else if ((c >= 'A') && (c <= 'Z')) {
                    symbols[c - 'A']++;
                }
            }
            for (int i = 0; i < 26; i++){
                if (symbols[i] != 0){
                    System.out.println((char) ('a' + i) + ": " + symbols[i]);
                }
            }
        }
    }

