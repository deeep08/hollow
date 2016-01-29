package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.HollowList;
import com.netflix.hollow.HollowListSchema;
import com.netflix.hollow.objects.delegate.HollowListDelegate;
import com.netflix.hollow.objects.generic.GenericHollowRecordHelper;

public class VideoGeneralArrayOfEpisodeTypesHollow extends HollowList<VideoGeneralEpisodeTypesHollow> {

    public VideoGeneralArrayOfEpisodeTypesHollow(HollowListDelegate delegate, int ordinal) {
        super(delegate, ordinal);
    }

    @Override
    @SuppressWarnings("unchecked")
    public VideoGeneralEpisodeTypesHollow instantiateElement(int ordinal) {
        return (VideoGeneralEpisodeTypesHollow) api().getVideoGeneralEpisodeTypesHollow(ordinal);
    }

    @Override
    public boolean equalsElement(int elementOrdinal, Object testObject) {
        return GenericHollowRecordHelper.equalObject(getSchema().getElementType(), elementOrdinal, testObject);
    }

    public VMSHollowVideoInputAPI api() {
        return typeApi().getAPI();
    }

    public VideoGeneralArrayOfEpisodeTypesTypeAPI typeApi() {
        return (VideoGeneralArrayOfEpisodeTypesTypeAPI) delegate.getTypeAPI();
    }

}