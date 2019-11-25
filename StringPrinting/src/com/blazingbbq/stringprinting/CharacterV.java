package com.blazingbbq.stringprinting;

public class CharacterV extends NewCharacter{
	
	public CharacterV(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'V';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x5(0, 3);
		//2
		block2x3(1, 1);
		//3
		block4x2(2, 0);
		//4
		block2x3(5, 1);
		//5
		block2x5(6, 3);
	}
	
}
