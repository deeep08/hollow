package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.delegate.HollowObjectAbstractDelegate;
import com.netflix.hollow.read.dataaccess.HollowObjectTypeDataAccess;
import com.netflix.hollow.HollowObjectSchema;
import com.netflix.hollow.read.customapi.HollowTypeAPI;
import com.netflix.hollow.objects.delegate.HollowCachedDelegate;

public class FestivalsDelegateCachedImpl extends HollowObjectAbstractDelegate implements HollowCachedDelegate, FestivalsDelegate {

    private final int copyrightOrdinal;
    private final Long festivalId;
    private final int festivalNameOrdinal;
    private final int descriptionOrdinal;
    private final int shortNameOrdinal;
    private final int singularNameOrdinal;
   private FestivalsTypeAPI typeAPI;

    public FestivalsDelegateCachedImpl(FestivalsTypeAPI typeAPI, int ordinal) {
        this.copyrightOrdinal = typeAPI.getCopyrightOrdinal(ordinal);
        this.festivalId = typeAPI.getFestivalIdBoxed(ordinal);
        this.festivalNameOrdinal = typeAPI.getFestivalNameOrdinal(ordinal);
        this.descriptionOrdinal = typeAPI.getDescriptionOrdinal(ordinal);
        this.shortNameOrdinal = typeAPI.getShortNameOrdinal(ordinal);
        this.singularNameOrdinal = typeAPI.getSingularNameOrdinal(ordinal);
        this.typeAPI = typeAPI;
    }

    public int getCopyrightOrdinal(int ordinal) {
        return copyrightOrdinal;
    }

    public long getFestivalId(int ordinal) {
        return festivalId.longValue();
    }

    public Long getFestivalIdBoxed(int ordinal) {
        return festivalId;
    }

    public int getFestivalNameOrdinal(int ordinal) {
        return festivalNameOrdinal;
    }

    public int getDescriptionOrdinal(int ordinal) {
        return descriptionOrdinal;
    }

    public int getShortNameOrdinal(int ordinal) {
        return shortNameOrdinal;
    }

    public int getSingularNameOrdinal(int ordinal) {
        return singularNameOrdinal;
    }

    @Override
    public HollowObjectSchema getSchema() {
        return typeAPI.getTypeDataAccess().getSchema();
    }

    @Override
    public HollowObjectTypeDataAccess getTypeDataAccess() {
        return typeAPI.getTypeDataAccess();
    }

    public FestivalsTypeAPI getTypeAPI() {
        return typeAPI;
    }

    public void updateTypeAPI(HollowTypeAPI typeAPI) {
        this.typeAPI = (FestivalsTypeAPI) typeAPI;
    }

}