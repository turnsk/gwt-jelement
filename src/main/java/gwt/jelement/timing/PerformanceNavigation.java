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
package gwt.jelement.timing;

import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="PerformanceNavigation", isNative = true)
public class PerformanceNavigation extends JsObject{
    public static short TYPE_NAVIGATE; /* 0 */
    public static short TYPE_RELOAD; /* 1 */
    public static short TYPE_BACK_FORWARD; /* 2 */
    public static short TYPE_RESERVED; /* 255 */
    
    @JsConstructor
    public PerformanceNavigation(){
        super();
    }
    
    @JsProperty(name="type")
    public native short getType();
    
    @JsProperty(name="redirectCount")
    public native short getRedirectCount();
    
}
