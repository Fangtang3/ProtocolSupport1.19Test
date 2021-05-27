package protocolsupport.protocol.typeremapper.entity.format.metadata.types.living.fish;

import protocolsupport.protocol.typeremapper.entity.format.metadata.object.value.NetworkEntityMetadataObjectIndexValueNoOpTransformer;
import protocolsupport.protocol.types.networkentity.metadata.NetworkEntityMetadataObjectIndex;
import protocolsupport.protocol.utils.ProtocolVersionsHelper;

public class TropicalFishNetworkEntityMetadataFormatTransformerFactory extends FishNetworkEntityMetadataFormatTransformerFactory {

	public static final TropicalFishNetworkEntityMetadataFormatTransformerFactory INSTANCE = new TropicalFishNetworkEntityMetadataFormatTransformerFactory();

	protected TropicalFishNetworkEntityMetadataFormatTransformerFactory() {
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.TropicalFish.VARIANT, 16), ProtocolVersionsHelper.UP_1_15);
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.TropicalFish.VARIANT, 15), ProtocolVersionsHelper.ALL_1_14);
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.TropicalFish.VARIANT, 13), ProtocolVersionsHelper.ALL_1_13);
	}

}