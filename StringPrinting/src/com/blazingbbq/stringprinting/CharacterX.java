package com.blazingbbq.stringprinting;

public class CharacterX extends NewCharacter{
	
	public CharacterX(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'X';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x2(0, 0);
		//2
		block2x2(1, 1);
		//3
		block2x2(5, 1);
		//4
		block2x2(6, 0);
		//5
		block2x2(5, 5);
		//6
		block2x2(6, 6);
		//7
		block2x2(1, 5);
		//8
		block2x2(0, 6);
		//9
		block2x4(2, 2);
		block2x4(4, 2);
	}
	
}
