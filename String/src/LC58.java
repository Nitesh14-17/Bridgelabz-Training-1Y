public class LC58 {
    public int lengthOfLastWord(String s) {
        String[] arr =s.split(" ");
        String last= arr[arr.length-1];
        return last.length();
    }
}
