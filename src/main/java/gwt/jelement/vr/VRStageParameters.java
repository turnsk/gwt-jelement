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
package gwt.jelement.vr;

import gwt.jelement.core.Float32Array;
import gwt.jelement.core.IsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="VRStageParameters", isNative = true)
public class VRStageParameters extends IsObject{
    @JsProperty(name="sittingToStandingTransform")
    public native Float32Array getSittingToStandingTransform();
    
    @JsProperty(name="sizeX")
    public native double getSizeX();
    
    @JsProperty(name="sizeZ")
    public native double getSizeZ();
    
}
