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
package gwt.jelement.filesystem;

import gwt.jelement.core.IsObject;
import gwt.jelement.fileapi.Blob;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Object", isNative = true)
public class FileWriterSync implements IsObject {
    @JsProperty(name="position")
    public native double getPosition();
    
    @JsProperty(name="length")
    public native double getLength();
    
    @JsMethod(name = "seek")
    public native void seek(double position);
    
    @JsMethod(name = "truncate")
    public native void truncate(double size);
    
    @JsMethod(name = "write")
    public native void write(Blob data);
    
}
