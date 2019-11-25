package com.blazingbbq.stringprinting;

import java.util.ArrayList;

public class Blocks {
	
	static ArrayList<NewCharacter> blocks = new ArrayList<NewCharacter>();
	public static boolean isInitialized = false;
	
	public static void init(){
		//Blocks
		CharacterSPACE characterSPACE = new CharacterSPACE(0, 0, 1, 1, 1, 1);
		blocks.add(characterSPACE);
		CharacterDOT characterDOT = new CharacterDOT(0, 0, 1, 1, 1, 1);
		blocks.add(characterDOT);
		CharacterEXCLAMATION characterEXCLAMATION = new CharacterEXCLAMATION(0, 0, 1, 1, 1, 1);
		blocks.add(characterEXCLAMATION);
		CharacterCOLON characterCOLON = new CharacterCOLON(0, 0, 1, 1, 1, 1);
		blocks.add(characterCOLON);
		Character0 character0 = new Character0(0, 0, 1, 1, 1, 1);
		blocks.add(character0);
		Character1 character1 = new Character1(0, 0, 1, 1, 1, 1);
		blocks.add(character1);
		Character2 character2 = new Character2(0, 0, 1, 1, 1, 1);
		blocks.add(character2);
		Character3 character3 = new Character3(0, 0, 1, 1, 1, 1);
		blocks.add(character3);
		Character4 character4 = new Character4(0, 0, 1, 1, 1, 1);
		blocks.add(character4);
		Character5 character5 = new Character5(0, 0, 1, 1, 1, 1);
		blocks.add(character5);
		Character6 character6 = new Character6(0, 0, 1, 1, 1, 1);
		blocks.add(character6);
		Character7 character7 = new Character7(0, 0, 1, 1, 1, 1);
		blocks.add(character7);
		Character8 character8 = new Character8(0, 0, 1, 1, 1, 1);
		blocks.add(character8);
		Character9 character9 = new Character9(0, 0, 1, 1, 1, 1);
		blocks.add(character9);
		CharacterA characterA = new CharacterA(0, 0, 1, 1, 1, 1);
		blocks.add(characterA);
		CharacterB characterB = new CharacterB(0, 0, 1, 1, 1, 1);
		blocks.add(characterB);
		CharacterC characterC = new CharacterC(0, 0, 1, 1, 1, 1);
		blocks.add(characterC);
		CharacterD characterD = new CharacterD(0, 0, 1, 1, 1, 1);
		blocks.add(characterD);
		CharacterE characterE = new CharacterE(0, 0, 1, 1, 1, 1);
		blocks.add(characterE);
		CharacterF characterF = new CharacterF(0, 0, 1, 1, 1, 1);
		blocks.add(characterF);
		CharacterG characterG = new CharacterG(0, 0, 1, 1, 1, 1);
		blocks.add(characterG);
		CharacterH characterH = new CharacterH(0, 0, 1, 1, 1, 1);
		blocks.add(characterH);
		CharacterI characterI = new CharacterI(0, 0, 1, 1, 1, 1);
		blocks.add(characterI);
		CharacterJ characterJ = new CharacterJ(0, 0, 1, 1, 1, 1);
		blocks.add(characterJ);
		CharacterK characterK = new CharacterK(0, 0, 1, 1, 1, 1);
		blocks.add(characterK);
		CharacterL characterL = new CharacterL(0, 0, 1, 1, 1, 1);
		blocks.add(characterL);
		CharacterM characterM = new CharacterM(0, 0, 1, 1, 1, 1);
		blocks.add(characterM);
		CharacterN characterN = new CharacterN(0, 0, 1, 1, 1, 1);
		blocks.add(characterN);
		CharacterO characterO = new CharacterO(0, 0, 1, 1, 1, 1);
		blocks.add(characterO);
		CharacterP characterP = new CharacterP(0, 0, 1, 1, 1, 1);
		blocks.add(characterP);
		CharacterQ characterQ = new CharacterQ(0, 0, 1, 1, 1, 1);
		blocks.add(characterQ);
		CharacterR characterR = new CharacterR(0, 0, 1, 1, 1, 1);
		blocks.add(characterR);
		CharacterS characterS = new CharacterS(0, 0, 1, 1, 1, 1);
		blocks.add(characterS);
		CharacterT characterT = new CharacterT(0, 0, 1, 1, 1, 1);
		blocks.add(characterT);
		CharacterU characterU = new CharacterU(0, 0, 1, 1, 1, 1);
		blocks.add(characterU);
		CharacterV characterV = new CharacterV(0, 0, 1, 1, 1, 1);
		blocks.add(characterV);
		CharacterW characterW = new CharacterW(0, 0, 1, 1, 1, 1);
		blocks.add(characterW);
		CharacterX characterX = new CharacterX(0, 0, 1, 1, 1, 1);
		blocks.add(characterX);
		CharacterY characterY = new CharacterY(0, 0, 1, 1, 1, 1);
		blocks.add(characterY);
		CharacterZ characterZ = new CharacterZ(0, 0, 1, 1, 1, 1);
		blocks.add(characterZ);
		
		isInitialized = true;
	}
	
	public static boolean hasBeenInitialized(){
		return isInitialized;
	}
	
	public static ArrayList<NewCharacter> getBlocks(){
		return blocks;
	}
	
}
