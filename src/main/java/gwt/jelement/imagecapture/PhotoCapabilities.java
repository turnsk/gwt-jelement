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
package gwt.jelement.imagecapture;

import gwt.jelement.core.IsObject;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="PhotoCapabilities", isNative = true)
public class PhotoCapabilities implements IsObject {
    @JsProperty(name="redEyeReduction")
    private String redEyeReduction;
    
    @JsProperty(name="fillLightMode")
    private String[] fillLightMode;
    
    @JsProperty(name="imageHeight")
    public native MediaSettingsRange getImageHeight();
    
    @JsProperty(name="imageWidth")
    public native MediaSettingsRange getImageWidth();
    
    @JsOverlay
    public final RedEyeReduction getRedEyeReduction(){
       return RedEyeReduction.of(redEyeReduction);
    }
    
    @JsOverlay
    public final FillLightMode[] getFillLightMode(){
       return FillLightMode.ofArray(fillLightMode);
    }
    
}
