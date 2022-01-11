public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
//      longest Common Prefix
        String cp = strs[0];
        for (int i = 1; i < strs.length; i++) {
            //reduce the size of the first string until the next string is within the 1st string
            while (strs[i].indexOf(cp) != 0){
                cp = cp.substring(0,cp.length()-1);
            }
        }
        return cp;
    }
}
