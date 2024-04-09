public class StringBuilders {
    
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i < str.length(); i++){      //Time complexity here O(n).
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String compress(String str){
        String newStr = "";

        for(int i = 0; i < str.length(); i++){ //Time complexity here will be O(n).
            Integer count = 1;
            
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;    
            }

            newStr += str.charAt(i);

            if (count > 1) {
                newStr += count.toString();
            }

        }

        return newStr;
    }

    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Dushyant");
        // for(char ch = 'a'; ch <= 'z'; ch++){    // Time complexity here is O(26)
        //     sb.append(ch);
        // }
        // System.out.println(sb);

        // String str = "hi, i am dushyant";
        // System.out.println(toUpperCase(str));

        String str = "aaabbcdd";
        System.out.println(compress(str));
    }
}
