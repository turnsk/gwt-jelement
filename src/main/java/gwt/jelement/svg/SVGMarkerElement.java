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

@JsType(namespace = JsPackage.GLOBAL, name="SVGMarkerElement", isNative = true)
public class SVGMarkerElement extends SVGElement {
    public static short SVG_MARKERUNITS_UNKNOWN; /* 0 */
    public static short SVG_MARKERUNITS_USERSPACEONUSE; /* 1 */
    public static short SVG_MARKERUNITS_STROKEWIDTH; /* 2 */
    public static short SVG_MARKER_ORIENT_UNKNOWN; /* 0 */
    public static short SVG_MARKER_ORIENT_AUTO; /* 1 */
    public static short SVG_MARKER_ORIENT_ANGLE; /* 2 */
    
    @JsProperty(name="refX")
    public native SVGAnimatedLength getRefX();
    
    @JsProperty(name="refY")
    public native SVGAnimatedLength getRefY();
    
    @JsProperty(name="markerUnits")
    public native SVGAnimatedEnumeration getMarkerUnits();
    
    @JsProperty(name="markerWidth")
    public native SVGAnimatedLength getMarkerWidth();
    
    @JsProperty(name="markerHeight")
    public native SVGAnimatedLength getMarkerHeight();
    
    @JsProperty(name="orientType")
    public native SVGAnimatedEnumeration getOrientType();
    
    @JsProperty(name="orientAngle")
    public native SVGAnimatedAngle getOrientAngle();
    
    @JsProperty(name="viewBox")
    public native SVGAnimatedRect getViewBox();
    
    @JsProperty(name="preserveAspectRatio")
    public native SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();
    
    @JsMethod(name = "setOrientToAngle")
    public native void setOrientToAngle(SVGAngle angle);
    
    @JsMethod(name = "setOrientToAuto")
    public native void setOrientToAuto();
    
}
