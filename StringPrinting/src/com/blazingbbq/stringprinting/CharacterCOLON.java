package com.blazingbbq.stringprinting;

public class CharacterCOLON extends NewCharacter{
	
	public CharacterCOLON(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = ':';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x2(0, 1);
		//2
		block2x2(0, 5);
	}
	
}
