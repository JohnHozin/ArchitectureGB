package Seminar1.InMemoryModel;

import Seminar1.ModelElements.*;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PolygonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private IMemoryChangeObserver[] changeObservers;

    public ModelStore(IMemoryChangeObserver[] changeObservers) {
        this.changeObservers = changeObservers;
        this.Models = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Cameras = new ArrayList<>();

        this.Models.add(new PolygonalModel(new ArrayList<Texture>()));
        this.Flashes.add(new Flash());
        this.Cameras.add(new Camera());
        this.Scenes.add(new Scene(0, Models, Flashes, Cameras));
    }

    public Scene GetScena(int id) {
        return Scenes.get(id);
    }

    @Override
    public void NotifyChange(IModelChanger sender) {

    }
}
