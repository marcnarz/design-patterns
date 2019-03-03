package marcnarz.design.pattern.creational.singleton;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Singleton {

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    private static class SingletonHolder {

        private static final Singleton instance = new Singleton();
    }
}
