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
package gwt.jelement.css;

import gwt.jelement.core.IsObject;
import gwt.jelement.dom.Node;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="StyleSheet", isNative = true)
public class StyleSheet implements IsObject {
    @JsProperty(name="type")
    public native String getType();
    
    @JsProperty(name="href")
    public native String getHref();
    
    @JsProperty(name="ownerNode")
    public native Node getOwnerNode();
    
    @JsProperty(name="parentStyleSheet")
    public native StyleSheet getParentStyleSheet();
    
    @JsProperty(name="title")
    public native String getTitle();
    
    @JsProperty(name="media")
    public native MediaList getMedia();
    
    @JsProperty(name="disabled")
    public native boolean isDisabled();
    
    @JsProperty(name="disabled")
    public native void setDisabled(boolean disabled);
    
}
