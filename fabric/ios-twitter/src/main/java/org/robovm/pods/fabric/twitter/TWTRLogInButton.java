/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRLogInButton/*</name>*/ 
    extends /*<extends>*/UIButton/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TWTRLogInButtonPtr extends Ptr<TWTRLogInButton, TWTRLogInButtonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTRLogInButton.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TWTRLogInButton() {}
    protected TWTRLogInButton(SkipInit skipInit) { super(skipInit); }
    public TWTRLogInButton(@Block VoidBlock2<TWTRAuthSession, NSError> completion) { super(create(completion)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "logInCompletion")
    public native @Block VoidBlock2<TWTRAuthSession, NSError> getLogInCompletion();
    @Property(selector = "setLogInCompletion:")
    public native void setLogInCompletion(@Block VoidBlock2<TWTRAuthSession, NSError> v);
    @Property(selector = "loginMethods")
    public native TWTRLoginMethod getLoginMethods();
    @Property(selector = "setLoginMethods:")
    public native void setLoginMethods(TWTRLoginMethod v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "buttonWithLogInCompletion:")
    protected static native @Pointer long create(@Block VoidBlock2<TWTRAuthSession, NSError> completion);
    /*</methods>*/
}
