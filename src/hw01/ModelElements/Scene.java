package hw01.ModelElements;

import hw01.Staff.Type;

public class Scene {
    public Integer id;
    public PoligonalModel models;
    public Flash flash;

    public Scene(Integer id, PoligonalModel models, Flash flash) {
        this.id = id;
        this.models = models;
        this.flash = flash;
    }

    public Type method1 (Type type){
        return type;
    }

    // prescribe the conditional logic of type selection
    // прописываем условную логику выбора типа
    public Type method2 (Type type1, Type type2){
        if (type1 == type2){
            return type1;
        }
        else return type2;
    }
}
