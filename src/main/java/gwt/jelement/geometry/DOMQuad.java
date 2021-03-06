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
package gwt.jelement.geometry;

import gwt.jelement.core.IsObject;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="DOMQuad", isNative = true)
public class DOMQuad implements IsObject {
    @JsConstructor
    public DOMQuad(){
    }
    
    @JsConstructor
    public DOMQuad(DOMPointInit p1){
    }
    
    @JsConstructor
    public DOMQuad(DOMPointInit p1, DOMPointInit p2){
    }
    
    @JsConstructor
    public DOMQuad(DOMPointInit p1, DOMPointInit p2, DOMPointInit p3){
    }
    
    @JsConstructor
    public DOMQuad(DOMPointInit p1, DOMPointInit p2, DOMPointInit p3, DOMPointInit p4){
    }
    
    @JsProperty(name="p1")
    public native DOMPoint getP1();
    
    @JsProperty(name="p2")
    public native DOMPoint getP2();
    
    @JsProperty(name="p3")
    public native DOMPoint getP3();
    
    @JsProperty(name="p4")
    public native DOMPoint getP4();
    
    @JsMethod(name = "fromQuad")
    public static native DOMQuad fromQuad();
    
    @JsMethod(name = "fromQuad")
    public static native DOMQuad fromQuad(DOMQuadInit other);
    
    @JsMethod(name = "fromRect")
    public static native DOMQuad fromRect();
    
    @JsMethod(name = "fromRect")
    public static native DOMQuad fromRect(DOMRectInit other);
    
    @JsMethod(name = "getBounds")
    public native DOMRect getBounds();
    
}
