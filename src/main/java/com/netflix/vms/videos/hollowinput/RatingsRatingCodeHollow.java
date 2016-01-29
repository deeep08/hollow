package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.HollowObject;
import com.netflix.hollow.HollowObjectSchema;

public class RatingsRatingCodeHollow extends HollowObject {

    public RatingsRatingCodeHollow(RatingsRatingCodeDelegate delegate, int ordinal) {
        super(delegate, ordinal);
    }

    public RatingsRatingCodeMapOfTranslatedTextsHollow _getTranslatedTexts() {
        int refOrdinal = delegate().getTranslatedTextsOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getRatingsRatingCodeMapOfTranslatedTextsHollow(refOrdinal);
    }

    public VMSHollowVideoInputAPI api() {
        return typeApi().getAPI();
    }

    public RatingsRatingCodeTypeAPI typeApi() {
        return delegate().getTypeAPI();
    }

    protected RatingsRatingCodeDelegate delegate() {
        return (RatingsRatingCodeDelegate)delegate;
    }

}