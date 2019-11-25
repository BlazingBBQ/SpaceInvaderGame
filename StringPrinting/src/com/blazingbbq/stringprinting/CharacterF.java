package com.blazingbbq.stringprinting;

public class CharacterF extends NewCharacter{
	
	public CharacterF(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'F';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x8(0, 0);
		//2
		block4x2(2, 3);
		//3
		block6x2(2, 6);
	}
	
}
