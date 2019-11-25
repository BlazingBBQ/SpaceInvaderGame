package com.blazingbbq.stringprinting;

public class CharacterQ extends NewCharacter{
	
	public CharacterQ(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'Q';
	}
	
	public void render(){
		//Building Blocks
		//1
		block7x2(1, 0);
		//2
		block2x5(6, 2);
		//3
		block6x2(1, 6);
		//4
		block2x6(0, 1);
		//5
		block1x1(5, 2);
		//6
		block1x1(4, 3);
	}
	
}
