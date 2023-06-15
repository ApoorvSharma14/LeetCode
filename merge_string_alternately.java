class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder("");
        String result="";
        int i=0,j=0;
        while(i<word1.length() && j<word2.length()){
            str.append(word1.charAt(i));
            str.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i<word1.length()){
            str.append(word1.charAt(i));
            i++;
        }
        while(j<word2.length()){
            str.append(word2.charAt(j));
            j++;
        }

        result=str.toString();
        return result;

    }
}
