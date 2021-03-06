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
import gwt.jelement.html.VoidCallback;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Object", isNative = true)
public class Entry implements IsObject {
    @JsProperty(name="isFile")
    public native boolean isIsFile();
    
    @JsProperty(name="isDirectory")
    public native boolean isIsDirectory();
    
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="fullPath")
    public native String getFullPath();
    
    @JsProperty(name="filesystem")
    public native DOMFileSystem getFilesystem();
    
    @JsMethod(name = "copyTo")
    public native void copyTo(DirectoryEntry parent);
    
    @JsMethod(name = "copyTo")
    public native void copyTo(DirectoryEntry parent, String name);
    
    @JsMethod(name = "copyTo")
    public native void copyTo(DirectoryEntry parent, String name, EntryCallback successCallback);
    
    @JsMethod(name = "copyTo")
    public native void copyTo(DirectoryEntry parent, String name, EntryCallback successCallback, ErrorCallback errorCallback);
    
    @JsMethod(name = "getMetadata")
    public native void getMetadata(MetadataCallback successCallback);
    
    @JsMethod(name = "getMetadata")
    public native void getMetadata(MetadataCallback successCallback, ErrorCallback errorCallback);
    
    @JsMethod(name = "getParent")
    public native void getParent();
    
    @JsMethod(name = "getParent")
    public native void getParent(EntryCallback successCallback);
    
    @JsMethod(name = "getParent")
    public native void getParent(EntryCallback successCallback, ErrorCallback errorCallback);
    
    @JsMethod(name = "moveTo")
    public native void moveTo(DirectoryEntry parent);
    
    @JsMethod(name = "moveTo")
    public native void moveTo(DirectoryEntry parent, String name);
    
    @JsMethod(name = "moveTo")
    public native void moveTo(DirectoryEntry parent, String name, EntryCallback successCallback);
    
    @JsMethod(name = "moveTo")
    public native void moveTo(DirectoryEntry parent, String name, EntryCallback successCallback, ErrorCallback errorCallback);
    
    @JsMethod(name = "remove")
    public native void remove(VoidCallback successCallback);
    
    @JsMethod(name = "remove")
    public native void remove(VoidCallback successCallback, ErrorCallback errorCallback);
    
    @JsMethod(name = "toURL")
    public native String toURL();
    
}
