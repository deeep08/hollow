package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.read.customapi.HollowObjectTypeAPI;
import com.netflix.hollow.read.dataaccess.HollowObjectTypeDataAccess;

public class ArtworkRecipeTypeAPI extends HollowObjectTypeAPI {

    private final ArtworkRecipeDelegateLookupImpl delegateLookupImpl;

    ArtworkRecipeTypeAPI(VMSHollowVideoInputAPI api, HollowObjectTypeDataAccess typeDataAccess) {
        super(api, typeDataAccess, new String[] {
            "recipeName",
            "cdnFolder",
            "extension"
        });
        this.delegateLookupImpl = new ArtworkRecipeDelegateLookupImpl(this);
    }

    public int getRecipeNameOrdinal(int ordinal) {
        if(fieldIndex[0] == -1)
            return missingDataHandler().handleReferencedOrdinal("ArtworkRecipe", ordinal, "recipeName");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[0]);
    }

    public StringTypeAPI getRecipeNameTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public int getCdnFolderOrdinal(int ordinal) {
        if(fieldIndex[1] == -1)
            return missingDataHandler().handleReferencedOrdinal("ArtworkRecipe", ordinal, "cdnFolder");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[1]);
    }

    public StringTypeAPI getCdnFolderTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public int getExtensionOrdinal(int ordinal) {
        if(fieldIndex[2] == -1)
            return missingDataHandler().handleReferencedOrdinal("ArtworkRecipe", ordinal, "extension");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[2]);
    }

    public StringTypeAPI getExtensionTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public ArtworkRecipeDelegateLookupImpl getDelegateLookupImpl() {
        return delegateLookupImpl;
    }

    @Override
    public VMSHollowVideoInputAPI getAPI() {
        return (VMSHollowVideoInputAPI) api;
    }

}