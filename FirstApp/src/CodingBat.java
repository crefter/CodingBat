import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CodingBat {

    public static void main(String[] args) {

        shiftLeft(new int[]{6, 2, 5, 3});
        tenRun(new int[]{2, 1, 10, 4, 5, 20, 4});
        pre4(new int[]{2, 1, 10, 4, 5, 20, 4});
        post4(new int[]{2, 1, 10, 4, 5, 20});
        notAlone(new int[]{1, 1, 1, 2}, 1);
    }

    static public int[] shiftLeft(int[] nums) {

        int[] a = new int[nums.length];
        int f = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            a[i] = nums[i + 1];
        }
        a[a.length - 1] = f;

        return a;
    }

    static public int[] tenRun(int[] nums) {

        int[] a = new int[nums.length];
        int t = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 10 == 0 || nums[i] == 0) {

                t = nums[i];

            }

            if (t != -1) {
                a[i] = t;
            } else {
                a[i] = nums[i];
            }

        }

        return a;
    }

    static public int[] pre4(int[] nums) {

        int n = 0;

        while (nums[n] != 4) {
            n++;
        }


        return Arrays.copyOf(nums, n);
    }

    static public int[] post4(int[] nums) {

        int n = nums.length - 1;

        while (nums[n] != 4) {
            n--;
        }

        return Arrays.copyOfRange(nums, n + 1, nums.length);
    }

    static public int[] notAlone(int[] nums, int val) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == val && i != nums.length - 1 && i != 0) {
                if (nums[i - 1] > nums[i + 1]) {
                    a[i] = nums[i - 1];
                } else {
                    a[i] = nums[i + 1];
                }
                if (nums[nums.length - 2] == 1) {
                    a[i] = nums[i - 1];
                }
            } else {
                a[i] = nums[i];
            }
        }
        return a;
    }

    static public int[] zeroFront(int[] nums) {


        return nums;
    }

    public boolean lastDigit(int a, int b) {

        return a % 10 == b % 10;

    }

    public String endUp(String str) {

        if (str.length() >= 3) {

            String sub = str.substring(str.length() - 3);
            str = str.substring(0, str.length() - 3);
            return str + sub.toUpperCase();

        } else {
            return str.toUpperCase();
        }

    }

    public String everyNth(String str, int n) {

        int a = str.length();
        String c = "";


        for (int i = 0; i < str.length(); i += n) {
            c += str.charAt(i);
        }


        return c;
    }

    public String stringTimes(String str, int n) {
        String h = str;
        int i = 1;
        if (n == 0) {
            return "";
        }
        while (i < n) {
            str += h;
            i++;
        }

        return str;
    }

    public String frontTimes(String str, int n) {

        String res = "";

        if (str.length() <= 3) {

            for (int i = 0; i < n; i++) {

                res += str;

            }
        } else {

            for (int i = 0; i < n; i++) {
                res += str.substring(0, 3);
            }

        }
        return res;
    }

    int countXX(String str) {

        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) count++;
        }

        return count;

    }

    boolean doubleX(String str) {
        boolean a = true;

        int fx = str.indexOf('x');

        if (fx == -1) return false;

        if (fx + 1 >= str.length()) return false;

        return str.substring(fx + 1, fx + 2).equals("x");
    }

    public String stringBits(String str) {

        String res = "";

        for (int i = 0; i < str.length(); i += 2) {
            res += str.substring(i, i + 1);
        }

        return res;

    }

    public String stringSplosion(String str) {

        String res = "";

        for (int i = 1; i <= str.length(); i++) {
            res += str.substring(0, i);
        }


        return res;
    }

    public int last2(String str) {

        int count = 0;

        if (str.length() < 2) return 0;

        String sub = str.substring(str.length() - 2);

        for (int i = 0; i < str.length() - 2; i++) {

            if (str.substring(i, i + 2).equals(sub)) {
                count++;
            }
        }

        return count;
    }

    public int arrayCount9(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }

        return count;

    }

    public boolean arrayFront9(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                return true;
            }
            if (i == 3) break;
        }


        return false;
    }

    public boolean array123(int[] nums) {
        if (nums.length > 2) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                    return true;
                }
            }
        }
        return false;

    }

    public int stringMatch(String a, String b) {

        int min = Math.min(a.length(), b.length());
        int count = 0;
        for (int i = 0; i < min - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) count++;
        }


        return count;
    }

    public String stringX(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {

            if (!(i > 0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("x"))) {
                result = result + str.substring(i, i + 1);
            }
        }
        return result;

    }

    public String altPairs(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result += str.substring(i, end);
        }

        return result;

    }

    public String stringYak(String str) {

        String res = "";
        for (int i = 0; i < str.length(); i++) {

            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i += 2;
            } else {
                res += str.charAt(i);
            }
        }
        return res;

    }

    public int array667(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {

                count++;

            }

        }

        return count;
    }

    public boolean noTriples(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {

            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false;
            }

        }

        return true;

    }

    public boolean has271(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {

            int f = nums[i];
            int t = nums[i + 1];
            int h = nums[i + 2];


            if ((t - f) == 5 && Math.abs(h - (f - 1)) <= 2) {
                return true;
            }

        }

        return false;
    }

    public Map<String, String> mapBully(Map<String, String> map) {

        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }

        return map;
    }

    public Map<String, String> mapShare(Map<String, String> map) {
        map.remove("c");

        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }

        return map;
    }

    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }

        return map;
    }

    public Map<String, String> topping1(Map<String, String> map) {

        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }

        map.put("bread", "butter");

        return map;
    }

    public Map<String, String> topping2(Map<String, String> map) {

        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }

        return map;
    }

    public Map<String, String> topping3(Map<String, String> map) {

        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }

        return map;
    }

    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }

        return map;
    }

    public Map<String, String> mapAB3(Map<String, String> map) {

        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        }
        if (!map.containsKey("a") && map.containsKey("b")) {
            map.put("a", map.get("b"));
        }

        return map;
    }

    public Map<String, String> mapAB4(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").length() > map.get("b").length()) {
                map.put("c", map.get("a"));
            } else if (map.get("b").length() > map.get("a").length()) {
                map.put("c", map.get("b"));
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }

        return map;
    }

    public String helloName(String name) {

        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {

        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {

        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {

        String front = out.substring(0, 2);
        String back = out.substring(2);

        return front + word + back;
    }

    public String extraEnd(String str) {

        String sub = "";

        if (str.length() >= 2) {

            sub = str.substring(str.length() - 2);
        }
        return sub + sub + sub;
    }

    public String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(0, 2);
        }

    }

    public String firstHalf(String str) {

        int a = str.length() / 2;

        return str.substring(0, a);

    }

    public String withoutEnd(String str) {

        if (str.length() >= 2) {

            return str.substring(1, str.length() - 1);
        } else {
            return str;
        }

    }

    public String comboString(String a, String b) {

        if (a.length() > b.length()) {
            return b + a + b;
        } else {
            return a + b + a;
        }

    }

    public String nonStart(String a, String b) {

        if (a.length() >= 1 && b.length() >= 1) {
            return a.substring(1) + b.substring(1);
        } else {
            return "";
        }

    }

    public String left2(String str) {

        if (str.length() >= 2) {
            String front = str.substring(0, 2);
            String back = str.substring(2);

            return back + front;
        } else {
            return str;
        }
    }

    public String right2(String str) {

        if (str.length() >= 2) {

            return str.substring(str.length() - 2) +
                    str.substring(0, str.length() - 2);
        } else {
            return str;
        }

    }

    public String theEnd(String str, boolean front) {

        if (front) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }

    }

    public String withouEnd2(String str) {

        if (str.length() >= 2) {
            return str.substring(1, str.length() - 1);
        } else {
            return "";
        }

    }

    public String middleTwo(String str) {

        int p = str.length() / 2;

        if (str.length() >= 4) {
            return str.substring(p - 1, p + 1);
        } else {
            return str;
        }

    }

    public boolean endsLy(String str) {

        return str.length() >= 2 && str.substring(str.length() - 2).equals("ly");

    }

    public String nTwice(String str, int n) {

        if (str.length() > 1) {

            return str.substring(0, n) + str.substring(str.length() - n);
        } else {
            return "";
        }

    }

    public String twoChar(String str, int index) {

        if (str.length() >= 2) {
            if (index + 2 > str.length() || index < 0) {
                return str.substring(0, 2);
            } else {
                return str.substring(index, index + 2);
            }

        }


        return str;
    }

    public String middleThree(String str) {

        int a = str.length() / 2;

        if (str.length() >= 3) {
            return str.substring(a - 1, a + 2);
        }

        return str;
    }

    public boolean hasBad(String str) {


        if (str.length() > 3) {

            if (str.substring(0, 3).equals("bad")) {
                return true;
            }

            if (str.substring(1, 4).equals("bad")) {
                return true;
            }

        }

        if (str.length() == 3) {
            return str.substring(0, 3).equals("bad");
        }

        return false;
    }

    public String atFirst(String str) {

        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else if (str.length() == 1) {
            return str + "@";
        }

        return "@@";

    }

    public String lastChars(String a, String b) {

        if (a.length() != 0 && b.length() != 0) {
            return a.substring(0, 1) + b.substring(b.length() - 1);
        } else if (a.length() == 0 && b.length() == 0) {
            return "@@";
        } else if (a.length() == 0) {
            return "@" + b.substring(b.length() - 1);
        } else if (b.length() == 0) {
            return a.substring(0, 1) + "@";
        }

        return a;
    }

    public String conCat(String a, String b) {

        if (a.length() >= 1 && b.length() >= 1) {
            if (a.substring(a.length() - 1).equals(b.substring(0, 1))) {
                return a + b.substring(1);
            }
        }
        return a + b;
    }

    public String lastTwo(String str) {

        if (str.length() > 2) {
            String front = str.substring(0, str.length() - 2);

            String sub1 = str.substring(str.length() - 2, str.length() - 1);
            String sub2 = str.substring(str.length() - 1);

            return front + sub2 + sub1;
        }

        if (str.length() == 2) {

            return str.substring(1, 2) + str.substring(0, 1);
        }

        return str;
    }

    public String seeColor(String str) {


        if (str.length() >= 3 && str.substring(0, 3).equals("red")) {
            return "red";
        } else if (str.length() >= 4 && str.substring(0, 4).equals("blue")) {
            return "blue";
        }

        return "";
    }

    public boolean frontAgain(String str) {

        if (str.length() >= 2) {

            return str.substring(0, 2).equals(str.substring(str.length() - 2));

        }

        return false;
    }

    public String minCat(String a, String b) {

        if (a.length() < b.length()) {

            return a + b.substring(b.length() - a.length());

        } else if (a.length() == b.length()) {

            return a + b;

        } else if (a.length() > b.length()) {

            return a.substring(a.length() - b.length()) + b;
        }

        return "";
    }

    public String extraFront(String str) {

        if (str.length() >= 2) {
            String sub = str.substring(0, 2);

            return sub + sub + sub;
        }

        return str + str + str;
    }

    public String without2(String str) {

        if (str.length() >= 2) {

            if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {

                return str.substring(2);

            } else {
                return str;
            }

        }

        return str;
    }

    public String deFront(String str) {

        if (str.length() >= 2) {

            if (str.substring(0, 1).equals("a") && str.substring(1, 2).equals("b")) {
                return str;
            }

            if (str.substring(0, 1).equals("a")) {
                return str.substring(0, 1) + str.substring(2);
            } else if (str.substring(1, 2).equals("b")) {
                return str.substring(1);
            } else {
                return str.substring(2);
            }

        }

        return str;
    }

    public String startWord(String str, String word) {

        if (str.length() == 0) {
            return "";
        }

        String f = str.substring(1);
        String sec = word.substring(1);

        if (str.startsWith(word)) {
            return str.substring(0, word.length());
        } else if (f.startsWith(sec)) {
            return str.substring(0, word.length());
        }

        return "";
    }

    public String withoutX(String str) {

        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }

        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }

    public String withoutX2(String str) {

        if (str.length() >= 1) {
            if (str.equals("xx") || str.equals("x")) {
                return "";
            }

            if (str.substring(1, 2).equals("x")) {
                str = str.substring(0, 1) + str.substring(2);
            }
            if (str.substring(0, 1).equals("x")) {
                str = str.substring(1);
            }

        }

        return str;
    }

    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;

    }

    public boolean sameFirstLast(int[] nums) {

        return nums.length >= 1 && nums[0] == nums[nums.length - 1];

    }

    public int[] makePi() {
        int[] Pi = {3, 1, 4};

        return Pi;
    }

    public boolean commonEnd(int[] a, int[] b) {

        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);

    }

    public int sum3(int[] nums) {

        return nums[0] + nums[1] + nums[2];
    }

    public int[] rotateLeft3(int[] nums) {

        return new int[]{nums[1], nums[2], nums[0]};
    }

    public int[] reverse3(int[] nums) {

        return new int[]{nums[2], nums[1], nums[0]};
    }

    public int[] maxEnd3(int[] nums) {

        int a = 0;

        if (nums[0] > nums[2]) {
            a = nums[0];
        } else {
            a = nums[2];
        }
        return new int[]{a, a, a};
    }

    public int sum2(int[] nums) {
        if (nums.length >= 2) {

            return nums[0] + nums[1];
        }
        if (nums.length == 0) {
            return 0;
        }

        return nums[0];
    }

    public int[] middleWay(int[] a, int[] b) {

        return new int[]{a[1], b[1]};
    }

    public int[] makeEnds(int[] nums) {

        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public boolean has23(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                return true;
            }
        }

        return false;

    }

    public boolean no23(int[] nums) {


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                return false;
            }
        }

        return true;
    }

    public int[] makeLast(int[] nums) {

        int[] a = new int[(nums.length) * 2];
        a[a.length - 1] = nums[nums.length - 1];

        return a;
    }

    public boolean double23(int[] nums) {
        if (nums.length < 2) {
            return false;
        }

        if (nums.length == 2) {
            return (nums[nums.length - 2] == 2 && nums[nums.length - 1] == 2) ||
                    (nums[nums.length - 2] == 3 && nums[nums.length - 1] == 3);
        }

        return false;
    }

    public int[] fix23(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }

        }

        return nums;
    }

    public int start1(int[] a, int[] b) {

        int cons = 0;

        if (a.length >= 1 && a[0] == 1) {
            cons++;
        }
        if (b.length >= 1 && b[0] == 1) {
            cons++;
        }

        return cons;
    }

    public int[] biggerTwo(int[] a, int[] b) {

        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];

        if (sumA > sumB) {
            return a;
        } else if (sumA < sumB) {
            return b;
        } else {
            return a;
        }
    }

    public int[] makeMiddle(int[] nums) {

        if (nums.length >= 0) {

            int mid = nums.length / 2;

            return new int[]{nums[mid - 1], nums[mid]};
        }

        return nums;
    }

    public int[] plusTwo(int[] a, int[] b) {


        return new int[]{a[0], a[1], b[0], b[1]};
    }

    public int[] swapEnds(int[] nums) {

        int[] c = new int[nums.length];

        c[0] = nums[nums.length - 1];
        c[c.length - 1] = nums[0];

        for (int i = 1; i < nums.length - 1; i++) {
            c[i] = nums[i];
        }

        return c;
    }

    public int[] midThree(int[] nums) {

        int mid = nums.length / 2;

        return new int[]{nums[mid - 1], nums[mid], nums[mid + 1]};
    }

    public int maxTriple(int[] nums) {
        int a = 0;
        int one = nums[0];
        int two = nums[nums.length - 1];
        int three = nums[nums.length / 2];

        if (one > two) {
            a = one;
        } else {
            a = two;
        }

        if (a > three) {
            return a;
        } else {
            a = three;
        }

        return a;
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        } else {
            return new int[]{nums[0], nums[1]};
        }
    }

    public boolean unlucky1(int[] nums) {

        if (nums.length >= 2) {
            for (int i = 0; i < 2; i++) {
                if (nums[i] == 1 && nums[i + 1] == 3) {
                    return true;
                }
            }

            for (int i = nums.length - 1; i > nums.length - 2; i--) {
                if (nums[i - 1] == 1 && nums[i] == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public int[] make2(int[] a, int[] b) {

        if (a.length >= 2) {
            return new int[]{a[0], a[1]};
        } else if (a.length == 1) {
            return new int[]{a[0], b[0]};
        } else {
            return new int[]{b[0], b[1]};
        }

    }

    public int[] front11(int[] a, int[] b) {

        if (a.length == 0 && b.length == 0) {
            return new int[0];
        }

        if (a.length >= 1 && b.length >= 1) {
            return new int[]{a[0], b[0]};
        } else if (a.length == 0 && b.length >= 1) {
            return new int[]{b[0]};
        } else if (b.length == 0 && a.length >= 1) {
            return new int[]{a[0]};
        }

        return a;
    }

    public Map<String, Integer> word0(String[] strings) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String s : strings) {
            map.put(s, 0);
        }

        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {

        Map<String, Integer> map = new HashMap();

        for (String s : strings) {
            map.put(s, s.length());
        }

        return map;
    }

    public Map<String, String> pairs(String[] strings) {

        Map<String, String> map = new HashMap();

        for (String s : strings) {
            map.put(s.substring(0, 1), s.substring(s.length() - 1));
        }

        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {

        Map<String, Integer> map = new HashMap();

        for (int i = 0; i < strings.length; i++) {
            int count = 0;
            for (int j = 0; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) {
                    count++;
                }
            }
            map.put(strings[i], count);
        }

        return map;
    }

    public Map<String, String> firstChar(String[] strings) {

        Map<String, String> map = new HashMap();

        for (String s : strings) {

            map.put(s.substring(0, 1), map.getOrDefault(s.substring(0, 1), "") + s);

        }

        return map;
    }

    public String wordAppend(String[] strings) {

        String a = "";

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String currentString : strings) {
            int i = 0;
            if (map.containsKey(currentString)) {
                i = map.get(currentString) + 1;
                map.put(currentString, i);
                if (i % 2 == 0) {
                    a = a + currentString;
                }
            } else {
                map.put(currentString, i + 1);
            }

        }

        return a;
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Boolean> map = new HashMap();

        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, false);
            } else {
                map.put(s, true);
            }
        }

        return map;
    }

    public String[] allSwap(String[] strings) {
        final Map<Character, Integer> potentialSwap = new HashMap<>();

        for (int thisIndex = 0; thisIndex < strings.length; thisIndex++) {
            if (strings[thisIndex].isEmpty()) {
                continue; // skip empty strings
            }

            final Character firstChar = strings[thisIndex].charAt(0); // box charAt(0)
            // remove firstChar from the map. If it's not found, returns null
            final Integer potentialIndex = potentialSwap.remove(firstChar);

            if (potentialIndex != null) {
                final int thatIndex = potentialIndex; // unbox potentialIndex
                // swap values at thisIndex and thatIndex
                final String temp = strings[thatIndex];
                strings[thatIndex] = strings[thisIndex];
                strings[thisIndex] = temp;
            } else {
                // save the index for possible swapping later
                potentialSwap.put(firstChar, thisIndex); // box thisIndex
            }
        }

        return strings;
    }

    public String[] firstSwap(String[] strings) {

        Map<String, Integer> map = new HashMap();
        String[] result = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {

            String ch = strings[i].substring(0, 1);

            if (map.containsKey(ch) && map.get(ch) >= 0) {
                int p = map.get(ch);
                map.put(ch, -1);
                result[i] = result[p];
                result[p] = strings[i];
            } else {
                result[i] = strings[i];
                if (!map.containsKey(ch))
                    map.put(ch, i);
            }

        }
        return result;
    }

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend && cigars >= 40) {
            return true;
        } else return cigars >= 40 && cigars <= 60;

    }

    public int dateFashion(int you, int date) {
        if (date <= 2 || you <= 2) {
            return 0;
        } else if (you >= 8 || date >= 8) {
            return 2;
        } else {
            return 1;
        }
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {

        if (temp <= 90 && temp >= 60) {
            return true;
        }
        return isSummer && (temp <= 100 && temp >= 60);

    }

    public int caughtSpeeding(int speed, boolean isBirthday) {

        if (isBirthday) {
            if (speed <= 65) {
                return 0;
            } else if (speed >= 66 && speed <= 85) {
                return 1;
            } else {
                return 2;
            }
        }
        if (speed <= 60) {
            return 0;
        } else if (speed >= 61 && speed <= 80) {
            return 1;
        } else {
            return 2;
        }

    }

    public int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum <= 19 && sum >= 10) {
            return 20;
        }

        return sum;
    }

    public String alarmClock(int day, boolean vacation) {

        if (!vacation) {
            if (day >= 1 && day <= 5) {
                return "7:00";
            } else {
                return "10:00";
            }
        } else {
            if (day >= 1 && day <= 5) {
                return "10:00";
            } else {
                return "off";
            }
        }

    }

    public boolean love6(int a, int b) {

        if (a == 6 || b == 6) {
            return true;
        } else return (a + b) == 6 || Math.abs(a - b) == 6;

    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode && (n >= 10 || n <= 1)) {
            return true;
        } else return n >= 1 && n <= 10 && !outsideMode;

    }

    public boolean specialEleven(int n) {

        return n % 11 == 0 || n % 11 == 1;

    }

    public boolean more20(int n) {

        return n % 20 == 1 || n % 20 == 2;

    }

    public boolean old35(int n) {

        return n % 3 == 0 ^ n % 5 == 0;

    }

    public boolean less20(int n) {

        return n % 20 == 18 || n % 20 == 19;

    }

    public boolean nearTen(int num) {
        return num % 10 < 3 || num % 10 >= 8;

    }

    public int teenSum(int a, int b) {
        int sum = a + b;

        if (a >= 13 && a <= 19 || b >= 13 && b <= 19) {
            return 19;
        }

        return sum;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

        if (!isAsleep && !isMorning) {
            return true;
        }
        return !isAsleep && isMorning && isMom;

    }

    public int teaParty(int tea, int candy) {

        if (tea < 5 || candy < 5) {
            return 0;
        }
        if (tea >= candy * 2 || candy >= tea * 2) {
            return 2;
        }
        if (tea >= 5 && candy >= 5) {
            return 1;
        }

        return 3;
    }

    public String fizzString(String str) {
        boolean f = str.startsWith("f");
        boolean b = str.endsWith("b");

        if (f && b) {
            return "FizzBuzz";
        }
        if (f) return "Fizz";
        if (b) return "Buzz";

        return str;
    }

    public String fizzString2(int n) {
        String voskl = "!";
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz" + voskl;
        }
        if (n % 3 == 0) {
            return "Fizz" + voskl;
        }
        if (n % 5 == 0) {
            return "Buzz" + voskl;
        }

        return n + voskl;
    }

    public boolean twoAsOne(int a, int b, int c) {

        return Math.abs(a - b) == Math.abs(c) || Math.abs(a + b) == Math.abs(c);

    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {

        if (bOk && c > b) {
            return true;
        } else return b > a && c > b;

    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {

        if (equalOk) {
            return (b >= a && c >= b);
        } else {
            return (b > a && c > b);
        }

    }

    public boolean lastDigit(int a, int b, int c) {
        int aa = a % 10;
        int bb = b % 10;
        int cc = c % 10;

        if (aa == cc) {
            return true;
        }
        if (aa == bb) {
            return true;
        }
        return bb == cc;

    }

    public boolean lessBy10(int a, int b, int c) {

        int ab = Math.abs(a - b);
        int bc = Math.abs(b - c);
        int ac = Math.abs(a - c);

        return ab >= 10 || bc >= 10 || ac >= 10;

    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {

        if (!noDoubles) {
            return die1 + die2;
        } else {
            if (die1 == 6) {
                die1 = 1;
            }
            if (die1 == die2) {
                die1++;
                return die1 + die2;
            }

            return die1 + die2;
        }
    }

    public int maxMod5(int a, int b) {

        if (a == b) {
            return 0;
        }
        if (a % 5 == b % 5) {
            return Math.min(a, b);
        }

        return Math.max(a, b);
    }

    public int redTicket(int a, int b, int c) {

        if (a == b && a == c) {
            if (a == 2) {
                return 10;
            }
            return 5;
        }

        if (a != b && a != c) {
            return 1;
        }

        return 0;
    }

    public int greenTicket(int a, int b, int c) {

        if (a != b && a != c && b != c) {
            return 0;
        }
        if (a == b && a == c) {
            return 20;
        }

        if (a == b || a == c || b == c) {
            return 10;
        }

        return a;
    }

    public int blueTicket(int a, int b, int c) {

        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if (ab == 10 || bc == 10 || ac == 10) {
            return 10;
        }

        if (ab - bc == 10 || ab - ac == 10) {
            return 5;
        }

        return 0;
    }

    public boolean shareDigit(int a, int b) {

        return a / 10 == b % 10 || a % 10 == b / 10 || a % 10 == b % 10 || a / 10 == b / 10;

    }

    public int sumLimit(int a, int b) {

        int sum = a + b;
        if (String.valueOf(sum).length() == String.valueOf(a).length()) {
            return a + b;
        } else {
            return a;
        }
    }

    public boolean makeBricks(int small, int big, int goal) {

        return (goal <= (big * 5) + small) && (goal % 5 <= small);

    }

    public int loneSum(int a, int b, int c) {
        int sum = 0;
        if (a != b && a != c) {
            sum += a;
        }
        if (b != a && b != c) {
            sum += b;
        }
        if (c != a && c != b) {
            sum += c;
        }
        return sum;

    }

    public int luckySum(int a, int b, int c) {

        if (a == 13) {
            return 0;
        }

        if (b == 13) {
            return a;
        }

        if (c == 13) {
            return a + b;
        }

        return a + b + c;
    }

    public int noTeenSum(int a, int b, int c) {

        int aa = fixTeen(a);
        int bb = fixTeen(b);
        int cc = fixTeen(c);

        return aa + bb + cc;

    }

    public int fixTeen(int n) {
        if (n >= 13 && n < 15 || n > 16 && n <= 19) {
            return 0;
        }

        return n;
    }

    public int roundSum(int a, int b, int c) {

        return round10(a) + round10(b) + round10(c);

    }

    public int round10(int num) {

        if (num % 10 >= 5) {

            return (10 - num % 10) + num;

        } else {

            return num - num % 10;

        }

    }

    public boolean closeFar(int a, int b, int c) {

        if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) {
            return true;
        }
        return Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(c - b) >= 2;
    }

    public int blackjack(int a, int b) {
        int aa = a;
        int bb = b;

        if (aa > 21) {
            aa = 0;
        }
        if (bb > 21) {
            bb = 0;
        }

        if (aa > bb) {
            return aa;
        } else {
            return bb;
        }
    }

    public boolean evenlySpaced(int a, int b, int c) {

        int[] aa = {a, b, c};
        Arrays.sort(aa);

        int difsm = aa[1] - aa[0];
        int difmb = aa[2] - aa[1];

        return difsm == difmb;

    }

    public int makeChocolate(int small, int big, int goal) {

        int a = (goal - 5 * big);

        if (a <= small && a >= 0) return a;
        if (a < 0 && goal % 5 <= small) return goal % 5;

        return -1;
    }

    public List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }

    public List<String> addStar(List<String> strings) {
        strings.replaceAll(s -> s + "*");
        return strings;
    }

    public List<String> copies3(List<String> strings) {
        strings.replaceAll(s -> s + s + s);
        return strings;
    }

    public List<String> moreY(List<String> strings) {
        strings.replaceAll(s -> "y" + s + "y");
        return strings;
    }

    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n -> (n + 1) * 10);
        return nums;
    }

    public List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n % 10);
        return nums;
    }

    public List<String> lower(List<String> strings) {

        strings.replaceAll(s -> s.toLowerCase());
        return strings;

    }

    public List<String> noX(List<String> strings) {

        return strings.stream()
                .map(s -> s.replaceAll("x", ""))
                .collect(Collectors.toList());

    }

    public String doubleChar(String str) {
        String a = "";

        for (int i = 0; i < str.length(); i++) {

            a += str.substring(i, i + 1) + str.substring(i, i + 1);

        }

        return a;
    }

    public int countHi(String str) {

        int a = 0;

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.substring(i, i + 2).equals("hi")) {
                a += 1;
            }

        }

        return a;
    }

    public boolean catDog(String str) {

        int countCat = 0;
        int countDog = 0;

        for (int i = 0; i < str.length() - 2; i++) {

            if (str.substring(i, i + 3).equals("cat")) countCat++;
            if (str.substring(i, i + 3).equals("dog")) countDog++;

        }

        return countCat == countDog;

    }

    public int countCode(String str) {

        int result = 0;

        for (int i = 0; i < str.length() - 3; i++) {

            if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
                result++;
            }

        }

        return result;
    }

    public boolean endOther(String a, String b) {

        int lengthB = 0;
        int lengthS = 0;
        if (a.length() >= b.length()) {
            lengthB = a.length();
            lengthS = b.length();
            return a.substring(lengthB - lengthS, lengthB).toLowerCase().equals(b.toLowerCase());
        } else {
            lengthB = b.length();
            lengthS = a.length();
            return b.substring(lengthB - lengthS, lengthB).toLowerCase().equals(a.toLowerCase());
        }


    }

    public boolean xyzThere(String str) {

        for (int i = 0; i < str.length() - 2; i++) {

            boolean xyz = str.substring(i, i + 3).equals("xyz");
            if (xyz && i == 0) {
                return true;
            }
            if (xyz && str.charAt(i - 1) != '.') {
                return true;
            }
        }

        return false;
    }

    public boolean bobThere(String str) {

        for (int i = 0; i < str.length() - 2; i++) {

            if (str.substring(i, i + 1).equals("b") && str.substring(i + 2, i + 3).equals("b")) {
                return true;
            }
        }

        return false;
    }

    public boolean xyBalance(String str) {

        return (str.indexOf('x') == -1) || str.lastIndexOf('x') < str.lastIndexOf('y');
    }

    public String mixString(String a, String b) {
        int l = 0;
        String res = "";
        String h = "";
        if (a.length() <= b.length()) {
            l = a.length();
            h = b.substring(l);
        } else {
            l = b.length();
            h = a.substring(l);
        }

        for (int i = 0; i < l; i++) {

            res += a.substring(i, i + 1) + b.substring(i, i + 1);

        }

        return res + h;
    }

    public String repeatEnd(String str, int n) {

        String result = "";
        for (int i = 0; i < n; i++) {

            result += str.substring(str.length() - n);

        }

        return result;
    }

    public String repeatFront(String str, int n) {

        String result = "";

        for (int i = n; i <= str.length() && i >= 0; i--) {

            result += str.substring(0, i);

        }

        return result;
    }

    public String repeatSeparator(String word, String sep, int count) {

        if (count == 0) {
            return "";
        }
        String result = word;
        for (int i = 0; i < count - 1; i++) {

            result += sep + word;
        }

        return result;
    }

    public boolean prefixAgain(String str, int n) {

        String pre = str.substring(0, n);

        return str.substring(1).contains(pre);

    }

    public boolean xyzMiddle(String str) {

        if (str.equals("xyz")) {
            return true;
        }

        for (int i = 0; i < str.length() - 3; i++) {

            if (str.substring(i, i + 3).equals("xyz") && Math.abs(str.length() - i - 3 - i) <= 1) {
                return true;
            }

        }

        return false;
    }

    public String getSandwich(String str) {

        String res = "";

        if (str.length() < 9) {
            res = "";
        } else {

            int i = str.indexOf("bread");
            int j = str.lastIndexOf("bread");

            if (i != j) {

                res = str.substring(i + 5, j);

            }
        }

        return res;
    }

    public boolean sameStarChar(String str) {

        for (int i = 1; i < str.length() - 1; i++) {

            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }
        }


        return true;
    }

    public String oneTwo(String str) {

        String temp = "";

        for (int i = 0; i < str.length() - 2; i += 3) {

            temp = temp + str.substring(i + 1, i + 3) + str.charAt(i);

        }

        return temp;
    }

    public String zipZap(String str) {

        return str.replaceAll("z.p", "zp");
    }

    public String starOut(String str) {
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*' || (i > 0 && str.charAt(i - 1) == '*')) continue;
            if (i < str.length() - 1 && str.charAt(i + 1) == '*') continue;

            res = res + str.charAt(i);
        }

        return res;

    }

    public String plusOut(String str, String word) {

        if (str.contains(word)) {

            str = str.replace(word, "**");
            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) != '*') {

                    str = str.replace(str.substring(i, i + 1), "+");

                }

            }

        }

        str = str.replace("**", word);
        return str;

    }

    public String wordEnds(String str, String word) {
        String res = "";
        int sLen = str.length();
        int wLen = word.length();

        for (int i = 0; i < sLen - wLen + 1; i++) {

            String temp = str.substring(i, i + wLen);
            if (i > 0 && temp.equals(word)) {

                res += str.substring(i - 1, i);

            }

            if (i < sLen - wLen && temp.equals(word)) {

                res += str.substring(wLen + i, wLen + i + 1);

            }

        }

        return res;
    }

    public int countEvens(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {

                a++;

            }

        }

        return a;
    }

    public int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {

            max = Math.max(nums[i], max);
            min = Math.min(min, nums[i]);

        }


        return max - min;
    }

    public int centeredAverage(int[] nums) {

        Arrays.sort(nums);
        int a = 0;
        int sum = 0;
        for (int i = 1; i < nums.length - 1; i++) {

            a++;
            sum += nums[i];

        }

        return sum / a;
    }

    public int sum13(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums.length > 0) {

                if (nums[i] < 13 || nums[i] > 13) sum += nums[i];
                else i++;

            }

        }

        return sum;
    }

    public int sum67(int[] nums) {

        int sum = 0;
        boolean noSum = false;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 6) noSum = true;
            if (!noSum) sum += nums[i];
            if (nums[i] == 7) noSum = false;

        }

        return sum;
    }

    public boolean has22(int[] nums) {

        boolean f = false;
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 2 && nums[i + 1] == 2) {

                f = true;

            }

        }

        return f;
    }

    public boolean lucky13(int[] nums) {

        boolean noCon = true;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1 || nums[i] == 3) {
                noCon = false;
            }

        }

        return noCon;
    }

    public boolean sum28(int[] nums) {

        int sumOfTwo = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 2) {

                sumOfTwo += 2;

            }

        }

        return sumOfTwo == 8;
    }

    public boolean more14(int[] nums) {

        int c1 = 0;
        int c4 = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) c1++;
            if (nums[i] == 4) c4++;

        }
        return c1 > c4;
    }

    public int[] fizzArray(int n) {

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = i;

        }

        return a;
    }

    public boolean only14(int[] nums) {

        boolean a = true;
        for (int i = 0; i < nums.length; i++) {

            if (nums[0] != 0) {
                if (nums[i] == 1 || nums[i] == 4) {
                    a = true;
                } else {
                    a = false;
                    break;
                }
            }
        }
        return a;
    }

    public String[] fizzArray2(int n) {

        String[] res = new String[n];

        for (int i = 0; i < n; i++) {

            res[i] = String.valueOf(i);

        }

        return res;
    }

    public boolean no14(int[] nums) {

        boolean one = false;
        boolean four = false;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                one = true;
            }
            if (nums[i] == 4) {

                four = true;
            }
        }

        return !(one && four);
    }

    public boolean isEverywhere(int[] nums, int val) {

        boolean a = true;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] != val && nums[i + 1] != val) {

                a = false;

            }
        }

        return a;
    }

    public boolean either24(int[] nums) {

        boolean twos = false;
        boolean fours = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) twos = true;
            if (nums[i] == 4 && nums[i + 1] == 4) fours = true;
        }
        return (twos ^ fours);
    }

    public int matchUp(int[] nums1, int[] nums2) {

        int count = 0;
        for (int i = 0; i < nums1.length; i++) {

            if (Math.abs(nums1[i] - nums2[i]) <= 2 && Math.abs(nums1[i] - nums2[i]) != 0) {
                count++;
            }

        }

        return count;
    }

    public boolean has77(int[] nums) {

        boolean res = false;

        for (int i = 0; i < nums.length - 1; i++) {

            if ((nums[i] == 7 && nums[i + 1] == 7) || (i < nums.length - 2 && nums[i] == 7 && nums[i + 2] == 7)) {
                res = true;
            }

        }

        return res;
    }

    public boolean has12(int[] nums) {

        boolean res = false;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j < nums.length; j++) {

                if (nums[i] == 1 && nums[j] == 2) {

                    res = true;

                }

            }

        }

        return res;
    }

    public boolean modThree(int[] nums) {

        boolean res = false;

        for (int i = 0; i < nums.length - 2; i++) {

            int f = nums[i];
            int s = nums[i + 1];
            int t = nums[i + 2];

            if ((f % 2 == 0 && s % 2 == 0 && t % 2 == 0) || (f % 2 != 0 && s % 2 != 0 && t % 2 != 0)) {
                res = true;
            }

        }

        return res;
    }

    public boolean haveThree(int[] nums) {

        int count = 0;

        if (nums.length >= 1 && nums[0] == 3)
            count++;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == 3 && nums[i - 1] == 3)
                return false;

            if (nums[i] == 3) {
                count++;
            }

        }

        return count == 3;
    }

    public boolean twoTwo(int[] nums) {

        int len = nums.length;
        boolean result = true;
        boolean found = false;

        for (int i = 0; i < len; i++) {
            if (nums[i] != 2) found = false;

            if (nums[i] == 2 && found) result = true;

            if (nums[i] == 2 && !found) {
                found = true;
                result = false;
            }

        }
        return result;

    }

    public boolean sameEnds(int[] nums, int len) {

        int[] f = new int[len];
        int[] s = new int[len];
        boolean t = false;

        if (len == 0) {

            t = true;

        }

        for (int i = 0; i < len; i++) {

            t = nums[i] == nums[nums.length - len + i];

        }


        return t;
    }

    public boolean tripleUp(int[] nums) {

        boolean t = false;

        for (int i = 0; i < nums.length - 2; i++) {

            if (nums[i + 2] - nums[i + 1] == 1 && nums[i + 1] - nums[i] == 1) {
                t = true;
                break;
            } else
                t = false;

        }

        return t;
    }

    public int[] fizzArray3(int start, int end) {

        int s = start;
        int e = end;
        int[] arr = new int[e - s];

        for (int i = 0; i < e - s; i++) {

            arr[i] = i + s;

        }

        return arr;
    }


}
