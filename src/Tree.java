import java.util.ArrayList;
import java.util.List;

public class Tree<K, T> implements Position<K, T> {
    private K key;
    private T element;
    private Tree<K, T> parent;
    private Tree<K, T> leftChild;
    private Tree<K, T> rightChild;

    public Tree(K key, T element, Tree<K, T> parent, Tree<K, T> leftChild, Tree<K, T> rightChild) {
        this.key = key;
        this.element = element;
        this.parent = parent;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
    public Tree(K key, T element, Tree<K, T> parent) {
        this.key = key;
        this.element = element;
        this.parent = parent;
        this.leftChild = null;
        this.rightChild = null;
    }

    @Override
    public T getElement() {
        return element;
    }

    @Override
    public K getKey() {
        return key;
    }

    public void setParent(Tree<K, T> parent) {
        this.parent = parent;
    }

    public void addChild(Tree<K, T> child, boolean isLeft) {
        if (isLeft) {
            this.leftChild = child;
        } else {
            this.rightChild = child;
        }
        child.parent = this;
    }

    public List<Tree<K, T>> getChildren() {
        List<Tree<K, T>> children = new ArrayList<>();
        if (leftChild != null) {
            children.add(leftChild);
        }
        if (rightChild != null) {
            children.add(rightChild);
        }
        return children;
    }
}
