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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRMediaEntitySize/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class TWTRMediaEntitySizePtr extends Ptr<TWTRMediaEntitySize, TWTRMediaEntitySizePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTRMediaEntitySize.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TWTRMediaEntitySize() {}
    protected TWTRMediaEntitySize(Handle h, long handle) { super(h, handle); }
    protected TWTRMediaEntitySize(SkipInit skipInit) { super(skipInit); }
    public TWTRMediaEntitySize(String name, TWTRMediaEntitySizeResizingMode resizingMode, @ByVal CGSize size) { super((SkipInit) null); initObject(init(name, resizingMode, size)); }
    public TWTRMediaEntitySize(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "resizingMode")
    public native TWTRMediaEntitySizeResizingMode getResizingMode();
    @Property(selector = "size")
    public native @ByVal CGSize getSize();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithName:resizingMode:size:")
    protected native @Pointer long init(String name, TWTRMediaEntitySizeResizingMode resizingMode, @ByVal CGSize size);
    @Method(selector = "isEqualToMediaEntitySize:")
    public native boolean equalsTo(TWTRMediaEntitySize otherSize);
    @Method(selector = "mediaEntitySizesWithJSONDictionary:")
    public static native NSDictionary<NSString, TWTRMediaEntitySize> getMediaEntitySizes(NSDictionary<?, ?> dictionary);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
