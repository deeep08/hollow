package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.HollowList;
import com.netflix.hollow.HollowListSchema;
import com.netflix.hollow.objects.delegate.HollowListDelegate;
import com.netflix.hollow.objects.generic.GenericHollowRecordHelper;

public class CharacterArtworkArrayOfDerivativesHollow extends HollowList<CharacterArtworkDerivativesHollow> {

    public CharacterArtworkArrayOfDerivativesHollow(HollowListDelegate delegate, int ordinal) {
        super(delegate, ordinal);
    }

    @Override
    @SuppressWarnings("unchecked")
    public CharacterArtworkDerivativesHollow instantiateElement(int ordinal) {
        return (CharacterArtworkDerivativesHollow) api().getCharacterArtworkDerivativesHollow(ordinal);
    }

    @Override
    public boolean equalsElement(int elementOrdinal, Object testObject) {
        return GenericHollowRecordHelper.equalObject(getSchema().getElementType(), elementOrdinal, testObject);
    }

    public VMSHollowVideoInputAPI api() {
        return typeApi().getAPI();
    }

    public CharacterArtworkArrayOfDerivativesTypeAPI typeApi() {
        return (CharacterArtworkArrayOfDerivativesTypeAPI) delegate.getTypeAPI();
    }

}