package strings;

public class ReplaceAllDigitsWithCharacters {
    public static String replaceDigits(String s) {
        int l=s.length();
        StringBuilder sb=new StringBuilder();
        int i=0;

        for(i=0; i<l;i++){
            if(i%2==0)
                sb.append(s.charAt(i));
            else
                sb.append((char)(((int)s.charAt(i) - 48) + ((int)(s.charAt(i-1)))));
        }
        return sb.toString();
    }

}
