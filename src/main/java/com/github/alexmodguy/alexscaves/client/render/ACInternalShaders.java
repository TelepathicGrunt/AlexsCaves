package com.github.alexmodguy.alexscaves.client.render;

import net.minecraft.client.renderer.ShaderInstance;

import javax.annotation.Nullable;

public class ACInternalShaders {

    private static ShaderInstance renderTypeFerrouslimeGelShader;
    private static ShaderInstance renderTypeIrradiatedShader;
    private static ShaderInstance renderTypeBubbledShader;

    @Nullable
    public static ShaderInstance getRenderTypeFerrouslimeGelShader() {
        return renderTypeFerrouslimeGelShader;
    }

    public static void setRenderTypeFerrouslimeGelShader(ShaderInstance instance){
        renderTypeFerrouslimeGelShader = instance;
    }

    @Nullable
    public static ShaderInstance getRenderTypeIrradiatedShader() {
        return renderTypeIrradiatedShader;
    }

    public static void setRenderTypeIrradiatedShader(ShaderInstance instance){
        renderTypeIrradiatedShader = instance;
    }

    @Nullable
    public static ShaderInstance getRenderTypeBubbledShader() {
        return renderTypeBubbledShader;
    }

    public static void setRenderTypeBubbledShader(ShaderInstance instance){
        renderTypeBubbledShader = instance;
    }

}