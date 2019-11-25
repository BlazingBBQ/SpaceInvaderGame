package com.blazingbbq.stringprinting;

public class CharacterN extends NewCharacter{
	
	public CharacterN(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'N';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x8(0, 0);
		//2
		block2x2(2, 5);
		//3
		block2x2(3, 3);
		//4
		block2x2(4, 1);
		//5
		block2x8(6, 0);
		//6
		block1x1(2, 7);
		//7
		block1x1(5, 0);
	}
	
}
