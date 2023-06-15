class Solution {
    public String reverseVowels(String s) {
        String result="";
        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(list.contains(ch)) st.push(ch);
        }
         for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(list.contains(ch)) result+=st.pop();
            else result+=ch;
    }
    return result;
}
}
