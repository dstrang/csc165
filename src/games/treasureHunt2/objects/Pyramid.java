package games.treasureHunt2.objects;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import sage.scene.TriMesh;

public class Pyramid extends TriMesh{
	private static float[] vrts = new float[] {0,1,0,  -1,-1,1,  1,-1,1,  1,-1,-1,  -1,-1,-1};
	private static float[] cl = new float[] {1,0,0,1,  0,1,0,1,  0,0,1,1,  1,1,0,1,  1,0,1,1};
	private static int[] triangles = new int[] {0,1,2,  0,2,3,  0,3,4,  0,4,1,  1,4,2,  4,3,2};

	public Pyramid()
	{ 
		int i;
		FloatBuffer vertBuf = com.jogamp.common.nio.Buffers.newDirectFloatBuffer(vrts);
		FloatBuffer colorBuf = com.jogamp.common.nio.Buffers.newDirectFloatBuffer(cl);
		IntBuffer triangleBuf = com.jogamp.common.nio.Buffers.newDirectIntBuffer(triangles);
		this.setVertexBuffer(vertBuf);
		this.setColorBuffer(colorBuf);
		this.setIndexBuffer(triangleBuf); 
	}
}
