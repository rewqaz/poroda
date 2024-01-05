package com.vsu.ru.cg.model;
import com.vsu.ru.cg.math.vector.Vector2f;
import com.vsu.ru.cg.math.vector.Vector3f;
import com.vsu.ru.cg.model.model_components.Normal;
import com.vsu.ru.cg.model.model_components.Polygon;
import com.vsu.ru.cg.model.model_components.TextureVertex;
import com.vsu.ru.cg.model.model_components.Vertex;

import java.util.*;

public class Model {

    public ArrayList<Vector3f> vertices = new ArrayList<Vector3f>();
    public ArrayList<Vector2f> textureVertices = new ArrayList<Vector2f>();
    public ArrayList<Vector3f> normals = new ArrayList<Vector3f>();
    public ArrayList<Polygon> polygons = new ArrayList<Polygon>();

    public Model(Model model) {
    }

    public Model() {

    }

    public Model(ArrayList<Vertex> vertexList, ArrayList<TextureVertex> textureVertexList, ArrayList<Normal> normalList, ArrayList<Polygon> polygonList) {
    }

    public ArrayList<Vector2f> getTextureVertices() {
        return textureVertices;
    }

    public void setTextureVertices(ArrayList<Vector2f> textureVertices) {
        this.textureVertices = textureVertices;
    }

    public ArrayList<Vector3f> getNormals() {
        return normals;
    }

    public void setNormals(ArrayList<Vector3f> normals) {
        this.normals = normals;
    }

    public ArrayList<Vector3f> getVertices() {
        return vertices;
    }

    public void setVertices(ArrayList<Vector3f> vertices) {
        this.vertices = vertices;
    }

    public void setPolygons(ArrayList<Polygon> polygons) { 
        this.polygons = polygons; 
    }
    
    public ArrayList<Polygon> getPolygons() {
        return polygons;
    }
}
