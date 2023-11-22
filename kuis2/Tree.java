public class Tree {
    Node19 root;

    public Tree() {
        root = null;
    }
    public void insert(char data) {
        root = insertRec(root, data);
    }

    private Node19 insertRec(Node19 root, char data) {
        if (root == null) {
            root = new Node19(data);
            return root;
        }
        if (data > root.data) {
            root.right = insertRec(root.right, data);
        } else if (data < root.data) {
            root.left = insertRec(root.left, data);
        }

        return root;
    }
    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node19 root) {
        if (root != null) {
            inorderRec(root.right);
            System.out.print(root.data + "\t");
            inorderRec(root.left );
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();

        System.out.println("============================================================");
        System.out.println("|                                                          |");
        System.out.println("|                             KUIS 2                       |");
        System.out.println("|               PRAKTIKUM ALGORTIMA STRUKTUR DATA          |");
        System.out.println("|                                                          |");
        System.out.println("============================================================");
        System.out.println("|                         IDENTITAS                        |");
        System.out.println("============================================================");
        System.out.println("|     Dibuat Oleh = NASYWA SYAFINKA WIDYAMARA              |");
        System.out.println("|     NIM         = 2241760002                             |");
        System.out.println("|     Absen       = 19                                     |");
        System.out.println("============================================================");
    
        tree.insert('A');
        tree.insert('B');
        tree.insert('C');
        tree.insert('D');
        tree.insert('E');
        System.out.println("====================================");
        System.out.println("|            Metode Tree           |");
        System.out.println("====================================");
        tree.inorder();
    }
}