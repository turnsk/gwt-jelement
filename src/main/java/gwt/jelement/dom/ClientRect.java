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
package gwt.jelement.dom;

import gwt.jelement.core.IsObject;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="ClientRect", isNative = true)
public class ClientRect implements IsObject {
    @JsProperty(name="top")
    public native double getTop();
    
    @JsProperty(name="right")
    public native double getRight();
    
    @JsProperty(name="bottom")
    public native double getBottom();
    
    @JsProperty(name="left")
    public native double getLeft();
    
    @JsProperty(name="width")
    public native double getWidth();
    
    @JsProperty(name="height")
    public native double getHeight();
    
}
