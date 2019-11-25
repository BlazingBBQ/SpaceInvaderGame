package com.blazingbbq.stringprinting;

public class CharacterE extends NewCharacter{
	
	public CharacterE(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'E';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x8(0, 0);
		//2
		block6x2(2, 0);
		//3
		block4x2(2, 3);
		//4
		block6x2(2, 6);
	}
	
}
