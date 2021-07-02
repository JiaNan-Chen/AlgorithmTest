import java.awt.Point;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author chenjianan
 * @create 2021/6/25
 * @since 1.0.0
 */
public class Test {
    /**
     * 描述
     * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     * [
     * [1,2,8,9],
     * [2,4,9,12],
     * [4,7,10,13],
     * [6,8,11,15]
     * ]
     * 给定 target = 7，返回 true。
     * <p>
     * 给定 target = 3，返回 false。
     * <p>
     * <p>
     * 示例1
     * 输入：
     * 7,[[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]]
     * 复制
     * 返回值：
     * true
     * 复制
     * 说明：
     * 存在7，返回true
     * 示例2
     * 输入：
     * 3,[[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]]
     * 复制
     * 返回值：
     * false
     * 复制
     * 说明：
     * 不存在3，返回false
     *
     * @param args
     */
    public static void main(String[] args) {
//        System.out.println(isContain(new int[][]{{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}}, 0, 0, 3, 3, 3));
        for (int index = 0; index < 10; index++) {
//            System.out.print(getFirb1(index) + " ");
//            System.out.print(getFirb2(index) + " ");
        }
//        System.out.print(getMax(8));
        System.out.print(new Solution().movingCount(1, 2, 3));
        //5,10,10
        System.out.print(new Solution().movingCount(15, 20, 20));
        System.out.print(new Solution2().hasPath(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCB"));

//        TreeNode node=new TreeNode(11);
//        node.left=new TreeNode(9);
//        node.right=new TreeNode(13);
//        node.left.left=new TreeNode(8);
//        node.left.right=new TreeNode(10);
//        node.right.left=new TreeNode(12);
//        node.right.right=new TreeNode(14);
//        printTree(node);
//        TreeNode node=new TreeNode(110);
//        for(int index=0;index<100;index++){
//            buildBTS(node, index);
//        }
//        printTree(node);
        MaxHeapSortSolution sortSolution = new MaxHeapSortSolution();
        sortSolution.Insert(10);
        sortSolution.Insert(9);
        sortSolution.Insert(23);
        sortSolution.Insert(1);
        sortSolution.Insert(5);
        sortSolution.Insert(4);
        sortSolution.Insert(2103);

        ArrayList list = new Solution4().maxInWindows(new int[]{10, 14, 12, 11}, 4);
        System.out.println(list);

        int[] src = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(Arrays.copyOfRange(src, 0, 1)));

        System.out.println(new Solution5().VerifySquenceOfBST(new int[]{4, 8, 6, 12, 16, 14, 10}));

        System.out.println(new Solution9().Power(2d, 3));
        System.out.println(new Solution11().replaceSpace("asdasd dasda"));
        System.out.println(new Solution12().FindNumbersWithSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, 21));
        System.out.println(new Solution13().FindContinuousSequence(9));
        System.out.println(new Solution14().ReverseSentence(""));
        char[] test = new char[]{'1', '2', '3', '4', '5'};
        new Solution14().swap(test, 1, 3);
        System.out.println(Arrays.toString(test));

        System.out.println(new Solution15().IsContinuous(new int[]{6, 0, 2, 0, 4}));
        System.out.println(Arrays.toString(new Solution17().FindNumsAppearOnce(new int[]{0, 0, 2, 2, 3, 0, 4})));
        System.out.println(new Solution18().GetUglyNumber_Solution(7));
        System.out.println(Arrays.toString(new Solution21().reOrderArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));
        new Solution24().Find(5, new int[][]{{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}});
        System.out.println(new Solution25().GetNumberOfK(
                new int[]{1, 2, 3, 3, 3, 3, 4, 5}, 3
        ));
        System.out.println(new Solution28().printMatrix(new int[][]{
                {1},
                {5},
                {9},
                {13}
        }));

        Solution30.TreeNode node = new Solution30.TreeNode(10);
        node.left = new Solution30.TreeNode(6);
        node.left.left = new Solution30.TreeNode(4);
        node.left.right = new Solution30.TreeNode(8);
        node.right = new Solution30.TreeNode(14);
        node.right.left = new Solution30.TreeNode(12);
        node.right.right = new Solution30.TreeNode(16);
        new Solution30().Convert(node);
        new Solution31().GetLeastNumbers_Solution(new int[]{4, 5, 1, 6, 2, 7, 2, 8}, 2);
        System.out.println(new Solution32().FindGreatestSumOfSubArray(new int[]{1, -2, 3, 10, -4, 7, 2, -5}));
        System.out.println(new Solution33().NumberOf1Between1AndN_Solution(10));
        System.out.println(new Solution34().PrintMinNumber(new int[]{3, 32, 321}));
        System.out.println(new Solution36().InversePairs(new int[]{1, 2, 3, 4, 5, 6, 7, 0}));
    }

    //描述
    //在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
    // 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
    //
    //对于50\%50%的数据,size\leq 10^4size≤10
    //4
    //
    //对于100\%100%的数据,size\leq 10^5size≤10
    //5
    //
    //
    //输入描述：
    //题目保证输入的数组中没有的相同的数字
    //示例1
    //输入：
    //[1,2,3,4,5,6,7,0]
    //复制
    //返回值：
    //7
    public static class Solution36 {
        private int mCount = 0;

        public int InversePairs(int[] array) {
            mCount = 0;
            if (array == null || array.length <= 0) {
                return mCount;
            }
            mergeSort(array);
            return mCount;
        }

        private void mergeSort(int[] array) {
            int[] temp = new int[array.length];
            mergeSortInner(array, temp, 0, array.length - 1);
        }

        private void mergeSortInner(int[] array, int[] temp, int left, int right) {
            if (left < right) {
                int middle = (left + right) / 2;
                mergeSortInner(array, temp, left, middle);
                mergeSortInner(array, temp, middle + 1, right);
                sortPartial(array, temp, left, middle + 1, right);
            }
        }

        private void sortPartial(int[] array, int[] temp, int left, int right, int end) {
            int k = left;
            int i = left;
            int j = right;
            while (i < right && j <= end) {
                if (array[i] <= array[j]) {
                    temp[k++] = array[i++];
                } else {
                    mCount += j - k;
                    mCount %= 1000000007;
                    temp[k++] = array[j++];
                }
            }
            while (i < right) {
                temp[k++] = array[i++];
            }
            while (j <= end) {
                temp[k++] = array[j++];
            }
            for (int index = left; index <= end; index++) {
                array[index] = temp[index];
            }
        }

    }

    //描述
    //在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
    //示例1
    //输入：
    //"google"
    //复制
    //返回值：
    //4
    public static class Solution35 {
        public int FirstNotRepeatingChar(String str) {
            if (str == null || str.length() <= 0) {
                return -1;
            }
            HashMap<Character, Integer> map = new HashMap<>();
            for (int index = 0; index < str.length(); index++) {
                Character c = str.charAt(index);
                Integer i = map.get(c);
                if (i == null) {
                    i = 1;
                } else {
                    i++;
                }
                map.put(c, i);
            }
            for (int index = 0; index < str.length(); index++) {
                Character c = str.charAt(index);
                if (map.get(c) == 1) {
                    return index;
                }
            }
            return -1;
        }
    }

