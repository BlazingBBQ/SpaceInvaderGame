package com.blazingbbq.stringprinting;

public class CharacterD extends NewCharacter{
	
	public CharacterD(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'D';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x8(0, 0);
		//2
		block5x2(2, 0);
		//3
		block2x6(6, 1);
		//4
		block5x2(2, 6);
	}
	
}
