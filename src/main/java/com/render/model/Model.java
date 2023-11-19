package com.render.model;
import com.render.math.Vector2f;
import com.render.math.Vector3f;

import java.util.*;

public class Model {

    public ArrayList<Vector3f> vertices = new ArrayList<com.render.math.Vector3f>();
    public ArrayList<Vector2f> textureVertices = new ArrayList<com.render.math.Vector2f>();
    public ArrayList<Vector3f> normals = new ArrayList<Vector3f>();
    public ArrayList<Polygon> polygons = new ArrayList<Polygon>();
}