    //描述
    //输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
    //例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
    //示例1
    //输入：
    //[3,32,321]
    //复制
    //返回值：
    //"321323"
    public static class Solution34 {
        public String PrintMinNumber(int[] numbers) {
            if (numbers == null || numbers.length <= 0) {
                return "";
            }
            ArrayList<String> result = buildAllSort(numbers);
            return getMaxString(result);
        }

        public String getMaxString(ArrayList<String> res) {
            String curMinString = res.get(0);
            for (int index = 1; index < res.size(); index++) {
                String temp = res.get(index);
                if (curMinString.compareTo(temp) > 0) {
                    curMinString = temp;
                }
            }
            return curMinString;
        }

        public ArrayList<String> buildAllSort(int[] nums) {
            ArrayList<String> result = new ArrayList<>();
            buildAllSortInner(result, nums, 0);
            return result;
        }

        public void buildAllSortInner(ArrayList<String> result, int[] nums, int left) {
            if (left == nums.length - 1) {
                StringBuilder sb = new StringBuilder();
                for (int index = 0; index < nums.length; index++) {
                    sb.append(nums[index]);
                }
                result.add(sb.toString());
                return;
            }
            for (int index = left; index < nums.length; index++) {
                swap(nums, left, index);
                buildAllSortInner(result, nums, left + 1);
                swap(nums, left, index);
            }
        }

        private void swap(int[] nums, int left, int right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
    }

    //描述
    //输入一个整数 n ，求1～n这n个整数的十进制表示中1出现的次数
    //例如，1~13中包含1的数字有1、10、11、12、13因此共出现6次
    //
    //示例1
    //输入：
    //13
    //复制
    //返回值：
    //6
    //本人太菜没有看懂大部分人推崇的方法，试了下数学归纳法，发现也不错。
    //先来做如下归纳：
    //0-9中有1个1；
    //10-19中有1+10=11个1；
    //20-29中有1个1；
    //...
    //0-99中有11*1+1*9=20个1；
    //100-199中有20+100=120个1；（希望大家认真理解为什么是+100）
    //0-999中有20*9+120=20*10+100=300个1(此处20为0-99中1的个数，100为10^2)；
    //0-9999中有300*10+1000=4000个1(此处300为0-999中1的个数，1000为10^3)。
    //我们再回头整理下思路：
    //0-9（1个9）中有1*10^0个1；
    //0-99（2个9）中有2*10^1个1；
    //0-999（3个9）中有3*10^2个1；
    //0-9999（4个9）中有4*10^3个1；
    //...
    //0-999999999（9个9）中有9*10^8个1；
    public static class Solution33 {
        public int NumberOf1Between1AndN_Solution(int n) {
            int count = 0;
            for (int index = n; index > 0; index--) {
                int temp = index;
                while (temp > 0) {
                    if ((temp % 10) == 1) {
                        count++;
                    }
                    temp = temp / 10;
                }
            }
            return count;
        }
    }

    //描述
    //输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。要求时间复杂度为 O(n).
    //示例1
    //输入：
    //[1,-2,3,10,-4,7,2,-5]
    //复制
    //返回值：
    //18
    //复制
    //说明：
    //输入的数组为{1,-2,3,10,—4,7,2,一5}，和最大的子数组为{3,10,一4,7,2}，因此输出为该子数组的和 18。
    //dp[i] = max(array[i], dp[i-1]+array[i])
    //1,-2,3,10,-4,7,2,-5
    public static class Solution32 {
        public int FindGreatestSumOfSubArray(int[] array) {
            if (array == null || array.length <= 0) {
                return 0;
            }
            int curMax = array[0];
            int max = curMax;
            for (int index = 1; index < array.length; index++) {
                curMax = Math.max(curMax + array[index], array[index]);
                max = Math.max(curMax, max);
            }
            return max;
        }
    }

    //描述
    //给定一个数组，找出其中最小的K个数。例如数组元素是4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
    // 如果K>数组的长度，那么返回一个空的数组
    //示例1
    //输入：
    //[4,5,1,6,2,7,3,8],4
    //复制
    //返回值：
    //[1,2,3,4]
    public static class Solution31 {
        public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
            ArrayList<Integer> list = new ArrayList<>();
            if (input == null || input.length < k) {
                return list;
            }
            quickSort(input, 0, input.length - 1);
            //System.out.println(Arrays.toString(input));
            for (int index = 0; index < k; index++) {
                list.add(input[index]);
            }
            return list;
        }

        private void quickSort(int[] arr, int left, int right) {
            if (left < right) {
                int middle = getPartition(arr, left, right);
                quickSort(arr, left, middle - 1);
                quickSort(arr, middle + 1, right);
            }
        }

        private int getPartition(int[] arr, int left, int right) {
            int temp = arr[left];
            while (left < right) {
                while (left < right && arr[right] >= temp) {
                    right--;
                }
                arr[left] = arr[right];
                while (left < right && arr[left] <= temp) {
                    left++;
                }
                arr[right] = arr[left];
            }
            arr[left] = temp;
            return left;
        }


    }

    //描述
    //输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。如下图所示
    //https://uploadfiles.nowcoder.com/images/20210605/557336_1622886924427/E1F1270919D292C9F48F51975FD07CE2
    //
    //注意:
    //1.要求不能创建任何新的结点，只能调整树中结点指针的指向。当转化完成以后，树中节点的左指针需要指向前驱，树中节点的右指针需要指向后继
    //2.返回链表中的第一个节点的指针
    //3.函数返回的TreeNode，有左右指针，其实可以看成一个双向链表的数据结构
    //4.你不用输出或者处理，示例中输出里面的英文，比如"From left to right are:"这样的，程序会根据你的返回值自动打印输出

    /**
     *
     */
    public static class Solution30 {
        public static class TreeNode {
            int val = 0;
            TreeNode left = null;
            TreeNode right = null;

            public TreeNode(int val) {
                this.val = val;
            }

        }

        public TreeNode Convert(TreeNode pRootOfTree) {
            TreeNode cur = pRootOfTree;
            ArrayDeque<TreeNode> stack = new ArrayDeque<>();
            TreeNode result = null;
            TreeNode pre = null;
            while (cur != null || !stack.isEmpty()) {
                while (cur != null) {
                    stack.push(cur);
                    cur = cur.left;
                }
                TreeNode temp = stack.pop();
                if (pre == null) {
                    result = temp;
                    temp.left = null;
                } else {
                    pre.right = temp;
                    temp.left = pre;
                }
                pre = temp;
                cur = temp.right;
            }
            return result;
        }
    }


    //描述
    //从上往下打印出二叉树的每个节点，同层节点从左至右打印。
    //示例1
    //输入：
    //{5,4,#,3,#,2,#,1}
    //复制
    //返回值：
    //[5,4,3,2,1]
    public class Solution29 {
        public class TreeNode {
            int val = 0;
            TreeNode left = null;
            TreeNode right = null;

