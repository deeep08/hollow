package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.delegate.HollowObjectDelegate;

public interface MovieRatingsRatingReasonTranslatedTextsDelegate extends HollowObjectDelegate {

    public int getValueOrdinal(int ordinal);

    public MovieRatingsRatingReasonTranslatedTextsTypeAPI getTypeAPI();

}