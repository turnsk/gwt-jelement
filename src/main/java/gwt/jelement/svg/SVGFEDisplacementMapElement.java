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

import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="SVGFEDisplacementMapElement", isNative = true)
public class SVGFEDisplacementMapElement extends SVGElement {
    public static short SVG_CHANNEL_UNKNOWN; /* 0 */
    public static short SVG_CHANNEL_R; /* 1 */
    public static short SVG_CHANNEL_G; /* 2 */
    public static short SVG_CHANNEL_B; /* 3 */
    public static short SVG_CHANNEL_A; /* 4 */
    
    @JsProperty(name="in1")
    public native SVGAnimatedString getIn1();
    
    @JsProperty(name="in2")
    public native SVGAnimatedString getIn2();
    
    @JsProperty(name="scale")
    public native SVGAnimatedNumber getScale();
    
    @JsProperty(name="xChannelSelector")
    public native SVGAnimatedEnumeration getXChannelSelector();
    
    @JsProperty(name="yChannelSelector")
    public native SVGAnimatedEnumeration getYChannelSelector();
    
    @JsProperty(name="x")
    public native SVGAnimatedLength getX();
    
    @JsProperty(name="y")
    public native SVGAnimatedLength getY();
    
    @JsProperty(name="width")
    public native SVGAnimatedLength getWidth();
    
    @JsProperty(name="height")
    public native SVGAnimatedLength getHeight();
    
    @JsProperty(name="result")
    public native SVGAnimatedString getResult();
    
}
