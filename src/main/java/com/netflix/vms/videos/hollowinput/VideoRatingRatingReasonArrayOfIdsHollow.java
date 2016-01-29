package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.HollowList;
import com.netflix.hollow.HollowListSchema;
import com.netflix.hollow.objects.delegate.HollowListDelegate;
import com.netflix.hollow.objects.generic.GenericHollowRecordHelper;

public class VideoRatingRatingReasonArrayOfIdsHollow extends HollowList<VideoRatingRatingReasonIdsHollow> {

    public VideoRatingRatingReasonArrayOfIdsHollow(HollowListDelegate delegate, int ordinal) {
        super(delegate, ordinal);
    }

    @Override
    @SuppressWarnings("unchecked")
    public VideoRatingRatingReasonIdsHollow instantiateElement(int ordinal) {
        return (VideoRatingRatingReasonIdsHollow) api().getVideoRatingRatingReasonIdsHollow(ordinal);
    }

    @Override
    public boolean equalsElement(int elementOrdinal, Object testObject) {
        return GenericHollowRecordHelper.equalObject(getSchema().getElementType(), elementOrdinal, testObject);
    }

    public VMSHollowVideoInputAPI api() {
        return typeApi().getAPI();
    }

    public VideoRatingRatingReasonArrayOfIdsTypeAPI typeApi() {
        return (VideoRatingRatingReasonArrayOfIdsTypeAPI) delegate.getTypeAPI();
    }

}