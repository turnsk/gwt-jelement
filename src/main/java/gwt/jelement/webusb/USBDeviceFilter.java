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
package gwt.jelement.webusb;

import gwt.jelement.core.JsObject;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class USBDeviceFilter extends JsObject{

    @JsProperty(name="vendorId")
    private short vendorId;

    @JsProperty(name="productId")
    private short productId;

    @JsProperty(name="classCode")
    private byte classCode;

    @JsProperty(name="subclassCode")
    private byte subclassCode;

    @JsProperty(name="protocolCode")
    private byte protocolCode;

    @JsProperty(name="serialNumber")
    private String serialNumber;

    public USBDeviceFilter(){
    }

    @JsOverlay
    public final short getVendorId(){
        return this.vendorId;
    }

    @JsOverlay
    public final void setVendorId(short vendorId){
        this.vendorId = vendorId;
    }

    @JsOverlay
    public final short getProductId(){
        return this.productId;
    }

    @JsOverlay
    public final void setProductId(short productId){
        this.productId = productId;
    }

    @JsOverlay
    public final byte getClassCode(){
        return this.classCode;
    }

    @JsOverlay
    public final void setClassCode(byte classCode){
        this.classCode = classCode;
    }

    @JsOverlay
    public final byte getSubclassCode(){
        return this.subclassCode;
    }

    @JsOverlay
    public final void setSubclassCode(byte subclassCode){
        this.subclassCode = subclassCode;
    }

    @JsOverlay
    public final byte getProtocolCode(){
        return this.protocolCode;
    }

    @JsOverlay
    public final void setProtocolCode(byte protocolCode){
        this.protocolCode = protocolCode;
    }

    @JsOverlay
    public final String getSerialNumber(){
        return this.serialNumber;
    }

    @JsOverlay
    public final void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }


}
