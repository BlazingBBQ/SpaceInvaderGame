package com.blazingbbq.base;

import java.util.ArrayList;

import com.blazingbbq.stringprinting.*;

public class Game {
	
	private ArrayList<NewCharacter> characters;
	private PrintableString string2;
	
	//Constructor
	public Game(){
		//ArrayList init
		characters = new ArrayList<NewCharacter>();
		
		CharacterA characterA = new CharacterA(10, 30, 1, 1, 1, 1);
		characters.add(characterA);
		CharacterB characterB = new CharacterB(20, 30, 1, 1, 1, 1);
		characters.add(characterB);
		CharacterC characterC = new CharacterC(30, 30, 1, 1, 1, 1);
		characters.add(characterC);
		CharacterD characterD = new CharacterD(40, 30, 1, 1, 1, 1);
		characters.add(characterD);
		CharacterE characterE = new CharacterE(50, 30, 1, 1, 1, 1);
		characters.add(characterE);
		CharacterF characterF = new CharacterF(60, 30, 1, 1, 1, 1);
		characters.add(characterF);
		CharacterG characterG = new CharacterG(70, 30, 1, 1, 1, 1);
		characters.add(characterG);
		CharacterH characterH = new CharacterH(80, 30, 1, 1, 1, 1);
		characters.add(characterH);
		CharacterI characterI = new CharacterI(90, 30, 1, 1, 1, 1);
		characters.add(characterI);
		CharacterJ characterJ = new CharacterJ(100, 30, 1, 1, 1, 1);
		characters.add(characterJ);
		CharacterK characterK = new CharacterK(110, 30, 1, 1, 1, 1);
		characters.add(characterK);
		CharacterL characterL = new CharacterL(120, 30, 1, 1, 1, 1);
		characters.add(characterL);
		CharacterM characterM = new CharacterM(130, 30, 1, 1, 1, 1);
		characters.add(characterM);
		CharacterN characterN = new CharacterN(140, 30, 1, 1, 1, 1);
		characters.add(characterN);
		CharacterO characterO = new CharacterO(150, 30, 1, 1, 1, 1);
		characters.add(characterO);
		CharacterP characterP = new CharacterP(160, 30, 1, 1, 1, 1);
		characters.add(characterP);
		CharacterQ characterQ = new CharacterQ(170, 30, 1, 1, 1, 1);
		characters.add(characterQ);
		CharacterR characterR = new CharacterR(180, 30, 1, 1, 1, 1);
		characters.add(characterR);
		CharacterS characterS = new CharacterS(190, 30, 1, 1, 1, 1);
		characters.add(characterS);
		CharacterT characterT = new CharacterT(200, 30, 1, 1, 1, 1);
		characters.add(characterT);
		CharacterU characterU = new CharacterU(210, 30, 1, 1, 1, 1);
		characters.add(characterU);
		CharacterV characterV = new CharacterV(220, 30, 1, 1, 1, 1);
		characters.add(characterV);
		CharacterW characterW = new CharacterW(230, 30, 1, 1, 1, 1);
		characters.add(characterW);
		CharacterX characterX = new CharacterX(240, 30, 1, 1, 1, 1);
		characters.add(characterX);
		CharacterY characterY = new CharacterY(250, 30, 1, 1, 1, 1);
		characters.add(characterY);
		CharacterZ characterZ = new CharacterZ(260, 30, 1, 1, 1, 1);
		characters.add(characterZ);
		Character0 character0 = new Character0(270, 30, 1, 1, 1, 1);
		characters.add(character0);
		Character1 character1 = new Character1(280, 30, 1, 1, 1, 1);
		characters.add(character1);
		Character2 character2 = new Character2(290, 30, 1, 1, 1, 1);
		characters.add(character2);
		Character3 character3 = new Character3(300, 30, 1, 1, 1, 1);
		characters.add(character3);
		Character4 character4 = new Character4(310, 30, 1, 1, 1, 1);
		characters.add(character4);
		Character5 character5 = new Character5(320, 30, 1, 1, 1, 1);
		characters.add(character5);
		Character6 character6 = new Character6(330, 30, 1, 1, 1, 1);
		characters.add(character6);
		Character7 character7 = new Character7(340, 30, 1, 1, 1, 1);
		characters.add(character7);
		Character8 character8 = new Character8(350, 30, 1, 1, 1, 1);
		characters.add(character8);
		Character9 character9 = new Character9(360, 30, 1, 1, 1, 1);
		characters.add(character9);
		CharacterDOT characterDOT = new CharacterDOT(370, 30, 1, 1, 1, 1);
		characters.add(characterDOT);
		CharacterEXCLAMATION characterEXCLAMATION = new CharacterEXCLAMATION(380, 30, 1, 1, 1, 1);
		characters.add(characterEXCLAMATION);
		CharacterCOLON characterCOLON = new CharacterCOLON(390, 30, 1, 1, 1, 1);
		characters.add(characterCOLON);
		
		
		//SIMON
		CharacterS characterSS = new CharacterS(50, 50, 1, 1, 1, 1);
		characters.add(characterSS);
		CharacterI characterSI = new CharacterI(59, 50, 1, 1, 1, 1);
		characters.add(characterSI);
		CharacterM characterSM = new CharacterM(68, 50, 1, 1, 1, 1);
		characters.add(characterSM);
		CharacterO characterSN = new CharacterO(77, 50, 1, 1, 1, 1);
		characters.add(characterSN);
		CharacterN characterSO = new CharacterN(86, 50, 1, 1, 1, 1);
		characters.add(characterSO);
		
		
		//PrintableString
		string2 = new PrintableString(238, 284, 1, 0, 0, 4, "Game Over");
	}
	
	public void getInput(){
		
	}
	
	public void update(){
		
	}
	
	public void render(){
		for(NewCharacter character : characters){
			character.render();
		}
		string2.render();
	}
	
	public ArrayList<NewCharacter> getCharacters(){
		return characters;
	}
	
}
