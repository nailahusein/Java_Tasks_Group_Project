package narmin.week04;

public class task03 {
    public static class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AAABBBCCC";
        String result = removeDup(str);
        System.out.println("String with duplicates removed: " + result);
    }

    public static String removeDup(String str) {
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isDuplicate = false;


            for (int j = 0; j < sb.length(); j++) {
                if (currentChar == sb.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            // If the current character is not a duplicate, append it to the StringBuilder
            if (!isDuplicate) {
                sb.append(currentChar);
            }
        }
        // Convert StringBuilder to String and return
        return sb.toString();
    }
}


    //String -- Remove Duplicates
        //Write a return method that can remove the duplicated values from
        //String
        //Ex: removeDup("AAABBBCCC") ==> ABC


}
