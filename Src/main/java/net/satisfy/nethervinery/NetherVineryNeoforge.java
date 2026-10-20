package net.satisfy.nethervinery;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.satisfy.nethervinery.core.event.CommonEvents;
import net.satisfy.nethervinery.core.registry.*;
import net.satisfy.nethervinery.core.util.NetherVineryPre;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(NetherVineryNeoforge.MODID)
public class NetherVineryNeoforge {
    public static final String MODID = "nethervinery";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public NetherVineryNeoforge(IEventBus modEventBus) {

        NetherEffects.MOB_EFFECTS.register(modEventBus);

        NetherVineryPre.preInit();
        init();
    }

    public static void init() {
        NetherObjectRegistry.init();
        NetherEntityTypeRegistry.init();
        NetherTabRegistry.init();
        NetherGrapeTypes.addGrapeAttributes();
        NetherEffects.init();
        CommonEvents.init();
    }
}

