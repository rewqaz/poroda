package com.vsu.ru.cg.model.model_components;

import com.vsu.ru.cg.math.vector.Vector3f;

public class Vertex {
    private Vector3f coordinates;

    public Vertex(Vector3f coordinates) {
        this.coordinates = coordinates;
    }

    public Vector3f getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Vector3f coordinates) {
        this.coordinates = coordinates;
    }
}
