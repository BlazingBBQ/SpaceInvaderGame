package com.blazingbbq.stringprinting;

public class CharacterC extends NewCharacter{
	
	public CharacterC(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'C';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x2(6, 1);
		//2
		block6x2(1, 0);
		//3
		block2x6(0, 1);
		//4
		block6x2(1, 6);
		//5
		block2x2(6, 5);
	}
	
}
