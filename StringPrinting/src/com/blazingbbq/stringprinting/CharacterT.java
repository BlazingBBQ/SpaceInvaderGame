package com.blazingbbq.stringprinting;

public class CharacterT extends NewCharacter{
	
	public CharacterT(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'T';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x8(3, 0);
		//2
		block8x2(0, 6);
	}
	
}
