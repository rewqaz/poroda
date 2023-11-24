package com.render.model.utils3D;

import com.render.model.Model;
import com.render.model.utils3D.realization.Normalization;
import com.render.model.utils3D.realization.Triangulation;

public class ModelUtils3D {
    public static void triangulate(Model model) {
        Triangulation.triangulate(model);
    }

    public static void calculateNormals(Model model){
        Normalization.calculateNormals(model);
    }
}
