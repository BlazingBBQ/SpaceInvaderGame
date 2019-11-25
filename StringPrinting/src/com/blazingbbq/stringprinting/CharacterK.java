package com.blazingbbq.stringprinting;

public class CharacterK extends NewCharacter{
	
	public CharacterK(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'K';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x8(0, 0);
		//2
		block3x2(5, 0);
		//3
		block2x2(4, 1);
		//4
		block2x2(2, 3);
		//5
		block2x2(4, 5);
		//6
		block3x2(5, 6);
	}
	
}
