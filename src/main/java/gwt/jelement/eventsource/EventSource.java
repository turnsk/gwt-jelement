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
package gwt.jelement.eventsource;

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="EventSource", isNative = true)
public class EventSource extends EventTarget {
    public static short CONNECTING; /* 0 */
    public static short OPEN; /* 1 */
    public static short CLOSED; /* 2 */
    
    @JsProperty(name="onopen")
    private EventHandlerNonNull onopen;
    
    @JsProperty(name="onmessage")
    private EventHandlerNonNull onmessage;
    
    @JsProperty(name="onerror")
    private EventHandlerNonNull onerror;
    
    @JsConstructor
    public EventSource(String url){
        super();
    }
    
    @JsConstructor
    public EventSource(String url, EventSourceInit eventSourceInitDict){
        super();
    }
    
    @JsProperty(name="url")
    public native String getUrl();
    
    @JsProperty(name="withCredentials")
    public native boolean isWithCredentials();
    
    @JsProperty(name="readyState")
    public native short getReadyState();
    
    @JsOverlay
    public final EventHandlerNonNull getOnOpen(){
        return this.onopen;
    }
    
    @JsOverlay
    public final void setOnOpen(EventHandlerNonNull onopen){
        this.onopen = onopen;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMessage(){
        return this.onmessage;
    }
    
    @JsOverlay
    public final void setOnMessage(EventHandlerNonNull onmessage){
        this.onmessage = onmessage;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnError(){
        return this.onerror;
    }
    
    @JsOverlay
    public final void setOnError(EventHandlerNonNull onerror){
        this.onerror = onerror;
    }
    
    @JsMethod(name = "close")
    public native void close();
    
}
