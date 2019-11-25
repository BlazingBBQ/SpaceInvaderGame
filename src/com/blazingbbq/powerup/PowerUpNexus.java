package com.blazingbbq.powerup;

import java.util.ArrayList;
import java.util.Random;

import org.lwjgl.opengl.Display;

import com.blazingbbq.game.DataUtil;
import com.blazingbbq.game.Delay;
import com.blazingbbq.gameobject.Blaster;
import com.blazingbbq.gameobject.Player;
import com.blazingbbq.gameobject.PlayerStats;
import com.blazingbbq.stringprinting.PrintableString;

public class PowerUpNexus {
	
	/*
	 * Steps to creating a new Power Up:
	 * 
	 * 1 - Create new class inheriting from PowerUp (Assign color)
	 * 2 - Change numberPowerUps
	 * 3 - Add constant for the PowerUp duration (delay)
	 * 4 - Add new delay and HUD element
	 * 5 - Initial them in the init method
	 * 6 - Add if to update method
	 * 7 - Add if to render method
	 * 8 - Add case to spawn method
	 * 9 - Create PowerUp and PowerDown methods
	 */
	
	private static Random random = new Random();
	
	private static int numberPowerUps = 5;
	public static int coinsForPowerUp = 3;
	
	public static final int SPEED_POWER_UP_DELAY = 15000;
	public static final int BLASTER_POWER_UP_DELAY = 15000;
	public static final int SIZE_POWER_UP_DELAY = 15000;
	public static final int SHOTSPEED_POWER_UP_DELAY = 15000;
	
	private static Delay speedPUD;
	private static Delay blasterPUD;
	private static Delay sizePUD;
	private static Delay shotSpeedPUD;
	
	private static PrintableString speedHUD;
	private static PrintableString blasterHUD;
	private static PrintableString sizeHUD;
	private static PrintableString shotSpeedHUD;
	
	private static ArrayList<PrintableString> activePowerUps;
	
	private static int stringSize;
	
	public static void init(int size){
		
		speedPUD = new Delay(SPEED_POWER_UP_DELAY);
		blasterPUD = new Delay(BLASTER_POWER_UP_DELAY);
		sizePUD = new Delay(SIZE_POWER_UP_DELAY);
		shotSpeedPUD = new Delay(SHOTSPEED_POWER_UP_DELAY);
		
		stringSize = size;
		
		speedHUD = new PrintableString(6, 6, SpeedPowerUp.r, SpeedPowerUp.g, SpeedPowerUp.b, size, new Integer(speedPUD.millisecondsRemaining()).toString());
		blasterHUD = new PrintableString(6, 6, BlasterPowerUp.r, BlasterPowerUp.g, BlasterPowerUp.b, size, new Integer(blasterPUD.millisecondsRemaining()).toString());
		sizeHUD = new PrintableString(6, 6, SizePowerUp.r, SizePowerUp.g, SizePowerUp.b, size, new Integer(sizePUD.millisecondsRemaining()).toString());
		shotSpeedHUD = new PrintableString(6, 6, ShotSpeedPowerUp.r, ShotSpeedPowerUp.g, ShotSpeedPowerUp.b, size, new Integer(shotSpeedPUD.millisecondsRemaining()).toString());
		
		activePowerUps = new ArrayList<PrintableString>();
		
	}
	
	public static void update(){
		
		//Speed
		if(speedPUD.isOver()){
			powerDownSpeed();
		}
		
		//Blaster
		if(blasterPUD.isOver()){
			powerDownBlaster();
		}
		
		//Size
		if(sizePUD.isOver()){
			powerDownSize();
		}
		
		//Shot Speed
		if(shotSpeedPUD.isOver()){
			powerDownShotSpeed();
		}
		
	}
	
