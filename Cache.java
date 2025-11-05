import java.util.LinkedList;

/**
 * Кэш фиксированного размера n, хранит последние добавленные элементы.
 * При переполнении удаляет самый старый (первый).
 */
public class Cache<T> {
    private final int capacity;
    private final LinkedList<T> data = new LinkedList<>();

    public Cache(int n) {
        if (n <= 0) throw new IllegalArgumentException("capacity must be > 0");
        this.capacity = n;
    }

    /** Добавить элемент в конец; при переполнении удалить самый старый (первый). */
    public void add(T item) {
        if (data.size() == capacity) {
            data.removeFirst();
        }
        data.addLast(item);
    }

    /** Удалить элемент, если есть. Возвращает true, если что-то удалили. */
    public boolean remove(T item) {
        return data.remove(item); // использует equals() у T
    }

    /** Проверить наличие элемента. */
    public boolean exists(T item) {
        return data.contains(item);
    }

    /** Первый (самый старый) или null, если пусто. */
    public T getFirst() {
        return data.isEmpty() ? null : data.getFirst();
    }

    /** Последний (самый новый) или null, если пусто. */
    public T getLast() {
        return data.isEmpty() ? null : data.getLast();
    }

    /** Элемент по индексу или null, если индекс вне диапазона. */
    public T getItemByIndex(int i) {
        if (i < 0 || i >= data.size()) return null;
        return data.get(i);
    }

    /** Полезные вспомогательные методы. */
    public int size()      { return data.size(); }
    public int capacity()  { return capacity; }

    @Override public String toString() { return data.toString(); }
}
