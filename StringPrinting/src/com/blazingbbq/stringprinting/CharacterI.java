package com.blazingbbq.stringprinting;

public class CharacterI extends NewCharacter{
	
	public CharacterI(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'I';
	}
	
	public void render(){
		//Building Blocks
		//1
		block8x2(0, 0);
		//2
		block2x4(3, 2);
		//3
		block8x2(0, 6);
	}
	
}
