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
package gwt.jelement.frame;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class Console{
    
    @JsMethod(name = "assert")
    public native void assert_();
    
    @JsMethod(name = "assert")
    public native void assert_(boolean condition);
    
    @JsMethod(name = "assert")
    public native void assert_(boolean condition, Any... data);
    
    @JsMethod(name = "clear")
    public native void clear();
    
    @JsMethod(name = "count")
    public native void count();
    
    @JsMethod(name = "count")
    public native void count(String label);
    
    @JsMethod(name = "debug")
    public native void debug();
    
    @JsMethod(name = "debug")
    public native void debug(Any... data);
    
    @JsMethod(name = "dir")
    public native void dir(Any item);
    
    @JsMethod(name = "dir")
    public native void dir(Any item, Object options);
    
    @JsMethod(name = "dirxml")
    public native void dirxml();
    
    @JsMethod(name = "dirxml")
    public native void dirxml(Any... data);
    
    @JsMethod(name = "error")
    public native void error();
    
    @JsMethod(name = "error")
    public native void error(Any... data);
    
    @JsMethod(name = "group")
    public native void group();
    
    @JsMethod(name = "group")
    public native void group(Any... data);
    
    @JsMethod(name = "groupCollapsed")
    public native void groupCollapsed();
    
    @JsMethod(name = "groupCollapsed")
    public native void groupCollapsed(Any... data);
    
    @JsMethod(name = "groupEnd")
    public native void groupEnd();
    
    @JsMethod(name = "info")
    public native void info();
    
    @JsMethod(name = "info")
    public native void info(Any... data);
    
    @JsMethod(name = "log")
    public native void log();
    
    @JsMethod(name = "log")
    public native void log(Any... data);
    
    @JsMethod(name = "table")
    public native void table(Any tabularData);
    
    @JsMethod(name = "table")
    public native void table(Any tabularData, String[] properties);
    
    @JsMethod(name = "time")
    public native void time();
    
    @JsMethod(name = "time")
    public native void time(String label);
    
    @JsMethod(name = "timeEnd")
    public native void timeEnd();
    
    @JsMethod(name = "timeEnd")
    public native void timeEnd(String label);
    
    @JsMethod(name = "trace")
    public native void trace();
    
    @JsMethod(name = "trace")
    public native void trace(Any... data);
    
    @JsMethod(name = "warn")
    public native void warn();
    
    @JsMethod(name = "warn")
    public native void warn(Any... data);
    
}