package com.blazingbbq.stringprinting;

public class CharacterM extends NewCharacter{
	
	public CharacterM(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'M';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x8(0, 0);
		//2
		block1x2(2, 5);
		//3
		block2x2(3, 3);
		//4
		block1x2(5, 5);
		//5
		block2x8(6, 0);
	}
	
}
