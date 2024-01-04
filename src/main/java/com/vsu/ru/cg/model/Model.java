package com.vsu.ru.cg.model;
import com.vsu.ru.cg.model.model_components.Normal;
import com.vsu.ru.cg.model.model_components.Polygon;
import com.vsu.ru.cg.model.model_components.TextureVertex;
import com.vsu.ru.cg.model.model_components.Vertex;

import java.util.*;

public class Model {
    private List<Vertex> vertices;
    private List<TextureVertex> textureVertices;
    private List<Normal> normals;
    private List<Polygon> polygons;

    public Model() {
    }

    public Model(List<Vertex> vertices, List<Polygon> polygons) {
        this.vertices = vertices;
        this.polygons = polygons;
    }

    public Model(List<Vertex> vertices, List<TextureVertex> textureVertices, List<Normal> normals, List<Polygon> polygons) {
        this.vertices = vertices;
        this.textureVertices = textureVertices;
        this.normals = normals;
        this.polygons = polygons;
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertex> vertices) {
        this.vertices = vertices;
    }

    public List<TextureVertex> getTextureVertices() {
        return textureVertices;
    }

    public void setTextureVertices(List<TextureVertex> textureVertices) {
        this.textureVertices = textureVertices;
    }

    public List<Normal> getNormals() {
        return normals;
    }

    public void setNormals(List<Normal> normals) {
        this.normals = normals;
    }

    public List<Polygon> getPolygons() {
        return polygons;
    }

    public void setPolygons(List<Polygon> polygons) {
        this.polygons = polygons;
    }
}
