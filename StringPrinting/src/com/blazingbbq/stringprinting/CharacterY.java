package com.blazingbbq.stringprinting;

public class CharacterY extends NewCharacter{
	
	public CharacterY(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'Y';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x4(0, 4);
		//2
		block2x2(1, 3);
		//3
		block2x4(3, 0);
		//4
		block2x2(5, 3);
		//5
		block2x4(6, 4);
	}
	
}
