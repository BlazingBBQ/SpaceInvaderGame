package com.blazingbbq.stringprinting;

public class CharacterR extends NewCharacter{
	
	public CharacterR(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'R';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x8(0, 0);
		//2
		block3x2(5, 0);
		//3
		block1x1(4, 1);
		//4
		block5x2(2 , 2);
		//5
		block2x4(6, 3);
		//6
		block5x2(2, 6);
	}
	
}
