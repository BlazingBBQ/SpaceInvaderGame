package com.blazingbbq.stringprinting;

public class CharacterJ extends NewCharacter{
	
	public CharacterJ(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'J';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x2(0, 1);
		//2
		block4x2(1, 0);
		//3
		block2x5(4, 1);
		//4
		block8x2(0, 6);
	}
	
}
