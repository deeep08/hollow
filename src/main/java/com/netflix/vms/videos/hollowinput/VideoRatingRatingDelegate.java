package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.delegate.HollowObjectDelegate;

public interface VideoRatingRatingDelegate extends HollowObjectDelegate {

    public int getReasonOrdinal(int ordinal);

    public long getRatingId(int ordinal);

    public Long getRatingIdBoxed(int ordinal);

    public long getCertificationSystemId(int ordinal);

    public Long getCertificationSystemIdBoxed(int ordinal);

    public VideoRatingRatingTypeAPI getTypeAPI();

}