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

import gwt.jelement.imagecapture.ConstrainPoint2DParameters;
import gwt.jelement.imagecapture.Point2D;
import gwt.jelement.mediastream.ConstrainBooleanParameters;
import gwt.jelement.mediastream.ConstrainDOMStringParameters;
import gwt.jelement.mediastream.ConstrainDoubleRange;
import gwt.jelement.mediastream.ConstrainLongRange;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class MediaTrackConstraintSet{

    public MediaTrackConstraintSet(){
    }

    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface ConstrainLong {
        @JsOverlay
        static ConstrainLong of(double value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static ConstrainLong of(ConstrainLongRange value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default double asDouble(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default ConstrainLongRange asConstrainLongRange(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isDouble(){
            return (Object) this instanceof Double;
        }
    
        @JsOverlay
        default boolean isConstrainLongRange(){
            return (Object) this instanceof ConstrainLongRange;
        }
    
    }
    
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface ConstrainDouble {
        @JsOverlay
        static ConstrainDouble of(double value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static ConstrainDouble of(ConstrainDoubleRange value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default double asDouble(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default ConstrainDoubleRange asConstrainDoubleRange(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isDouble(){
            return (Object) this instanceof Double;
        }
    
        @JsOverlay
        default boolean isConstrainDoubleRange(){
            return (Object) this instanceof ConstrainDoubleRange;
        }
    
    }
    
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface ConstrainDOMString {
        @JsOverlay
        static ConstrainDOMString of(String value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static ConstrainDOMString of(String[] value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static ConstrainDOMString of(ConstrainDOMStringParameters value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default String asString(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default String[] asStringArray(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default ConstrainDOMStringParameters asConstrainDOMStringParameters(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isString(){
            return (Object) this instanceof String;
        }
    
        @JsOverlay
        default boolean isStringArray(){
            return (Object) this instanceof String[];
        }
    
        @JsOverlay
        default boolean isConstrainDOMStringParameters(){
            return (Object) this instanceof ConstrainDOMStringParameters;
        }
    
    }
    
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface ConstrainBoolean {
        @JsOverlay
        static ConstrainBoolean of(boolean value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static ConstrainBoolean of(ConstrainBooleanParameters value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default boolean asBoolean(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default ConstrainBooleanParameters asConstrainBooleanParameters(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isBoolean(){
            return (Object) this instanceof Boolean;
        }
    
        @JsOverlay
        default boolean isConstrainBooleanParameters(){
            return (Object) this instanceof ConstrainBooleanParameters;
        }
    
    }
    
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface ConstrainPoint2D {
        @JsOverlay
        static ConstrainPoint2D of(Point2D[] value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static ConstrainPoint2D of(ConstrainPoint2DParameters value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default Point2D[] asPoint2DArray(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default ConstrainPoint2DParameters asConstrainPoint2DParameters(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isPoint2DArray(){
            return (Object) this instanceof Point2D[];
        }
    
        @JsOverlay
        default boolean isConstrainPoint2DParameters(){
            return (Object) this instanceof ConstrainPoint2DParameters;
        }
    
    }
    
    @JsProperty(name="width")
    public ConstrainLong width;

    @JsOverlay
    public final void setWidth(double width){
        this.width = MediaTrackConstraintSet.ConstrainLong.of(width);
    }

    @JsOverlay
    public final void setWidth(ConstrainLongRange width){
        this.width = MediaTrackConstraintSet.ConstrainLong.of(width);
    }

    @JsProperty(name="height")
    public ConstrainLong height;

    @JsOverlay
    public final void setHeight(double height){
        this.height = MediaTrackConstraintSet.ConstrainLong.of(height);
    }

    @JsOverlay
    public final void setHeight(ConstrainLongRange height){
        this.height = MediaTrackConstraintSet.ConstrainLong.of(height);
    }

    @JsProperty(name="aspectRatio")
    public ConstrainDouble aspectRatio;

    @JsOverlay
    public final void setAspectRatio(double aspectRatio){
        this.aspectRatio = MediaTrackConstraintSet.ConstrainDouble.of(aspectRatio);
    }

    @JsOverlay
    public final void setAspectRatio(ConstrainDoubleRange aspectRatio){
        this.aspectRatio = MediaTrackConstraintSet.ConstrainDouble.of(aspectRatio);
    }

    @JsProperty(name="frameRate")
    public ConstrainDouble frameRate;

    @JsOverlay
    public final void setFrameRate(double frameRate){
        this.frameRate = MediaTrackConstraintSet.ConstrainDouble.of(frameRate);
    }

    @JsOverlay
    public final void setFrameRate(ConstrainDoubleRange frameRate){
        this.frameRate = MediaTrackConstraintSet.ConstrainDouble.of(frameRate);
    }

    @JsProperty(name="facingMode")
    public ConstrainDOMString facingMode;

    @JsOverlay
    public final void setFacingMode(String facingMode){
        this.facingMode = MediaTrackConstraintSet.ConstrainDOMString.of(facingMode);
    }

    @JsOverlay
    public final void setFacingMode(String[] facingMode){
        this.facingMode = MediaTrackConstraintSet.ConstrainDOMString.of(facingMode);
    }

    @JsOverlay
    public final void setFacingMode(ConstrainDOMStringParameters facingMode){
        this.facingMode = MediaTrackConstraintSet.ConstrainDOMString.of(facingMode);
    }

    @JsProperty(name="volume")
    public ConstrainDouble volume;

    @JsOverlay
    public final void setVolume(double volume){
        this.volume = MediaTrackConstraintSet.ConstrainDouble.of(volume);
    }

    @JsOverlay
    public final void setVolume(ConstrainDoubleRange volume){
        this.volume = MediaTrackConstraintSet.ConstrainDouble.of(volume);
    }

    @JsProperty(name="sampleRate")
    public ConstrainLong sampleRate;

    @JsOverlay
    public final void setSampleRate(double sampleRate){
        this.sampleRate = MediaTrackConstraintSet.ConstrainLong.of(sampleRate);
    }

    @JsOverlay
    public final void setSampleRate(ConstrainLongRange sampleRate){
        this.sampleRate = MediaTrackConstraintSet.ConstrainLong.of(sampleRate);
    }

    @JsProperty(name="sampleSize")
    public ConstrainLong sampleSize;

    @JsOverlay
    public final void setSampleSize(double sampleSize){
        this.sampleSize = MediaTrackConstraintSet.ConstrainLong.of(sampleSize);
    }

    @JsOverlay
    public final void setSampleSize(ConstrainLongRange sampleSize){
        this.sampleSize = MediaTrackConstraintSet.ConstrainLong.of(sampleSize);
    }

    @JsProperty(name="echoCancellation")
    public ConstrainBoolean echoCancellation;

    @JsOverlay
    public final void setEchoCancellation(boolean echoCancellation){
        this.echoCancellation = MediaTrackConstraintSet.ConstrainBoolean.of(echoCancellation);
    }

    @JsOverlay
    public final void setEchoCancellation(ConstrainBooleanParameters echoCancellation){
        this.echoCancellation = MediaTrackConstraintSet.ConstrainBoolean.of(echoCancellation);
    }

    @JsProperty(name="latency")
    public ConstrainDouble latency;

    @JsOverlay
    public final void setLatency(double latency){
        this.latency = MediaTrackConstraintSet.ConstrainDouble.of(latency);
    }

    @JsOverlay
    public final void setLatency(ConstrainDoubleRange latency){
        this.latency = MediaTrackConstraintSet.ConstrainDouble.of(latency);
    }

    @JsProperty(name="channelCount")
    public ConstrainLong channelCount;

    @JsOverlay
    public final void setChannelCount(double channelCount){
        this.channelCount = MediaTrackConstraintSet.ConstrainLong.of(channelCount);
    }

    @JsOverlay
    public final void setChannelCount(ConstrainLongRange channelCount){
        this.channelCount = MediaTrackConstraintSet.ConstrainLong.of(channelCount);
    }

    @JsProperty(name="deviceId")
    public ConstrainDOMString deviceId;

    @JsOverlay
    public final void setDeviceId(String deviceId){
        this.deviceId = MediaTrackConstraintSet.ConstrainDOMString.of(deviceId);
    }

    @JsOverlay
    public final void setDeviceId(String[] deviceId){
        this.deviceId = MediaTrackConstraintSet.ConstrainDOMString.of(deviceId);
    }

    @JsOverlay
    public final void setDeviceId(ConstrainDOMStringParameters deviceId){
        this.deviceId = MediaTrackConstraintSet.ConstrainDOMString.of(deviceId);
    }

    @JsProperty(name="groupId")
    public ConstrainDOMString groupId;

    @JsOverlay
    public final void setGroupId(String groupId){
        this.groupId = MediaTrackConstraintSet.ConstrainDOMString.of(groupId);
    }

    @JsOverlay
    public final void setGroupId(String[] groupId){
        this.groupId = MediaTrackConstraintSet.ConstrainDOMString.of(groupId);
    }

    @JsOverlay
    public final void setGroupId(ConstrainDOMStringParameters groupId){
        this.groupId = MediaTrackConstraintSet.ConstrainDOMString.of(groupId);
    }

    @JsProperty(name="videoKind")
    public ConstrainDOMString videoKind;

    @JsOverlay
    public final void setVideoKind(String videoKind){
        this.videoKind = MediaTrackConstraintSet.ConstrainDOMString.of(videoKind);
    }

    @JsOverlay
    public final void setVideoKind(String[] videoKind){
        this.videoKind = MediaTrackConstraintSet.ConstrainDOMString.of(videoKind);
    }

    @JsOverlay
    public final void setVideoKind(ConstrainDOMStringParameters videoKind){
        this.videoKind = MediaTrackConstraintSet.ConstrainDOMString.of(videoKind);
    }

    @JsProperty(name="depthNear")
    public ConstrainDouble depthNear;

    @JsOverlay
    public final void setDepthNear(double depthNear){
        this.depthNear = MediaTrackConstraintSet.ConstrainDouble.of(depthNear);
    }

    @JsOverlay
    public final void setDepthNear(ConstrainDoubleRange depthNear){
        this.depthNear = MediaTrackConstraintSet.ConstrainDouble.of(depthNear);
    }

    @JsProperty(name="depthFar")
    public ConstrainDouble depthFar;

    @JsOverlay
    public final void setDepthFar(double depthFar){
        this.depthFar = MediaTrackConstraintSet.ConstrainDouble.of(depthFar);
    }

    @JsOverlay
    public final void setDepthFar(ConstrainDoubleRange depthFar){
        this.depthFar = MediaTrackConstraintSet.ConstrainDouble.of(depthFar);
    }

    @JsProperty(name="focalLengthX")
    public ConstrainDouble focalLengthX;

    @JsOverlay
    public final void setFocalLengthX(double focalLengthX){
        this.focalLengthX = MediaTrackConstraintSet.ConstrainDouble.of(focalLengthX);
    }

    @JsOverlay
    public final void setFocalLengthX(ConstrainDoubleRange focalLengthX){
        this.focalLengthX = MediaTrackConstraintSet.ConstrainDouble.of(focalLengthX);
    }

    @JsProperty(name="focalLengthY")
    public ConstrainDouble focalLengthY;

    @JsOverlay
    public final void setFocalLengthY(double focalLengthY){
        this.focalLengthY = MediaTrackConstraintSet.ConstrainDouble.of(focalLengthY);
    }

    @JsOverlay
    public final void setFocalLengthY(ConstrainDoubleRange focalLengthY){
        this.focalLengthY = MediaTrackConstraintSet.ConstrainDouble.of(focalLengthY);
    }

    @JsProperty(name="whiteBalanceMode")
    public ConstrainDOMString whiteBalanceMode;

    @JsOverlay
    public final void setWhiteBalanceMode(String whiteBalanceMode){
        this.whiteBalanceMode = MediaTrackConstraintSet.ConstrainDOMString.of(whiteBalanceMode);
    }

    @JsOverlay
    public final void setWhiteBalanceMode(String[] whiteBalanceMode){
        this.whiteBalanceMode = MediaTrackConstraintSet.ConstrainDOMString.of(whiteBalanceMode);
    }

    @JsOverlay
    public final void setWhiteBalanceMode(ConstrainDOMStringParameters whiteBalanceMode){
        this.whiteBalanceMode = MediaTrackConstraintSet.ConstrainDOMString.of(whiteBalanceMode);
    }

    @JsProperty(name="exposureMode")
    public ConstrainDOMString exposureMode;

    @JsOverlay
    public final void setExposureMode(String exposureMode){
        this.exposureMode = MediaTrackConstraintSet.ConstrainDOMString.of(exposureMode);
    }

    @JsOverlay
    public final void setExposureMode(String[] exposureMode){
        this.exposureMode = MediaTrackConstraintSet.ConstrainDOMString.of(exposureMode);
    }

    @JsOverlay
    public final void setExposureMode(ConstrainDOMStringParameters exposureMode){
        this.exposureMode = MediaTrackConstraintSet.ConstrainDOMString.of(exposureMode);
    }

    @JsProperty(name="focusMode")
    public ConstrainDOMString focusMode;

    @JsOverlay
    public final void setFocusMode(String focusMode){
        this.focusMode = MediaTrackConstraintSet.ConstrainDOMString.of(focusMode);
    }

    @JsOverlay
    public final void setFocusMode(String[] focusMode){
        this.focusMode = MediaTrackConstraintSet.ConstrainDOMString.of(focusMode);
    }

    @JsOverlay
    public final void setFocusMode(ConstrainDOMStringParameters focusMode){
        this.focusMode = MediaTrackConstraintSet.ConstrainDOMString.of(focusMode);
    }

    @JsProperty(name="pointsOfInterest")
    public ConstrainPoint2D pointsOfInterest;

    @JsOverlay
    public final void setPointsOfInterest(Point2D[] pointsOfInterest){
        this.pointsOfInterest = MediaTrackConstraintSet.ConstrainPoint2D.of(pointsOfInterest);
    }

    @JsOverlay
    public final void setPointsOfInterest(ConstrainPoint2DParameters pointsOfInterest){
        this.pointsOfInterest = MediaTrackConstraintSet.ConstrainPoint2D.of(pointsOfInterest);
    }

    @JsProperty(name="exposureCompensation")
    public ConstrainDouble exposureCompensation;

    @JsOverlay
    public final void setExposureCompensation(double exposureCompensation){
        this.exposureCompensation = MediaTrackConstraintSet.ConstrainDouble.of(exposureCompensation);
    }

    @JsOverlay
    public final void setExposureCompensation(ConstrainDoubleRange exposureCompensation){
        this.exposureCompensation = MediaTrackConstraintSet.ConstrainDouble.of(exposureCompensation);
    }

    @JsProperty(name="colorTemperature")
    public ConstrainDouble colorTemperature;

    @JsOverlay
    public final void setColorTemperature(double colorTemperature){
        this.colorTemperature = MediaTrackConstraintSet.ConstrainDouble.of(colorTemperature);
    }

    @JsOverlay
    public final void setColorTemperature(ConstrainDoubleRange colorTemperature){
        this.colorTemperature = MediaTrackConstraintSet.ConstrainDouble.of(colorTemperature);
    }

    @JsProperty(name="iso")
    public ConstrainDouble iso;

    @JsOverlay
    public final void setIso(double iso){
        this.iso = MediaTrackConstraintSet.ConstrainDouble.of(iso);
    }

    @JsOverlay
    public final void setIso(ConstrainDoubleRange iso){
        this.iso = MediaTrackConstraintSet.ConstrainDouble.of(iso);
    }

    @JsProperty(name="brightness")
    public ConstrainDouble brightness;

    @JsOverlay
    public final void setBrightness(double brightness){
        this.brightness = MediaTrackConstraintSet.ConstrainDouble.of(brightness);
    }

    @JsOverlay
    public final void setBrightness(ConstrainDoubleRange brightness){
        this.brightness = MediaTrackConstraintSet.ConstrainDouble.of(brightness);
    }

    @JsProperty(name="contrast")
    public ConstrainDouble contrast;

    @JsOverlay
    public final void setContrast(double contrast){
        this.contrast = MediaTrackConstraintSet.ConstrainDouble.of(contrast);
    }

    @JsOverlay
    public final void setContrast(ConstrainDoubleRange contrast){
        this.contrast = MediaTrackConstraintSet.ConstrainDouble.of(contrast);
    }

    @JsProperty(name="saturation")
    public ConstrainDouble saturation;

    @JsOverlay
    public final void setSaturation(double saturation){
        this.saturation = MediaTrackConstraintSet.ConstrainDouble.of(saturation);
    }

    @JsOverlay
    public final void setSaturation(ConstrainDoubleRange saturation){
        this.saturation = MediaTrackConstraintSet.ConstrainDouble.of(saturation);
    }

    @JsProperty(name="sharpness")
    public ConstrainDouble sharpness;

    @JsOverlay
    public final void setSharpness(double sharpness){
        this.sharpness = MediaTrackConstraintSet.ConstrainDouble.of(sharpness);
    }

    @JsOverlay
    public final void setSharpness(ConstrainDoubleRange sharpness){
        this.sharpness = MediaTrackConstraintSet.ConstrainDouble.of(sharpness);
    }

    @JsProperty(name="zoom")
    public ConstrainDouble zoom;

    @JsOverlay
    public final void setZoom(double zoom){
        this.zoom = MediaTrackConstraintSet.ConstrainDouble.of(zoom);
    }

    @JsOverlay
    public final void setZoom(ConstrainDoubleRange zoom){
        this.zoom = MediaTrackConstraintSet.ConstrainDouble.of(zoom);
    }

    @JsProperty(name="torch")
    public ConstrainBoolean torch;

    @JsOverlay
    public final void setTorch(boolean torch){
        this.torch = MediaTrackConstraintSet.ConstrainBoolean.of(torch);
    }

    @JsOverlay
    public final void setTorch(ConstrainBooleanParameters torch){
        this.torch = MediaTrackConstraintSet.ConstrainBoolean.of(torch);
    }

    @JsProperty(name="mandatory")
    public Object mandatory;

    @JsOverlay
    public final Object getMandatory(){
        return this.mandatory;
    }

    @JsOverlay
    public final void setMandatory(Object mandatory){
        this.mandatory = mandatory;
    }

    @JsProperty(name="_optional")
    public Object[] _optional;

    @JsOverlay
    public final Object[] get_optional(){
        return this._optional;
    }

    @JsOverlay
    public final void set_optional(Object[] _optional){
        this._optional = _optional;
    }


}
