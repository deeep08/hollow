package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.HollowList;
import com.netflix.hollow.HollowListSchema;
import com.netflix.hollow.objects.delegate.HollowListDelegate;
import com.netflix.hollow.objects.generic.GenericHollowRecordHelper;

public class CharacterArtworkArrayOfLocalesHollow extends HollowList<CharacterArtworkLocalesHollow> {

    public CharacterArtworkArrayOfLocalesHollow(HollowListDelegate delegate, int ordinal) {
        super(delegate, ordinal);
    }

    @Override
    @SuppressWarnings("unchecked")
    public CharacterArtworkLocalesHollow instantiateElement(int ordinal) {
        return (CharacterArtworkLocalesHollow) api().getCharacterArtworkLocalesHollow(ordinal);
    }

    @Override
    public boolean equalsElement(int elementOrdinal, Object testObject) {
        return GenericHollowRecordHelper.equalObject(getSchema().getElementType(), elementOrdinal, testObject);
    }

    public VMSHollowVideoInputAPI api() {
        return typeApi().getAPI();
    }

    public CharacterArtworkArrayOfLocalesTypeAPI typeApi() {
        return (CharacterArtworkArrayOfLocalesTypeAPI) delegate.getTypeAPI();
    }

}