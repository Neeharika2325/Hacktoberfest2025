class Solution {
    public String longestCommonPrefix(String[] str) {
        String prefix=str[0];
        for(int i=1;i<str.length;i++){
        while(str[i].indexOf(prefix)!=0){//if whole string do not matches
            prefix=prefix.substring(0,prefix.length()-1);
            if(prefix.isEmpty())
            return "";}
        }
        return prefix;
    }
}
