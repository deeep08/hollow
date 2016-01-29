package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.delegate.HollowObjectAbstractDelegate;
import com.netflix.hollow.read.dataaccess.HollowObjectTypeDataAccess;
import com.netflix.hollow.HollowObjectSchema;
import com.netflix.hollow.read.customapi.HollowTypeAPI;
import com.netflix.hollow.objects.delegate.HollowCachedDelegate;

public class VideoTypeDelegateCachedImpl extends HollowObjectAbstractDelegate implements HollowCachedDelegate, VideoTypeDelegate {

    private final Long videoId;
    private final int typeOrdinal;
    private final Boolean isTV;
   private VideoTypeTypeAPI typeAPI;

    public VideoTypeDelegateCachedImpl(VideoTypeTypeAPI typeAPI, int ordinal) {
        this.videoId = typeAPI.getVideoIdBoxed(ordinal);
        this.typeOrdinal = typeAPI.getTypeOrdinal(ordinal);
        this.isTV = typeAPI.getIsTVBoxed(ordinal);
        this.typeAPI = typeAPI;
    }

    public long getVideoId(int ordinal) {
        return videoId.longValue();
    }

    public Long getVideoIdBoxed(int ordinal) {
        return videoId;
    }

    public int getTypeOrdinal(int ordinal) {
        return typeOrdinal;
    }

    public boolean getIsTV(int ordinal) {
        return isTV.booleanValue();
    }

    public Boolean getIsTVBoxed(int ordinal) {
        return isTV;
    }

    @Override
    public HollowObjectSchema getSchema() {
        return typeAPI.getTypeDataAccess().getSchema();
    }

    @Override
    public HollowObjectTypeDataAccess getTypeDataAccess() {
        return typeAPI.getTypeDataAccess();
    }

    public VideoTypeTypeAPI getTypeAPI() {
        return typeAPI;
    }

    public void updateTypeAPI(HollowTypeAPI typeAPI) {
        this.typeAPI = (VideoTypeTypeAPI) typeAPI;
    }

}