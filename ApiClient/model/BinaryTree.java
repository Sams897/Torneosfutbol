package model;

public class BinaryTree {

    private Node root;

    private class Node {
        private int key;
        private Person value;
        private Node left;
        private Node right;

        public Node(int key, Person value) {  //constructor creado para el arbol binario
            this.key = key;   //la key la usaremos como un valor numerico que nos servira para ordenar los nodos del arbol binario
            this.value = value; // aca guardaremos el objeto que en este caso es la person 
            this.left = null;
            this.right = null;
        }
    }

    public void insert(int key, Person value) { // el insert agregara un nuevo nodo al arbol
        root = insertRecursive(root, key, value);
    }

    private Node insertRecursive(Node root, int key, Person value) {// la recursividad la aplicamos para validar la existencia el Id 
        if (root == null) {
            return new Node(key, value);
        }

        if (key < root.key) {
            root.left = insertRecursive(root.left, key, value); // valua la existencia y lo inserta en donde exista un lugar vacio verificando derecha e izquierda
        } else if (key > root.key) {
            root.right = insertRecursive(root.right, key, value);
        }

        return root;
    }

    public Person search(int key) {//Comienza la búsqueda desde la raíz y desciende recursivamente por el árbol hasta que se encuentra el nodo con la clave deseada.
        return searchRecursive(root, key);
    }

    private Person searchRecursive(Node root, int key) {
        if (root == null || root.key == key) {
            return (root != null) ? root.value : null;
        }

        if (key < root.key) {
            return searchRecursive(root.left, key);
        }

        return searchRecursive(root.right, key);
    }

}
