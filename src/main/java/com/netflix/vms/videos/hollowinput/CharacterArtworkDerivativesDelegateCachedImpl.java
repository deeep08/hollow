package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.delegate.HollowObjectAbstractDelegate;
import com.netflix.hollow.read.dataaccess.HollowObjectTypeDataAccess;
import com.netflix.hollow.HollowObjectSchema;
import com.netflix.hollow.read.customapi.HollowTypeAPI;
import com.netflix.hollow.objects.delegate.HollowCachedDelegate;

public class CharacterArtworkDerivativesDelegateCachedImpl extends HollowObjectAbstractDelegate implements HollowCachedDelegate, CharacterArtworkDerivativesDelegate {

    private final int recipeNameOrdinal;
    private final int fileNameOrdinal;
    private final Long imageId;
    private final int cdnOriginServerIdOrdinal;
    private final Long width;
    private final int cdnDirectoryOrdinal;
    private final int imageTypeOrdinal;
    private final int cdnOriginServerOrdinal;
    private final Long height;
   private CharacterArtworkDerivativesTypeAPI typeAPI;

    public CharacterArtworkDerivativesDelegateCachedImpl(CharacterArtworkDerivativesTypeAPI typeAPI, int ordinal) {
        this.recipeNameOrdinal = typeAPI.getRecipeNameOrdinal(ordinal);
        this.fileNameOrdinal = typeAPI.getFileNameOrdinal(ordinal);
        this.imageId = typeAPI.getImageIdBoxed(ordinal);
        this.cdnOriginServerIdOrdinal = typeAPI.getCdnOriginServerIdOrdinal(ordinal);
        this.width = typeAPI.getWidthBoxed(ordinal);
        this.cdnDirectoryOrdinal = typeAPI.getCdnDirectoryOrdinal(ordinal);
        this.imageTypeOrdinal = typeAPI.getImageTypeOrdinal(ordinal);
        this.cdnOriginServerOrdinal = typeAPI.getCdnOriginServerOrdinal(ordinal);
        this.height = typeAPI.getHeightBoxed(ordinal);
        this.typeAPI = typeAPI;
    }

    public int getRecipeNameOrdinal(int ordinal) {
        return recipeNameOrdinal;
    }

    public int getFileNameOrdinal(int ordinal) {
        return fileNameOrdinal;
    }

    public long getImageId(int ordinal) {
        return imageId.longValue();
    }

    public Long getImageIdBoxed(int ordinal) {
        return imageId;
    }

    public int getCdnOriginServerIdOrdinal(int ordinal) {
        return cdnOriginServerIdOrdinal;
    }

    public long getWidth(int ordinal) {
        return width.longValue();
    }

    public Long getWidthBoxed(int ordinal) {
        return width;
    }

    public int getCdnDirectoryOrdinal(int ordinal) {
        return cdnDirectoryOrdinal;
    }

    public int getImageTypeOrdinal(int ordinal) {
        return imageTypeOrdinal;
    }

    public int getCdnOriginServerOrdinal(int ordinal) {
        return cdnOriginServerOrdinal;
    }

    public long getHeight(int ordinal) {
        return height.longValue();
    }

    public Long getHeightBoxed(int ordinal) {
        return height;
    }

    @Override
    public HollowObjectSchema getSchema() {
        return typeAPI.getTypeDataAccess().getSchema();
    }

    @Override
    public HollowObjectTypeDataAccess getTypeDataAccess() {
        return typeAPI.getTypeDataAccess();
    }

    public CharacterArtworkDerivativesTypeAPI getTypeAPI() {
        return typeAPI;
    }

    public void updateTypeAPI(HollowTypeAPI typeAPI) {
        this.typeAPI = (CharacterArtworkDerivativesTypeAPI) typeAPI;
    }

}