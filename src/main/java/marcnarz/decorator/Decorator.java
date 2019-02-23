package marcnarz.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Decorator implements Updater {

    private Updater updater;

    @Override
    public void update(Object object) {
        updater.update(object);
    }
}
