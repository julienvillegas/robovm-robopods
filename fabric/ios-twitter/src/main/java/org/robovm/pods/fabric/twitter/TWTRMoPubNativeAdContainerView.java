/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.fabric.twitter;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.accounts.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.mediaplayer.*;
import org.robovm.apple.social.*;
import org.robovm.apple.uikit.*;
import org.robovm.pods.fabric.twitter.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRMoPubNativeAdContainerView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*/implements UIAppearanceContainer/*</implements>*/ {

    /*<ptr>*/public static class TWTRMoPubNativeAdContainerViewPtr extends Ptr<TWTRMoPubNativeAdContainerView, TWTRMoPubNativeAdContainerViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTRMoPubNativeAdContainerView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TWTRMoPubNativeAdContainerView() {}
    protected TWTRMoPubNativeAdContainerView(Handle h, long handle) { super(h, handle); }
    protected TWTRMoPubNativeAdContainerView(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "theme")
    public native TWTRNativeAdTheme getTheme();
    @Property(selector = "setTheme:")
    public native void setTheme(TWTRNativeAdTheme v);
    @Property(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    @Property(selector = "setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    @Property(selector = "adBackgroundColor")
    public native UIColor getAdBackgroundColor();
    @Property(selector = "setAdBackgroundColor:")
    public native void setAdBackgroundColor(UIColor v);
    @Property(selector = "primaryTextColor")
    public native UIColor getPrimaryTextColor();
    @Property(selector = "setPrimaryTextColor:")
    public native void setPrimaryTextColor(UIColor v);
    @Property(selector = "buttonBackgroundColor")
    public native UIColor getButtonBackgroundColor();
    @Property(selector = "setButtonBackgroundColor:")
    public native void setButtonBackgroundColor(UIColor v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
