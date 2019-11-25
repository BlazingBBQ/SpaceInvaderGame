package com.blazingbbq.stringprinting;

public class CharacterL extends NewCharacter{
	
	public CharacterL(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'L';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x8(0, 0);
		//2
		block6x2(2, 0);
	}
	
}
