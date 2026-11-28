class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())){
            return true;
        }
        boolean flag = false;
        for(int i=0;i<word.length();i++){
            if(i==0 && Character.isUpperCase(word.charAt(i))){
            }
            else if(Character.isUpperCase(word.charAt(i))){
                flag=true;
                break;
            }

        }
        return flag? false : true;
        
    }
}