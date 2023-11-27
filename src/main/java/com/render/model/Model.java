package com.render.model;

import com.render.model.model3D_components.Normal;
import com.render.model.model3D_components.Polygon;
import com.render.model.model3D_components.TextureVertex;
import com.render.model.model3D_components.Vertex;
import com.render.math.vector.Vector2f;
import com.render.math.vector.Vector3f;


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

    public ArrayList<Vector3f> vertices = new ArrayList<Vector3f>();
    public ArrayList<Vector2f> textureVertices = new ArrayList<Vector2f>();
    public ArrayList<Vector3f> normals = new ArrayList<Vector3f>();
    public ArrayList<Polygon> polygons = new ArrayList<Polygon>();

}
