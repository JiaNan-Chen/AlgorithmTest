import java.util.ArrayList;
import java.util.HashMap;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author chenjianan
 * @create 2021/8/22
 * @since 1.0.0AudioRecord
 */
public class RealTest {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int a = in.nextInt();
        //System.out.println(a);
//        System.out.println(getString("XDOYEZODEYXNZR", "XYZ"));
//        {1,2,3,4}
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
reorderList(node);
//        System.out.println(getString("XDOYEZODEYXNZR", "XYZ"));

    }

    static class ListNode {
        ListNode next;
        int value;

        public ListNode(int value) {
            this.value = value;
        }
    }


    //L0->L1->L2->L3->L4->L5
    //L0->L(5-0)->L1->L2->L()->L4
    public static void reorderList(ListNode head) {
        ArrayList<ListNode> record = new ArrayList();
        ListNode l = head;
        while (l != null) {
            record.add(l);
            l = l.next;
        }
        l = new ListNode(-1);
        if (record.size() > 0) {
            int left = 0;
            int right = record.size() - 1;
            while (left < right) {
                l.next = record.get(left++);
                l.next.next = record.get(right--);
                l = l.next.next;
            }
            if (left == right) {
                l.next = record.get(left);
            }
        }
    }

    //S 0~t.length()
    //

    public static String getString(String s, String t) {
        if (t == null || t.length() <= 0) {
            return "";
        }
        int length = t.length();
        int left = 0;
        int right = length - 1;
        String temp = "";
        HashMap<Character, Integer> map = new HashMap();
        for (int index = 0; index < t.length(); index++) {
            Character c = t.charAt(index);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int[] res = new int[map.size()];
        while (left <= right - length + 1 && right <= s.length() - 1) {
            for (int index = 0; index < map.size(); index++) {
                res[index] = 0;
            }
            int mIndex = 0;
            for (Character c : map.keySet()) {
                Integer count = map.get(c);
                int realCount = 0;
                for (int index = left; index <= right; index++) {
                    Character sChar = s.charAt(index);
                    if (sChar == c) {
                        realCount++;
                    }
                }
                if (realCount >= count) {
                    res[mIndex] = 1;
                }
                mIndex++;
            }
            boolean success = true;
            for (int index = 0; index < map.size(); index++) {
                if (res[index] == 0) {
                    success = false;
                }
            }
            if (success) {
                if (temp.length() == 0 || temp.length() > right - left + 1) {
                    temp = s.substring(left, right + 1);
                }
                if (temp.length() == t.length()) {
                    break;
                }
                left++;
            } else {
                right++;
            }
        }
        return temp;
    }
}
