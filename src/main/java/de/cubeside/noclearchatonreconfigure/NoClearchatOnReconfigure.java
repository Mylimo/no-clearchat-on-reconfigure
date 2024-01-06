package de.cubeside.noclearchatonreconfigure;


import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;

@Mod(NoClearchatOnReconfigure.MODID)
public class NoClearchatOnReconfigure {

    public static final String MODID = "noclearchatonreconfigure";

    public NoClearchatOnReconfigure()
    {
        ModLoadingContext.get().registerExtensionPoint(IExtensionPoint.DisplayTest.class, () -> {
            return new IExtensionPoint.DisplayTest(() -> IExtensionPoint.DisplayTest.IGNORESERVERONLY, (a, b) -> true);
        });
    }
}
