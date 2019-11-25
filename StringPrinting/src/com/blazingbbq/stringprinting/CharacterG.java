package com.blazingbbq.stringprinting;

public class CharacterG extends NewCharacter{
	
	public CharacterG(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'G';
	}
	
	public void render(){
		//Building Blocks
		//1
		block6x2(1, 0);
		//2
		block2x3(6, 1);
		//3
		block2x1(4, 3);
		//4
		block2x6(0, 1);
		//5
		block6x2(1, 6);
		//6
		block2x2(6, 5);
	}
	
}
