package com.render.model.model3D_components;

import com.render.math.Vector2f;

public class TextureVertex {
    private Vector2f coordinates;

    public TextureVertex(Vector2f coordinates) {
        this.coordinates = coordinates;
    }

    public Vector2f getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Vector2f coordinates) {
        this.coordinates = coordinates;
    }
}