	public static void render(){
		
		speedHUD.setString(new Integer(speedPUD.millisecondsRemaining()).toString());
		blasterHUD.setString(new Integer(blasterPUD.millisecondsRemaining()).toString());
		sizeHUD.setString(new Integer(sizePUD.millisecondsRemaining()).toString());
		shotSpeedHUD.setString(new Integer(shotSpeedPUD.millisecondsRemaining()).toString());
		
		activePowerUps.clear();
		
		//Speed 
		if (!speedHUD.getString().equals("0")){
			speedHUD.setCoordinates(6, 6 + (stringSize * 8 + 6) * activePowerUps.size());
			activePowerUps.add(speedHUD);
		}
		
		//Blaster
		if (!blasterHUD.getString().equals("0")){
			blasterHUD.setCoordinates(6, 6 + (stringSize * 8 + 6) * activePowerUps.size());
			activePowerUps.add(blasterHUD);
		}
		
		//Size
		if (!sizeHUD.getString().equals("0")){
			sizeHUD.setCoordinates(6, 6 + (stringSize * 8 + 6) * activePowerUps.size());
			activePowerUps.add(sizeHUD);
		}
		
		//Shot Speed
		if (!shotSpeedHUD.getString().equals("0")){
			shotSpeedHUD.setCoordinates(6, 6 + (stringSize * 8 + 6) * activePowerUps.size());
			activePowerUps.add(shotSpeedHUD);
		}
		
		for (PrintableString ps : activePowerUps){
			ps.render();
		}
		
	}
	
	//Spawn powerUps
	public static void spawnPowerUps(int amount){
		for(int i = 1; i <= amount; i++){
			int temp = random.nextInt(numberPowerUps);
			
			switch(temp){
			case 0: DataUtil.getGame().addObject(new SpeedPowerUp(random.nextInt(Display.getWidth()), Display.getHeight()));
			break;
			case 1: DataUtil.getGame().addObject(new DualBlasterPowerUp(random.nextInt(Display.getWidth()), Display.getHeight()));
			break;
			case 2: DataUtil.getGame().addObject(new SizePowerUp(random.nextInt(Display.getWidth()), Display.getHeight()));
			break;
			case 3: DataUtil.getGame().addObject(new TripleBlasterPowerUp(random.nextInt(Display.getWidth()), Display.getHeight()));
			break;
			case 4: DataUtil.getGame().addObject(new ShotSpeedPowerUp(random.nextInt(Display.getWidth()), Display.getHeight()));
			break;
			}
		}
	}

	// Power Up's
	//----------------------------------------------------------------------------------------------------
	//Power Up - Speed
	public static void powerUpSpeed(){
		DataUtil.getPlayer().getStats().setSpeed(9f);
		
		speedPUD.start();
	}
	
	//Power Up - Blaster
	public static void powerUpBlaster(Blaster newBlaster){
		if (newBlaster.getblasterPriorityID() > DataUtil.getPlayer().getStats().getBlaster().getblasterPriorityID()){
			DataUtil.getPlayer().getStats().setBlaster(newBlaster);
		}
		
		blasterPUD.start();
	}
	
	//Power Up - Size
	public static void powerUpSize() {
		DataUtil.getPlayer().setSize((float) ((float) Player.DEFAULT_SIZE / 1.5));
		DataUtil.getPlayer().setCurrentSize((float) ((float)Player.DEFAULT_SIZE / 1.5));
		
		sizePUD.start();
	}
	
	//Power Up - Shot Speed
	public static void powerUpShotSpeed() {
		DataUtil.getPlayer().getStats().setShotSpeed(250);
		
		shotSpeedPUD.start();
	}
	//----------------------------------------------------------------------------------------------------
	
	
	
	// Power Down's
	//----------------------------------------------------------------------------------------------------
	// Power Down - Speed
	public static void powerDownSpeed(){
		DataUtil.getPlayer().getStats().setSpeed(PlayerStats.DEFAULT_SPEED);
		speedPUD.reset();
	}
	
	// Power Down - Blaster
	public static void powerDownBlaster(){
		DataUtil.getPlayer().getStats().setBlaster(new Blaster());
		blasterPUD.reset();
	}
	
	// Power Down - Size
	public static void powerDownSize() {
		DataUtil.getPlayer().setSize(Player.DEFAULT_SIZE);
		DataUtil.getPlayer().setCurrentSize(Player.DEFAULT_SIZE);
		sizePUD.reset();
	}
	
	// Power Down - Shot Speed
	public static void powerDownShotSpeed(){
		DataUtil.getPlayer().getStats().setShotSpeed(PlayerStats.DEFAULT_SHOT_SPEED);
		shotSpeedPUD.reset();
	}
	//----------------------------------------------------------------------------------------------------
	
}
