package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.delegate.HollowObjectAbstractDelegate;
import com.netflix.hollow.read.dataaccess.HollowObjectTypeDataAccess;
import com.netflix.hollow.HollowObjectSchema;
import com.netflix.hollow.read.customapi.HollowTypeAPI;
import com.netflix.hollow.objects.delegate.HollowCachedDelegate;

public class RolloutPhasesDelegateCachedImpl extends HollowObjectAbstractDelegate implements HollowCachedDelegate, RolloutPhasesDelegate {

    private final Long seasonMovieId;
    private final int elementsOrdinal;
    private final int nameOrdinal;
    private final Boolean showCoreMetadata;
    private final int windowsOrdinal;
    private final int phaseTypeOrdinal;
   private RolloutPhasesTypeAPI typeAPI;

    public RolloutPhasesDelegateCachedImpl(RolloutPhasesTypeAPI typeAPI, int ordinal) {
        this.seasonMovieId = typeAPI.getSeasonMovieIdBoxed(ordinal);
        this.elementsOrdinal = typeAPI.getElementsOrdinal(ordinal);
        this.nameOrdinal = typeAPI.getNameOrdinal(ordinal);
        this.showCoreMetadata = typeAPI.getShowCoreMetadataBoxed(ordinal);
        this.windowsOrdinal = typeAPI.getWindowsOrdinal(ordinal);
        this.phaseTypeOrdinal = typeAPI.getPhaseTypeOrdinal(ordinal);
        this.typeAPI = typeAPI;
    }

    public long getSeasonMovieId(int ordinal) {
        return seasonMovieId.longValue();
    }

    public Long getSeasonMovieIdBoxed(int ordinal) {
        return seasonMovieId;
    }

    public int getElementsOrdinal(int ordinal) {
        return elementsOrdinal;
    }

    public int getNameOrdinal(int ordinal) {
        return nameOrdinal;
    }

    public boolean getShowCoreMetadata(int ordinal) {
        return showCoreMetadata.booleanValue();
    }

    public Boolean getShowCoreMetadataBoxed(int ordinal) {
        return showCoreMetadata;
    }

    public int getWindowsOrdinal(int ordinal) {
        return windowsOrdinal;
    }

    public int getPhaseTypeOrdinal(int ordinal) {
        return phaseTypeOrdinal;
    }

    @Override
    public HollowObjectSchema getSchema() {
        return typeAPI.getTypeDataAccess().getSchema();
    }

    @Override
    public HollowObjectTypeDataAccess getTypeDataAccess() {
        return typeAPI.getTypeDataAccess();
    }

    public RolloutPhasesTypeAPI getTypeAPI() {
        return typeAPI;
    }

    public void updateTypeAPI(HollowTypeAPI typeAPI) {
        this.typeAPI = (RolloutPhasesTypeAPI) typeAPI;
    }

}