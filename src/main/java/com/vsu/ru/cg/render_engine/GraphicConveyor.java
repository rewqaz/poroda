package com.vsu.ru.cg.render_engine;
import com.vsu.ru.cg.math.matrix.Matrix4f;
import com.vsu.ru.cg.math.vector.Vector3f;

import javax.vecmath.Point2f;

public class GraphicConveyor {

    public static Matrix4f rotateScaleTranslate() {
        float[] matrix = new float[]{
                1, 0, 0, 0,
                0, 1, 0, 0,
                0, 0, 1, 0,
                0, 0, 0, 1};
        return new Matrix4f(matrix);
    }

    public static Matrix4f lookAt(Vector3f eye, Vector3f target) {
        return lookAt(eye, target, new Vector3f(0F, 1.0F, 0F));
    }

    public static Matrix4f lookAt(Vector3f eye, Vector3f target, Vector3f up) {
        Vector3f resultX = new Vector3f();
        Vector3f resultY = new Vector3f();
        Vector3f resultZ = new Vector3f();
        resultZ.addMul(target, eye);
        resultX.addMul(up, resultZ);
        resultY.addMul(resultZ, resultX);

        resultX.nor();
        resultY.nor();
        resultZ.nor();

        float[] matrix = new float[]{
                resultX.x, resultY.x, resultZ.x, 0,
                resultX.y, resultY.y, resultZ.y, 0,
                resultX.z, resultY.z, resultZ.z, 0,
                -resultX.dot(eye), -resultY.dot(eye), -resultZ.dot(eye), 1};
        return new Matrix4f(matrix);
    }

    public static Matrix4f perspective(
            final float fov,
            final float aspectRatio,
            final float nearPlane,
            final float farPlane) {
        Matrix4f result = new Matrix4f();
        float tangentMinusOnDegree = (float) (1.0F / (Math.tan(fov * 0.5F)));
        result.val[result.M11] = tangentMinusOnDegree / aspectRatio;
        result.val[result.M22] = tangentMinusOnDegree;
        result.val[result.M33] = (farPlane + nearPlane) / (farPlane - nearPlane);
        result.val[result.M34] = 1.0F;
        result.val[result.M43] = 2 * (nearPlane * farPlane) / (nearPlane - farPlane);
        return result;
    }

    public static Vector3f multiplyMatrix4ByVector3(final Matrix4f matrix, final Vector3f vertex) {
        final float x = (vertex.x * matrix.val[matrix.M11]) + (vertex.y * matrix.val[matrix.M21]) + (vertex.z * matrix.val[matrix.M31]) + matrix.val[matrix.M41];
        final float y = (vertex.x * matrix.val[matrix.M12]) + (vertex.y * matrix.val[matrix.M22]) + (vertex.z * matrix.val[matrix.M32]) + matrix.val[matrix.M42];
        final float z = (vertex.x * matrix.val[matrix.M13]) + (vertex.y * matrix.val[matrix.M23]) + (vertex.z * matrix.val[matrix.M33]) + matrix.val[matrix.M43];
        final float w = (vertex.x * matrix.val[matrix.M14]) + (vertex.y * matrix.val[matrix.M24]) + (vertex.z * matrix.val[matrix.M34]) + matrix.val[matrix.M44];
        return new Vector3f(x / w, y / w, z / w);
    }

    public static Point2f vertexToPoint(final Vector3f vertex, final int width, final int height) {
        return new Point2f(vertex.x * width + width / 2.0F, -vertex.y * height + height / 2.0F);
    }
}
