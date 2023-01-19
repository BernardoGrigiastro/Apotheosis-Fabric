package safro.zenith.village.wanderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.trading.MerchantOffer;
import org.jetbrains.annotations.Nullable;
import safro.zenith.api.BasicItemListing;
import safro.zenith.api.json.SerializerBuilder;

public class BasicJsonTrade extends BasicItemListing implements JsonTrade {

	protected ResourceLocation id;
	protected SerializerBuilder<JsonTrade>.Serializer serializer;

	protected final boolean rare;

	public BasicJsonTrade(ItemStack price, ItemStack price2, ItemStack forSale, int maxTrades, int xp, float priceMult, boolean rare) {
		super(price, price2, forSale, maxTrades, xp, priceMult);
		this.rare = rare;
	}

	@Override
	public void setId(ResourceLocation id) {
		if (this.id != null) throw new UnsupportedOperationException();
		this.id = id;
	}

	@Override
	public void setSerializer(SerializerBuilder<JsonTrade>.Serializer serializer) {
		if (this.serializer != null) throw new UnsupportedOperationException();
		this.serializer = serializer;
	}

	@Override
	public ResourceLocation getId() {
		return id;
	}

	@Override
	public SerializerBuilder<JsonTrade>.Serializer getSerializer() {
		return serializer;
	}

	@Override
	public boolean isRare() {
		return this.rare;
	}
}
