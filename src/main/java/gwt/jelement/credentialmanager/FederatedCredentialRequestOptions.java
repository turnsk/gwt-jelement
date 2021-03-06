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
package gwt.jelement.credentialmanager;

import gwt.jelement.core.JsObject;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class FederatedCredentialRequestOptions extends JsObject{

    @JsProperty(name="providers")
    private String[] providers;

    @JsProperty(name="protocols")
    private String[] protocols;

    public FederatedCredentialRequestOptions(){
    }

    @JsOverlay
    public final String[] getProviders(){
        return this.providers;
    }

    @JsOverlay
    public final void setProviders(String[] providers){
        this.providers = providers;
    }

    @JsOverlay
    public final String[] getProtocols(){
        return this.protocols;
    }

    @JsOverlay
    public final void setProtocols(String[] protocols){
        this.protocols = protocols;
    }


}
