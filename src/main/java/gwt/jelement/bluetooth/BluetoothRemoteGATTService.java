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
package gwt.jelement.bluetooth;

import gwt.jelement.core.IsObject;
import gwt.jelement.core.Promise;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="BluetoothRemoteGATTService", isNative = true)
public class BluetoothRemoteGATTService implements IsObject {
    @JsProperty(name="device")
    public native BluetoothDevice getDevice();
    
    @JsProperty(name="uuid")
    public native String getUuid();
    
    @JsProperty(name="isPrimary")
    public native boolean isIsPrimary();
    
    @JsMethod(name = "getCharacteristic")
    public native Promise<BluetoothRemoteGATTCharacteristic> getCharacteristic(String characteristic);
    
    @JsMethod(name = "getCharacteristic")
    public native Promise<BluetoothRemoteGATTCharacteristic> getCharacteristic(double characteristic);
    
    @JsMethod(name = "getCharacteristics")
    public native Promise<BluetoothRemoteGATTCharacteristic[]> getCharacteristics();
    
    @JsMethod(name = "getCharacteristics")
    public native Promise<BluetoothRemoteGATTCharacteristic[]> getCharacteristics(String characteristic);
    
    @JsMethod(name = "getCharacteristics")
    public native Promise<BluetoothRemoteGATTCharacteristic[]> getCharacteristics(double characteristic);
    
}
