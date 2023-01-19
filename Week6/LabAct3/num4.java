/* 4. Given a string, compute recursively (no loops) a new string where all 
    the lowercase × chars have been changed to y chars
 */
package labact3;

public class num4 {
    public static String replaceXWithY(String str) {
        if (str.length() == 0) {
            return "";
        } else {
            if (str.charAt(0) == 'x') {
                return 'y' + replaceXWithY(str.substring(1));
            } else {
                return str.charAt(0) + replaceXWithY(str.substring(1));
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(replaceXWithY("xsunxflowerx"));
    }
}
