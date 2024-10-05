/*


Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".


 */

public class Problem14 {

    public static void main(String[] args) {

        String[] arr = new String[]{"flower","flow","flight"};
        String result = longestCommonPrefix(arr);

        System.out.println(result);

    }

    static String longestCommonPrefix(String[] strs) {

        if(strs==null || strs.length == 0){
            return "";
        }



        String prefix = strs[0];

        for(int i=1 ; i<strs.length ; i++){

            while(strs[i].indexOf(prefix)!=0){

                prefix = prefix.substring(0,prefix.length()-1);

                if(prefix.isEmpty()){
                    return "";
                }
            }
        }


        return prefix;

    }
}
