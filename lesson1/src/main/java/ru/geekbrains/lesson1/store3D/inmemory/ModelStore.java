package ru.geekbrains.lesson1.store3D.inmemory;

import ru.geekbrains.lesson1.store3D.models.elements.Camera;
import ru.geekbrains.lesson1.store3D.models.elements.Flash;
import ru.geekbrains.lesson1.store3D.models.PoligonalModel;
import ru.geekbrains.lesson1.store3D.models.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {

    private List<ModelChangedObserver> observers = new ArrayList<>();

    private List<PoligonalModel> models = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();
    private List<Scene> scenes = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();

    public void add(PoligonalModel model, Scene scene, Flash flash, Camera camera){
        models.add(model);
        flashes.add(flash);
        scenes.add(scene);
        cameras.add(camera);
        notifyChange();
    }

    public Scene getScene(int id) {
        for (Scene scene : scenes) {
            if (scene.getId() == id) {
                return scene;
            }
        }
        throw new RuntimeException("Неверный ID сцены");
    }

    @Override
    public void notifyChange() {
        for (ModelChangedObserver observer : observers){
            observer.applyUpdateModel();
        }
    }

    @Override
    public void RegisterModelChanger(ModelChangedObserver o) {
        observers.add(o);
    }

    @Override
    public void RemoveModelChanger(ModelChangedObserver o) {
        observers.remove(o);
    }


}
