package net.zegline.alpha;

import java.util.Random;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Alpha.MOD_ID, name = Alpha.MOD_NAME, version = Alpha.VERSION, dependencies = Alpha.DEPENDENCIES)
public class Alpha {

	// Constants
	public static final String MOD_ID = "alpha";
	public static final String MOD_NAME = "Zegline's Alpha Mod";
	public static final String VERSION = "@VERSION@";
	public static final String DEPENDENCIES = "required-after:forge@[13.20.0.2206,)";
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":";
	
	// Variables
	public static Random random = new Random();
	
	@Instance(MOD_ID)
	public static Alpha instance;
	
	@SidedProxy(clientSide = "net.zegline.alpha.ClientProxy", serverSide = "net.zegline.alpha.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
		proxy.postInit(event);
	}
	
}
