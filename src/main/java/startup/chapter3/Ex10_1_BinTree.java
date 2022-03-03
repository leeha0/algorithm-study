package startup.chapter3;

import java.util.Comparator;

class Node<K, V> {

    K key;
    V data;
    Node<K, V> left;
    Node<K, V> right;

    public Node(K key, V data, Node<K, V> left, Node<K, V> right) {
        this.key = key;
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return data;
    }

    public void print() {
        System.out.println(data);
    }
}

public class Ex10_1_BinTree<K, V> {

    private Node<K, V> root;
    private Comparator<? super K> comparator = null;

    // 자연 순서 키 비교 - K의 타입이 Comparable 인터페이스룰 구현해야 함
    public Ex10_1_BinTree() {
        this.root = null;
    }

    // 커스텀 비교자로 키 비교
    public Ex10_1_BinTree(Comparator<? super K> comparator) {
        this();
        this.comparator = comparator;
    }

    private int comp(K key1, K key2) {
        return (comparator == null) ?
            ((Comparable<K>) key1).compareTo(key2) : comparator.compare(key1, key2);
    }

    public V search(K key) {
        Node<K, V> p = root;

        while (true) {
            if (p == null) {
                return null;
            }
            int cond = comp(key, p.getKey());
            if (cond == 0) {
                return p.getValue();
            } else if (cond < 0) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
    }

    public void add(K key, V value) {
        if (root == null) {
            root = new Node<>(key, value, null, null);
        } else {
            addNode(root, key, value);
        }
    }

    private void addNode(Node<K, V> node, K key, V value) {
        int cond = comp(key, node.getKey());
        if (cond == 0) {
            // 노드 삽입 실패
            return;
        } else if (cond < 0) {
            if (node.left == null) {
                node.left = new Node<>(key, value, null, null);
            } else {
                addNode(node.left, key, value);
            }
        } else {
            if (node.right == null) {
                node.right = new Node<>(key, value, null, null);
            } else {
                addNode(node.right, key, value);
            }
        }
    }

    public boolean remove(K key) {
        Node<K, V> p = root;
        Node<K, V> parent = null;
        boolean isLeftChild = true;

        while (true) {
            if (p == null) {
                // 노드 삭제 실패 (해당 키 값이 없음)
                return false;
            }
            int cond = comp(key, p.getKey());
            if (cond == 0) {
                // 노드 삭제 성공 (해당 키 값이 있음)
                break;
            } else {
                parent = p;
                if (cond < 0) {
                    isLeftChild = true;
                    p = p.left;
                } else {
                    isLeftChild = false;
                    p = p.right;
                }
            }
        }

        if (p.left == null) {
            // 삭제할 노드에 왼쪽 자식이 없는 경우
            if (p == root) {
                root = p.right;
            } else if (isLeftChild) {
                parent.left = p.right;
            } else {
                parent.right = p.right;
            }
        } else if (p.right == null) {
            // 삭제할 노드에 오른쪽 자식이 없는 경우
            if (p == root) {
                root = p.left;
            } else if (isLeftChild) {
                parent.left = p.left;
            } else {
                parent.right = p.left;
            }
        } else {
            // 삭제할 노드에 왼쪽 & 오른쪽 자식이 있는 경우
            parent = p;
            Node<K, V> left = p.left;
            isLeftChild = true;

            while (left.right != null) {
                parent = left;
                left = left.right;
                isLeftChild = false;
            }
            p.key = left.key;
            p.data = left.data;

            if (isLeftChild) {
                parent.left = left.left;
            } else {
                parent.right = left.left;
            }
        }

        return true;
    }

    public void print() {
        printInorderSubTree(root);
    }

    private void printInorderSubTree(Node<K, V> node) {
        // 중위 순회 출력
        if (node != null) {
            printInorderSubTree(node.left);
            System.out.println(node.key + " " + node.data);
            printInorderSubTree(node.right);
        }
    }

}
