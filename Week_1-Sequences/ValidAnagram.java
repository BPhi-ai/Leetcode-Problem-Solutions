public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(ValidAnagramSolution(s, t));
    }

    public static boolean ValidAnagramSolution(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] alpha = new int[26];
        for(int a = 0; a < s.length(); a++) {
            alpha[s.charAt(a) - 'a']++;
        }
        for(int b = 0; b < s.length(); b++) {
            alpha[t.charAt(b) - 'a']--;
        }

        for(int i: alpha) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }
}
