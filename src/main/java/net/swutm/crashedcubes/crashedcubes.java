package net.swutm.crashedcubes;

import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.swutm.crashedcubes.init.CrashedCubesModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(crashedcubes.MOD_ID)
public class crashedcubes
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "crashedcubes";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public crashedcubes()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        CrashedCubesModItems.REGISTRY.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }
    }

