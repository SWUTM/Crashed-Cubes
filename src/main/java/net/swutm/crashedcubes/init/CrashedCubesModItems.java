package net.swutm.crashedcubes.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.swutm.crashedcubes.crashedcubes;
import net.swutm.crashedcubes.item.WoodHammerItem;
import net.swutm.crashedcubes.item.WoodExcavatorItem;
import net.swutm.crashedcubes.item.UkraineHammerItem;
import net.swutm.crashedcubes.item.StoneHammerItem;
import net.swutm.crashedcubes.item.StoneExcavatorItem;
import net.swutm.crashedcubes.item.NetheriteHammerItem;
import net.swutm.crashedcubes.item.NetheriteExcavatorItem;
import net.swutm.crashedcubes.item.IronHammerItem;
import net.swutm.crashedcubes.item.IronExcavatorItem;
import net.swutm.crashedcubes.item.GoldHammerItem;
import net.swutm.crashedcubes.item.GoldExcavatorItem;
import net.swutm.crashedcubes.item.DiamondHammerItem;
import net.swutm.crashedcubes.item.DiamondExcavatorItem;

public class CrashedCubesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, crashedcubes.MOD_ID);
	public static final RegistryObject<Item> WOOD_HAMMER = REGISTRY.register("wood_hammer", () -> new WoodHammerItem());
	public static final RegistryObject<Item> STONE_HAMMER = REGISTRY.register("stone_hammer", () -> new StoneHammerItem());
	public static final RegistryObject<Item> IRON_HAMMER = REGISTRY.register("iron_hammer", () -> new IronHammerItem());
	public static final RegistryObject<Item> GOLD_HAMMER = REGISTRY.register("gold_hammer", () -> new GoldHammerItem());
	public static final RegistryObject<Item> DIAMOND_HAMMER = REGISTRY.register("diamond_hammer", () -> new DiamondHammerItem());
	public static final RegistryObject<Item> NETHERITE_HAMMER = REGISTRY.register("netherite_hammer", () -> new NetheriteHammerItem());
	public static final RegistryObject<Item> WOOD_EXCAVATOR = REGISTRY.register("wood_excavator", () -> new WoodExcavatorItem());
	public static final RegistryObject<Item> STONE_EXCAVATOR = REGISTRY.register("stone_excavator", () -> new StoneExcavatorItem());
	public static final RegistryObject<Item> IRON_EXCAVATOR = REGISTRY.register("iron_excavator", () -> new IronExcavatorItem());
	public static final RegistryObject<Item> GOLD_EXCAVATOR = REGISTRY.register("gold_excavator", () -> new GoldExcavatorItem());
	public static final RegistryObject<Item> DIAMOND_EXCAVATOR = REGISTRY.register("diamond_excavator", () -> new DiamondExcavatorItem());
	public static final RegistryObject<Item> NETHERITE_EXCAVATOR = REGISTRY.register("netherite_excavator", () -> new NetheriteExcavatorItem());
	public static final RegistryObject<Item> UKRAINE_HAMMER = REGISTRY.register("ukraine_hammer", () -> new UkraineHammerItem());
}
