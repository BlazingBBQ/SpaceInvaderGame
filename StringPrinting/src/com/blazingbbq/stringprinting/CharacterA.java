package com.blazingbbq.stringprinting;

public class CharacterA extends NewCharacter{
	
	public CharacterA(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'A';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x6(0, 0);
		//2
		block4x2(2, 2);
		//3
		block2x6(6, 0);
		//4
		block4x2(2, 6);
	}
	
}
