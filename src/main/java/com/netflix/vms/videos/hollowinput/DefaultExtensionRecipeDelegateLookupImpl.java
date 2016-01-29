package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.delegate.HollowObjectAbstractDelegate;
import com.netflix.hollow.read.dataaccess.HollowObjectTypeDataAccess;
import com.netflix.hollow.HollowObjectSchema;

public class DefaultExtensionRecipeDelegateLookupImpl extends HollowObjectAbstractDelegate implements DefaultExtensionRecipeDelegate {

    private final DefaultExtensionRecipeTypeAPI typeAPI;

    public DefaultExtensionRecipeDelegateLookupImpl(DefaultExtensionRecipeTypeAPI typeAPI) {
        this.typeAPI = typeAPI;
    }

    public int getRecipeNameOrdinal(int ordinal) {
        return typeAPI.getRecipeNameOrdinal(ordinal);
    }

    public int getExtensionOrdinal(int ordinal) {
        return typeAPI.getExtensionOrdinal(ordinal);
    }

    public DefaultExtensionRecipeTypeAPI getTypeAPI() {
        return typeAPI;
    }

    @Override
    public HollowObjectSchema getSchema() {
        return typeAPI.getTypeDataAccess().getSchema();
    }

    @Override
    public HollowObjectTypeDataAccess getTypeDataAccess() {
        return typeAPI.getTypeDataAccess();
    }

}