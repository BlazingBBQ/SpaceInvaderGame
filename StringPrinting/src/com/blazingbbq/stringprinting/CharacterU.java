package com.blazingbbq.stringprinting;

public class CharacterU extends NewCharacter{
	
	public CharacterU(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'U';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x7(0, 1);
		//2
		block6x2(1, 0);
		//3
		block2x7(6, 1);
	}
	
}
