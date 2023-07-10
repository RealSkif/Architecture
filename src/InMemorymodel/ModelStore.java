package InMemorymodel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PolygonalModel;
import ModelElements.Scene;

import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PolygonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public ModelStore(List<PolygonalModel> models, List<Scene> scenes,
                      List<Flash> flashes, List<Camera> cameras) {
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public Scene getScene(int index) {
        return this.scenes.get(index);
    }


    @Override
    public void notifyChange(IModelChanger sender) {

    }
}
