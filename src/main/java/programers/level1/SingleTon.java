package programers.level1;

public class SingleTon {
    private SingleTon() {}

    private static class LazyHolder {
        public static final SingleTon INSTANCE = new SingleTon();
    }

    public static SingleTon getInstance() {
        return LazyHolder.INSTANCE;
    }
}
