package com.blazingbbq.stringprinting;

public class CharacterP extends NewCharacter{
	
	public CharacterP(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'P';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x8(0, 0);
		//2
		block5x2(2, 2);
		//3
		block2x4(6, 3);
		//4
		block5x2(2, 6);
	}
	
}
