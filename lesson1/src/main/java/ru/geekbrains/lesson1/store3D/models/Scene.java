package ru.geekbrains.lesson1.store3D.models;

import ru.geekbrains.lesson1.store3D.models.elements.Camera;
import ru.geekbrains.lesson1.store3D.models.elements.Flash;

import java.util.ArrayList;
import java.util.List;

public class Scene {

    private static int counter = 0;

    private int id;

    private List<PoligonalModel> models = new ArrayList<>();

    private List<Flash> flashes = new ArrayList<>();

    private List<Camera> cameras = new ArrayList<>();

    {
        id = ++counter;
    }

    public Scene(PoligonalModel model, Camera camera) {
        models.add(model);
        cameras.add(camera);
    }

    public int getId() {
        return id;
    }

    public List<PoligonalModel> getModels() {
        return List.copyOf(models);
    }

    public List<Flash> getFlashes() {
        return List.copyOf(flashes);
    }

    public List<Camera> getCameras() {
        return List.copyOf(cameras);
    }

    public void setModels(List<PoligonalModel> models) {
        this.models = models;
    }

    public void setFlashes(List<Flash> flashes) {
        this.flashes = flashes;
    }

    public void setCameras(List<Camera> cameras) {
        this.cameras = cameras;
    }

}
