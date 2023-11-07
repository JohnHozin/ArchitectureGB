package ModelElements;

import Other.Point3D;

import java.util.ArrayList;
import java.util.List;

public class PolygonalModel {
    public List<Poligon> Poligons;
    public List<Texture> Textures;

    public PolygonalModel(List<Texture> textures) {
        this.Textures = textures;
        this.Poligons = new ArrayList<>();

        this.Poligons.add(new Poligon(new Point3D()));
    }
}
