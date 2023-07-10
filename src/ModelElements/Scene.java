package ModelElements;

import java.util.List;

public class Scene {
    int id;
    List<PolygonalModel> models;
    List<Flash> flashes;

    public Scene(List<PolygonalModel> models, List<Flash> flashes) {
        this.models = models;
        this.flashes = flashes;
    }

    public <T> T method1(T type){
        return type;
    }
    public <T> T method2(T type1, T type2){
        return type1;
    }
}
