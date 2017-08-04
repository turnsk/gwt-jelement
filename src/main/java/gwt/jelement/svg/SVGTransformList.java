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
package gwt.jelement.svg;

import gwt.jelement.core.ArrayLike;
import gwt.jelement.core.Js;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="SVGTransformList", isNative = true)
public class SVGTransformList extends ArrayLike{
    @JsProperty(name="numberOfItems")
    public native double getNumberOfItems();
    
    @JsMethod(name = "appendItem")
    public native SVGTransform appendItem(SVGTransform newItem);
    
    @JsMethod(name = "clear")
    public native void clear();
    
    @JsMethod(name = "consolidate")
    public native SVGTransform consolidate();
    
    @JsMethod(name = "createSVGTransformFromMatrix")
    public native SVGTransform createSVGTransformFromMatrix(SVGMatrix matrix);
    
    @JsMethod(name = "getItem")
    public native SVGTransform getItem(double index);
    
    @JsMethod(name = "initialize")
    public native SVGTransform initialize(SVGTransform newItem);
    
    @JsMethod(name = "insertItemBefore")
    public native SVGTransform insertItemBefore(SVGTransform newItem, double index);
    
    @JsMethod(name = "removeItem")
    public native SVGTransform removeItem(double index);
    
    @JsMethod(name = "replaceItem")
    public native SVGTransform replaceItem(SVGTransform newItem, double index);
    
    @JsOverlay
    public final void set(double index, SVGTransform newItem){
        Js.<SVGTransform>set(this.object(), index, newItem);
    }
    
}
