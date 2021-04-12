package protocolsupport.protocol.storage.netcache;

import org.bukkit.NamespacedKey;

public interface IBiomeRegistry {

	public NamespacedKey getBiomeKey(int id);

	public int getBiomeId(NamespacedKey biome);

	public NamespacedKey getAnyBiomeKey();

	public int getAnyBiomeId();

}
