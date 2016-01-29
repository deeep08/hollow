package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.read.customapi.HollowObjectTypeAPI;
import com.netflix.hollow.read.dataaccess.HollowObjectTypeDataAccess;

public class VideoRightsRightsContractsDisallowedAssetBundlesDisallowedSubtitleLangCodesTypeAPI extends HollowObjectTypeAPI {

    private final VideoRightsRightsContractsDisallowedAssetBundlesDisallowedSubtitleLangCodesDelegateLookupImpl delegateLookupImpl;

    VideoRightsRightsContractsDisallowedAssetBundlesDisallowedSubtitleLangCodesTypeAPI(VMSHollowVideoInputAPI api, HollowObjectTypeDataAccess typeDataAccess) {
        super(api, typeDataAccess, new String[] {
            "value"
        });
        this.delegateLookupImpl = new VideoRightsRightsContractsDisallowedAssetBundlesDisallowedSubtitleLangCodesDelegateLookupImpl(this);
    }

    public int getValueOrdinal(int ordinal) {
        if(fieldIndex[0] == -1)
            return missingDataHandler().handleReferencedOrdinal("VideoRightsRightsContractsDisallowedAssetBundlesDisallowedSubtitleLangCodes", ordinal, "value");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[0]);
    }

    public StringTypeAPI getValueTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public VideoRightsRightsContractsDisallowedAssetBundlesDisallowedSubtitleLangCodesDelegateLookupImpl getDelegateLookupImpl() {
        return delegateLookupImpl;
    }

    @Override
    public VMSHollowVideoInputAPI getAPI() {
        return (VMSHollowVideoInputAPI) api;
    }

}