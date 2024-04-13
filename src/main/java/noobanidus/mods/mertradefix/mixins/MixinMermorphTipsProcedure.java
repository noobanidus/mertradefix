package noobanidus.mods.mertradefix.mixins;

import net.mcreator.seadwellers.procedures.MermorphTipsProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(MermorphTipsProcedure.class)
public class MixinMermorphTipsProcedure {
  @Redirect(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;)V", at=@At(value = "INVOKE", target = "Lnet/minecraft/network/chat/Component;literal(Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;", ordinal=0))
  private static MutableComponent MerTradeFixFirstString(String p_237114_) {
    return Component.translatable("info.mermorph_trade_aquamarine");
  }

  @Redirect(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;)V", at=@At(value = "INVOKE", target = "Lnet/minecraft/network/chat/Component;literal(Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;", ordinal=1))
  private static MutableComponent MerTradeFixSecondString(String p_237114_) {
    return Component.translatable("info.mermorph_trade_fish");
  }

  @Redirect(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;)V", at=@At(value = "INVOKE", target = "Lnet/minecraft/network/chat/Component;literal(Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;", ordinal=2))
  private static MutableComponent MerTradeFixThirdString(String p_237114_) {
    return Component.translatable("info.mermorph_trade_nautilus");
  }
}
