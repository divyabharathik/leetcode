public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        StringBuilder word = new StringBuilder();
        boolean found = false;
        int i = s.length() - 1;
        while (i >= 0) {
            if(!found){
                if ((s.charAt(i) + "").equals(" ")) {
                    found =true;
                } else {
                    word.insert(0, s.charAt(i));
                }
            }
            i--;
        }
        return word.length();
    }

}
