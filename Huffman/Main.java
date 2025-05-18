public class Main {
    public static void main(String[] args) {
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] charfreq = { 5, 9, 12, 13, 16, 45 };

        HuffmanNode root = Huffman.buildTree(charArray, charfreq);
        Huffman.printCode(root, "");
    }
}
