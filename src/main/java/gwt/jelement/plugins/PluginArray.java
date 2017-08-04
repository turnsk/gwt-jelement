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
package gwt.jelement.plugins;

import gwt.jelement.core.ArrayLike;
import gwt.jelement.core.Js;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="PluginArray", isNative = true)
public class PluginArray extends ArrayLike{
    @JsOverlay
    public final Plugin get(String name){
        return (Plugin) Js.get(this.object(), name);
    }
    
    @JsMethod(name = "item")
    public native Plugin item(double index);
    
    @JsMethod(name = "namedItem")
    public native Plugin namedItem(String name);
    
    @JsMethod(name = "refresh")
    public native void refresh();
    
    @JsMethod(name = "refresh")
    public native void refresh(boolean reload);
    
}
