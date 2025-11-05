public class CacheTest {
    public static void main(String[] args) {
        Cache<String> cache = new Cache<>(3);
        cache.add("A");
        cache.add("B");
        cache.add("C");
        System.out.println("После A,B,C: " + cache);   // [A, B, C]

        cache.add("D"); // удалит A
        System.out.println("После D: " + cache);       // [B, C, D]

        System.out.println("exists(B): " + cache.exists("B")); // true
        System.out.println("remove(B): " + cache.remove("B")); // true
        System.out.println("После remove(B): " + cache);       // [C, D]

        System.out.println("first : " + cache.getFirst());     // C
        System.out.println("last  : " + cache.getLast());      // D
        System.out.println("idx 0 : " + cache.getItemByIndex(0)); // C
        System.out.println("idx 10: " + cache.getItemByIndex(10)); // null

        // второй кэш другого типа
        Cache<Integer> nums = new Cache<>(2);
        nums.add(10);
        nums.add(20);
        nums.add(30); // удалит 10
        System.out.println("nums: " + nums); // [20, 30]
    }
}
