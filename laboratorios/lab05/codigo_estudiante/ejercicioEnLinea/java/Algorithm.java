public class Algorithm {



    public static boolean DFSColorFC(Tree tree) {
        return DFSColorFCAux(tree.getFirst(), 1);
    }

    private static boolean DFSColorFCAux(Node first, int color) {

       ...
}
