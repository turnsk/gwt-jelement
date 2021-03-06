/*
 * Copyright 2017 Abed Tony BenBrahim <tony.benrahim@10xdev.com>
 *     and Gwt-JElement project contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package gwt.jelement.webgl;

import gwt.jelement.core.JsObject;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class WebGLContextAttributes extends JsObject{

    @JsProperty(name="alpha")
    private boolean alpha;

    @JsProperty(name="depth")
    private boolean depth;

    @JsProperty(name="stencil")
    private boolean stencil;

    @JsProperty(name="antialias")
    private boolean antialias;

    @JsProperty(name="premultipliedAlpha")
    private boolean premultipliedAlpha;

    @JsProperty(name="preserveDrawingBuffer")
    private boolean preserveDrawingBuffer;

    @JsProperty(name="failIfMajorPerformanceCaveat")
    private boolean failIfMajorPerformanceCaveat;

    public WebGLContextAttributes(){
    }

    @JsOverlay
    public final boolean isAlpha(){
        return this.alpha;
    }

    @JsOverlay
    public final void setAlpha(boolean alpha){
        this.alpha = alpha;
    }

    @JsOverlay
    public final boolean isDepth(){
        return this.depth;
    }

    @JsOverlay
    public final void setDepth(boolean depth){
        this.depth = depth;
    }

    @JsOverlay
    public final boolean isStencil(){
        return this.stencil;
    }

    @JsOverlay
    public final void setStencil(boolean stencil){
        this.stencil = stencil;
    }

    @JsOverlay
    public final boolean isAntialias(){
        return this.antialias;
    }

    @JsOverlay
    public final void setAntialias(boolean antialias){
        this.antialias = antialias;
    }

    @JsOverlay
    public final boolean isPremultipliedAlpha(){
        return this.premultipliedAlpha;
    }

    @JsOverlay
    public final void setPremultipliedAlpha(boolean premultipliedAlpha){
        this.premultipliedAlpha = premultipliedAlpha;
    }

    @JsOverlay
    public final boolean isPreserveDrawingBuffer(){
        return this.preserveDrawingBuffer;
    }

    @JsOverlay
    public final void setPreserveDrawingBuffer(boolean preserveDrawingBuffer){
        this.preserveDrawingBuffer = preserveDrawingBuffer;
    }

    @JsOverlay
    public final boolean isFailIfMajorPerformanceCaveat(){
        return this.failIfMajorPerformanceCaveat;
    }

    @JsOverlay
    public final void setFailIfMajorPerformanceCaveat(boolean failIfMajorPerformanceCaveat){
        this.failIfMajorPerformanceCaveat = failIfMajorPerformanceCaveat;
    }


}
