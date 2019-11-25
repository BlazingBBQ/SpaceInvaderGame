package com.blazingbbq.stringprinting;

public class CharacterDOT extends NewCharacter{
	
	public CharacterDOT(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = '.';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x2(0, 0);
	}
	
}
