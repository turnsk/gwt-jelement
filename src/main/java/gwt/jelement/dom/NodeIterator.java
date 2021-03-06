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

@JsType(namespace = JsPackage.GLOBAL, name="NodeIterator", isNative = true)
public class NodeIterator implements IsObject {
    @JsProperty(name="root")
    public native Node getRoot();
    
    @JsProperty(name="referenceNode")
    public native Node getReferenceNode();
    
    @JsProperty(name="pointerBeforeReferenceNode")
    public native boolean isPointerBeforeReferenceNode();
    
    @JsProperty(name="whatToShow")
    public native double getWhatToShow();
    
    @JsProperty(name="filter")
    public native NodeFilter getFilter();
    
    @JsMethod(name = "detach")
    public native void detach();
    
    @JsMethod(name = "nextNode")
    public native Node nextNode();
    
    @JsMethod(name = "previousNode")
    public native Node previousNode();
    
}
