package com.blazingbbq.stringprinting;

public class CharacterH extends NewCharacter{
	
	public CharacterH(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'H';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x8(0, 0);
		//2
		block4x2(2, 3);
		//3
		block2x8(6, 0);
	}
	
}
