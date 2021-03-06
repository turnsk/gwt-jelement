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
package gwt.jelement.html.media;

import gwt.jelement.core.IsObject;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="MediaError", isNative = true)
public class MediaError implements IsObject {
    public static short MEDIA_ERR_ABORTED; /* 1 */
    public static short MEDIA_ERR_NETWORK; /* 2 */
    public static short MEDIA_ERR_DECODE; /* 3 */
    public static short MEDIA_ERR_SRC_NOT_SUPPORTED; /* 4 */
    
    @JsProperty(name="code")
    public native short getCode();
    
    @JsProperty(name="message")
    public native String getMessage();
    
}
