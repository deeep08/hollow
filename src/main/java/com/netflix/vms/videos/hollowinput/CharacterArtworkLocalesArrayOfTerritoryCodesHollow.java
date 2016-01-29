package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.HollowList;
import com.netflix.hollow.HollowListSchema;
import com.netflix.hollow.objects.delegate.HollowListDelegate;
import com.netflix.hollow.objects.generic.GenericHollowRecordHelper;

public class CharacterArtworkLocalesArrayOfTerritoryCodesHollow extends HollowList<CharacterArtworkLocalesTerritoryCodesHollow> {

    public CharacterArtworkLocalesArrayOfTerritoryCodesHollow(HollowListDelegate delegate, int ordinal) {
        super(delegate, ordinal);
    }

    @Override
    @SuppressWarnings("unchecked")
    public CharacterArtworkLocalesTerritoryCodesHollow instantiateElement(int ordinal) {
        return (CharacterArtworkLocalesTerritoryCodesHollow) api().getCharacterArtworkLocalesTerritoryCodesHollow(ordinal);
    }

    @Override
    public boolean equalsElement(int elementOrdinal, Object testObject) {
        return GenericHollowRecordHelper.equalObject(getSchema().getElementType(), elementOrdinal, testObject);
    }

    public VMSHollowVideoInputAPI api() {
        return typeApi().getAPI();
    }

    public CharacterArtworkLocalesArrayOfTerritoryCodesTypeAPI typeApi() {
        return (CharacterArtworkLocalesArrayOfTerritoryCodesTypeAPI) delegate.getTypeAPI();
    }

}