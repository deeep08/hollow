package com.netflix.vms.hollowoutput.pojos;

import java.util.Arrays;

public class DefaultExtensionRecipe {

    public char[] extensionStr;
    public char[] recipeNameStr;

    public boolean equals(Object other) {
        if(other == this)  return true;
        if(!(other instanceof DefaultExtensionRecipe))
            return false;

        DefaultExtensionRecipe o = (DefaultExtensionRecipe) other;
        if(!Arrays.equals(o.extensionStr, extensionStr)) return false;
        if(!Arrays.equals(o.recipeNameStr, recipeNameStr)) return false;
        return true;
    }

    @SuppressWarnings("unused")
    private int __assigned_ordinal = -1;
}