package com.render.model.model3D_components;

import com.render.math.Vector3f;

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
