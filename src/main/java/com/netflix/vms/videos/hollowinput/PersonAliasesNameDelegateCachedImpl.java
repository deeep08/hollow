package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.delegate.HollowObjectAbstractDelegate;
import com.netflix.hollow.read.dataaccess.HollowObjectTypeDataAccess;
import com.netflix.hollow.HollowObjectSchema;
import com.netflix.hollow.read.customapi.HollowTypeAPI;
import com.netflix.hollow.objects.delegate.HollowCachedDelegate;

public class PersonAliasesNameDelegateCachedImpl extends HollowObjectAbstractDelegate implements HollowCachedDelegate, PersonAliasesNameDelegate {

    private final int translatedTextsOrdinal;
   private PersonAliasesNameTypeAPI typeAPI;

    public PersonAliasesNameDelegateCachedImpl(PersonAliasesNameTypeAPI typeAPI, int ordinal) {
        this.translatedTextsOrdinal = typeAPI.getTranslatedTextsOrdinal(ordinal);
        this.typeAPI = typeAPI;
    }

    public int getTranslatedTextsOrdinal(int ordinal) {
        return translatedTextsOrdinal;
    }

    @Override
    public HollowObjectSchema getSchema() {
        return typeAPI.getTypeDataAccess().getSchema();
    }

    @Override
    public HollowObjectTypeDataAccess getTypeDataAccess() {
        return typeAPI.getTypeDataAccess();
    }

    public PersonAliasesNameTypeAPI getTypeAPI() {
        return typeAPI;
    }

    public void updateTypeAPI(HollowTypeAPI typeAPI) {
        this.typeAPI = (PersonAliasesNameTypeAPI) typeAPI;
    }

}