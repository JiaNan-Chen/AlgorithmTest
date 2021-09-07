//import java.util.ArrayDeque;
//
///**
// * 〈一句话功能简述〉<br>
// * 〈〉
// *
// * @author chenjianan
// * @create 2021/7/26
// * @since 1.0.0
// */
//public class TreeTest {
//    public static void main(String[] args) {
//        MyTreeNode myTreeNode = new MyTreeNode(1);
//        myTreeNode.left = new MyTreeNode(2);
//        myTreeNode.left.left = new MyTreeNode(4);
//        myTreeNode.left.right = new MyTreeNode(5);
//        myTreeNode.right = new MyTreeNode(3);
//        myTreeNode.right.left = new MyTreeNode(6);
//        myTreeNode.right.right = new MyTreeNode(7);
//        inOrder(myTreeNode);
//    }
//
//    public static final class MyTreeNode {
//        MyTreeNode left;
//        MyTreeNode right;
//        int value;
//
//        public MyTreeNode(int value) {
//            this.value = value;
//        }
//
//        @Override
//        public String toString() {
//            return "MyTreeNode{" +
//                    "value=" + value +
//                    '}';
//        }
//    }
//
//    //如果你按照 根节点 -> 左孩子 -> 右孩子 的方式遍历，即「先序遍历」，每次先遍历根节点，遍历结果为 1 2 4 5 3 6 7；
//    //
//    //同理，如果你按照 左孩子 -> 根节点 -> 右孩子 的方式遍历，即「中序序遍历」，遍历结果为 4 2 5 1 6 3 7；
//    //
//    //如果你按照 左孩子 -> 右孩子 -> 根节点 的方式遍历，即「后序序遍历」，遍历结果为 4 5 2 6 7 3 1；
//    //
//    //最后，层次遍历就是按照每一层从左向右的方式进行遍历，遍历结果为 1 2 3 4 5 6 7。
//    public static void preOrder(MyTreeNode head) {
//        ArrayDeque<MyTreeNode> deque = new ArrayDeque<>();
//        deque.push(head);
//        while (!deque.isEmpty()) {
//            MyTreeNode node = deque.pop();
//            System.out.println(node);
//            if (node.right != null) {
//                deque.push(node.right);
//            }
//            if (node.left != null) {
//                deque.push(node.left);
//            }
//        }
//    }
//
//    public static void inOrder(MyTreeNode head) {
//        ArrayDeque<MyTreeNode> deque = new ArrayDeque<>();
//        MyTreeNode cur = head;
//        while (cur != null || !deque.isEmpty()) {
//            while (cur != null) {
//                deque.push(cur);
//                cur = cur.left;
//            }
//            MyTreeNode temp = deque.pop();
//            System.out.println(temp);
//            cur = temp.right;
//        }
//    }
//
//    public static void postOrder(MyTreeNode head) {
//
//    }
//
//    public class Solution {
//        boolean isSymmetrical(TreeNode pRoot) {
//            return isSame(pRoot, pRoot);
//        }
//
//        private boolean isSame(TreeNode left, TreeNode right) {
//            if (left == null && right == null) {
//                return true;
//            }
//            if (left == null || right == null) {
//                return false;
//            }
//            if (left.left != null && right.right != null) {
//                if (left.left.val != right.right.val) {
//                    return false;
//                }
//            } else {
//                if (left.left != null || right.right != null) {
//                    return false;
//                }
//            }
//            if (left.right != null && right.left != null) {
//                if (left.right.val != right.left.val) {
//                    return false;
//                }
//            } else {
//                if (left.right != null || right.left != null) {
//                    return false;
//                }
//            }
//            //left.right.val!=right.left.val
//            return isSame(left.left, right.right) && isSame(left.right, right.left);
//        }
//    }
//
//    //给定一个二叉树其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
//    // 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的next指针。下图为一棵有9个节点的二叉树。树中从父节点指向子节点的指针用实线表示，从子节点指向父节点的用虚线表示
//
//    public class Solution {
//        public class ListNode {
//            int val;
//            ListNode next = null;
//
//            ListNode(int val) {
//                this.val = val;
//            }
//
//            public ListNode deleteDuplication(ListNode pHead) {
//                if (pHead == null) {
//                    return null;
//                }
//                ListNode head = new ListNode(pHead.val - 1);
//                head.next = pHead;
//                ListNode cur = head;
//                while (cur != null) {
//                    ListNode tempHead = cur;
//                    if (cur.next != null && cur.next.next != null && cur.next.val == cur.next.next.val) {
//                        int tempValue = cur.next.val;
//                        cur = cur.next.next.next;
//                        while (cur != null) {
//                            if (cur.val == tempValue) {
//                                cur = cur.next;
//                            } else {
//                                break;
//                            }
//                        }
//                        tempHead.next = cur;
//                        cur = tempHead;
//                    }else{
//                        cur=cur.next;
//                    }
//                }
//                return head.next;
//            }
//        }
//    }
//
//    public class Solution {
//
//        public ListNode EntryNodeOfLoop(ListNode pHead) {
//            //先判断是否有环
//            ListNode l=pHead;
//            ListNode r=pHead;
//            while(r!=null){
//                if(r.next!=null){
//                    r=r.next.next;
//                    l=l.next;
//                    if(r==l){
//                        break;
//                    }
//                }else{
//                    return null;
//                }
//            }
//            int count=0;
//            while(true){
//                r=r.next;
//                count++;
//                if(r==l){
//                    break;
//                }
//            }
//            l=pHead;
//            r=pHead;
//            for(int index=0;index<count;index++){
//                r=r.next;
//            }
//            while(true){
//                if(l==r){
//                    return l;
//                }
//                l=l.next;
//                r=r.next;
//            }
//        }
//    }
//
//
//    //描述
//    //请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
//    // 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
//    //后台会用以下方式调用Insert 和 FirstAppearingOnce 函数
//    //string caseout = "";
//    //1.读入测试用例字符串casein
//    //2.如果对应语言有Init()函数的话，执行Init() 函数
//    //3.循环遍历字符串里的每一个字符ch {
//    //Insert(ch);
//    //caseout += FirstAppearingOnce()
//    //}
//    //2. 输出caseout，进行比较。
//    //返回值描述：
//    //如果当前字符流没有存在出现一次的字符，返回#字符。
//    //示例1
//    //输入：
//    //"google"
//    //复制
//    //返回值：
//    //"ggg#ll"
//    public class Solution {
//        private ArrayList<Character> mFirstAppearingList=new ArrayList<Character>();
//        private ArrayList<Character> mMultiAppearingList=new ArrayList<Character>();
//
//
//        //Insert one char from stringstream
//        public void Insert(char ch)
//        {
//            if(mFirstAppearingList.contains(ch)){
//                mFirstAppearingList.remove((Character)ch);
//                mMultiAppearingList.add((Character)ch);
//            }else{
//                if(!mMultiAppearingList.contains(ch)){
//                    mFirstAppearingList.add((Character)ch);
//                }
//            }
//        }
//        //return the first appearence once char in current stringstream
//        public char FirstAppearingOnce()
//        {
//            if(mFirstAppearingList.size()>0){
//                return mFirstAppearingList.get(0);
//            }
//            return '#';
//        }
//    }
//
//
//    public class Solution {
//        /**
//         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//         *
//         *
//         * @param str string字符串
//         * @return bool布尔型
//         */
//        public boolean isNumeric (String str) {
//            if(str==null||str.length()==0){
//                return false;
//            }
//            // write code here
//            int eCount=0;
//            int eIndex=-1;
//            for(int index=0;index<str.length();index++){
//                if(str.charAt(index)=='e'||str.charAt(index)=='E'){
//                    eCount++;
//                    eIndex=index;
//                }
//            }
//            if(eCount>1){
//                return false;
//            }
//            if(eIndex!=-1){
//                //e必须在中间
//                if(eIndex==0||eIndex==str.length()-1){
//                    return false;
//                }
//                //e两边不能有小数点
//                if(str.charAt(eIndex-1)=='.'||str.charAt(eIndex+1)=='.'){
//                    return false;
//                }
//                String before=str.substring(0,eIndex);
//                String after=str.substring(eIndex+1);
//                return checkNumber(before,true)&&checkNumber(after,false);
//            }else{
//                //没有e
//                return checkNumber(str,true);
//            }
//        }
//
//        private boolean checkNumber(String str,boolean canFloat){
//            if(str==null||str.length()==0){
//                return false;
//            }
//            int pointIndex=-1;
//            if(!canFloat){
//                if(str.contains(".")){
//                    return false;
//                }
//            }else{
//                int pointCount=0;
//                for(int index=0;index<str.length();index++){
//                    if(str.charAt(index)=='.'){
//                        pointCount++;
//                        pointIndex=index;
//                    }
//                }
//                if(pointCount>1){
//                    return false;
//                }
//            }
//            if(pointIndex!=-1){
//                String before=str.substring(0,pointIndex);
//                String after=str.substring(pointIndex+1);
//                return onlyNumber(before,true,true)&&onlyNumber(after,false,false);
//            }else{
//                return onlyNumber(str,true,false);
//            }
//        }
//
//        private boolean onlyNumber(String str,Boolean canBelowZero,boolean canOnlyFUHAO){
//            if(str==null||str.length()==0){
//                return false;
//            }
//            for(int index=0;index<str.length();index++){
//                if(index==0&&canBelowZero&&(str.charAt(0)=='-'||str.charAt(0)=='+')){
//                    if(str.length()>1||canOnlyFUHAO){
//                        continue;
//                    }else{
//                        return false;
//                    }
//                }
//                if(str.charAt(index)<'0'||str.charAt(index)>'9'){
//                    return false;
//                }
//            }
//            return true;
//        }
//    }
//
//    import java.util.*;
//
//
//    public class Solution {
//        /**
//         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//         *
//         *
//         * @param str string字符串
//         * @param pattern string字符串
//         * @return bool布尔型
//         */
//        public boolean match (String str, String pattern) {
//            // write code here
//            if("".equals(str)&&"".equals(pattern)){
//                return true;
//            }
//            if("".equals(pattern)&&!"".equals(str)){
//                return false;
//            }
//            if(pattern.length()>1&&'*'==pattern.charAt(1)){
//                return
//                        //无有效匹配
//                        match(str,pattern.substring(2))
//                                //只有一个匹配
//                                ||(str.length()>0&&(pattern.charAt(0)==str.charAt(0)||pattern.charAt(0)=='.')&&match(str.substring(1),pattern.substring(2)))
//                                //多个匹配
//                                ||(str.length()>0&&(pattern.charAt(0)==str.charAt(0)||pattern.charAt(0)=='.')&&match(str.substring(1),pattern));
//            }
//            if('.'==pattern.charAt(0)){
//                return str.length()>0&&match(str.substring(1),pattern.substring(1));
//            }
//            return (str.length()>0&&pattern.length()>0&&pattern.charAt(0)==str.charAt(0)&&match(str.substring(1),pattern.substring(1)));
//        }
//    }
//
//    public boolean match (String str, String pattern) {
//        if(str.isEmpty()&&pattern.isEmpty()){
//            return true;
//        }
//        if(!str.isEmpty()&&pattern.isEmpty()){
//            return false;
//        }
//        if(pattern.length()>1&&pattern.charAt(1)=='*'){
//            return match(str,pattern.substring(2))||
//                    (str.length()>0&&match(str.substring(1),pattern));
//        }
//        if(pattern.charAt(0)=='.'){
//            return str.length()>0&&match(str.substring(1),pattern.substring(1));
//        }
//    }
//}
