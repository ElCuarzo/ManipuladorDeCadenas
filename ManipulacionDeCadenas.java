public class ManipulacionDeCadenas {
    public String trimAndConcat(String str1, String str2) {
        String str1text = str1.trim();
        String str2text = str2.trim();
        String concatString = str1text + str2text;
        return concatString;
    }

    public int getIndexOrNull(String str, char letter) {
        int index = str.indexOf(letter);
        return index;
    }

    public int getIndexOrNullV2(String str, String str1) {
        int getindex = str.indexOf(str1);
        return getindex;
    }

    public String concatSubStringV2(String str1, int Star, int End, String str2) {
        String subStr = str1.substring(Star, End);
        String concatstr = subStr + str2;
        return concatstr;
    }
}