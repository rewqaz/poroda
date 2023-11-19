package com.render.model.model_components;

import com.render.math.Vector3f;

public class Normal {
    private Vector3f coordinates;

    public Normal(Vector3f coordinates) {
        this.coordinates = coordinates;
    }

    public Vector3f getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Vector3f coordinates) {
        this.coordinates = coordinates;
    }
}
