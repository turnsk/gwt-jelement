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
package gwt.jelement.presentation;

import gwt.jelement.core.Array;
import gwt.jelement.core.Promise;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="PresentationRequest", isNative = true)
public class PresentationRequest extends EventTarget {
    @JsProperty(name="onconnectionavailable")
    private EventHandlerNonNull onconnectionavailable;
    
    @JsConstructor
    public PresentationRequest(String url){
        super();
    }
    
    @JsConstructor
    public PresentationRequest(String[] urls){
        super();
    }
    
    @JsConstructor
    public PresentationRequest(Array urls){
        super();
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnConnectionavailable(){
        return this.onconnectionavailable;
    }
    
    @JsOverlay
    public final void setOnConnectionavailable(EventHandlerNonNull onconnectionavailable){
        this.onconnectionavailable = onconnectionavailable;
    }
    
    @JsMethod(name = "getAvailability")
    public native Promise<PresentationAvailability> getAvailability();
    
    @JsMethod(name = "reconnect")
    public native Promise<PresentationConnection> reconnect(String id);
    
    @JsMethod(name = "start")
    public native Promise<PresentationConnection> start();
    
}
