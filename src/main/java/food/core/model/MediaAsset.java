package food.core.model;

import lombok.Data;

@Data
public class MediaAsset {

    private MediaAssetEnum assetType;
    private String url;
}
