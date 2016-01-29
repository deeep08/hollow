package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.HollowObject;
import com.netflix.hollow.HollowObjectSchema;

public class MoviesTransliteratedTranslatedTextsHollow extends HollowObject {

    public MoviesTransliteratedTranslatedTextsHollow(MoviesTransliteratedTranslatedTextsDelegate delegate, int ordinal) {
        super(delegate, ordinal);
    }

    public StringHollow _getValue() {
        int refOrdinal = delegate().getValueOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getStringHollow(refOrdinal);
    }

    public VMSHollowVideoInputAPI api() {
        return typeApi().getAPI();
    }

    public MoviesTransliteratedTranslatedTextsTypeAPI typeApi() {
        return delegate().getTypeAPI();
    }

    protected MoviesTransliteratedTranslatedTextsDelegate delegate() {
        return (MoviesTransliteratedTranslatedTextsDelegate)delegate;
    }

}