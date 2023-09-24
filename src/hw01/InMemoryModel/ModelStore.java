package hw01.InMemoryModel;

import hw01.ModelElements.*;

import java.util.ArrayList;
import java.util.List;

// хранилище моделей
public class ModelStore implements IModelChanger {

    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangedObserver[] changeObserver;

    // describing the relationship (описываем отношения)
    public ModelStore(IModelChangedObserver[] changeObserver) {
        // take aggregates outside (агрегация снаружи)
        this.changeObserver = changeObserver;
        // create components inside (компоненты создаем внутри)
        this.models = new ArrayList<>();
        models.add(new PoligonalModel(null));
        this.scenes = new ArrayList<>();
        scenes.add(new Scene(0, models.get(0), flashes.get(0)));
        this.flashes = new ArrayList<>();
        flashes.add(new Flash());
        this.cameras = new ArrayList<>();
        cameras.add(new Camera());
    }

    public Scene getScene (Integer id) {
        Scene scene = scenes.get(id);
        return scene;
    }


    // change registration (регистрация изменений)
    @Override
    public void notifyChange(IModelChanger sender) {
    }
}
