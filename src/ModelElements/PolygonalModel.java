package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PolygonalModel {
    public List<Polygon> polygons;
    public List<Texture> textures;

    public PolygonalModel(List<Texture> textures) {
        this.textures = textures;
        polygons = new ArrayList<>();
    }
}
