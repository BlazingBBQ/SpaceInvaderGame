package com.blazingbbq.stringprinting;

public class CharacterZ extends NewCharacter{
	
	public CharacterZ(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'Z';
	}
	
	public void render(){
		//Building Blocks
		//1
		block8x2(0, 0);
		//2
		block2x1(0, 2);
		//3
		block5x1(1, 3);
		//4
		block5x1(2, 4);
		//5
		block2x1(6, 5);
		//6
		block8x2(0, 6);
	}
	
}
