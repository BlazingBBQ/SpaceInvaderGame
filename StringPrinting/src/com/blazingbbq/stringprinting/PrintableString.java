package com.blazingbbq.stringprinting;

import java.util.ArrayList;

public class PrintableString {
	
	ArrayList<NewCharacter> characters;
	
	private String string = "";
	private float x;
	private float y;
	private float r;
	private float g;
	private float b;
	private float size;
	
	//Constructor
	public PrintableString(float x, float y, float r, float g, float b, float size, String string){
		characters = new ArrayList<NewCharacter>();
		this.x = x;
		this.y = y;
		this.r = r;
		this.g = g;
		this.b = b;
		this.size = size;
		
		if(!Blocks.hasBeenInitialized()){
			Blocks.init();
		}
		
		//Change String *initialization*
		setString(string);
	}
	
	public PrintableString(String string, float x, float y, float r, float g, float b, float size){
		characters = new ArrayList<NewCharacter>();
		this.x = x;
		this.y = y;
		this.r = r;
		this.g = g;
		this.b = b;
		this.size = size;
		
		if(!Blocks.hasBeenInitialized()){
			Blocks.init();
		}
		
		//Change String *initialization*
		setString(string);
	}
	
	//render()
	public void render(){
		for(NewCharacter character : characters){
			character.render();
		}
	}
	
	//Modify Printable String
	//setString
	public void setString(String newString){
		this.string = newString;
		
		characters.clear();
		
		getNewCharacters(string);
	}
	
	//setColor
	public void setColor(float r, float g, float b){
		this.r = r;
		this.g = g;
		this.b = b;
		
		this.setString(this.getString());
	}
	
	//setCoordinates
	public void setCoordinates(float x, float y){
		this.x = x;
		this.y = y;
		
		this.setString(this.getString());
	}
	
	//setSize
	public void setSize(float size){
		this.size = size;
		
		this.setString(this.getString());
	}
	
	//Get
	//getString
	public String getString(){
		return string;
	}
	
	//getColorR
	public float getColorR(){
		return r;
	}
	
	//getColorG
	public float getColorG(){
		return g;
	}
	
	//getColorB
	public float getColorB(){
		return b;
	}
	
	//getCoordinateX
	public float getCoordinateX(){
		return x;
	}
	
	//getCoordinateY
	public float getCoordinateY(){
		return y;
	}
	
	//getTotalSize
	public float getTotalSize(){
		return characters.size() * size * 9;
	}
	
	//getCharacterSize
	public float getCharacterSize(){
		return size * 8;
	}
	
	//getSize
	public float getSize(){
		return size;
	}
	
	//getNewCharacters
	public void getNewCharacters(String string){
		String string1 = string;
		String string2 = string1.toUpperCase();
		char[] chars = string2.toCharArray();
		
		for(char character : chars){
			for(NewCharacter block : Blocks.getBlocks()){
				if(character == block.toChar()){
				switch (block.toChar()){
				case ' ':
					characters.add(new CharacterSPACE(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case '.':
					characters.add(new CharacterDOT(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case '!':
					characters.add(new CharacterEXCLAMATION(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case ':':
					characters.add(new CharacterCOLON(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case '0':
					characters.add(new Character0(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case '1':
					characters.add(new Character1(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case '2':
					characters.add(new Character2(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case '3':
					characters.add(new Character3(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case '4':
					characters.add(new Character4(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case '5':
					characters.add(new Character5(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case '6':
					characters.add(new Character6(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case '7':
					characters.add(new Character7(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case '8':
					characters.add(new Character8(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case '9':
					characters.add(new Character9(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'A':
					characters.add(new CharacterA(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'B':
					characters.add(new CharacterB(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'C':
					characters.add(new CharacterC(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'D':
					characters.add(new CharacterD(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'E':
					characters.add(new CharacterE(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'F':
					characters.add(new CharacterF(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'G':
					characters.add(new CharacterG(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'H':
					characters.add(new CharacterH(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'I':
					characters.add(new CharacterI(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'J':
					characters.add(new CharacterJ(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'K':
					characters.add(new CharacterK(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'L':
					characters.add(new CharacterL(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'M':
					characters.add(new CharacterM(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'N':
					characters.add(new CharacterN(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'O':
					characters.add(new CharacterO(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'P':
					characters.add(new CharacterP(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'Q':
					characters.add(new CharacterQ(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'R':
					characters.add(new CharacterR(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'S':
					characters.add(new CharacterS(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'T':
					characters.add(new CharacterT(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'U':
					characters.add(new CharacterU(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'V':
					characters.add(new CharacterV(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'W':
					characters.add(new CharacterW(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'X':
					characters.add(new CharacterX(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'Y':
					characters.add(new CharacterY(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				case 'Z':
					characters.add(new CharacterZ(x + 9 * size * characters.size(), y, r, g, b, size));
					break;
				}
				}
			}
		}
	}
	
}
