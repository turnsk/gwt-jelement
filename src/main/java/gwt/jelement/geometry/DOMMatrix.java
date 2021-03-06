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

import gwt.jelement.core.Array;
import gwt.jelement.core.Float32Array;
import gwt.jelement.core.Float64Array;
import gwt.jelement.core.Js;
import jsinterop.annotations.*;
import jsinterop.annotations.JsOverlay;

@JsType(namespace = JsPackage.GLOBAL, name="DOMMatrix", isNative = true)
public class DOMMatrix extends DOMMatrixReadOnly {
    @JsConstructor
    public DOMMatrix(){
        super();
    }
    
    @JsConstructor
    public DOMMatrix(String init){
        super();
    }
    
    @JsConstructor
    public DOMMatrix(double[] init){
        super();
    }
    
    @JsConstructor
    public DOMMatrix(Array init){
        super();
    }
    
    @JsProperty(name="a")
    public native void setA(double a);
    
    @JsProperty(name="b")
    public native void setB(double b);
    
    @JsProperty(name="c")
    public native void setC(double c);
    
    @JsProperty(name="d")
    public native void setD(double d);
    
    @JsProperty(name="e")
    public native void setE(double e);
    
    @JsProperty(name="f")
    public native void setF(double f);
    
    @JsProperty(name="m11")
    public native void setM11(double m11);
    
    @JsProperty(name="m12")
    public native void setM12(double m12);
    
    @JsProperty(name="m13")
    public native void setM13(double m13);
    
    @JsProperty(name="m14")
    public native void setM14(double m14);
    
    @JsProperty(name="m21")
    public native void setM21(double m21);
    
    @JsProperty(name="m22")
    public native void setM22(double m22);
    
    @JsProperty(name="m23")
    public native void setM23(double m23);
    
    @JsProperty(name="m24")
    public native void setM24(double m24);
    
    @JsProperty(name="m31")
    public native void setM31(double m31);
    
    @JsProperty(name="m32")
    public native void setM32(double m32);
    
    @JsProperty(name="m33")
    public native void setM33(double m33);
    
    @JsProperty(name="m34")
    public native void setM34(double m34);
    
    @JsProperty(name="m41")
    public native void setM41(double m41);
    
    @JsProperty(name="m42")
    public native void setM42(double m42);
    
    @JsProperty(name="m43")
    public native void setM43(double m43);
    
    @JsProperty(name="m44")
    public native void setM44(double m44);
    
    @JsMethod(name = "fromFloat32Array")
    public static native DOMMatrix fromFloat32Array(Float32Array array32);
    
    @JsMethod(name = "fromFloat64Array")
    public static native DOMMatrix fromFloat64Array(Float64Array array64);
    
    @JsMethod(name = "fromMatrix")
    public static native DOMMatrix fromMatrix();
    
    @JsMethod(name = "fromMatrix")
    public static native DOMMatrix fromMatrix(DOMMatrixInit other);
    
    @JsMethod(name = "invertSelf")
    public native DOMMatrix invertSelf();
    
    @JsMethod(name = "multiplySelf")
    public native DOMMatrix multiplySelf();
    
    @JsMethod(name = "multiplySelf")
    public native DOMMatrix multiplySelf(DOMMatrixInit other);
    
    @JsMethod(name = "preMultiplySelf")
    public native DOMMatrix preMultiplySelf();
    
    @JsMethod(name = "preMultiplySelf")
    public native DOMMatrix preMultiplySelf(DOMMatrixInit other);
    
    @JsMethod(name = "rotateAxisAngleSelf")
    public native DOMMatrix rotateAxisAngleSelf();
    
    @JsMethod(name = "rotateAxisAngleSelf")
    public native DOMMatrix rotateAxisAngleSelf(double x);
    
    @JsMethod(name = "rotateAxisAngleSelf")
    public native DOMMatrix rotateAxisAngleSelf(double x, double y);
    
    @JsMethod(name = "rotateAxisAngleSelf")
    public native DOMMatrix rotateAxisAngleSelf(double x, double y, double z);
    
    @JsMethod(name = "rotateAxisAngleSelf")
    public native DOMMatrix rotateAxisAngleSelf(double x, double y, double z, double angle);
    
    @JsMethod(name = "rotateFromVectorSelf")
    public native DOMMatrix rotateFromVectorSelf();
    
    @JsMethod(name = "rotateFromVectorSelf")
    public native DOMMatrix rotateFromVectorSelf(double x);
    
    @JsMethod(name = "rotateFromVectorSelf")
    public native DOMMatrix rotateFromVectorSelf(double x, double y);
    
    @JsMethod(name = "rotateSelf")
    public native DOMMatrix rotateSelf();
    
    @JsMethod(name = "rotateSelf")
    public native DOMMatrix rotateSelf(double rotX);
    
    @JsMethod(name = "rotateSelf")
    public native DOMMatrix rotateSelf(double rotX, double rotY);
    
    @JsMethod(name = "rotateSelf")
    public native DOMMatrix rotateSelf(double rotX, double rotY, double rotZ);
    
    @JsMethod(name = "scale3dSelf")
    public native DOMMatrix scale3dSelf();
    
    @JsMethod(name = "scale3dSelf")
    public native DOMMatrix scale3dSelf(double scale);
    
    @JsMethod(name = "scale3dSelf")
    public native DOMMatrix scale3dSelf(double scale, double originX);
    
    @JsMethod(name = "scale3dSelf")
    public native DOMMatrix scale3dSelf(double scale, double originX, double originY);
    
    @JsMethod(name = "scale3dSelf")
    public native DOMMatrix scale3dSelf(double scale, double originX, double originY, double originZ);
    
    @JsMethod(name = "scaleSelf")
    public native DOMMatrix scaleSelf();
    
    @JsMethod(name = "scaleSelf")
    public native DOMMatrix scaleSelf(double scaleX);
    
    @JsMethod(name = "scaleSelf")
    public native DOMMatrix scaleSelf(double scaleX, double scaleY);
    
    @JsMethod(name = "scaleSelf")
    public native DOMMatrix scaleSelf(double scaleX, double scaleY, double scaleZ);
    
    @JsMethod(name = "scaleSelf")
    public native DOMMatrix scaleSelf(double scaleX, double scaleY, double scaleZ, double originX);
    
    @JsMethod(name = "scaleSelf")
    public native DOMMatrix scaleSelf(double scaleX, double scaleY, double scaleZ, double originX, double originY);
    
    @JsMethod(name = "scaleSelf")
    public native DOMMatrix scaleSelf(double scaleX, double scaleY, double scaleZ, double originX, double originY, double originZ);
    
    @JsMethod(name = "setMatrixValue")
    public native DOMMatrix setMatrixValue(String transformList);
    
    @JsMethod(name = "skewXSelf")
    public native DOMMatrix skewXSelf();
    
    @JsMethod(name = "skewXSelf")
    public native DOMMatrix skewXSelf(double sx);
    
    @JsMethod(name = "skewYSelf")
    public native DOMMatrix skewYSelf();
    
    @JsMethod(name = "skewYSelf")
    public native DOMMatrix skewYSelf(double sy);
    
    @JsMethod(name = "translateSelf")
    public native DOMMatrix translateSelf();
    
    @JsMethod(name = "translateSelf")
    public native DOMMatrix translateSelf(double tx);
    
    @JsMethod(name = "translateSelf")
    public native DOMMatrix translateSelf(double tx, double ty);
    
    @JsMethod(name = "translateSelf")
    public native DOMMatrix translateSelf(double tx, double ty, double tz);
    
}
