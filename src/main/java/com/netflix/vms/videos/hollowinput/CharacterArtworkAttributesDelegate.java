package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.delegate.HollowObjectDelegate;

public interface CharacterArtworkAttributesDelegate extends HollowObjectDelegate {

    public int getFile_seqOrdinal(int ordinal);

    public CharacterArtworkAttributesTypeAPI getTypeAPI();

}