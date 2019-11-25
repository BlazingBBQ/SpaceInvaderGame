package com.blazingbbq.stringprinting;

import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glColor3f;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glPopMatrix;
import static org.lwjgl.opengl.GL11.glPushMatrix;
import static org.lwjgl.opengl.GL11.glTranslatef;
import static org.lwjgl.opengl.GL11.glVertex2f;

public abstract class NewCharacter {
	protected char character;
	
	protected float r;
	protected float g;
	protected float b;
	
	protected float x;
	protected float y;
	protected float size;
	
	protected boolean[] flags = new boolean[0];
	
	//Initialization for all letters
	public void init(float x, float y, float r, float g, float b, float size){
		this.x = x;
		this.y = y;
		this.r =r;
		this.g = g;
		this.b = b;
		this.size = size;
	}
	
	//Build character on new matrixes
	public abstract void render();
	
	//toChar()
	public char toChar(){
		return character;
	}
	
	
	
	//Building Blocks  [ Formula =  //Blocks x*y  |&|  ? == changing term ]
	
	//Blocks 1x?
	public void block1x1(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 1 * size);
				glVertex2f(1 * size, 1 * size);
				glVertex2f(1 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	public void block1x2(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 2 * size);
				glVertex2f(1 * size, 2 * size);
				glVertex2f(1 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	public void block1x3(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 3 * size);
				glVertex2f(1 * size, 3 * size);
				glVertex2f(1 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	public void block1x4(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 4 * size);
				glVertex2f(1 * size, 4 * size);
				glVertex2f(1 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	public void block1x5(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 5 * size);
				glVertex2f(1 * size, 5 * size);
				glVertex2f(1 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	public void block1x6(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 6 * size);
				glVertex2f(1 * size, 6 * size);
				glVertex2f(1 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	public void block1x7(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 7 * size);
				glVertex2f(1 * size, 7 * size);
				glVertex2f(1 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	public void block1x8(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 8 * size);
				glVertex2f(1 * size, 8 * size);
				glVertex2f(1 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	
	//Blocks ?x1
	public void block2x1(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 1 * size);
				glVertex2f(2 * size, 1 * size);
				glVertex2f(2 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	public void block3x1(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 1 * size);
				glVertex2f(3 * size, 1 * size);
				glVertex2f(3 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	public void block4x1(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 1 * size);
				glVertex2f(4 * size, 1 * size);
				glVertex2f(4 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	public void block5x1(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 1 * size);
				glVertex2f(5 * size, 1 * size);
				glVertex2f(5 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	public void block6x1(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 1 * size);
				glVertex2f(6 * size, 1 * size);
				glVertex2f(6 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	public void block7x1(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 1 * size);
				glVertex2f(7 * size, 1 * size);
				glVertex2f(7 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	public void block8x1(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 1 * size);
				glVertex2f(8 * size, 1 * size);
				glVertex2f(8 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	
	//Blocks 2x?
	public void block2x2(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 2 * size);
				glVertex2f(2 * size, 2 * size);
				glVertex2f(2 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	public void block2x3(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 3 * size);
				glVertex2f(2 * size, 3 * size);
				glVertex2f(2 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	public void block2x4(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 4 * size);
				glVertex2f(2 * size, 4 * size);
				glVertex2f(2 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	public void block2x5(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 5 * size);
				glVertex2f(2 * size, 5 * size);
				glVertex2f(2 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	public void block2x6(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 6 * size);
				glVertex2f(2 * size, 6 * size);
				glVertex2f(2 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	public void block2x7(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 7 * size);
				glVertex2f(2 * size, 7 * size);
				glVertex2f(2 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	public void block2x8(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 8 * size);
				glVertex2f(2 * size, 8 * size);
				glVertex2f(2 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	
	//Blocks ?x2
	public void block3x2(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 2 * size);
				glVertex2f(3 * size, 2 * size);
				glVertex2f(3 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	public void block4x2(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 2 * size);
				glVertex2f(4 * size, 2 * size);
				glVertex2f(4 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	public void block5x2(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 2 * size);
				glVertex2f(5 * size, 2 * size);
				glVertex2f(5 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	public void block6x2(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 2 * size);
				glVertex2f(6 * size, 2 * size);
				glVertex2f(6 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	public void block7x2(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 2 * size);
				glVertex2f(7 * size, 2 * size);
				glVertex2f(7 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
	public void block8x2(float gridX, float gridY){
		glPushMatrix();
		{
			glTranslatef(x + gridX * size, y + gridY * size, 0);
			glColor3f(r, g, b);
			glBegin(GL_QUADS);
			{
				glVertex2f(0, 0);
				glVertex2f(0, 2 * size);
				glVertex2f(8 * size, 2 * size);
				glVertex2f(8 * size, 0);
			}
			glEnd();
			
		}
		glPopMatrix();
	}
	
}
