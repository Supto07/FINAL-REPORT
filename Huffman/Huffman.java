import java.util.PriorityQueue;

public class Huffman {
    public static void printCode(HuffmanNode root, String s) {
        if (root.left == null && root.right == null && Character.isLetter(root.c)) {
            System.out.println(root.c + ":" + s);
            return;
        }
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

    public static HuffmanNode buildTree(char[] chars, int[] freqs) {
        PriorityQueue<HuffmanNode> q = new PriorityQueue<>(new MyComparator());

        for (int i = 0; i < chars.length; i++) {
            HuffmanNode node = new HuffmanNode();
            node.c = chars[i];
            node.data = freqs[i];
            q.add(node);
        }

        while (q.size() > 1) {
            HuffmanNode x = q.poll();
            HuffmanNode y = q.poll();

            HuffmanNode f = new HuffmanNode();
            f.data = x.data + y.data;
            f.c = '-';
            f.left = x;
            f.right = y;

            q.add(f);
        }

        return q.poll();
    }
}
