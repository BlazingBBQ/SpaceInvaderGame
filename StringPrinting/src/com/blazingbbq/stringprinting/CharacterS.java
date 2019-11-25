package com.blazingbbq.stringprinting;

public class CharacterS extends NewCharacter{
	
	public CharacterS(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'S';
	}
	
	public void render(){
		//Building Blocks
		//1
		block7x2(0, 0);
		//2
		block2x3(6, 1);
		//3
		block6x2(1, 3);
		//4
		block2x3(0, 4);
		//5
		block7x2(1, 6);
	}
	
}
