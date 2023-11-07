package ModelElements;

import Other.Type;

import java.util.List;

public class Scene {
    public int Id;
    public List<PolygonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> Cameras;

    public Scene(int id, List<PolygonalModel> models, List<Flash> flashes, List<Camera> cameras) throws RuntimeException {
        this.Id = id;

        if (models.size() > 0) {
            Models = models;
        } else {
            throw new RuntimeException("Пустой список");
        }

        Flashes = flashes;

        if (cameras.size() > 0) {
            this.Cameras = cameras;
        } else {
            throw new RuntimeException("Пустой список");
        }
    }

    public Type method1(Type id) {
        return id;
    }

    public Type method2(Type id1, Type id2) {
        return id2;
    }
}
