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
package gwt.jelement.mediastream;

import gwt.jelement.indexeddb.IDBObjectStoreParameters;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class ConstrainDOMStringParameters{

    public ConstrainDOMStringParameters(){
    }

    @JsProperty(name="exact")
    public IDBObjectStoreParameters.KeyPathUnion exact;

    @JsOverlay
    public final void setExact(String exact){
        this.exact = IDBObjectStoreParameters.KeyPathUnion.of(exact);
    }

    @JsOverlay
    public final void setExact(String[] exact){
        this.exact = IDBObjectStoreParameters.KeyPathUnion.of(exact);
    }

    @JsProperty(name="ideal")
    public IDBObjectStoreParameters.KeyPathUnion ideal;

    @JsOverlay
    public final void setIdeal(String ideal){
        this.ideal = IDBObjectStoreParameters.KeyPathUnion.of(ideal);
    }

    @JsOverlay
    public final void setIdeal(String[] ideal){
        this.ideal = IDBObjectStoreParameters.KeyPathUnion.of(ideal);
    }


}