            public TreeNode(int val) {
                this.val = val;

            }

        }

        public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
            ArrayList<Integer> list = new ArrayList<>();
            if (root == null) {
                return list;
            }
            ArrayList<TreeNode> res = new ArrayList();
            res.add(root);
            while (!res.isEmpty()) {
                TreeNode cur = res.remove(0);
                list.add(cur.val);
                if (cur.left != null) {
                    res.add(cur.left);
                }
                if (cur.right != null) {
                    res.add(cur.right);
                }
            }
            return list;
        }
    }

    //描述
    //输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵：
    //[[1,2,3,4],
    //[5,6,7,8],
    //[9,10,11,12],
    //[13,14,15,16]]
    //则依次打印出数字
    //[1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10]
    public static class Solution28 {
        public ArrayList<Integer> printMatrix(int[][] matrix) {
            ArrayList<Integer> list = new ArrayList<>();
            if (matrix == null || matrix.length <= 0 || matrix[0].length <= 0) {
                return list;
            }
            int index = 0;
            int width = matrix[0].length;
            int height = matrix.length;
            while (index < width - 1 - index && index < height - 1 - index) {
                for (int i = index; i < width - index; i++) {
                    list.add(matrix[index][i]);
                }
                for (int i = index + 1; i < height - 1 - index; i++) {
                    list.add(matrix[i][width - 1 - index]);
                }
                for (int i = width - 1 - index; i > index; i--) {
                    list.add(matrix[height - 1 - index][i]);
                }
                for (int i = height - 1 - index; i > index; i--) {
                    list.add(matrix[i][index]);
                }
                index++;
            }
            if (index == width - 1 - index) {
                for (int i = index; i <= height - 1 - index; i++) {
                    list.add(matrix[i][index]);
                }
            } else if (index == height - 1 - index) {
                for (int i = index; i <= width - 1 - index; i++) {
                    list.add(matrix[index][i]);
                }
            }
            return list;
        }
    }

    //描述
    //操作给定的二叉树，将其变换为源二叉树的镜像。
    //比如：    源二叉树
    //            8
    //           /  \
    //          6   10
    //         / \  / \
    //        5  7 9 11
    //        镜像二叉树
    //            8
    //           /  \
    //          10   6
    //         / \  / \
    //        11 9 7  5
    //示例1
    //输入：
    //{8,6,10,5,7,9,11}
    //复制
    //返回值：
    //{8,10,6,11,9,7,5}
    public static class Solution27 {
        public class TreeNode {
            int val = 0;
            TreeNode left = null;
            TreeNode right = null;

            public TreeNode(int val) {
                this.val = val;
            }
        }

        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         * @param pRoot TreeNode类
         * @return TreeNode类
         */
        public TreeNode Mirror(TreeNode pRoot) {
            // write code here
            TreeNode result = pRoot;
            reverseInner(pRoot);
            return result;
        }

        private void reverseInner(TreeNode root) {
            if (root == null) {
                return;
            }
            TreeNode left = root.left;
            TreeNode right = root.right;
            if (left != null && right != null) {
                root.left = right;
                root.right = left;
                reverseInner(right);
                reverseInner(left);
            } else if (left != null) {
                root.left = null;
                root.right = left;
                reverseInner(left);
            } else if (right != null) {
                root.left = right;
                root.right = null;
                reverseInner(right);
            }
        }


    }

    //描述
    //输入两个无环的单链表，找出它们的第一个公共结点。（注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
    //
    //示例1
    //输入：
    //{1,2,3},{4,5},{6,7}
    //复制
    //返回值：
    //{6,7}
    //复制
    //说明：
    //第一个参数{1,2,3}代表是第一个链表非公共部分，第二个参数{4,5}代表是第二个链表非公共部分，最后的{6,7}表示的是2个链表的公共部分
    //这3个参数最后在后台会组装成为2个两个无环的单链表，且是有公共节点的
    //示例2
    //输入：
    //{1},{2,3}{}
    //复制
    //返回值：
    //{}
    //复制
    //说明：
    //2个链表没有公共节点 ,返回null，后台打印{}
    public static class Solution26 {
        public class ListNode {
            int val;
            ListNode next = null;

            ListNode(int val) {
                this.val = val;
            }
        }

        public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
            ListNode top = pHead1;
            ListNode bottom = pHead2;
            while (top != bottom) {
                top = top != null ? top.next : pHead2;
                bottom = bottom != null ? bottom.next : pHead1;
            }
            return top;
        }
    }

    //描述
    //统计一个数字在升序数组中出现的次数。
    //示例1
    //输入：
    //[1,2,3,3,3,3,4,5],3
    //复制
    //返回值：
    //4
    public static class Solution25 {
        public int GetNumberOfK(int[] array, int k) {
            if (array == null || array.length <= 0) {
                return 0;
            }
            int searchIndex = -1;
            int left = 0;
            int right = array.length - 1;
            while (left <= right) {
                int middle = (left + right) / 2;
                if (array[middle] == k) {
                    searchIndex = middle;
                    break;
                }
                if (k < array[middle]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
            if (searchIndex == -1) {
                return 0;
            }
            int count = 1;
            int i = 1;
            while (true) {
                if (searchIndex - i >= 0) {
                    if (array[searchIndex - i] == k) {
                        count++;
                        i++;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            i = 1;
            while (true) {
                if (searchIndex + i < array.length) {
                    if (array[searchIndex + i] == k) {
                        count++;
                        i++;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            return count;
        }
    }

    //描述
    //在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
    //[
    //  [1,2,8,9],
    //  [2,4,9,12],
    //  [4,7,10,13],
    //  [6,8,11,15]
    //]
    //给定 target = 7，返回 true。
    //
    //给定 target = 3，返回 false。

    //5,[[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]]
    public static class Solution24 {
        public boolean Find(int target, int[][] array) {
            if (array == null || array.length <= 0 || array[0].length <= 0) {
                return false;
            }
            int left = 0;
            int bottom = array.length - 1;
            while (left <= array[0].length - 1 && bottom >= 0) {
                if (array[bottom][left] == target) {
                    return true;
                }
                if (array[bottom][left] > target) {
                    bottom--;
                } else if (array[bottom][left] < target) {
                    left++;
                }
            }
            return false;
        }
    }

    //描述
    //输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
    //示例1
    //输入：
    //{8,8,#,9,#,2,#,5},{8,9,#,2}
    //复制
    //返回值：
    //true
    public class Solution23 {
        public class TreeNode {
            int val = 0;
            TreeNode left = null;
            TreeNode right = null;

            public TreeNode(int val) {
                this.val = val;
            }
        }

        public boolean HasSubtree(TreeNode root1, TreeNode root2) {
            if (root1 == null || root2 == null) {
                return false;
            }
            ArrayDeque<TreeNode> stack = new ArrayDeque();
            stack.push(root1);
            while (!stack.isEmpty()) {
                TreeNode cur = stack.pop();
                if (isChildTree(cur, root2)) {
                    return true;
                }
                if (cur.left != null) {
                    stack.push(cur.left);
                }
                if (cur.right != null) {
                    stack.push(cur.right);
                }
            }
            return false;
        }

        private boolean isChildTree(TreeNode root1, TreeNode root2) {
            if (root2 == null) {
                return true;
            }
            if (root1 == null) {
                return false;
            }
            if (root1.val != root2.val) {
                return false;
            }
            return isChildTree(root1.left, root2.left) && isChildTree(root1.right, root2.right);
        }

    }

    //描述
    //输入一个链表，输出一个链表，该输出链表包含原链表中从倒数第k个结点至尾节点的全部节点。
    //如果该链表长度小于k，请返回一个长度为 0 的链表。
    //示例1
    //输入：
    //{1,2,3,4,5},1
    //复制
    //返回值：
    //{5}
    //
    public static class Solution22 {
        public class ListNode {
            int val;
            ListNode next = null;

            public ListNode(int val) {
                this.val = val;
            }
        }

        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         * @param pHead ListNode类
         * @param k     int整型
         * @return ListNode类
         */
        //{1,2,3,4,5},6
        public ListNode FindKthToTail(ListNode pHead, int k) {
            // write code here
            ListNode localHead = new ListNode(-1);
            localHead.next = pHead;
            ListNode slow = localHead;
            ListNode fast = localHead;
            while (k > 0 && fast != null) {
                k--;
                fast = fast.next;
            }
            if (fast == null) {
                return null;
            }
            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
            return slow;
        }
    }

    //描述
    //输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
    //示例1
    //输入：
    //[1,2,3,4]
    //复制
    //返回值：
    //[1,3,2,4]
    //复制
    //示例2
    //输入：
    //[2,4,6,5,7]
    //复制
    //返回值：
    //[5,7,2,4,6]
    public static class Solution21 {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         * @param array int整型一维数组
         * @return int整型一维数组
         */
        public int[] reOrderArray(int[] array) {
            // write code here
            ArrayList<Integer> odd = new ArrayList();
            ArrayList<Integer> even = new ArrayList();
            for (int index = 0; index < array.length; index++) {
                int cur = array[index];
                if (cur % 2 == 1) {
                    odd.add(cur);
                } else {
                    even.add(cur);
                }
            }
            for (int index = 0; index < odd.size(); index++) {
                array[index] = odd.get(index);
            }
            for (int index = 0; index < even.size(); index++) {
                array[odd.size() + index] = even.get(index);
            }
            return array;
        }
    }

    //描述
    //把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
    //输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
    //NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
    //示例1
    //输入：
    //[3,4,5,1,2]
    //复制
    //返回值：
    //1
    //复制
    public static class Solution20 {
        public int minNumberInRotateArray(int[] array) {
            return 0;
        }
    }

    //描述
    //用两个栈来实现一个队列，分别完成在队列尾部插入整数(push)和在队列头部删除整数(pop)的功能。 队列中的元素为int类型。保证操作合法，即保证pop操作时队列内已有元素。
    //
    //示例:
    //输入:
    //["PSH1","PSH2","POP","POP"]
    //返回:
    //1,2
    //解析:
    //"PSH1":代表将1插入队列尾部
    //"PSH2":代表将2插入队列尾部
    //"POP“:代表删除一个元素，先进先出=>返回1
    //"POP“:代表删除一个元素，先进先出=>返回2
    //示例1
    //输入：
    //["PSH1","PSH2","POP","POP"]
    //复制
    //返回值：
    //1,2
    public class Solution19 {
        ArrayDeque<Integer> stack1 = new ArrayDeque<Integer>();
        ArrayDeque<Integer> stack2 = new ArrayDeque<Integer>();

        public void push(int node) {
            stack1.push(node);
        }

        public int pop() {
            if (!stack2.isEmpty()) {
                return stack2.pop();
            }
            if (stack1.isEmpty()) {
                return -1;
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }

    //把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。
    // 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
    public static class Solution18 {
        public int GetUglyNumber_Solution(int index) {
            if (index <= 0) {
                return 0;
            }
            if (index == 1) {
                return 1;
            }
            int index2 = 0;
            int index3 = 0;
            int index5 = 0;
            int[] result = new int[index];
            result[0] = 1;
            for (int i = 1; i < index; i++) {
                int result2 = result[index2] * 2;
                int result3 = result[index3] * 3;
                int result5 = result[index5] * 5;
                result[i] = Math.min(Math.min(result2, result3), result5);
                if (result2 <= result[i]) {
                    index2++;
                }
                if (result3 <= result[i]) {
                    index3++;
                }
                if (result5 <= result[i]) {
                    index5++;
                }
            }
            return result[index - 1];
        }
    }

    //描述
    //一个整型数组里除了两个数字只出现一次，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
    //示例1
    //输入：
    //[1,4,1,6]
    //复制
    //返回值：
    //[4,6]
    //复制
    //说明：
    //返回的结果中较小的数排在前面
    //如果只有一个数字仅出现一次，其余都出现两次，则所有数字异或的结果就是那个仅出现一次的数字。
    //此题中，有两个数字只出现一次，所有数字异或的结果一定非0，其二进制表示中一定有某一位为1，
    // 可根据这一位是否为1，将数组分为两部分，则两部分的所有数字分别做异或，得到的两个结果就是要求的两个结果。
    //1010^1010=0000^1101=1101
    public static class Solution17 {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         * @param array int整型一维数组
         * @return int整型一维数组
         */
        public int[] FindNumsAppearOnce(int[] array) {
            if (array == null || array.length < 2) {
                return new int[2];
            }
            // write code here
            int temp = array[0];
            for (int index = 1; index < array.length; index++) {
                temp ^= array[index];
            }
            int i = 1;
            while (true) {
                if ((temp & i) != 0) {
                    break;
                }
                i = i << 1;
            }
            int[] copyArr = new int[array.length];
            int left = 0;
            int right = array.length - 1;
            for (int index = 0; index < array.length; index++) {
                if ((array[index] & i) == i) {
                    copyArr[left++] = array[index];
                } else {
                    copyArr[right--] = array[index];
                }
            }
            int a = copyArr[0], b = copyArr[left];
            for (int index = 1; index < left; index++) {
                a ^= copyArr[index];
            }
            for (int index = left + 1; index < copyArr.length; index++) {
                b ^= copyArr[index];
            }
            if (a < b) {
                return new int[]{a, b};
            } else {
                return new int[]{b, a};
            }
        }
    }


    //Java实现
    //参考了别人的思路，这里也是使用了两个栈。
    //一个用来存所有的元素“stackTotal”,另一个用来存加入新的元素后当前stackTotal中对应的最小值。
    //两个栈中的元素数量始终保持一致，当新的元素小于“stackLittle”栈顶元素时，“stackLittle”像栈顶push新来的元素，否则，“stackLittle”向栈顶加入原栈顶元素。
    //执行“pop”方法时，两个栈同时弹出各自的栈顶元素。
    //import java.util.Stack;
    //
//    public class Solution {
//        Stack<Integer> stackTotal = new Stack<Integer>();
//        Stack<Integer> stackLittle = new Stack<Integer>();
//
//        public void push(int node) {
//            stackTotal.push(node);
//            if(stackLittle.empty()){
//                stackLittle.push(node);
//            }else{
//                if(node <= stackLittle.peek()){
//                    stackLittle.push(node);
//                }else{
//                    stackLittle.push(stackLittle.peek());
//                }
//            }
//        }
//
//        public void pop() {
//            stackTotal.pop();
//            stackLittle.pop();
//        }
//
//        public int top() {
//            return stackTotal.peek();
//        }
//
//        public int min() {
//            return stackLittle.peek();
//        }
//    }

    //描述
    //定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数，并且调用 min函数、push函数 及 pop函数 的时间复杂度都是 O(1)
    //push(value):将value压入栈中
    //pop():弹出栈顶元素
    //top():获取栈顶元素
    //min():获取栈中最小元素
    //
    //示例:
    //输入:    ["PSH-1","PSH2","MIN","TOP","POP","PSH1","TOP","MIN"]
    //输出:    -1,2,1,-1
    //解析:
    //"PSH-1"表示将-1压入栈中，栈中元素为-1
    //"PSH2"表示将2压入栈中，栈中元素为2，-1
    //“MIN”表示获取此时栈中最小元素==>返回-1
    //"TOP"表示获取栈顶元素==>返回2
    //"POP"表示弹出栈顶元素，弹出2，栈中元素为-1
    //"PSH-1"表示将1压入栈中，栈中元素为1，-1
    //"TOP"表示获取栈顶元素==>返回1
    //“MIN”表示获取此时栈中最小元素==>返回-1
    //
    //示例1
    //输入：
    // ["PSH-1","PSH2","MIN","TOP","POP","PSH1","TOP","MIN"]
    //复制
    //返回值：
    //-1,2,1,-1
    public class Solution16 {
        ArrayList<Integer> mList = new ArrayList();
        ArrayList<Integer> mMin = new ArrayList();

        public void push(int node) {
            mList.add(node);
            if (mMin.isEmpty()) {
                mMin.add(node);
            } else {
                if (mMin.get(mMin.size() - 1) > node) {
                    mMin.add(node);
                } else {
                    mMin.add(mMin.get(mMin.size() - 1));
                }
            }
        }

        public void pop() {
            if (mList.size() > 0) {
                mList.remove(mList.size() - 1);
                mMin.remove(mMin.size() - 1);
            }
        }

        public int top() {
            if (mList.size() > 0) {
                return mList.get(mList.size() - 1);
            } else {
                return -1;
            }
        }

        public int min() {
            if (mMin.size() > 0) {
                return mMin.get(mMin.size() - 1);
            } else {
                return -1;
            }
        }
    }

    //描述
    //现在有2副扑克牌，从扑克牌中随机五张扑克牌，我们需要来判断一下是不是顺子。
    //有如下规则：
    //1. A为1，J为11，Q为12，K为13，A不能视为14
    //2. 大、小王为 0，0可以看作任意牌
    //3. 如果给出的五张牌能组成顺子（即这五张牌是连续的）就输出true，否则就输出false。
    //例如：给出数据[6,0,2,0,4]
    //中间的两个0一个看作3，一个看作5 。即：[6,3,2,5,4]
    //这样这五张牌在[2,6]区间连续，输出true
    //数据保证每组5个数字，每组最多含有4个零，数组的数取值为 [0, 13]
    //
    //示例1
    //输入：
    //[6,0,2,0,4]
    //复制
    //返回值：
    //true
    //复制
    //示例2
    //输入：
    //[0,3,2,6,4]
    //复制
    //返回值：
    //true
    //复制
    public static class Solution15 {
        public boolean IsContinuous(int[] numbers) {
            int zeroIndex = -1;
            for (int index = 0; index < numbers.length; index++) {
                if (numbers[index] == 0) {
                    zeroIndex = index;
                    break;
                }
            }
            if (zeroIndex == -1) {
                int min = numbers[0];
                for (int index = 1; index < numbers.length; index++) {
                    if (numbers[index] < min) {
                        min = numbers[index];
                    }
                }
                for (int index = 1; index < numbers.length; index++) {
                    if (!contains(numbers, min + index)) {
                        return false;
                    }
                }
//                System.out.println(Arrays.toString(numbers));
                return true;
            } else {
                for (int index = 1; index < 14; index++) {
                    numbers[zeroIndex] = index;
                    if (IsContinuous(numbers)) {
                        numbers[zeroIndex] = 0;
                        return true;
                    }
                }
                numbers[zeroIndex] = 0;
                return false;
            }
        }

        private boolean contains(int[] numbers, int i) {
            for (int index = 0; index < numbers.length; index++) {
                if (numbers[index] == i) {
                    return true;
                }
            }
            return false;
        }
    }

    //描述
    //牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。例如，“nowcoder. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a nowcoder.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
    //示例1
    //输入：
    //"nowcoder. a am I"
    //复制
    //返回值：
    //"I am a nowcoder."
    public static class Solution14 {
        public String ReverseSentence(String str) {
            if (str == null || str.length() <= 0) {
                return "";
            }
            int length = str.length();
            int spaceCount = 0;
            char[] temp = new char[str.length()];
            int left = 0;
            int right = length - 1;
            for (int index = 0; index < length; index++) {
                if (str.charAt(index) == ' ') {
                    spaceCount++;
//                    if (right == length - 1) {
//                        right = index;
//                    }
                    right = length - index - 2;
                }
                temp[length - 1 - index] = str.charAt(index);
            }
            System.out.println(Arrays.toString(temp));
            while (right <= length - 1 && spaceCount >= 0) {
                spaceCount--;
                swap(temp, left, right);
                if (right < length - 1) {
                    for (int index = right + 2; index < length; index++) {
                        if (temp[index] == ' ') {
                            left = right + 2;
                            right = index - 1;
                            break;
                        } else if (index == length - 1) {
                            left = right + 2;
                            right = length - 1;
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            return new String(temp);
        }

        public void swap(char[] content, int left, int right) {
            for (int index = 0; index <= (right - left) / 2; index++) {
                char temp = content[left + index];
                content[left + index] = content[right - index];
                content[right - index] = temp;
            }
        }
    }

    public static class Solution13 {
        public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
            ArrayList<ArrayList<Integer>> result = new ArrayList();
            int left = 1;
            int right = 2;
            int localSum = left + right;
            while (right < sum && left < right) {
                if (localSum == sum) {
                    ArrayList<Integer> temp = new ArrayList();
                    for (int index = left; index <= right; index++) {
                        temp.add(index);
                    }

                }
                if (localSum < sum) {
                    right++;
                    localSum += right;
                } else {
                    localSum -= left;
                    left++;
                }
            }
            return result;
        }
    }

    //描述
    //输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
    // 如果有多对数字的和等于S，返回两个数的乘积最小的，如果无法找出这样的数字，返回一个空数组即可。
    //返回值描述：
    //对应每个测试案例，输出两个数，小的先输出。
    //示例1
    //输入：
    //[1,2,4,7,11,15],15
    //复制
    //返回值：
    //[4,11]
    public static class Solution12 {
        public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
            ArrayList<Integer> result = new ArrayList<>();
            if (array == null || array.length <= 1) {
                return result;
            }

            if (sum < array[0]) {
                return result;
            }
            int left = 0;
            int right = array.length - 1;
            int temp = 0;
            while (left < right) {
                int localSum = array[left] + array[right];
                if (localSum == sum) {
                    int a = array[left] * array[right];
                    if (temp > a || temp == 0) {
                        temp = a;
                        result.clear();
                        result.add(array[left]);
                        result.add(array[right]);
                    }
                    left++;
                    right--;
                } else if (localSum > sum) {
                    right--;
                } else {
                    left++;
                }
            }
            return result;
        }
    }

    //描述
    //请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
    //示例1
    //输入：
    //"We Are Happy"
    //复制
    //返回值：
    //"We%20Are%20Happy"
    public static class Solution11 {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         * @param s string字符串
         * @return string字符串
         */
        public String replaceSpace(String s) {
            // write code here
            if (s == null || s.length() <= 0) {
                return "";
            }
            int spaceCount = 0;
            for (int index = 0; index < s.length(); index++) {
                if (s.charAt(index) == ' ') {
                    spaceCount++;
                }
            }
            char[] c = new char[s.length() + spaceCount * 2];
            int cIndex = 0;
            for (int index = 0; index < s.length(); index++) {
                if (s.charAt(index) == ' ') {
                    c[cIndex++] = '%';
                    c[cIndex++] = '2';
                    c[cIndex++] = '0';
                } else {
                    c[cIndex++] = s.charAt(index);
                }
            }
            return new String(c);
        }
    }

    //输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针random指向一个随机节点），请对此链表进行深拷贝，并返回拷贝后的头结点。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）。 下图是一个含有5个结点的复杂链表。图中实线箭头表示next指针，虚线箭头表示random指针。为简单起见，指向null的指针没有画出。
    //
    //
    //示例:
    //输入:{1,2,3,4,5,3,5,#,2,#}
    //输出:{1,2,3,4,5,3,5,#,2,#}
    //解析:我们将链表分为两段，前半部分{1,2,3,4,5}为ListNode，后半部分{3,5,#,2,#}是随机指针域表示。
    //以上示例前半部分可以表示链表为的ListNode:1->2->3->4->5
    //后半部分，3，5，#，2，#分别的表示为
    //1的位置指向3，2的位置指向5，3的位置指向null，4的位置指向2，5的位置指向null
    //如下图:
    //
    //示例1
    //输入：
    //{1,2,3,4,5,3,5,#,2,#}
    //复制
    public static class Solution10 {
        public static class RandomListNode {
            int label;
            RandomListNode next = null;
            RandomListNode random = null;

            RandomListNode(int label) {
                this.label = label;
            }
        }

        public RandomListNode Clone(RandomListNode pHead) {
            if (pHead == null) {
                return null;
            }
            HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
            RandomListNode head = pHead;
            while (head != null) {
                map.put(head, new RandomListNode(pHead.label));
                head = head.next;
            }
            head = pHead;
            while (head != null) {
                map.get(head).next = map.get(head.next);
                map.get(head).random = map.get(head.random);
                head = head.next;
            }
            return map.get(pHead);
        }
    }

    //描述
    //给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
    //
    //保证base和exponent不同时为0。不得使用库函数，同时不需要考虑大数问题，也不用考虑小数点后面0的位数。
    //
    //示例1
    //输入：
    //2.00000,3
    //复制
    //返回值：
    //8.00000
    //复制
    //示例2
    //输入：
    //2.10000,3
    //复制
    //返回值：
    //9.26100
    //复制
    //示例3
    //输入：
    //2.00000,-2
    //复制
    //返回值：
    //0.25000
    //复制
    //说明：
    //2的-2次方等于1/4=0.25
    public static class Solution9 {
        public double Power(double base, int exponent) {
            if (exponent == 0) {
                return 1;
            }
            if (exponent == 1) {
                return base;
            }
            if (exponent > 0) {
                return base * Power(base, exponent - 1);
            } else {
                return 1 / Power(base, -exponent);
            }
        }
    }

    //输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
    //示例1
    //输入：
    //{1,3,5},{2,4,6}
    //复制
    //返回值：
    //{1,2,3,4,5,6}
    public static class Solution8 {
        public class ListNode {
            int val;
            ListNode next = null;

            ListNode(int val) {
                this.val = val;
            }
        }

        public ListNode Merge(ListNode list1, ListNode list2) {
            ListNode result = new ListNode(-1);
            ListNode cur = result;
            ListNode top = list1;
            ListNode bottom = list2;
            while (top != null && bottom != null) {
                if (top.val < bottom.val) {
                    cur.next = top;
                    top = top.next;
                } else {
                    cur.next = bottom;
                    bottom = bottom.next;
                }
                cur = cur.next;
            }
            if (top != null) {
                cur.next = top;
            }
            if (bottom != null) {
                cur.next = bottom;
            }
            return result;
        }
    }

    //描述
    //给定一个数组，找出其中最小的K个数。例如数组元素是4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。如果K>数组的长度，那么返回一个空的数组
    //示例1
    //输入：
    //[4,5,1,6,2,7,3,8],4
    //复制
    //返回值：
    //[1,2,3,4]
//    public class Solution7 {
//        public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
//
//        }
//    }

    //描述
    //输入一颗二叉树的根节点和一个整数，按字典序打印出二叉树中结点值的和为输入整数的所有路径。
    // 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
    //示例1
    //输入：
    //{10,5,12,4,7},22
    //复制
    //返回值：
    //[[10,5,7],[10,12]]
    //复制
    //示例2
    //输入：
    //{10,5,12,4,7},15
    //复制
    //返回值：
    //[]
    public class Solution6 {

        public class TreeNode {
            int val = 0;
            TreeNode left = null;
            TreeNode right = null;

            public TreeNode(int val) {
                this.val = val;
            }
        }

        public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            buildPath(list, new ArrayList<>(), root, target);
            return list;
        }

        public void buildPath(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> path, TreeNode node, int target) {
            if (node == null) {
                return;
            }
            path.add(node.val);
            if (node.left == null && node.right == null) {
                int sum = 0;
                for (int index = 0; index < path.size(); index++) {
                    sum += path.get(index);
                }
                if (sum == target) {
                    list.add(new ArrayList<>(path));
                }
            }
            buildPath(list, path, node.left, target);
            buildPath(list, path, node.right, target);
            path.remove((Integer) node.val);
        }
    }

    //描述
    //输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则返回true,否则返回false。假设输入的数组的任意两个数字都互不相同。（ps：我们约定空树不是二叉搜素树）
    //示例1
    //输入：
    //[4,8,6,12,16,14,10]
    //复制
    //返回值：
    //true
    public static class Solution5 {
        public boolean VerifySquenceOfBST(int[] sequence) {
            if (sequence == null || sequence.length == 0) {
                return false;
            }
            if (sequence.length == 1) {
                return true;
            }
            int last = sequence[sequence.length - 1];
            int markIndex = -1;
            for (int index = 0; index < sequence.length - 1; index++) {
                if (sequence[index] > last) {
                    markIndex = index;
                    break;
                }
            }
            if (markIndex == -1) {
                //最后一个数都比前面的大
                markIndex = sequence.length - 1;
            }
            for (int index = markIndex + 1; index < sequence.length - 1; index++) {
                if (sequence[index] < last) {
                    return false;
                }
            }
            if (markIndex > 0 && markIndex < sequence.length - 1) {
                return VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, markIndex))
                        && VerifySquenceOfBST(Arrays.copyOfRange(sequence, markIndex, sequence.length - 1));
            } else {
                return VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, sequence.length - 1));
            }
        }
    }

    public static class Solution4 {
        public ArrayList<Integer> maxInWindows(int[] num, int size) {
            if (num == null || num.length < size) {
                return null;
            }
            ArrayList<Integer> list = new ArrayList();
            int leftIndex = 0;
            int rightIndex = leftIndex + size - 1;
            int bigIndex = -1;
            int temp = -1;
            while (rightIndex < num.length) {
                if (bigIndex < leftIndex) {
                    //不在滑动窗口
                    temp = num[leftIndex];
                    bigIndex = leftIndex;
                    for (int index = leftIndex + 1; index <= rightIndex; index++) {
                        int cur = num[index];
                        if (cur >= num[bigIndex]) {
                            bigIndex = index;
                        }
                    }
                } else {
                    if (num[bigIndex] < num[rightIndex]) {
                        bigIndex = rightIndex;
                    }
                }
                list.add(num[bigIndex]);
                //窗口滑动
                leftIndex++;
                rightIndex++;
            }
            return list;
        }
    }

    public static class MaxHeapSortSolution {

        private ArrayList<Integer> mList = new ArrayList();

        public void Insert(Integer num) {
            mList.add(num);
            for (int index = mList.size() - 1; index >= 0; index--) {
                buildMaxHeap(mList, (index + 1) / 2 - 1, index + 1);
                swap(mList, 0, index);
            }
            System.out.println(mList);
        }

        public Double GetMedian() {
            if (mList.size() > 0) {
                if (mList.size() % 2 == 0) {
                    return (mList.get(mList.size() / 2 - 1) + mList.get(mList.size() / 2)) / 2d;
                } else {
                    return mList.get(mList.size() / 2).doubleValue();
                }
            }
            return 0d;
        }

        private static void buildMaxHeap(ArrayList<Integer> list, int end, int listSize) {
            while (end >= 0) {
                buildMaxHeapInner(list, end, listSize);
                end--;
            }
        }

        private static void buildMaxHeapInner(ArrayList<Integer> list, int index, int listSize) {
            if (index < 0 || list == null || 2 * index + 1 >= listSize) {
                return;
            }
            int val = list.get(index);
            int maxChild = list.get(2 * index + 1);
            int maxIndex = 2 * index + 1;
            if (2 * index + 2 < listSize) {
                int right = list.get(2 * index + 2);
                if (right > maxChild) {
                    maxChild = right;
                    maxIndex = 2 * index + 2;
                }
            }
            if (val < maxChild) {
                swap(list, index, maxIndex);
                buildMaxHeap(list, maxIndex, listSize);
            }
        }

        private static void swap(ArrayList<Integer> list, int left, int right) {
            Integer temp = list.get(right);
            list.set(right, list.get(left));
            list.set(left, temp);
        }
    }

    /**
     * 便于理解的例子
     * 题目
     *   [plaintext]
     * 7
     * 3 8
     * 8 1 0
     * 2 7 4 4
     * 4 5 2 6 5
     * 从上到下选择一条路，使得经过的数字之和最大。
     *
     * 路径上的每一步只能往左下或者右下走。
     * @param index
     * @return
     */

    /**
     * 7()
     * 3() 8()
     * 8(8+12) 1(1+12) 0(0+10)
     * 2(2+5=7) 7(7+5=12) 4(4+6=10) 4(4+6=10)
     * 4() 5() 2() 6() 5()
     *
     * @param index
     * @return
     */


    public static int getFirb2(int index) {
        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        int[] temp = new int[index + 1];
        temp[0] = 0;
        temp[1] = 1;
        for (int i = 2; i <= index; i++) {
            temp[i] = temp[i - 1] + temp[i - 2];
        }
        return temp[index];
    }

    //F(0)=0，F(1)=1, F(n)=F(n - 1)+F(n - 2)
    //0、1、1、2、3、5、8、13、21、34
    public static int getFirb1(int index) {
        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        return getFirb1(index - 1) + getFirb1(index - 2);
    }


    private static boolean isContain(int[][] src, int column1, int row1, int column2, int row2, int dest) {
        if (src[column1][row1] == dest || src[column2][row2] == dest) {
            return true;
        }
        return (row1 + 1 <= row2 && src[column1][row1 + 1] <= dest && isContain(src, column1, row1 + 1, column2, row2, dest)) ||
                (column1 + 1 <= column2 && src[column1 + 1][row1] <= dest && isContain(src, column1 + 1, row1, column2, row2, dest)) ||
                (row2 - 1 >= row1 && src[column2][row2 - 1] >= dest && isContain(src, column1, row1, column2, row2 - 1, dest)) ||
                (column2 - 1 >= column1 && src[column2 - 1][row2] >= dest && isContain(src, column1, row1, column2 - 1, row2, dest));
    }

    /**
     * 描述
     * 给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1，m<=n），每段绳子的长度记为k[1],...,k[m]。请问k[1]x...xk[m]可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
     * 输入描述：
     * 输入一个数n，意义见题面。（2 <= n <= 60）
     * 返回值描述：
     * 输出答案。
     *
     * @return
     */
    //输入：
    //8
    //复制
    //返回值：
    //18
    //f(n)=max(n,f(n-2)*f(2),f(n-3)*f(3)...f(n/2)*f((1+n)/2))
    private static int getMax(int num) {
        int[] f = new int[num + 1];
        f[0] = 1;
        f[1] = 1;
        f[2] = 2;
        for (int index = 3; index < num + 1; index++) {
            f[index] = index;
            for (int inner = 2; inner <= index / 2; inner++) {
                f[index] = Math.max(f[index], f[inner] * f[index - inner]);
            }
        }
        return f[num];
    }
    // * 示例1
    //     * 输入：
    //     * 1,2,3
    //     * 复制
    //     * 返回值：
    //     * 3
    //     * 复制
    //     * 示例2
    //     * 输入：
    //     * 0,1,3
    //     * 复制
    //     * 返回值：
    //     * 1
    //     * 复制
    //     * 示例3
    //     * 输入：
    //     * 10,1,100
    //     * 复制
    //     * 返回值：
    //     * 29
    //     * 复制
    //     * 说明：
    //     * [0,0],[0,1],[0,2],[0,3],[0,4],[0,5],[0,6],[0,7],[0,8],[0,9],[0,10],[0,11],[0,12],[0,13],[0,14],[0,15],[0,16],[0,17],[0,18],[0,19],[0,20],[0,21],[0,22],[0,23],[0,24],[0,25],[0,26],[0,27],[0,28] 这29种，后面的[0,29],[0,30]以及[0,31]等等是无法到达的
    //     * 示例4
    //     * 输入：
    //     * 5,10,10
    //     * 复制
    //     * 返回值：
    //     * 21

    /**
     * 描述
     * 地上有一个rows行和cols列的方格。坐标从 [0,0] 到 [rows-1,cols-1]。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于threshold的格子。 例如，当threshold为18时，机器人能够进入方格[35,37]，因为3+5+3+7 = 18。但是，它不能进入方格[35,38]，因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
     * <p>
     * 范围:
     * 1 <= rows, cols<= 100
     * 0 <= threshold <= 20
     */
    public static class Solution {
        public int movingCount(int threshold, int rows, int cols) {
            int[][] mark = new int[rows][cols];
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    mark[r][c] = 0;
                }
            }
            ArrayDeque<Point> deque = new ArrayDeque();
            deque.push(new Point(0, 0));
            while (!deque.isEmpty()) {
                Point popPoint = deque.pop();
                mark[popPoint.x][popPoint.y] = 1;
                if (shouldAddQueue(threshold, mark, popPoint.x + 1, popPoint.y)) {
                    deque.push(new Point(popPoint.x + 1, popPoint.y));
                }
                if (shouldAddQueue(threshold, mark, popPoint.x - 1, popPoint.y)) {
                    deque.push(new Point(popPoint.x - 1, popPoint.y));
                }
                if (shouldAddQueue(threshold, mark, popPoint.x, popPoint.y + 1)) {
                    deque.push(new Point(popPoint.x, popPoint.y + 1));
                }
                if (shouldAddQueue(threshold, mark, popPoint.x, popPoint.y - 1)) {
                    deque.push(new Point(popPoint.x, popPoint.y - 1));
                }
            }
            int count = 0;
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    if (mark[r][c] == 1) {
                        count++;
                    }
                }
            }
            return count;
        }

        private boolean shouldAddQueue(int threshold, int[][] mark, int row, int col) {
            if (row >= 0 && row < mark.length && col >= 0 && col < mark[0].length) {
                if (getNumSum(row) + getNumSum(col) <= threshold && mark[row][col] == 0) {
                    return true;
                }
            }
            return false;
        }

        private int getNumSum(int num) {
            if (num < 10) {
                return num;
            }
            if (num < 100) {
                return num % 10 + num / 10;
            }
            if (num == 100) {
                return 1;
            }
            return 0;
        }
    }


    //描述
    //请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径
    // 。路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
    // 如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
    // 例如 \begin{bmatrix} a & b & c &e \\ s & f & c & s \\ a & d & e& e\\ \end{bmatrix}\quad
    //⎣
    //⎡
    //​
    //
    //a
    //s
    //a
    //​
    //
    //b
    //f
    //d
    //​
    //
    //c
    //c
    //e
    //​
    //
    //e
    //s
    //e
    //​
    //
    //⎦
    //⎤
    //​
    //  矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
    //
    //示例1
    //输入：
    //[[a,b,c,e],[s,f,c,s],[a,d,e,e]],"abcced"
    //复制
    //返回值：
    //true
    //复制
    //示例2
    //输入：
    //[[a,b,c,e],[s,f,c,s],[a,d,e,e]],"abcb"
    //复制
    //返回值：
    //false
    //复制
    //备注：
    //0 <= matrix.length <= 200
    //0 <= matrix[i].length <= 200

    public static class Solution2 {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         * @param matrix char字符型二维数组
         * @param word   string字符串
         * @return bool布尔型
         */
        public boolean hasPath(char[][] matrix, String word) {
            // write code here
            if (matrix.length <= 0 || matrix[0].length <= 0) {
                return "".equals(word);
            }
            if ("".equals(word)) {
                return true;
            }
            //先遍历第一行
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[0].length; col++) {
                    ArrayDeque<PointsInfo> arrayDeque = new ArrayDeque();
                    if (matrix[row][col] == word.charAt(0)) {
                        if (word.length() == 1) {
                            return true;
                        }
                        PointsInfo pointsInfo = new PointsInfo(new MyPoint(row, col));
                        pointsInfo.addSelf();
                        arrayDeque.push(pointsInfo);
                    } else {
                        continue;
                    }
                    while (!arrayDeque.isEmpty()) {
                        PointsInfo p = arrayDeque.pop();
                        if (successPattern(matrix, word, arrayDeque, p, p.currentPoint.x + 1, p.currentPoint.y) ||
                                successPattern(matrix, word, arrayDeque, p, p.currentPoint.x - 1, p.currentPoint.y) ||
                                successPattern(matrix, word, arrayDeque, p, p.currentPoint.x, p.currentPoint.y + 1) ||
                                successPattern(matrix, word, arrayDeque, p, p.currentPoint.x, p.currentPoint.y - 1)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        private boolean successPattern(char[][] matrix, String word, ArrayDeque<PointsInfo> arrayDeque, PointsInfo p, int row, int col) {
            if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length) {
                return false;
            }
            if (word.length() <= p.infos.size()) {
                return false;
            }
            if (word.charAt(p.infos.size()) == matrix[row][col] && !p.infos.contains(new MyPoint(row, col))) {
                PointsInfo pointsInfo = new PointsInfo(new MyPoint(row, col));
                pointsInfo.infos.addAll(p.infos);
                pointsInfo.addSelf();
                arrayDeque.push(pointsInfo);
                if (word.length() == pointsInfo.infos.size()) {
                    return true;
                }
            }
            return false;
        }

        public static class PointsInfo {
            MyPoint currentPoint;
            ArrayList<MyPoint> infos = new ArrayList<>();

            public PointsInfo(MyPoint currentPoint) {
                this.currentPoint = currentPoint;
            }

            public void addSelf() {
                infos.add(currentPoint);
            }
        }

        public static class MyPoint {
            public int x, y;

            public MyPoint(int x, int y) {
                this.x = x;
                this.y = y;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                MyPoint myPoint = (MyPoint) o;
                return x == myPoint.x && y == myPoint.y;
            }

            @Override
            public String toString() {
                return "MyPoint{" +
                        "x=" + x +
                        ", y=" + y +
                        '}';
            }
        }


    }

    public static final class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    //中序遍历
    public static void printTree(TreeNode node) {
        if (node == null) {
            return;
        }
        printTree(node.left);
        System.out.print(node.val + " ");
        printTree(node.right);
    }

    //构造二叉搜索（排序、查找）树
    public static void buildBTS(TreeNode node, int value) {
        if (node == null) {
            return;
        }
        if (node.val >= value) {
            if (node.left != null) {
                buildBTS(node.left, value);
            } else {
                node.left = new TreeNode(value);
            }
        } else {
            if (node.right != null) {
                buildBTS(node.right, value);
            } else {
                node.right = new TreeNode(value);
            }
        }
    }

}
