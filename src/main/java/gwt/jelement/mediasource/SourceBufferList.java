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
package gwt.jelement.mediasource;

import gwt.jelement.core.ArrayLike;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="SourceBufferList", isNative = true)
public class SourceBufferList extends EventTarget implements ArrayLike<SourceBuffer> {
    @JsProperty(name="onaddsourcebuffer")
    private EventHandlerNonNull onaddsourcebuffer;
    
    @JsProperty(name="onremovesourcebuffer")
    private EventHandlerNonNull onremovesourcebuffer;
    
    @JsOverlay
    public final EventHandlerNonNull getOnAddsourcebuffer(){
        return this.onaddsourcebuffer;
    }
    
    @JsOverlay
    public final void setOnAddsourcebuffer(EventHandlerNonNull onaddsourcebuffer){
        this.onaddsourcebuffer = onaddsourcebuffer;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnRemovesourcebuffer(){
        return this.onremovesourcebuffer;
    }
    
    @JsOverlay
    public final void setOnRemovesourcebuffer(EventHandlerNonNull onremovesourcebuffer){
        this.onremovesourcebuffer = onremovesourcebuffer;
    }
    
}
