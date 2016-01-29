package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.HollowList;
import com.netflix.hollow.HollowListSchema;
import com.netflix.hollow.objects.delegate.HollowListDelegate;
import com.netflix.hollow.objects.generic.GenericHollowRecordHelper;

public class VideoPersonArrayOfAliasHollow extends HollowList<VideoPersonAliasHollow> {

    public VideoPersonArrayOfAliasHollow(HollowListDelegate delegate, int ordinal) {
        super(delegate, ordinal);
    }

    @Override
    @SuppressWarnings("unchecked")
    public VideoPersonAliasHollow instantiateElement(int ordinal) {
        return (VideoPersonAliasHollow) api().getVideoPersonAliasHollow(ordinal);
    }

    @Override
    public boolean equalsElement(int elementOrdinal, Object testObject) {
        return GenericHollowRecordHelper.equalObject(getSchema().getElementType(), elementOrdinal, testObject);
    }

    public VMSHollowVideoInputAPI api() {
        return typeApi().getAPI();
    }

    public VideoPersonArrayOfAliasTypeAPI typeApi() {
        return (VideoPersonArrayOfAliasTypeAPI) delegate.getTypeAPI();
    }

}